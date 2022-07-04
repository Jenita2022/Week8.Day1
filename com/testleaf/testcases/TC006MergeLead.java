package com.testleaf.testcases;

import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class TC006MergeLead extends ProjectSpecificMethods{

	@Test
	public void runMergeLead() throws InterruptedException {

		new LoginPage(driver).enterUserName().enterPassword().clickLogin()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickMergeLeadLink()
		.clickFirstLookup()
		.switchtoChildWindow()
		.enterFirstLookupFirstName().clickFindLead().clickFirstResulID()
		.parentWindow()
		.clickSecondLookup()
		.switchtoChildWindow()
		.enterSecondLookupFirstName().clickFindLead().clickSecondResulID()
		.parentWindow()
		.clickMerge()
		.alertAccept()
		.verifyPageTitle();

	}
}
