package com.testleaf.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class AlertPage extends ProjectSpecificMethods{
	
	public AlertPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public ViewLeadPage alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		return new ViewLeadPage(driver);
	}
	

}
