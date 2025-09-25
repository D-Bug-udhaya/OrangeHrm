package comjs;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaSc {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.automationpractice.pl/index.php");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000);");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,-1000);");
	
	WebElement fb = driver.findElement(By.xpath("//h4[text()='Follow us on Facebook']"));
	js.executeScript("arguments[0].scrollIntoView(true);",fb);
	
	js.executeScript("alert('this is D-Bug!!');");
	driver.switchTo().alert().accept();
	
	
}
}
