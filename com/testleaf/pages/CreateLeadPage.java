package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage enterCoName(String CoName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CoName);
		return this;
	}

	public CreateLeadPage enterFirstName(String Fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
		return this;
	}

	public CreateLeadPage enterLastName(String Lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
		return this;
	}

	public ViewLeadPage clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
