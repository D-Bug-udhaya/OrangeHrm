package com.rerunscriptss;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestCases {
	
	WebDriver driver;
	
	@BeforeTest
	public void browserInitialize() {
		driver=new ChromeDriver();
		driver.get("https:www.facebook.com");

	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	@Test(retryAnalyzer = RerunScript.class)
	public void testMethod() {
		String title=driver.getTitle();
		assertEquals(title, "instagram");//assertEquals(actual,expedted
	}

}
