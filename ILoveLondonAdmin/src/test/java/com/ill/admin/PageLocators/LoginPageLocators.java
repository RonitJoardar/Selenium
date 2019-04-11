package com.ill.admin.PageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import com.ill.admin.TestBase.TestBase;

public class LoginPageLocators {
	
	
	@FindBy(how=How.XPATH, using=".//*[@id='username']") 
	public WebElement Username_Tb;
	@FindBy(xpath=".//*[@id='password']") 
	public  WebElement Password_Tb;
	@FindBy(xpath=".//button[text()='Sign In']") 
	public  WebElement SignIn_btn;
	@FindBy(xpath=".//button[text()='SIGN UP']") 
	public  WebElement SignUp_btn;
	@FindBy(xpath=".//*[text()='Forgot Password?']") 
	public  WebElement ForgotPwd_link;

	
	
	public void login_test(String Username, String Password)
	{
		Username_Tb.sendKeys(Username);
		Password_Tb.sendKeys(Password);
		SignIn_btn.click();
		
	}

}