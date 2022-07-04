package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.base.ProjectSpecificMethods_CrossBrowser;

public class LoginPage_CrossBrowser extends ProjectSpecificMethods_CrossBrowser{


	public LoginPage_CrossBrowser(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public LoginPage_CrossBrowser enterUserName() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		return this;
	}

	public LoginPage_CrossBrowser enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}

	public HomePage_CrossBrowser clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage_CrossBrowser(driver);

	}

}
