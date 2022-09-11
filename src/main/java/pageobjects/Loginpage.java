package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.*;

public class Loginpage extends Testbase{
	
	@FindBy(id = "user-name")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement pass;
	
	@FindBy(id = "login-button")
	WebElement login;
	
	public Loginpage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String getpageTitle() {
		return driver.getTitle();
		
	}
	public Homepage proceed(String un, String pwd) {
		username.sendKeys(un);
		pass.sendKeys(pwd);
		login.click();
		return new Homepage();
	}

}
