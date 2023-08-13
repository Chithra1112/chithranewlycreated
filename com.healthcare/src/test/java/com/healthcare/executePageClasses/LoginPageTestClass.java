package com.healthcare.executePageClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.HomePageClass;
import pageclasses.LoginPageClass;

public class LoginPageTestClass extends BaseClass {
 
	LoginPageClass lp;
	HomePageClass hp;
	
@Test(dataProviderClass = DataProviderClassOne.class,dataProvider = "dp")
public void verifyUnsuccessfullLogin(String uname,String paswrd){
		lp=new LoginPageClass(driver);
		lp.logInAsRegistrationDesk(uname, paswrd);
		
		hp=new HomePageClass(driver);
		
		String actualResult=hp.getTextOfInvalidUser();
		String expectedResult="Invalid username/password. Please try again.";
		
		Assert.assertEquals(actualResult,expectedResult);

}

@Test(dataProviderClass = DataProviderClassOne.class,dataProvider = "login")
public void verifySuccessfullLogin(String uname,String paswrd){
	lp=new LoginPageClass(driver);
	lp.logInAsRegistrationDesk(uname, paswrd);
	
	hp=new HomePageClass(driver);
	
	String actualResultOne=hp.getTextOfWelcomeMessage();
	String expectedResultOne="Logged in as Super User (admin) at Registration Desk.";
	
	Assert.assertEquals(actualResultOne,expectedResultOne);
	
}

@Test(dataProviderClass = DataProviderClassOne.class,dataProvider = "login")

public void verifyTheLogoIsDisplayedOrNotInHomePage(String uname,String paswrd) {
	
	lp=new LoginPageClass(driver);
	lp.logInAsRegistrationDesk(uname, paswrd);
	
	hp=new HomePageClass(driver);
	
	Boolean actualResult=hp.logoIsDisplayedOrNotInHomepage();
	
	Assert.assertTrue(actualResult);
	
}
@Test(dataProviderClass=DataProviderClassOne.class,dataProvider="login") 

public void verifyTheCorrectSiteIsLoadedWhileHittingTheURL(String uname,String paswrd) throws IOException {
	
	lp=new LoginPageClass(driver);
	lp.logInAsRegistrationDesk(uname, paswrd);
	
	hp=new HomePageClass(driver);
	
	String actualOutcome=driver.getCurrentUrl();
	String expectedOutcome=lp.readStringData(10,2);
	
	Assert.assertEquals(actualOutcome, expectedOutcome);
	
}

}