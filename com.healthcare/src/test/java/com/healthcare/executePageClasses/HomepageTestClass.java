package com.healthcare.executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.HomePageClass;
import pageclasses.LoginPageClass;

public class HomepageTestClass extends BaseClass{
	
	LoginPageClass lp;
	HomePageClass hp;
	
  @Test(dataProviderClass = DataProviderClassOne.class,dataProvider = "login")
  public void verifyAllTilesAreDisplayedInHomepage(String uname,String paswrd) {
	  lp=new LoginPageClass(driver);
	  lp.logInAsRegistrationDesk(uname, paswrd);
	  
	  hp=new HomePageClass(driver);
	  Boolean actualOutcome=hp.isAllTilesAreDisplayed();
	  Assert.assertTrue(actualOutcome);
  }
}
