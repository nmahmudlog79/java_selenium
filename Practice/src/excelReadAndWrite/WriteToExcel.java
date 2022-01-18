package excelReadAndWrite;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {
	
	public static void main(String[] args) {

		// The location where the excel file will be created
		// Absolute path
		// String filePath =
		// "C:/Users/Mahmud/eclipse-workspace/Practice/DataTest/TestData.xlsx";
		// Relative path
		String filePath = "../Practice/DataTest/TestData.xlsx";

		// Name of the file with extension .xlsx ---TestData.xlsx

		// workbook >> SpreadSheet
		// SpreadSheet >>Based on Row and Column I want to insert data

		Object[][] studentInfo = { { "Sl", "firstName", "lastName", "Address" },
				{ "101", "Jack", "Cohen", "Manhattan,NYC" }, { "102", "Amir", "Tabti", "NJ,USA" },
				{ "103", "Maheen", "Bokhari", "NJ,USA" }, { "104", "Tahmina", "Rashid", "Long Island,NY" }, };

		writeToExcelFile(filePath, studentInfo, "stdDetails");

	}

	public static void writeToExcelFile(String filePath, Object[][] input, String sheetName) {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("sheetName");
		int rowNumber = 0;

		for (Object[] data : input) {
			Row row = sheet.createRow(rowNumber++);
			int colNumber = 0;

			for (Object field : data) {
				Cell cell = row.createCell(colNumber++);
				if (field instanceof String) {
					cell.setCellValue((String) field);
				} else if (field instanceof Integer) {
					cell.setCellValue((Integer) field);
				}
				
			}
		}
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(filePath);
			workbook.write(fileOutputStream);
			System.out.println("Excel file is created");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
