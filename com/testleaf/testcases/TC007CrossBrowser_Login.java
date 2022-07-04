package com.testleaf.testcases;

import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods_CrossBrowser;
import com.testleaf.pages.LoginPage_CrossBrowser;

public class TC007CrossBrowser_Login extends ProjectSpecificMethods_CrossBrowser{

	@Test
	public void runCrossBrowserLogin() {
		new LoginPage_CrossBrowser(driver)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickLogoutLink();
	
	}
}
