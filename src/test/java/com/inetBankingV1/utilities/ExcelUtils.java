package com.inetBankingV1.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	
	public void ReadData() throws IOException{
	FileInputStream file= new FileInputStream("C:\\Users\\Hemant\\eclipse-workspace\\inetBankingV1\\src\\test\\java\\com\\inetBankingV1\\testData\\Logindata.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	int rowcount = sheet.getLastRowNum();
	
	int colcount= sheet.getRow(0).getLastCellNum();
	
	for(int i=0;i<=rowcount;i++)
	{
		XSSFRow currentRow=sheet.getRow(i);
		
		for(int j=0;i<=colcount;j++)
		{
			String value=currentRow.getCell(j).toString();
			System.out.println(value);
		}
	}
	
}
}