package StepDef;

import static Utilities.propertyReader.getURL;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.serialization.ValidatingObjectInputStream;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;

	public static void initialization() {
		
		WebDriverManager.chromedriver().setup();
		//Create a map to store  preferences 
		Map<String, Object> prefs = new HashMap<String, Object>();

		//add key and value to map as follow to switch off browser notification
		//Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);

		//Create an instance of ChromeOptions 
		ChromeOptions options = new ChromeOptions();

		// set ExperimentalOption - prefs 
		options.setExperimentalOption("prefs", prefs);

		driver=new ChromeDriver(options);
		driver.navigate().to(getURL());
		driver.manage().window().maximize();
		
		
		
		
	}
}
