package com.testngAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
WebDriver driver=new ChromeDriver();
@Test(priority=1)
public void testAssertions() throws InterruptedException {
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	String actual=driver.getTitle();
	String expected="OrangeHRM";
		//assertEquals
	Assert.assertEquals(actual,expected,"Title Mismatch");
	Thread.sleep(5000);
}

@Test(priority=2)
public void login() {
	//2. assertTrue
	
	WebElement username = driver.findElement(By.name("username"));
	WebElement pwd=driver.findElement(By.name("password"));
	
	username.sendKeys("Admin");
	pwd.sendKeys("admin123");
	WebElement log = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	log.click();
	
	boolean loginStatus=true;
	Assert.assertTrue(loginStatus,"LoginStatus should be true");
	
}
//3.assertFalse
@Test(priority=3)
public void errorMessageDisplayed() {	
WebElement error = driver.findElement(By.xpath("(//p[contains(@class,alert)])[1]"));
boolean errorMsg= error.isDisplayed();
Assert.assertFalse(errorMsg,"Error msg should not be displayed");
	
}
	//4.assertNotNull
	
@Test(priority=4)
public void userName() {
	WebElement username = driver.findElement(By.name("username"));
	username.sendKeys(null);
	Assert.assertNotNull(username,"UserName shuld not be null");
	

	
//	String session=null;
//	Assert.assertNotNull(session,"session should be null initiallu!");
	
	

}
}
