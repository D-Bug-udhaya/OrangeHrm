package com.data;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Wait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dd=new ChromeDriver();
		dd.get("https://letcode.in/waits");
		dd.findElement(By.id("accept")).click();
		WebDriverWait wait = new WebDriverWait(dd, Duration.ofSeconds(3)); // 10 seconds timeout
		wait.until(ExpectedConditions.alertIsPresent());
		dd.switchTo().alert().accept();
		// Assuming 'driver' is your WebDriver instance
	
		
	
	}

}
