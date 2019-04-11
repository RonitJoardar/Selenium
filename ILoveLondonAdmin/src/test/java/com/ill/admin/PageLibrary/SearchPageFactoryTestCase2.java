package com.ill.admin.PageLibrary;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SearchPageFactoryTestCase2 {
	WebDriver driver;
	String baseURL;
	SearchPageFactory searchPage;
	//static Logger log=Logger.getLogger(SearchPageFactory.class);

	@BeforeMethod
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		baseURL="https://www.expedia.co.in/";
		searchPage=new SearchPageFactory(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);
		//PropertyConfigurator.configure("Log4jp.properties");
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	public void test() throws Exception {
		searchPage.clickFlightTab();
		//log.info("Click on the Flight tab");

		searchPage.passOrigin("Mumb",0);
		//Thread.sleep(3000);
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//div[@class='main-suggestion']")))).click();
		//log.info("Enter Origin City");
		//driver.findElement(By.xpath(".//div[@class='main-suggestion']")).click();
		
		searchPage.passDestination("D",0);
		//Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//div[@class='main-suggestion']")))).click();
		//log.info("Enter Departure City");
		//driver.findElement(By.xpath(".//div[@class='main-suggestion']")).click();

		
		searchPage.passDepartureDate("12/10/2017");
		//log.info("Enter flying date");
		
		searchPage.passReturnDate("15/10/2017");
		//log.info("Enter return date");
		
		searchPage.clickSearchButton();
		//log.info("Click on the Search button");
	}

}
