package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

import com.testleaf.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{


	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}

	//@FindBy(how = How.ID, using = "username") WebElement eleUserName;
	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//eleUserName.sendKeys("DemoSalesManager");
		return this;
	}


	//@FindBy(how = How.ID, using = "password") WebElement elePassword;
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//elePassword.sendKeys("crmsfa");
		return this;
	}

	public HomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);

	}

}
