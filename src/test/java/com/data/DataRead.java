package com.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataRead {
public static void main(String[] args) throws Throwable{
	FileInputStream f=new FileInputStream("C:\\Users\\admin\\HandOnProject\\AutomationPractice\\Datas\\data.xlsx");
	// to obtain input from the file
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet sheet=wb.getSheetAt(0);
	int rowCount = sheet.getPhysicalNumberOfRows();
	int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
	
	System.out.println("Rows :"+rowCount);
	for (int i = 0; i < rowCount; i++) {//i=1 i<4
		Row row = sheet.getRow(i);
		
		for(int j=0;j<colCount;j++) {
			Cell cell = row.getCell(j);
			System.out.println(cell.toString()+" ");
		}

	}
	wb.close();
	f.close();
}
}
