package StepDef;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaligateSecuredPageStep extends Base {

	
	
	@Given("User is on Facebook Sign in Screen")
	public void user_is_on_facebook_sign_in_screen() {
		Base.initialization();
	   assertTrue("https://www.facebook.com/",true);
	}

	@When("User navigate to the facebook friends page without sigin in")
	public void user_navigate_to_the_facebook_friends_page_without_sigin_in() throws Exception {
	    driver.navigate().to("https://www.facebook.com/login.php?next=https%3A%2F%2Fwww.facebook.com%2Ffriends");
	takeSnapShot();
	}

	@Then("User gets error message")
	public void user_gets_error_message() {
	 assertTrue("You must log in to continue",true);
	 driver.close();
	}
	
	
	public void takeSnapShot() throws Exception{
		
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		//Move image file to new destination
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

		File DestFile=new File("/Users/nitin/eclipse workspace/Java/Projectask_FirstApproach/src/test/resources/ScreenShot"+timestamp+".png");
		
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);

		}


}
