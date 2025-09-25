package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
//	io.cucumber.junit.UndefinedStepException: The step 'User is on OrangeHRM login page' and 3 other step(s) are undefined.
//	You can implement these steps using the snippet(s) below:

	@Given("User is on OrangeHRM login page")
	public void user_is_on_orange_hrm_login_page() {
		driver=new ChromeDriver();
	    // Write code here that turns the phrase above into concrete actions	
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("User enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	//	throw new io.cucumber.java.PendingException();
	}
	@When("Clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	    // Write code here that turns the phrase above into concrete actions
	  
	}
	@Then("User should be navigated to the dashboard")
	public void user_should_be_navigated_to_the_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status= driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		if(status) {
			System.out.println("Login Successful- Dashboard displayed!!");
		}
		driver.quit();
	
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
