package com.ill.admin.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;

import com.ill.admin.Listener.Listeners;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * Utility class has methods which will be used number of times in scripts,
 * Methods in this class load configuration files, initialize the browser, call implicit wait
 * load excel files in the system and generate extent reports.
 * @author Ronit
 *
 */

public class Utility {

	public  WebDriver driver;
	public  String Baseurl, ChromePath, FirefoxPath, PhantomJSPath, ExcelPath, FileUploader;
	public static String ScreenshotPath;
	public String ReportPath;
	public  ExtentReports reports;
	public static  ExtentTest etest;
	//public  ITestResult result;

	//to load the property file
	public Utility() throws Exception
	{
		File file = new File(System.getProperty("user.dir")+"/src/test/resources/Config/config.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties config = new Properties();
		config.load(fis);
		 this.Baseurl = config.getProperty("URL");
		 this.ChromePath= config.getProperty("ChromePath");
		 this.FirefoxPath= config.getProperty("FirefoxPath");
		 this.PhantomJSPath = config.getProperty("PhantomJSPath");
		 this.ExcelPath = config.getProperty("ExcelPath");
		 this.ScreenshotPath=config.getProperty("ScreenshotPath");
		 this.ReportPath=config.getProperty("ReportPath");
		 this.FileUploader=config.getProperty("FileUploader");

		
	}
	//Start Browser and open the link
	public  void init(String Browser) throws Exception
	{
	
		if(Browser.equalsIgnoreCase("Firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", this.FirefoxPath);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(Baseurl);
		}
		else if(Browser.equalsIgnoreCase("Chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", this.ChromePath);
			//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			
			//Create object of ChromeOptions class
			ChromeOptions options = new ChromeOptions();
			 
			// add parameter which will disable the extension
			options.addArguments("--disable-extensions","test-type");
			//options.("ignore-certificate-errors");
			//capabilities = (DesiredCapabilities)options.toCapabilities();
			//capabilities.setCapability("chrome.binary", ChomePath);
			//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get(Baseurl);
		}
		else if(Browser.equalsIgnoreCase("PhantomJS"))
		{
			System.setProperty("phantomjs.binary.path",this.PhantomJSPath);
			driver = new PhantomJSDriver();
			driver.manage().window().maximize();
			driver.get(Baseurl);
		}
	}
		//Call implicit wait
		public  void implicitWait(int wait)
		{
			driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
		}
		
		//Read Excel File
		
		//take a screen shot
		/*public static String captureScreenshot(WebDriver driver,String sc_name) throws Exception
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String dest = System.getProperty("user.dir")+ScreenshotPath+sc_name+".png";
			File destination = new File(dest);
			FileUtils.copyFile(source,destination);
			etest.log(LogStatus.INFO, "Screenshot Taken: "+sc_name);
			return  dest;
			
		}*/
		public void captureScreenshot(WebDriver driver,String sc_name) throws Exception
		{
			//this.driver=driver;
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(System.getProperty("user.dir")+ScreenshotPath+sc_name+".png"));
			
		}
		/*public int Columncount(int sheetindex)
		{
			int Columncount=wb.getSheetAt(sheetindex);
			Columncount+=1;
			return Columncount;
			
		}*/
		/*public void extentReports()
		{
			reports = new ExtentReports("C:\\Users\\Ronit\\workspace\\com.ill.admin\\src\\test\\resources\\ExtentReports\\ILL_admin.html", false);
			etest = reports.startTest("ILL Admin Sanity Test");
			//Listeners listen = new Listeners();
			//listen.onTestFailure(result);
			reports.endTest(etest);
			reports.flush();
		}*/
		
	
		
		
}
