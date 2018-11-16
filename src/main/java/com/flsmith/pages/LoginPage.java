package com.flsmith.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flsmith.base.TestBase;

public class LoginPage extends TestBase{
	
	//page Factory - OR
	@FindBy(name="Email")
	WebElement Email;
	
	@FindBy(name="Password")
	WebElement Password;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement SignInBtn;
	
	//Initializing the page object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions: 
	public EnterpriseDowntime login(String email,String pwd) {
		Email.sendKeys(email);
		Password.sendKeys(pwd);
		SignInBtn.click();
		
		return new EnterpriseDowntime();
	}
}
