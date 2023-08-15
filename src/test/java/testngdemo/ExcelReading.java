package testngdemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReading {
	
	  @Test(dataProvider = "TestData")
	    public void testWithData(String name, Double age) {
	        // Your test logic using the provided data
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	
	@DataProvider(name = "TestData")
    public Object[][] readTestData() throws IOException {
        // Path to the Excel file
        String filePath = ".//src//test//resources//testFiles//credentials.xlsx";

        // Load the Excel file
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);

        // Get the first sheet of the workbook
        Sheet sheet = workbook.getSheetAt(0);

        // Get the number of rows and columns
        int rowCount = sheet.getLastRowNum()+1;
        int columnCount = sheet.getRow(0).getLastCellNum();

        // Create a two-dimensional array to store the data
        Object[][] data = new Object[rowCount][columnCount];

        // Read the data from each cell and store it in the array
        for (int i = 1; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < columnCount; j++) {
                Cell cell = row.getCell(j);
                data[i-1][j] = convertCellValue(cell);
            }
        }

        // Close the workbook and input stream
        workbook.close();
        fis.close();

        return data;
    }
	
	private Object convertCellValue(Cell cell) {
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return cell.getNumericCellValue();
            case BOOLEAN:
                return cell.getBooleanCellValue();
            default:
                return null;
        }
    }

}
