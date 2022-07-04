package com.testleaf.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class TC004DeleteLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void getFile() {
		fileName = "DeleteLeadData";
	}

	@Test(dataProvider = "fetchdata")
	public void runDeleteLead(String PhoneNo) throws InterruptedException {
		new LoginPage(driver).enterUserName()
		.enterPassword().clickLogin()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.clickPhoneNo()
		.enterPhoneNo(PhoneNo)
		.clickFindLead()
		.clickFirstResultID()
		.clickDelete();
}
	
}
