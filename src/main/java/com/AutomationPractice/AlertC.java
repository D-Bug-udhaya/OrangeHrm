package com.AutomationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertC {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		WebElement sim = driver.findElement(By.id("simple_result"));
		String text = sim.getText();
		System.out.println("Text after click the ok button:"+text);
//		
//		String text2 = driver.findElement(By.id("simple_result")).getText();
//		System.out.println(text2);
//	
//
		//confirm
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		driver.switchTo().alert().dismiss();
//		
		
		//prompt
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		driver.switchTo().alert().sendKeys("D-Bug");
		driver.switchTo().alert().accept();
		
//		
		
	}

}
