package utils;
import org.assertj.core.api.Assertions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CsvUtilSteps {
	String filePath;
	File csvFile;
	private final String delimiter = ",";

   
	public void setFilePath(String filePath) {
		csvFile = new File(filePath);
		this.filePath = filePath;
	}


	
	public void assertCsvIsNotEmpty() {
		Assertions.assertThat(csvFile.length()).isNotEqualTo(0);
	}

	
	public List<String> getColumnHeaders() {
		try(BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			return Arrays.stream(br.readLine().split(delimiter)).map(header -> header.replace("\"","").trim()).collect(Collectors.toList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	
	public int getColumnCount() {
		return getColumnHeaders().size();
	}

	
	public List<String> getColumnDataAsList(String columnName) {
		int columnIndex = getColumnHeaders().indexOf(columnName);
		List<String> columnData = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			String currentLine;
			while ((currentLine = br.readLine()) != null) {
				String[] rowData = currentLine.split(delimiter);
				columnData.add(rowData[columnIndex].replace("\"","").replace("=",""));
			}
			columnData.remove(0);
			return columnData;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	
	public List<String> getFirstRow() {
		try {
			return Files.lines(Path.of(filePath)).skip(1).limit(1)
					.map(line -> line.split(delimiter))
					.flatMap(Arrays::stream)
					.map(data -> data.replace("\"", "").replace("=", ""))
					.collect(Collectors.toList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	
	public void deleteCsvFile() {
		if (csvFile.exists()) {
			csvFile.delete();
		}
	}

	
	public void assertCsvFileIsDeleted() {
		Assertions.assertThat(csvFile.exists()).isFalse();
	}

	
	public void assertRowsContainsExpectedValue(String value) {
		Assertions.assertThat(getFirstRow()).contains(value);
	}

	
	public void assertRowsContainsExpectedListOfValues(List<String> values) {
		Assertions.assertThat(getFirstRow()).containsAll(values);
	}

	
	public void assertColumnContainsExpectedValue(String columnName, String value) {
		Assertions.assertThat(getColumnDataAsList(columnName)).containsOnly(value);
	}

	
	public void assertColumnContainsExpectedListOfValues(String columnName, List<String> values) {
		Assertions.assertThat(getColumnDataAsList(columnName)).containsAll(values);
	}

	
	public void assertColumnDoesNotContainValues(String columnName, List<String> values) {
		Assertions.assertThat(getColumnDataAsList(columnName)).doesNotContainAnyElementsOf(values);
	}

	
	public void assertNumberOfColumnsPresent(int numberOfColumns) {
		Assertions.assertThat(getColumnCount()).isEqualTo(numberOfColumns);
	}

	
	public void assertColumnHeadersPresent(List<String> expectedHeadersList) {
		Assertions.assertThat(getColumnHeaders()).containsAll(expectedHeadersList);
	}

	
	public void assertColumnIsEmpty(String columnName) {
		Assertions.assertThat(getColumnDataAsList(columnName)).containsOnly("");
	}

	
	public void assertColumnIsNotEmpty(String columnName) {
		Assertions.assertThat(getColumnDataAsList(columnName)).isNotEmpty();
	}
}