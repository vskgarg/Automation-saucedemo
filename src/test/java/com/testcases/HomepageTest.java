package com.testcases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;

import pageobjects.Homepage;
import pageobjects.Loginpage;

public class HomepageTest extends Testbase{
	Loginpage log;
	Homepage home;
	public HomepageTest() {
		super();

	}
	
	@BeforeMethod
	public void setup1() {
		initialise();
		log = new Loginpage();
		home = log.proceed("standard_user", "secret_sauce");
		//home = new Homepage();
		
	}
	
	@Test
	
	public void logotest() {
		boolean res = home.logovisible();
		Assert.assertEquals(res, true);
		
	}
	
	@Test(enabled=false)
	
	public void menutest() {
		boolean res2 = home.menuvisible();
		Assert.assertEquals(res2, true);
	}
	
	@Test
	
	public void addCart() {
		WebElement res3= home.addToCart();
		//(By.xpath("//div[@class='text']//h2")).getText();
		//System.out.println(res3.getText());
		String r = res3.getText();
		Assert.assertEquals(r, "10");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
