package com.JanSeleniumBDD.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData {

	public static String testCaseName = null;

	public static String value = null;

	public static String key = null;

	public static Map<String, String> map = null;
	
	public static void main(String[] args) {
		readDataFromExcel("FB");
	}

	public static Map<String, String> readDataFromExcel(String tcName) {
		try {

			File file = new File("E:\\BrowserDriver\\Test.xlsx");

			FileInputStream fin = new FileInputStream(file);

			XSSFWorkbook wb = new XSSFWorkbook(fin);

			XSSFSheet sh = wb.getSheet("Data");

			int rows = sh.getLastRowNum() - sh.getFirstRowNum();

			int cols = sh.getRow(0).getLastCellNum();

			map = new HashMap<String, String>();

			for (int i = 1; i <= rows; i++) {

				testCaseName = sh.getRow(i).getCell(0).getStringCellValue();

				if (testCaseName.equals(tcName)) {

					for (int j = 1; j < cols; j++) {

						key = sh.getRow(0).getCell(j).getStringCellValue();

						if (!sh.getRow(i).getCell(j).getCellType().equals("BLANK")) {

							if (sh.getRow(i).getCell(j).getCellType() == CellType.STRING) {

								value = sh.getRow(i).getCell(j).getStringCellValue();

							} else if (sh.getRow(i).getCell(j).getCellType() == CellType.NUMERIC) {

								value = String.valueOf((int) sh.getRow(i).getCell(j).getNumericCellValue());
							} else {

								value = sh.getRow(i).getCell(j).getRawValue();
							}
						}
						map.put(key, value);
					}
				}
			}
			wb.close();

		} catch (Exception e) {

			System.out.println(e.getMessage());
			
			e.printStackTrace();
		}

		return map;
	}

}
