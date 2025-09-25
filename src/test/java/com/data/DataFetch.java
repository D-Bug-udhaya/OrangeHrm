package com.data;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DataFetch{
	
	private static void fbLogin() throws EncryptedDocumentException, IOException, InterruptedException {
		        // Excel file
		        FileInputStream fis = new FileInputStream("C:\\\\Users\\\\admin\\\\HandOnProject\\\\AutomationPractice\\\\Datas\\\\data.xlsx");
		        Workbook wb = WorkbookFactory.create(fis);
		        Sheet sheet = wb.getSheetAt(0);
		        System.out.println("Total rows: " + sheet.getLastRowNum());
		        // Selenium driver
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.facebook.com/login");

		        
		        DataFormatter formatter = new DataFormatter();
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
		            Row row = sheet.getRow(i);
		            if (row == null) continue;

		            String username = formatter.formatCellValue(row.getCell(0));
		            String password = formatter.formatCellValue(row.getCell(1));

		            if (username.isEmpty() || password.isEmpty()) continue;

		            System.out.println("Trying login → " + username + " | " + password);

		            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		            emailField.clear();
		            emailField.sendKeys(username);

		            WebElement passField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		            passField.clear();
		            passField.sendKeys(password);

		            driver.findElement(By.name("login")).click();
		            Thread.sleep(4000);

		            driver.get("https://www.facebook.com/login");  // reload for next credentials
		        }

//		        
//		        DataFormatter formatter = new DataFormatter();
//
//		        int lastRow = sheet.getLastRowNum();
//		        System.out.println("Total rows: " + lastRow);
//
//		        for (int i = 0; i <= lastRow; i++) {
//		            Row row = sheet.getRow(i);
//
//		            if (row == null) {
//		                System.out.println("Row " + i + " is NULL");
//		                continue;
//		            }
//
//		            for (int j = 0; j < row.getLastCellNum(); j++) {
//		                String cellValue = formatter.formatCellValue(row.getCell(j));
//		                System.out.print(" | " + cellValue);
//		            }
//		            System.out.println();
//		        }

//		        DataFormatter formatter = new DataFormatter();
//
//		        for (int i = 1; i <= sheet.getLastRowNum(); i++) {   // start from 0 if no header
//		            Row row = sheet.getRow(i);
//		            if (row == null) continue;
//
//		            String username = formatter.formatCellValue(row.getCell(0));
//		            String password = formatter.formatCellValue(row.getCell(1));
//
//		            if (username.isEmpty() || password.isEmpty()) continue;
//
//		            System.out.println("Row " + i + " → Username: [" + username + "], Password: [" + password + "]");
//
//		            WebElement emailField = driver.findElement(By.id("email"));
//		            emailField.clear();
//		            emailField.sendKeys(username);
//
//		            WebElement passField = driver.findElement(By.id("pass"));
//		            passField.clear();
//		            passField.sendKeys(password);
//
//		            Thread.sleep(2000);
//
//		            driver.findElement(By.name("login")).click();
//		            Thread.sleep(4000);
//		        }
		       
		        wb.close();
		        fis.close();
		    }
		

public static void fb() throws IOException {
	 FileInputStream file = new FileInputStream("C:\\Users\\admin\\HandOnProject\\AutomationPractice\\Datas\\data.xlsx");
     
     // Workbook open
 	XSSFWorkbook wb=new XSSFWorkbook(file);
     
     // 1st sheet select
     Sheet sheet = wb.getSheetAt(0);
     
     // Total rows & columns
     int totalRows = sheet.getPhysicalNumberOfRows();
     int totalCols = sheet.getRow(0).getPhysicalNumberOfCells();
     
     // Loop rows
     for (int i = 1; i < totalRows; i++) {   // i=1 → header skip
         Row row = sheet.getRow(i);
         
         // Loop columns
         for (int j = 0; j < totalCols; j++) {
             Cell cell = row.getCell(j);
             System.out.print(cell.toString() + "   ");
         }
         System.out.println();
     }
     
    wb.close();
     file.close();
     
     
 }
	    public static void main(String[] args) throws Exception {     
	        // Excel file path
	    	fbLogin();
	       
	}
}
	
