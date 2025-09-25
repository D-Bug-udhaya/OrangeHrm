package com.data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	WebElement original = driver.findElement(By.xpath("(//div[text()='Shiv "
			+ "Trishul Damru Gold-plated Locket with Rudraksha Mala'])[1]"
			+ "//following::span[1]"));
	WebElement dis = driver.findElement(By.xpath("(//span[@class='mrp'])[5]"));
	//   (//span[@class="discount-price strike"])[5]//following-sibling::*
	
	System.out.println("Original price:"+original.getText());
	System.out.println("Discount price:"+dis.getText());


}
}
