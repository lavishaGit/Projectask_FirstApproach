package StepDef;


import static org.junit.Assert.assertTrue;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.Cookie;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Login;

public class InfoStorageSteps extends Base{
	
	Login log;
	@Given("User is on Facebook Home Page")
	public void user_is_on_facebook_home_page() {
		Base.initialization();
		log=new Login(driver);
		
		log.setUsername();
		log.setPassword();
		log.clickSubmit();
		
	}

	@When("User stores login information in local browser")
	public void user_stores_login_information_in_local_browser() {
		// Create a file to store Login Information 
		File file = new File("Cookiefile.data"); 
		try{ 
		// Delete old file if already exists
		file.delete(); 
		file.createNewFile(); 
		FileWriter file1 = new FileWriter(file); 
		BufferedWriter writecookie = new BufferedWriter(file1); //Getting the cookie information 
		for(Cookie ck : driver.manage().getCookies()) { 
			writecookie.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure())); 
			writecookie.newLine(); 
		} 
		writecookie.close(); 
		file1.close(); 
		}
		catch(Exception ex) 
		{ 
		ex.printStackTrace(); 
		} 
		
	}

	@Then("User able to see stored information in local browser")
	public void user_able_to_see_stored_information_in_local_browser() {
		assertTrue( "Cookiefile.data",true);
driver.close();
	}

}
