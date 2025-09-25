package com.AutomationPractice;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Scanner;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
public class BaseClass {
    public static WebDriver driver;
    public static WebDriverWait wait;
    
    public static void launchBrowser(String url) {
    	driver=new ChromeDriver();
    	driver.get(url);
    }
    //webElement.send("values");
    public static void passValue(WebElement ele,String value) {
    	ele.sendKeys(value);
    	
    }
    //webelemnet.click();
    public static void clickOnElement(WebElement ele) {
    	ele.click();
    }

    // Quit Browser
    public void quitBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    // ============= Reusable Methods =============

    // Click
    public static void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    // Send Keys
    public static void type(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
    }

    // Get Text
    public String getText(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    // Get Attribute
    public String getAttribute(WebElement element, String attribute) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getAttribute(attribute);
    }

    // Dropdown Select
    public void selectByVisibleText(WebElement element, String value) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Select sel = new Select(element);
        sel.selectByVisibleText(value);
    }

    public void selectByValue(WebElement element, String value) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Select sel = new Select(element);
        sel.selectByValue(value);
    }

    public void selectByIndex(WebElement element, int index) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Select sel = new Select(element);
        sel.selectByIndex(index);
    }

    // Explicit Wait for Element
    public WebElement waitForElement(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Alert Handling
    public void acceptAlert() {
        wait.until(ExpectedConditions.alertIsPresent()).accept();
    }

    public void dismissAlert() {
        wait.until(ExpectedConditions.alertIsPresent()).dismiss();
    }

    public String getAlertText() {
        return wait.until(ExpectedConditions.alertIsPresent()).getText();
    }

    // Screenshot
    public void takeScreenshot(String fileName) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("screenshots/" + fileName + ".png"));
    }

    // Scroll Into View
    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // JavaScript Click
    public void jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    // Page Title
    public String getPageTitle() {
        return driver.getTitle();
    }

    // Current URL
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}

