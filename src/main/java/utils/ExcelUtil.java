package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ExcelUtil {
	private FileInputStream fis;
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private final Map<String, Integer> columns = new HashMap<>();

	public ExcelUtil(String excelPath, String sheetName) {
		try {
			fis = new FileInputStream(excelPath);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
			sheet.getRow(0).forEach(cell -> columns.put(cell.getStringCellValue().trim(), cell.getColumnIndex()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int getNumberOfSheets() {
		return workbook.getNumberOfSheets();
	}

	public List<String> getSheetNames() {
		List<String> sheetNames = new ArrayList<>();
		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			sheetNames.add(workbook.getSheetName(i));
		}
		return sheetNames;
	}

	public boolean assertSheetIsNotEmpty() {
		Row row;
		Cell cell;
		Iterator<Row> rows = sheet.rowIterator();
		while (rows.hasNext()) {
			row = rows.next();
			Iterator<Cell> cells = row.cellIterator();
			while (cells.hasNext()) {
				cell = cells.next();
				if (!cell.getStringCellValue().isEmpty()) {
					return true;
				}
			}
		}
		return false;
	}

	public Set<String> getColumnHeaders() {
		return columns.keySet();
	}

	public int getRowCount() {
		return sheet.getLastRowNum();
	}

	public int getColumnCount() {
		return sheet.getRow(0).getLastCellNum();
	}

	public String getCellData(int rowNum, int colNum) {
		XSSFRow row = sheet.getRow(rowNum);
		XSSFCell cell = row.getCell(colNum);
		String data;
		try {
			data = cell.getRichStringCellValue().getString();
		} catch (Exception e) {
			data = "";
		}
		return data;
	}

	public List<String> getRowData(int rowIndex) {
		List<String> rowData = new ArrayList<>();
		sheet.getRow(rowIndex).forEach(cell -> rowData.add(cell.getStringCellValue()));
		return rowData;
	}

	public List<String> getColumnData(String columnName) {
		List<String> columnData = new ArrayList<>();
		if (columns.containsKey(columnName)) {
			int colIndex = columns.get(columnName);
			for (Row row : sheet) {
				if (row.getRowNum() == 0) {
					continue;
				}
				columnData.add(getCellData(row.getRowNum(), colIndex));
			}
		}
		return columnData;
	}

	public Map<String, List<String>> getDataBasedOnValue(String columnName, String value) {
		List<String> columnData = getColumnData(columnName);
		Map<String, List<String>> rowDataBasedOnValue = new HashMap<>();
		if (columnData.contains(value)) {
			int rowIndex = columnData.indexOf(value) + 1;
			List<String> rowData = getRowData(rowIndex);
			rowDataBasedOnValue.put(value, rowData);
		}
		return rowDataBasedOnValue;
	}

	public Map<String, List<String>> getDataBasedOnValue(String columnName) {
		List<String> columnData = getColumnData(columnName);
		Map<String, List<String>> rowDataBasedOnValue = new HashMap<>();
		columnData.forEach(value -> {
			int rowIndex = columnData.indexOf(value) + 1;
			List<String> rowData = getRowData(rowIndex);
			rowDataBasedOnValue.put(value, rowData);
		});
		return rowDataBasedOnValue;
	}

	public Map<String, String> getDataBasedOnColumnToColumnMapping(String columnName1, String columnName2) {
		List<String> columnData1 = getColumnData(columnName1);
		List<String> columnData2 = getColumnData(columnName2);
		Map<String, String> rowDataBasedOnValue = new HashMap<>();
		for (int i = 0; i < columnData1.size(); i++) {
			rowDataBasedOnValue.put(columnData1.get(i), columnData2.get(i));
		}
		return rowDataBasedOnValue;
	}

	public List<List<String>> getAllRowsAndColumnsData() {
		int totalNumberOfRows = getRowCount();
		int totalNumberOfColumns = getColumnCount();
		String[][] allData = new String[totalNumberOfRows][totalNumberOfColumns];
		for (int row = 1; row <= totalNumberOfRows; row++) {
			for (int col = 0; col < totalNumberOfColumns; col++) {
				allData[row - 1][col] = getCellData(row, col);
			}
		}
		return Arrays.stream(allData).map(a -> Stream.of(a).collect(Collectors.toCollection(ArrayList::new))).collect(
				Collectors.toCollection(ArrayList::new));
	}

	public void closeResources() {
		try {
			workbook.close();
			fis.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}