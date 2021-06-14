package com.datasource;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.utility.UtilityFunctions;

public class DataUtility {

	
	@DataProvider(name="Calculator")
	public static Object[][] getData() throws IOException{
		
		String filename = "C:\\Users\\Ankit Gaba\\Desktop\\testngdata.xlsx";
		String sheetname = "Sheet1";
		
		
		Object[][] testdata = UtilityFunctions.readExcel(filename, sheetname) ;
				return testdata;
	}
	
	
}
