package com.ill.admin.TestScript;

import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ill.admin.PageLibrary.LogInPage;
import com.ill.admin.Utility.Utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class TC1_Login extends LogInPage {

	public TC1_Login() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test(dataProvider="loginData")
	public void loginWithCorrectCredentials(String username, String password, String runmode) throws Exception
	{
		if(runmode.equalsIgnoreCase("N"))
		{
			throw new SkipException("Run Mode is N hence skipped");
		}
		login(username, password, runmode);
	}
	
}
