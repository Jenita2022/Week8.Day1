package com.testleaf.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class FindLeadsChildWindowPage extends ProjectSpecificMethods{
		
	public FindLeadsChildWindowPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public FindLeadsChildWindowPage switchtoChildWindow() {
		Set<String> set = driver.getWindowHandles();
		List<String> lst = new ArrayList<String>(set);
		driver.switchTo().window(lst.get(1));
		return this;
	}

	public FindLeadsChildWindowPage enterFirstLookupFirstName() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Cathy");
		return this;
	}

	public FindLeadsChildWindowPage clickFindLead() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}

	public MergeLeadPage clickFirstResulID() {
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		return new MergeLeadPage(driver);
	}

	public FindLeadsChildWindowPage enterSecondLookupFirstName() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("SS");
		return this;
	}
	
	public MergeLeadPage clickSecondResulID() {
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		return new MergeLeadPage(driver);
	}



}
