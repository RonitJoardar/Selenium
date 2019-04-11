package com.ill.admin.PageLibrary;

import org.junit.Assert;
import org.testng.annotations.DataProvider;

import com.ill.admin.TestBase.TestBase;

public class PoiStagingPage extends TestBase{

	public PoiStagingPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addNewPoi(String poiName,String poiAddress, String poiPostcode, String videoUrl,String duration, String phoneNumber, String defaultCharge, String chargeType, String chargeUnitId, String addCharge,String providerBusinessId) throws Exception
	{
		implicitWait(10);
		poiStagingPageElements();
		poiStagingLocator.enterPoiStagingValues(poiName,poiAddress,poiPostcode,videoUrl,duration,phoneNumber,defaultCharge,chargeType,chargeUnitId,addCharge,providerBusinessId, driver);
		Assert.assertFalse(poiStagingLocator.Activate_Btn.isDisplayed());
	}
	
	@DataProvider
	public Object[][] addNewPoiData() throws Exception
	{
		Object[][] data=dataProvider("AddNewPoi");
		return data;
		
	}
}
