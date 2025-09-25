import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Buttons {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demoqa.com/buttons");
		Actions a = new Actions(driver);
//		WebElement dc = driver.findElement(By.id("doubleClickBtn"));
//		a.doubleClick(dc).build().perform();
//		WebElement rc = driver.findElement(By.id("rightClickBtn"));
//		a.contextClick(rc).build().perform();
//		WebElement cm = driver.findElement(By.xpath("//button[text()='Click Me']"));
//		a.click(cm).build().perform();
		driver.get("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement drop = driver.findElement(By.xpath("(//p[text()='Drop here'])[1]"));
		
	//	a.dragAndDrop(drag, drop).build().perform();
		a.clickAndHold(drag).moveToElement(drop).build().perform();
		
		
		//https://www.leafground.com/drag.xhtml-->practice website
		
	}

}
