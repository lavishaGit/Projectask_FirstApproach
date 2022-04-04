package StepDef;
import static org.junit.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.codec.binary.Base64;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Login;

import static Utilities.propertyReader.*;
public class loginStepDefinition extends Base  {
	
	Login log;
	
	@Given("User is on Facebook Log-In Screen of the application")
	public void user_is_on_facebook_log_in_screen_of_the_application() throws IOException {
		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		Base.initialization();
		 log=new Login(driver);

		
//driver.navigate().to(getURL());
//driver.manage().window().maximize();

//log.setUsername();
//log.setPassword();
//log.clickSubmit();
		
	}

	@When("User enters valid Login Name  and Password and clicks on login button")
	public void user_enters_valid_login_name_and_password_and_clicks_on_login_button() throws InterruptedException {

        log.setUsername();
		log.setPassword();
		log.clickSubmit();
	    
	}
	
	@Then("User navigate to Facebook Home Page")
	public void user_navigate_to_facebook_home_page() {
	assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
driver.close();
	}
	

}
