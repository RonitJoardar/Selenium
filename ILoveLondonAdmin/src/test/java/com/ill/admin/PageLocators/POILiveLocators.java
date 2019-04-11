package com.ill.admin.PageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POILiveLocators {

	WebDriver  driver;
	public POILiveLocators(WebDriver  driver) {
		
		this.driver=driver;
	}
	
	//HomePage POI Live
	 @FindBy(xpath=".//*[@href='#/attraction/poi/poi-new']") public static WebElement POI_Live;
	 @FindBy(xpath=".//a[@href='#/attraction/poi/edit/4ac518cef964a52012a620e3']")  public static WebElement Admiralty_Arch_Edit;

}
