package com.ill.admin.Listener;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ill.admin.TestBase.TestBase;
import com.ill.admin.Utility.Utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class Listeners extends TestBase implements ITestListener{
	
	public Listeners() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	//public WebDriver driver = null;;
	//public ITestResult result;
	@Override
	public void onFinish(ITestContext arg0) {
			
			
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		;
		try {
			captureScreenshot(driver,result.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	/*	//this.result=result;
		try {
			//captureScreenshot(driver, result.getName());
			String screenshot_path = captureScreenshot(driver, result.getName());
			String image= etest.addScreenCapture(screenshot_path);
			etest.log(LogStatus.FAIL, result.getName(), image);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		*/
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}



}