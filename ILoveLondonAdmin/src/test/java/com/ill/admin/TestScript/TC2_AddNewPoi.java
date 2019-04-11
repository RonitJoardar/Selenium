package com.ill.admin.TestScript;

import org.testng.annotations.Test;

import com.ill.admin.PageLibrary.PoiStagingPage;

public class TC2_AddNewPoi extends PoiStagingPage {
	
	public TC2_AddNewPoi() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public void login(String username, String password, String runmode) throws Exception
	{		

		init("firefox");
		implicitWait(10);
		loginPageElements();
		loginLocator.login_test(username, password);
		poiStagingPageElements();
	}
	@Test(dataProvider="addNewPoiData")
	public void addNewPoiTest(String poiName,String poiAddress, String poiPostcode, String videoUrl,String duration, String phoneNumber, String defaultCharge, String chargeType, String chargeUnitId, String addCharge,String providerBusinessId) throws Exception
	{
		login("manjeet@wtechspaces.in","p@ssw0rd","Y");
		//implicitWait(10);
		addNewPoi(poiName,poiAddress,poiPostcode,videoUrl,duration,phoneNumber,defaultCharge,chargeType,chargeUnitId,addCharge,providerBusinessId);
	}

}
