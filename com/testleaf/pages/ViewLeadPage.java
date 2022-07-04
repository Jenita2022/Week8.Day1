package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{

	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public ViewLeadPage verifyFirstName() {
		System.out.println(driver.findElement(By.id("viewLead_firstName_sp")).getText());
		return this;
	}

	public EditLeadPage clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}

	public LeadsPage clickDelete() {
		driver.findElement(By.linkText("Delete")).click();
		return new LeadsPage(driver);
	}

	public DuplicateLeadPage clickDuplicate() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);
	}

	public ViewLeadPage verifyCoName() {
		System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
		return this;
	}

	public ViewLeadPage verifyPageTitle() {
		System.out.println("Title: "+driver.getTitle());
		return this;
	}


}
