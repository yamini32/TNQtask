package com.authorcafe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePom extends BaseClass {
	
	public LoginPagePom() {

PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "username")
	private WebElement userName;
	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPass() {
		return pass;
	}

	@FindBy(xpath = "//input[@type = 'password']")
	private WebElement pass;
	
	@FindBy(xpath = "//input[@value='Sign In']")
	private WebElement signin;
	
	@FindBy(xpath = "//p[@class=\"abunit para activeElement\"]")
	private WebElement edit;

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getSignin() {
		return signin;
	}
	

}
