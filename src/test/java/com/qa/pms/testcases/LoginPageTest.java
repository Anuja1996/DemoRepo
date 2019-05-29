package com.qa.pms.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pms.base.TestBase;
import com.qa.pms.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;

	public LoginPageTest() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setUp() throws IOException {
		TestBase.initialization();
		loginpage=new LoginPage();
		
	}
	
	@Test(priority=1)
	public void validatePMSTextPresent() {
		boolean flag=loginpage.checkPmsTextPresent();
		log.info(flag);
		
	}
	
	@Test(priority=2)
	public void validateLoginTextPresent() {
		boolean flag1=loginpage.checkLoginTextPresent();
		log.info(flag1);
		
	}
	
	@Test(priority=3)
	public void validateUsernameLogoPresent() {
		boolean flag1=loginpage.checkUsernameLogoPresent();
		log.info(flag1);
	}
	
	@Test(priority=4)
	public void validatePasswordLogoPresent() {
		boolean flag1=loginpage.checkPasswordLogoPresent();
		log.info(flag1);
	}
	
	@Test(priority=5)
	public void validateLoginBtnPresent() {
		boolean flag1=loginpage.checkLoginBtnPresent();
		log.info(flag1);
	}
	
	@Test(priority=6)
	public void validateIsCheckBoxSelected() {
		boolean flag1=loginpage.IsCheckBoxSelected();
		log.info(flag1);
	}
	
	@Test(priority=7)
	public void validateRememberMeTextPresent() {
		boolean flag1=loginpage.checkRememberMeTextPresent();
		log.info(flag1);
	}
	
	@Test(priority=8)
	public void validateuserNamePlaceHolderPresent() {
		String title=loginpage.checkuserNamePlaceHolderPresent();
		Assert.assertEquals(title, "Username");
		
		
	}
	
	@Test(priority=9)
	public void validatePasswordPlaceHolderPresent() {
		String title=loginpage.checkPasswordPlaceHolderPresent();
		Assert.assertEquals(title, "Password");
		
		
	}
	@Test(priority=10)
	public void validatePasswordLinkPresent() {
		boolean flag=loginpage.checkPasswordForgottenLinkPresent();
		log.info(flag);
		
	}
	@Test(priority=10)
	public void validateClickOnPasswordLinkPresent() {
		loginpage.clickOnPasswordForgottenLinkPresent();
		
	}
	//.......................Login Test cases.......................//
	
	@Test(priority=11)
	public void validateBlankUserPassword() throws InterruptedException {
		loginpage.blankUserNamePassword();
		
	}
	@Test(priority=12)
	public void validateBlankUserValidPassword() throws InterruptedException {
		loginpage.blankUserNameValidPassword();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
