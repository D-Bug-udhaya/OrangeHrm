package stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OLoginCredintials {

	    WebDriver driver;

	  
	    @Given("User is on OrangeHRM login page")
	    public void user_is_on_orangehrm_login_page() {
	        // Write code here that turns the phrase above into concrete actions
	    	  driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://opensource-demo.orangehrmlive.com/");

	    }
	    @When("User enters username {string} and password {string}")
	    public void user_enters_username_and_password(String uname, String pwd) {
	        driver.findElement(By.name("username")).sendKeys(uname);
	        driver.findElement(By.name("password")).sendKeys(pwd);
	    }

	    @When("Clicks on login button")
	    public void clicks_on_login_button() {
	        // Write code here that turns the phrase above into concrete actions
	    	  driver.findElement(By.xpath("//button[@type='submit']")).click();

	    }
	    @Then("User should be navigated to the dashboard")
	    public void user_should_be_navigated_to_the_dashboard() {
	        // Write code here that turns the phrase above into concrete actions
	    	  boolean status = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		        if (status) {
		            System.out.println("✅ Login Successful – Dashboard displayed!");
		        }
		        driver.quit();
	    }



	    }
	



