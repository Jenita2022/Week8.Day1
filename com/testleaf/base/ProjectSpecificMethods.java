package com.testleaf.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import com.testleaf.utils.ReadExcel_New;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	
	public String fileName;
	public ChromeDriver driver;	
		
	@BeforeMethod
	public void precondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@AfterMethod
	public void postcondition() {
		driver.close();
	}
	@DataProvider
	public String[][] fetchdata() throws IOException{
		String[][] readData = ReadExcel_New.readData(fileName);
		return readData;
	}

}
