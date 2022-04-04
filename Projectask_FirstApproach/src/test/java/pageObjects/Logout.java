package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	WebDriver ldriver;
	

	public Logout(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//@FindBy(xpath ="//div[contains(@class,'j83agx80')]")
	@FindBy(xpath ="//div[@class='j83agx80 l9j0dhe7']")
	WebElement dropdown;

	@FindBy(xpath="//span[contains(text(),'Log Out')]")
	WebElement logout;
	
	public void dropDownClick() throws InterruptedException
	{
		dropdown.click();
		
	}
	public void logoutClick() throws InterruptedException
	{
		String ddString=logout.getText();
System.out.println("this is logout      "+ddString);
		logout.click();
	}

}
