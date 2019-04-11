package com.ill.admin.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.ill.admin.PageLocators.EventsLocators;
import com.ill.admin.PageLocators.LoginPageLocators;
import com.ill.admin.PageLocators.POILiveLocators;
import com.ill.admin.PageLocators.PoiStagingLocators;
import com.ill.admin.Utility.ExcelReader;
import com.ill.admin.Utility.Utility;

/**
 * 
 * @author Ronit
 *TestBase class serves as the base class or center point of this framework, 
 *this class is used is used to load the UI elements of all the pages and also reads data from Excel file
 *
 */
public class TestBase extends ExcelReader {
	

	
	public  EventsLocators eventLocator;
	public  LoginPageLocators loginLocator;
	public  POILiveLocators poiLiveLocator;
	public  PoiStagingLocators poiStagingLocator;
	
	public TestBase() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Loads UI locators of Log In page
	 * @throws Exception
	 */
	public void loginPageElements() throws Exception
	{
		loginLocator=PageFactory.initElements(driver, LoginPageLocators.class);
	}
	/**
	 * Loads UI locators of POI Staging page
	 * 
	 */
	public void poiStagingPageElements()
	{
		poiStagingLocator=PageFactory.initElements(driver, PoiStagingLocators.class);
				
	}
	/**
	 * Loads UI locators of POI Live page
	 * @throws Exception
	 */
	public void poiLivePageElements()
	{
	
		poiLiveLocator=PageFactory.initElements(driver, POILiveLocators.class);
		//poiLiveLocator = new POILiveLocators(driver);
	}
	/**
	 * Loads UI locators of the Events Page
	 */
	public void eventsPageElements()
	{
		eventLocator=PageFactory.initElements(driver, EventsLocators.class);
		//eventLocator = new EventsLocators(driver);
		
	}	
	//@DataProvider
	public Object[][] dataProvider(String testcase) throws Exception
	{
		//ExcelReader reader = new ExcelReader();
		filePath = System.getProperty("user.dir")+ExcelPath;
		System.out.println("filepath" + filePath);
		readExcel(filePath);
		int rowNum= getRowCount(testcase);
		int colNum = getCoulumnCount(testcase);
		
		Object getData[][]= new Object[rowNum-1][colNum];
		for(int i=2;i<=rowNum;i++)
		{
			for(int j=0;j<colNum;j++)
			{
				getData[i-2][j]= getCellData(testcase, j, i);
			}
		}
		return getData;
	}

}
