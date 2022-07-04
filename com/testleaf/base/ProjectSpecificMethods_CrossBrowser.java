package com.testleaf.base;

import java.time.Duration;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.testleaf.utils.ReadExcel_New;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods_CrossBrowser {
	
	//public String fileName;
	//public ChromeDriver driver;
	public RemoteWebDriver driver;	
		
	@Parameters("browser")
	@BeforeMethod
	public void precondition(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void postcondition() {
		driver.close();
	}
//	@DataProvider
//	public String[][] fetchdata() throws IOException{
//		String[][] readData = ReadExcel_New.readData(fileName);
//		return readData;
//	}

}
