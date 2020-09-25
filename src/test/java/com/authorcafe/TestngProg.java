package com.authorcafe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestngProg extends BaseClass {
	
	@Test
	
	public void case1() {
		
		launchBrowser();
		url("https://authorcafe.com/sign-in/");
		
		LoginPagePom obj = new LoginPagePom();
		typevalue(obj.getUserName(), "aucsdet@yopmail.com");
		typevalue(obj.getPass(), "Authorcafe@123");
		clickIt(obj.getSignin());
        typevalue(obj.getEdit(), "Hello World");
	}
	
	@Test
	
	private void case2() {
		
		launchBrowser();
		url("https://www.pagecentralhub.com/ondemand/dashboard/output.html?accessCode=Jj2eSOUUDn");
		List<WebElement> totallines = driver.findElements(By.tagName("div"));
        int size = totallines.size();
        
        List<WebElement> linesends = driver.findElements(By.xpath("//span[contains(text(),'-')]"));
        int size2 = linesends.size();
 
         int hyphenationratio = size2/size;
         System.out.println(hyphenationratio);
	}
	
	

}
