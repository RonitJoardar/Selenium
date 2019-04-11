package com.ill.admin.PageLibrary;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ill.admin.PageLocators.EventsLocators;
import com.ill.admin.PageLocators.LoginPageLocators;
import com.ill.admin.PageLocators.PoiStagingLocators;
import com.ill.admin.TestBase.TestBase;

public class LogInPage extends TestBase {
	
	
	public LogInPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void login(String username, String password, String runmode) throws Exception
	{		

		init("chrome");
		implicitWait(10);
		loginPageElements();
		loginLocator.login_test(username, password);
		poiStagingPageElements();
		Assert.assertTrue(PoiStagingLocators.Source.isDisplayed());
		
	
	}
	@DataProvider
	public Object[][] loginData() throws Exception
	{
		Object[][] data=dataProvider("LogIn");
		return data;
		
	}
	
}

