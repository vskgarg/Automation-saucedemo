package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public Testbase() {
		
		try {
			prop = new Properties();
			FileInputStream input = new FileInputStream("/com.firstestng/src/main/resources/com/qa/config/config.properties");
			prop.load(input);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialise(){
		//String BrowserName = prop.getProperty("browser");
		
		String BrowserName = "firefox";
		
		if(BrowserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","C:\\chrome102\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		
		
	}

}
