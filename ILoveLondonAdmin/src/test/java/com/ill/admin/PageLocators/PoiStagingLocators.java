package com.ill.admin.PageLocators;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ill.admin.TestBase.TestBase;

public class PoiStagingLocators extends TestBase {

	
	public PoiStagingLocators() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	//Homepage drop down
	@FindBy(xpath = ".//a[@href='#' and text()!='DASHBOARD']") 
	public static WebElement Source;
	
	@FindBy(xpath = ".//*[text()='POI Staging']") 
	public WebElement POI_Staging;
	
	//Search POI
	@FindBy(xpath = ".//*[@id='serch']]") public WebElement POI_Staging_Search_tb;
	@FindBy(xpath = ".//button[text()='Search Foursquare']") public WebElement Search_FourSquare_Btn;
	@FindBy(xpath = ".//button[text()='Search Google']") public WebElement Search_Google_Btn;
	@FindBy(xpath = ".//button[@class='btn btn-sm btn-info']") public WebElement Search_Refresh_Btn;
	@FindBy(xpath = ".//*[@ng-disabled='!search'][@ng-click='searchPoi()']") public WebElement Search_Btn;
	@FindBy(xpath = ".//*[@href='#/attraction/stage/poi/edit/57a886cde4b0cd655fab02de']") public WebElement Adelphi_edit_btn;
	
	//Add New POI Page Locators
	
	@FindBy(xpath = ".//button[@type='submit' and text()='Add New POI']") public WebElement Add_new_POI_Btn;
	@FindBy(xpath = ".//*[contains(text(),'General')]") public WebElement General_Info_Tab;
	@FindBy(xpath = ".//*[contains(text(),'Operation')]") public WebElement Days_of_Operation_Tab;
	@FindBy(xpath = ".//*[contains(text(),'Non-Operating')]") public WebElement Non_Operating_Day_Tab;
	@FindBy(xpath = ".//*[contains(text(),'Providers')]") public WebElement Providers_Tab;
	@FindBy(xpath = ".//*[@id='userName']") public WebElement POI_Name_tb;
	@FindBy(xpath = ".//*[@id='address']") public WebElement POI_Address_tb;
	@FindBy(xpath = ".//*[@id='pcode']") public WebElement POI_pcode_tb;
	@FindBy(xpath = ".//*[@id='url']") public WebElement POI_URL_tb;
	@FindBy(xpath = ".//*[@id='videoUrl']") public WebElement POI_Video_URL_tb;
	@FindBy(xpath = ".//*[@placeholder='Duration In Minutes']") public WebElement Staging_Duration_tb;
	@FindBy(xpath = ".//*[@id='specialOffer']") public WebElement Staging_Special_Offer_Cb;
	@FindBy(xpath = ".//*[@id='phoneNumber']") public WebElement Staging_Phone_Number_Tb;
	@FindBy(xpath = ".//*[@placeholder='Default Charge Amount']") public WebElement Staging_Default_Charge_Tb;
	@FindBy(xpath = ".//select[@name='defaultSymbol']") public WebElement Staging_Charge_Symbol_DD;
	@FindBy(xpath = ".//*[@id='btnAddchagrs']") public WebElement Staging_Add_new_charge_btn;
	@FindBy(xpath = ".//*[@placeholder='Charge Type']") public WebElement Staging_Charge_Type_Tb;
	@FindBy(xpath = ".//*[@placeholder='Unit Id']") public WebElement Staging_Unit_Id_Tb;
	@FindBy(xpath = ".//select[@name='currency0']") public WebElement Staging_Add_Charge_Currency_DD;
	@FindBy(xpath = ".//input[@name='amount0']") public WebElement Staging_Add_Charge_TB;
	@FindBy(xpath = ".//*[@value='Add New Schedule List']") public WebElement Staging_New_Schedule_Btn;
	@FindBy(xpath = ".//*[@placeholder='Effective Date From*']") public WebElement Staging_Date_From_Picker;
	@FindBy(xpath = ".//*[@placeholder='Effective Date To*']") public WebElement Staging_Date_To_Picker;
	@FindBy(xpath = ".//span[text()='Day of the week*']") public WebElement Staging_Day_Of_Week;
	@FindBy(xpath = ".//*[@id='endTime']") public WebElement Staging_End_Time;
	@FindBy(xpath = ".//select[@name='providerId']") public WebElement Staging_Provider_Id_DD;
	@FindBy(xpath = ".//*[@name='businessId']") public WebElement Staging_Business_Id_Tb;
	@FindBy(xpath = ".//input[@value='Save'][@type='button']") public WebElement Provider_Save_Btn;
	@FindBy(xpath = ".//input[@type='submit']") public WebElement POI_Save_Btn;
	@FindBy(xpath = ".//*[text()='Activate']") public WebElement Activate_Btn;
	@FindBy(xpath = ".//*[text()='Deactivate']") public WebElement Deactivate_Btn;
	@FindBy(xpath = ".//*[text()='Exit']") public WebElement Exit_Btn;
	@FindBy(xpath = ".//input[@type='file']") public WebElement Image_Upload_Btn;

	public void enterPoiStagingValues(String poiName,String poiAddress, String poiPostcode, String videoUrl,String duration, String phoneNumber, String defaultCharge, String chargeType, String chargeUnitId, String addCharge,String providerBusinessId,WebDriver driver) throws Exception
	{
		this.driver=driver;
		//System.out.println("driver check"+driver);
		Thread.sleep(8000);
		//A//ctions builder = new Actions(driver);
		//builder.clickAndHold(Source).build().perform();
		Source.click();
		Thread.sleep(8000);
		//new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(POI_Staging));
		POI_Staging.click();
		Thread.sleep(6000);
		Add_new_POI_Btn.click();
		Thread.sleep(2000);
		General_Info_Tab.click();
		Thread.sleep(2000);
		POI_Name_tb.sendKeys(poiName);
		POI_Address_tb.sendKeys(poiAddress);
		POI_pcode_tb.sendKeys(poiPostcode);
		POI_Video_URL_tb.sendKeys(videoUrl);
		Staging_Duration_tb.sendKeys(duration);
		Staging_Special_Offer_Cb.click();
	
		
		Staging_Phone_Number_Tb.sendKeys(phoneNumber);
		Staging_Default_Charge_Tb.sendKeys(defaultCharge);
		Select chargeSymbolDD= new Select(Staging_Charge_Symbol_DD);
		chargeSymbolDD.selectByValue("string:GBP");
		Staging_Add_new_charge_btn.click();
		Staging_Charge_Type_Tb.sendKeys(chargeType);
		Staging_Unit_Id_Tb.sendKeys(chargeUnitId);
		Select chargeCurrencyDD= new Select(Staging_Add_Charge_Currency_DD);
		chargeCurrencyDD.selectByVisibleText("GBP-British pound[B]");
		Staging_Add_Charge_TB.sendKeys(addCharge);
		//Providers_Tab.click();
		//Thread.sleep(8);
		Providers_Tab.click();
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		Thread.sleep(2000);
		Select stagingProviderIdDD = new Select(Staging_Provider_Id_DD);
		stagingProviderIdDD.selectByValue("GOLDENTOURS");
		Staging_Business_Id_Tb.sendKeys(providerBusinessId);
		Provider_Save_Btn.click();
		Thread.sleep(2000);
		POI_Save_Btn.click();
		Thread.sleep(4000);
		Image_Upload_Btn.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec(FileUploader);
		POI_Save_Btn.click();
		Activate_Btn.click();
		/*Days_of_Operation_Tab.click();
		Staging_New_Schedule_Btn.click();
		DateFormat dateFormat2 = new SimpleDateFormat("dd"); 
        Date date2 = new Date();
        String today = dateFormat2.format(date2); 
         List<WebElement> columns=Staging_Date_From_Picker.findElements(By.tagName("td"));  

        //comparing the text of cell with today's date and clicking it.
        for (WebElement cell : columns)
        {
           if (cell.getText().equals(today))
           {
              cell.click();
              break;
           }
        }*/
		
        
		
		
		
	}
	/*public static Date NextWorkingDayfromCurrentDate() {
		Calendar cal = Calendar.getInstance();
 
		System.out.println("Current Date -> " + cal.getTime());
 
		cal.add(Calendar.DATE, 5);
		while (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
				|| cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			cal.add(Calendar.DATE, 1);
		}
		//System.out.println("New Date for working day -> " + cal.getTime());
 
		return cal.getTime();
	}*/
	
	
	
}
