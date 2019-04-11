package com.ill.admin.PageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventsLocators {

	/*WebDriver driver;
	public EventsLocators(WebDriver driver) {

		this.driver = driver;
	}*/
	

	// Source Events
	@FindBy(xpath=".//a[@href='#/attraction/events']") public WebElement Source_Events;
	
	//Events Page Locators
	@FindBy(xpath=".//button[text()='Add New Event']") public  WebElement Add_New_Event_Btn;
	@FindBy(xpath = ".//*[@id='serch']]") public  WebElement Events_Search_tb;
	@FindBy(xpath = ".//button[@type='submit'][@class='btn btn-sm btn-info mr10']") public  WebElement Events_Search_btn;
	@FindBy(xpath = ".//a[text()='Next»']")public  WebElement Events_Next_btn;
	@FindBy(xpath = ".//*[contains(text(),'General')]")public  WebElement General_Info_Tab;
	@FindBy(xpath = ".//*[contains(text(),'Operation')]")public  WebElement Days_of_Operation_Tab;
	@FindBy(xpath = ".//div[contains(text(),'Attraction Collection')]")public  WebElement Attraction_Collection_Tab;
	@FindBy(xpath = ".//div[contains(text(),'Tour Collection')]")public  WebElement Tour_Collection_Tab;
	@FindBy(xpath = ".//div[contains(text(),'Home Screen Collection')]")public  WebElement HomeScreen_Collection_Tab;
	@FindBy(xpath = ".//div[contains(text(),'Theatre Collection')]")public  WebElement Theate_Collection_Tab;
	@FindBy(xpath = ".//div[contains(text(),'Explore Collection')]")public  WebElement Explore_Collection_Tab;


	//Delete and Edit functionality is in pipeline
	//Add New Event Page Locators
	@FindBy(xpath = ".//*[@id='name']") public  WebElement Add_Event_Name_Tb;
	@FindBy(xpath = ".//*[@id='category']") public  WebElement Add_Event_Category_DD;
	@FindBy(xpath = ".//*[@id='url']") public  WebElement Add_Event_URL_Tb;
	@FindBy(xpath = ".//*[@id='turl']")public  WebElement Add_Event_Ticketing_URL_Tb;
	@FindBy(xpath = ".//*[@id='vurl']")public  WebElement Add_Event_Video_URL_Tb;
	@FindBy(xpath = ".//*[@id='modi']")public  WebElement Add_Event_Modifiable_Cb;
	@FindBy(xpath = ".//*[@id='coming']")public  WebElement Add_Event_Coming_Cb;
	@FindBy(xpath = ".//*[@id='lastchance']")public  WebElement Add_Event_LastChance_Cb;
	@FindBy(xpath = ".//*[@ng-model='eventDetail.free']") public  WebElement Add_Event_FreeEvent_Cb;
	@FindBy(xpath = ".//*[@id='disableTags']")public  WebElement Add_Event_Disabletags_Cb;
	@FindBy(xpath = ".//*[@id='specialoffer']")public  WebElement Add_Event_SpecialOffer_Cb;
	@FindBy(xpath = ".//*[@id='duration']") public  WebElement Add_Event_Duration_Tb;
	@FindBy(xpath = ".//*[@id='offer']") public  WebElement Add_Event_Offer_Tb;
	@FindBy(xpath = ".//*[@id='shortdescription']") public  WebElement Add_Event_ShortDescription_Tb;
	@FindBy(xpath = ".//*[@ng-model='eventDetail.desc']") public  WebElement Add_Event_Description_Tb;
	@FindBy(xpath = ".//*[@id='defaultchange']") public  WebElement Add_Event_Default_Charge_Tb;
	@FindBy(xpath = ".//*[@id='chargesym']") public  WebElement Add_Event_Charge_Symbol_DD;
	@FindBy(xpath = ".//*[@name='chargeType0']") public  WebElement Add_Event_Carge_Type_Tb;
	@FindBy(xpath = ".//*[@name='currency0']") public  WebElement Add_Event_Currency_DD;
	@FindBy(xpath = ".//*[@name='amount0']")public  WebElement Add_Event_Charge_Tb;
	@FindBy(xpath = ".//*[@name='amount0']/following::a[1]") public  WebElement Add_Event_Delete_Btn;
	@FindBy(xpath = ".//*[@value='Add New Location']") public  WebElement Add_Event_Add_NewLocation_Btn;
	@FindBy(xpath = ".//*[@name='poi']") public  WebElement Add_Event_Select_POI_DD;
	@FindBy(xpath = ".//*[@name='poi']/following::i[1]") public  WebElement Add_Event_DayofOperation_Delete_Btn;
	@FindBy(xpath = ".//*[@value='Add Date']") public  WebElement Add_Event_Add_Date_Btn;
	@FindBy(xpath = ".//*[@name='expandStartDate']") public  WebElement Add_Event_Start_date_calendar;
	@FindBy(xpath = ".//*[@placeholder='select end date']") public  WebElement Add_Event__date_calendar;
	@FindBy(xpath = ".//*[@placeholder='select start time']") public  WebElement Add_Event_Start_Time;
	@FindBy(xpath = ".//*[@placeholder='select end time']") public  WebElement Add_Event_End_Time;
	@FindBy(xpath = ".//*[@value='Save']") public  WebElement Add_Event_Save_Btn;
	@FindBy(xpath = ".//*[@ng-model='model.pic']") public  WebElement Add_Event_Upload_Image_Btn;

}
