package com.dd;


	import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import java.io.FileInputStream;

	public class fbLogin{
	    public static void main(String[] args) throws Exception {
	        // Excel file path
	        FileInputStream fis = new FileInputStream("C:\\Users\\admin\\HandOnProject\\AutomationPractice\\Datas\\data.xlsx");
	    	XSSFWorkbook wb=new XSSFWorkbook(fis);
	        Sheet sheet = wb.getSheetAt(0);

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // loop rows (skip header row 0)
	        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
	            Row row = sheet.getRow(i);
	            if (row == null) continue; // skip empty row

	            Cell userCell = row.getCell(0);
	            Cell passCell = row.getCell(1);

	            if (userCell == null || passCell == null) continue; // skip if any cell empty

	            String username = userCell.toString();
	            String password = passCell.toString();

	            System.out.println("Trying login for: " + username);

	            driver.get("https://www.facebook.com");

	            WebElement email = driver.findElement(By.id("email"));
	            WebElement pass = driver.findElement(By.id("pass"));
	            WebElement loginBtn = driver.findElement(By.name("login"));

	            email.clear();
	            email.sendKeys(username);
	            pass.clear();
	            pass.sendKeys(password);
	            loginBtn.click();

	            Thread.sleep(3000); // wait few seconds before next iteration
	        }
	        Thread.sleep(10000); // keep browser open for 10 seconds
	       

	        driver.quit();
	        wb.close();
	        fis.close();
	    }
	}


