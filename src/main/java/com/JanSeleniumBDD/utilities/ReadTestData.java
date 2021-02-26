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

	public static void main(String[] args) throws Exception {

		//readDataFromExcel();

		/*
		 * String num = "9966";
		 * 
		 * int v = Integer.parseInt(num);
		 * 
		 * System.out.println(v);
		 * 
		 * int u = 9955;
		 * 
		 * String s = String.valueOf(u);
		 * 
		 * System.out.println(s);
		 * 
		 */
		Map<String, String> map = new HashMap<String,String>();
		
		
		map.put("Name", "Suresh");
		
		map.put("Course", "Selenium");
		
		map.put("City", "Hyderabad");
		
		map.put("5", "Vijayawada");
		
		System.out.println(map);
		
		System.out.println(map.get("5"));
		
		System.out.println(map.get("Name"));
		
		map.put("Email", "Selenium189@gmail.com");
		
		
		map.put("About_US", "Quora");
		
		
		map.get("Email");
		
		
	}

	public static void readDataFromExcel() throws Exception {

		File file = new File("E:\\BrowserDriver\\Test.xlsx");

		FileInputStream fin = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fin);

		XSSFSheet sh = wb.getSheet("Data");

		int rows = sh.getLastRowNum() - sh.getFirstRowNum();

		int cols = sh.getRow(0).getLastCellNum();

		for (int i = 1; i <= rows; i++) {

			testCaseName = sh.getRow(i).getCell(0).getStringCellValue();

			for (int j = 1; j < cols; j++) {

				if (sh.getRow(i).getCell(j).getCellType() == CellType.STRING) {

					value = sh.getRow(i).getCell(j).getStringCellValue();

				} else if (sh.getRow(i).getCell(j).getCellType() == CellType.NUMERIC) {

					value = String.valueOf((int) sh.getRow(i).getCell(j).getNumericCellValue());
				} else {

					value = sh.getRow(i).getCell(j).getRawValue();
				}

			}
		}

		System.out.println(testCaseName);

		System.out.println(value);

		wb.close();

	}
}
