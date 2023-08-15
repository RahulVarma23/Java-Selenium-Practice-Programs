package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropController {

	public static void main(String[] args) throws IOException {
		FileInputStream  fileInputStream = new FileInputStream(".//src//test//resources//testFiles//testing.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		
		System.out.println(prop.getProperty("appUrl"));
	}
}
