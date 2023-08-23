package com.healthcare.executePageClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ScreenShot;

public class BaseClass {

	WebDriver driver;
	ScreenShot sc;

	public static Properties property;

	public static void readProperty() throws IOException {
		property = new Properties();
		FileInputStream f = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
		// set path from config.properties .first part is to get the system property and
		// second path is the location of config.properties.
		property.load(f);// to load the file
	}

	@Parameters("browser")
	@BeforeMethod(groups = {"launch"})
	public void beforeMethod(String browserValue) throws IOException {

		readProperty();// to read the url from properties file.
		if (browserValue.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();// automatically webdriver manager checks the browser n load it.
			driver = new ChromeDriver();
			
		} 
		else if (browserValue.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();// automatically webdriver manager checks the browser n load it.
			driver = new EdgeDriver();
		}

		WebDriverManager.chromedriver().setup();// automatically webdriver manager checks the browser n load it.
		driver = new ChromeDriver();
		
		driver.get(property.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod(groups = {"close"})
	public void afterMethod(ITestResult itr) throws IOException {// test result is an interface.

		if (itr.getStatus() == ITestResult.FAILURE)// gives status from execution,is it fail or pass.
		{
			sc = new ScreenShot();
			sc.takeScreenShot(driver, itr.getName());
		}
		driver.quit();
	}

	
	@BeforeSuite(alwaysRun = true)
	public void createExtendReport(final ITestContext testContext) {
		extendReport.ExtentManager.createInstance().createTest(testContext.getName(),"message");
		
	}
}
