package com.flsmith.testcases;

import org.testng.annotations.Test;

import com.flsmith.base.TestBase;
import com.flsmith.pages.EnterpriseDowntime;
import com.flsmith.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	EnterpriseDowntime enterpriseDowntime;
	
	public LoginPageTest() {
		super();
	}
  
  @BeforeMethod
  public void setUp() {
	  initialization();
	  loginpage = new LoginPage();
  }
  
  
  //@AfterMethod
  //public void tearDown() {
	  //driver.quit();
  //}
  
  @Test
  public void loginTest() {
	  enterpriseDowntime = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));	  
  }

}
