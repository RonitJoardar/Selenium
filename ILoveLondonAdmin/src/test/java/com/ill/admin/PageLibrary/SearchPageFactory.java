package com.ill.admin.PageLibrary;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPageFactory {
	WebDriver driver;
	Actions act; 
	WebDriverWait wait;
	
	@FindBy (id="tab-flight-tab")
	WebElement flightTab;
	
	@FindBy (id="flight-origin")
	WebElement originCity;
	
	//@FindBy (id="aria-option-0")
	@FindBy (xpath="//div[@class='main-suggestion']")
	WebElement firstOptionOrigin;
	
	
	@FindBy (id="flight-destination")
	WebElement destinationCity;
	
	//@FindBy (id="aria-option-3")
	@FindBy (xpath="//div[@class='main-suggestion']")
	WebElement firstOptionDestination;
	
	
	@FindBy (id="flight-departing")
	WebElement departureDate;
	
	@FindBy(id="flight-returning")
	WebElement returnDate;
	
	@FindBy(id="search-button")
	WebElement searchButton;
	
	public SearchPageFactory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFlightTab(){
		flightTab.click();
	}
	public void selectByIndex(int indexToBeSelected)
	{
		wait = new WebDriverWait(driver, 10);
		WebElement container = driver.findElement(By.xpath(".//ul[@class='results']/div[1]"));
		wait.until(ExpectedConditions.visibilityOf(container));
		List<WebElement> options = container.findElements(By.tagName("li"));
		if(indexToBeSelected<=options.size())
		{
			options.get(indexToBeSelected).click();
		}
	}
	
	public void passOrigin(String origin,int index) throws Exception{
		originCity.sendKeys(origin);
		Thread.sleep(2000);
		selectByIndex(index);

		//originCity.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		//firstOptionOrigin.click();

		//driver.findElement(By.xpath(".//div[@class='main-suggestion']")).click();
	}
	
	public void passDestination(String destination, int index) throws Exception{
		Thread.sleep(3000);
		destinationCity.sendKeys(destination);
		Thread.sleep(2000);
		selectByIndex(index);

		//destinationCity.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		//firstOptionDestination.click();
		
		//driver.findElement(By.xpath(".//div[@class='main-suggestion']")).click();
	}
	
	public void passDepartureDate(String depDate){
		departureDate.sendKeys(depDate);
	}
	
	public void passReturnDate(String retDate){
		//returnDate.clear();
		returnDate.sendKeys(retDate);
	}

	public void clickSearchButton(){
		searchButton.click();
	}
}