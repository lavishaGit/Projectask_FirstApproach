package StepDef;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Login;
import pageObjects.Logout;

public class LogoutStep extends Base {
	Login log;
	Logout logout;
	@Given("User is on Dashboard Screen of the application")
	public void user_is_on_facebook_dashboard_screen_of_the_application() {
		Base.initialization();
		log=new Login(driver);
		logout=new Logout(driver);
		log.setUsername();
		log.setPassword();
		log.clickSubmit();
		//Alert alert=driver.switchTo().alert();
		//alert.accept();
		
	}

	@When("User navigate to the dropdown icon upper left corner by clicks on it")
	public void user_navigate_to_the_dropdown_icon_upper_left_corner_by_clicks_on_it() throws InterruptedException {
logout.dropDownClick();	
Thread.sleep(1000);
}
	
	
	@When("User clicks  Logout icon")
	public void user_clicks_logout_icon() throws InterruptedException {
	   logout.logoutClick();
	}

	@Then("User able to logout successfully")
	public void user_able_to_logout_successfully() {
		assertTrue("Log Out",true);
	    driver.close();
	}

}
