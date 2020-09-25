package com.authorcafe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
	
	static WebDriver driver;
	
	public static WebDriver launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Author\\target\\chromedriver.exe");
		
		return driver;
			
	}
	
	public static  void url(String url) {
		
		driver.get(url);
		

	}
	
	public static  void typevalue(WebElement element, String value) {
		
		element.sendKeys(value);
		
	
	}
	public static void clickIt(WebElement element) {
		
		element.click();
		

	}

}
