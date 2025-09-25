package stepdefinitions;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

	import org.junit.Assert;

	public class AdactinStep{
		public static WebDriver driver;
		
		@Given("user launches the Adactin hotel application")
		public void user_launches_the_adactin_hotel_application() {
			driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://adactinhotelapp.com/");
		}
		@Given("user logs in with username {string} and password {string}")
		public void user_logs_in_with_username_and_password(String string, String string2) {
			driver.findElement(By.id("username")).sendKeys(string);
	        driver.findElement(By.id("password")).sendKeys(string2);
	        driver.findElement(By.id("login")).click();
		  //  throw new io.cucumber.java.PendingException();
		}
		@When("user selects location {string}, hotel {string}, room type {string}, number of rooms {string}")
		public void user_selects_location_hotel_room_type_number_of_rooms(String string, String string2, String string3, String string4) {
			WebElement loc = driver.findElement(By.name("location"));
	    	
	    	Select s=new Select(loc);
	    	s.selectByIndex(3);
	    	WebElement hot = driver.findElement(By.id("hotels"));
	    	Select s1=new Select(hot);
	    	s1.selectByIndex(2);
	    	WebElement room = driver.findElement(By.id("room_type"));
	    	Select s2=new Select(room);
	    	s2.selectByIndex(1);
	    	
	    	WebElement no = driver.findElement(By.id("room_nos"));
	    	Select s3=new Select(no);
	    	s3.selectByIndex(2);
		  //  throw new io.cucumber.java.PendingException();
		}
		@When("user selects check-in date {string} and check-out date {string}")
		public void user_selects_check_in_date_and_check_out_date(String string, String string2) {
			 driver.findElement(By.id("datepick_in")).clear();
	         driver.findElement(By.id("datepick_in")).sendKeys(string);
	         driver.findElement(By.id("datepick_out")).clear();
	         driver.findElement(By.id("datepick_out")).sendKeys(string2);
		//    throw new io.cucumber.java.PendingException();
		}
		@When("user enters adults per room {string} and children per room {string}")
		public void user_enters_adults_per_room_and_children_per_room(String string, String string2) {
			WebElement adult = driver.findElement(By.id("adult_room"));
	    	Select s=new Select(adult);
	    	s.selectByIndex(2);
	    	
	    	WebElement child = driver.findElement(By.id("child_room"));
	    	Select s1=new Select(child);
	    	s1.selectByIndex(2);
		 //   throw new io.cucumber.java.PendingException();
		}
		@Then("user should see available hotels list")
		public void user_should_see_available_hotels_list() {
	        Assert.assertTrue(driver.findElement(By.id("radiobutton_0")).isDisplayed());
		   // throw new io.cucumber.java.PendingException();
		}



	   
	}

