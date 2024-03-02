package utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class DatabaseUtils {
	private String connection_string = getEnvironmentProperty("dbURL");
	private String user_name = getEnvironmentProperty("dbUsername");
	private String user_password = getEnvironmentProperty("dbPassword");

	private Connection openConnection() {
		Properties props = new Properties();
		props.setProperty("user", user_name);
		props.setProperty("password", user_password);
		props.setProperty("sslmode", "prefer");
		props.setProperty("sslcert",
				System.getProperty("user.dir") + "/certificates/" + getEnvironmentProperty("test.environment")
						+ "/client-cert.der");
		props.setProperty("sslkey",
				System.getProperty("user.dir") + "/certificates/" + getEnvironmentProperty("test.environment")
						+ "/client-key.pk8");
		try {
			return DriverManager.getConnection(connection_string, props);
		} catch (SQLException cause) {
			throw new RuntimeException("Connection to database failed: " + cause.getMessage(), cause);
		}
	}

    private String getEnvironmentProperty(String s) {
        return s;
    }

    public String getResultFromDbColumn(String sqlQuery, String columnName) {
        try (Connection conn = openConnection();
             PreparedStatement stmt = conn.prepareStatement(sqlQuery);
             ResultSet resultSet = stmt.executeQuery()) {
            resultSet.next();
            return resultSet.getString(columnName);
        } catch (SQLException cause) {
            throw new RuntimeException("SQL query failed: " + cause.getMessage(), cause);
        }
    }

    public List<String> getResultsFromDbColumn(String sqlQuery, String columnName) {
        try (Connection conn = openConnection(); PreparedStatement stmt = conn.prepareStatement(sqlQuery); ResultSet resultSet = stmt.executeQuery()) {
            List<String> listOfValues = new ArrayList<>();
            while (resultSet.next()) {
                String valueFromColumn = resultSet.getString(columnName);
                listOfValues.add(valueFromColumn);
            }
            return listOfValues;
        } catch (SQLException sqlException) {
            throw new RuntimeException("SQL query failed: " + sqlException.getMessage(), sqlException);
        }
    }

    public void executeUpdateStatement(String statementString) {
        try (Connection connection = openConnection(); Statement state = connection.createStatement()) {
            state.executeUpdate(statementString);
        } catch (SQLException cause) {
            throw new RuntimeException("SQL Create Or Update Statement failed", cause);
        }
    }
}
