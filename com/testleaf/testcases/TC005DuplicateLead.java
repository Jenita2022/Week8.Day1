package com.testleaf.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class TC005DuplicateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void getFile() {
		fileName="DuplicateLeadData";
	}

	@Test(dataProvider = "fetchdata")
	public void runDuplicateLead(String Email) throws InterruptedException {
		
		new LoginPage(driver).enterUserName().enterPassword().clickLogin()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.clickEmail().enterEmail(Email).clickFindLead().clickFirstResultID()
		.clickDuplicate()
		.clickCreateLead();
	}
}
