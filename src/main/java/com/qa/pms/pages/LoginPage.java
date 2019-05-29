package com.qa.pms.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.pms.base.TestBase;

public class LoginPage extends TestBase{

	
	
@FindBy(xpath="//div[@class='login-page-logo']")
WebElement pmsText;

@FindBy(xpath="//h3[@class='form-title']")
WebElement loginText;

@FindBy(xpath="//i[@class='fa fa-user']")
WebElement usernameLogo;

@FindBy(xpath="//i[@class='fa fa-lock']")
WebElement passwordLogo;

@FindBy(xpath="//button[@type=\'submit\']")
WebElement loginBtn;

@FindBy(xpath="//*[@id=\"uniform-remember_me\"]/span")
WebElement checkBox;


@FindBy(xpath="//*[@id=\"login_form\"]/div[3]/label")
WebElement remembermeText;


@FindBy(xpath="//input[@placeholder='Username']")
WebElement userNamePlaceHolder;

@FindBy(xpath="//input[@placeholder='Password']")
WebElement passwordPlaceHolder;

@FindBy(xpath="//a[contains(text(),'Password forgotten?')]")
WebElement passwordforgottenLink;

@FindBy(xpath="//a[contains(text(),'Rukovoditel')]")
WebElement RukovoditelLink;

@FindBy(xpath="//small[contains(text(),'Powered by')]\r\n")
WebElement totalRukovoditelLink;

@FindBy(xpath=" //input[@placeholder='Username']")
WebElement username;

@FindBy(xpath=" //input[@placeholder='Password']")
WebElement password;

public LoginPage() throws IOException {
	PageFactory.initElements(driver, this);
	
}
public boolean checkPmsTextPresent() {
	return pmsText.isDisplayed();
	
}
public boolean checkLoginTextPresent() {
	return loginText.isDisplayed();
	
}

public boolean checkUsernameLogoPresent() {
	return usernameLogo.isDisplayed();
	
}

public boolean checkPasswordLogoPresent() {
	return passwordLogo.isDisplayed();
	
}

public boolean checkLoginBtnPresent() {
	return loginBtn.isDisplayed();
	
}

public boolean IsCheckBoxPresent() {
	return checkBox.isDisplayed();
	
}

public boolean IsCheckBoxSelected() {
	return checkBox.isSelected();
	
}
public boolean checkRememberMeTextPresent() {
	return remembermeText.isDisplayed();
	
}

public String checkuserNamePlaceHolderPresent() {
	return userNamePlaceHolder.getAttribute("placeholder");	
}
public String checkPasswordPlaceHolderPresent() {
	return passwordPlaceHolder.getAttribute("placeholder");	
}
public boolean checkPasswordForgottenLinkPresent() {
	return passwordforgottenLink.isDisplayed();
}
public void clickOnPasswordForgottenLinkPresent() {
	 passwordforgottenLink.click();
	driver.navigate().back();
}
public void blankUserNamePassword() throws InterruptedException {
	username.sendKeys("");
	Thread.sleep(5000);
	password.sendKeys("");
	Thread.sleep(5000);
	loginBtn.click();
	Thread.sleep(2000);
	
}




}
