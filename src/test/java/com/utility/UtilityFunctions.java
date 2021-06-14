package com.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilityFunctions {

	
	public static Object[][] readExcel( String fileName , String sheetName) throws IOException{
		
		FileInputStream fin = new FileInputStream(fileName);
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet sheet = wb.getSheet(sheetName);
		int rowcount , colcount;
		
		rowcount = sheet.getPhysicalNumberOfRows();
		colcount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] testdata = new String[rowcount-1][colcount];
		
		XSSFRow rw;
		XSSFCell cl;
		
		for(int i = 1 ; i<rowcount ; i++)
		{
			rw=sheet.getRow(i);
			for(int j=0 ; j<colcount;j++)
			{
				
				cl=rw.getCell(j);
				String cellvalue = cl.getStringCellValue();
				testdata[i-1][j] = cellvalue;				
				
				
			}
		}
		
		wb.close();
		
		return testdata;
		
	}
	
	
	
}
