package com.dd;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWrite {
	public static void main(String[] args) throws IOException {

		String file = "C:\\Users\\admin\\HandOnProject\\AutomationPractice\\Datas\\Employee.xlsx";
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet("Employeename");
		// Row 1
		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Name");
		header.createCell(1).setCellValue("Email");
		header.createCell(2).setCellValue("Mobile");

		// Row 2
		Row data = sheet.createRow(1);
		data.createCell(0).setCellValue("Anto");
		data.createCell(1).setCellValue("anto@123");
		data.createCell(2).setCellValue("83473781456");

		// Row 3
		Row data1 = sheet.createRow(2);
		data1.createCell(0).setCellValue("Vijay");
		data1.createCell(1).setCellValue("Vijay@123");
		data1.createCell(2).setCellValue("292331456");

		
		//Autosized:
		for (int i = 0; i < 3; i++) {
			sheet.autoSizeColumn(i);
		}
		
		FileOutputStream fos=new FileOutputStream(file);
		wb.write(fos);
		wb.close();
		fos.close();
		
		System.out.println("Data written into excel successfully"+file);
		
		
		
	}

}
