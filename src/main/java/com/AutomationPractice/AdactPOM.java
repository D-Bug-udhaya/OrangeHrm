package com.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactPOM {
	public WebDriver driver;//driver=null
	//WebElement username;
	//driver.findElement(by.id("username"));

	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="password")	
	private WebElement pwd;
	
	@FindBy(id="login")
	private WebElement log;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLog() {
		return log;
	}
	
	public AdactPOM(WebDriver abc){
		this.driver=abc;
		PageFactory.initElements(driver,this);
	}
	
	

}
