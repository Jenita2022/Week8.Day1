package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.base.ProjectSpecificMethods_CrossBrowser;

public class HomePage_CrossBrowser extends ProjectSpecificMethods_CrossBrowser{
	public HomePage_CrossBrowser(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public LoginPage_CrossBrowser clickLogoutLink(){
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage_CrossBrowser(driver);
	}
}
