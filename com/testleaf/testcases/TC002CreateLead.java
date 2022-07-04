package com.testleaf.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class TC002CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void getFile() {
		fileName = "CreateLeadData";
	}

	@Test(dataProvider="fetchdata")
	public void runCreateLead(String CoName, String Fname, String Lname) {
		new LoginPage(driver).enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCoName(CoName)
		.enterFirstName(Fname)
		.enterLastName(Lname)
		.clickCreateLead()
		.verifyFirstName();
	}
	
}
