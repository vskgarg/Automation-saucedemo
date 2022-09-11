package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;

import pageobjects.Homepage;
import pageobjects.Loginpage;

public class LoginTest extends Testbase{
	Loginpage loginpage;
	Homepage h;
	public LoginTest() {
		super();
		
		//Loginpage loginPage = new Loginpage();
	}
	@BeforeMethod
	public void setup() {
		initialise();
		loginpage = new Loginpage();
		
		
		
	}
	
	@Test
	public void titleTest() {
		
		//Loginpage loginPage = null;
		//Loginpage loginPage;
		String title = loginpage.getpageTitle();
		Assert.assertEquals(title, "vishakha");
		
	}
	
	@Test
	
	public void logg() {
		loginpage.proceed("standard_user", "secret_sauce");
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
