package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

import dev.failsafe.internal.util.Assert;

public class Homepage extends Testbase{
	
	@FindBy (className = "app_logo")
	WebElement logo;
	
	@FindBy (id = "react-burger-menu-btn")
	WebElement menu;
	
	@FindBy (xpath = "//*[contains(text(),'Products')]")
	WebElement heading;
	
	@FindBy (className = "product_sort_container")
	WebElement sortselect;
	
	@FindBy (className = "shopping_cart_link")
	WebElement cartlink;
	
	@FindBy (id = "add-to-cart-sauce-labs-backpack")
	WebElement prod;
	
	@FindBy (xpath = "//div[@class='shopping_cart_container']//a//span")
	WebElement cartnum;
	
	
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean logovisible() {
		return logo.isDisplayed();
	}
	
	public boolean menuvisible() {
		return menu.isDisplayed();
	}
	
	public WebElement addToCart() {
		prod.click();
		return cartnum;
	}
	

}
