package com.healthcare.executePageClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.ActiveVisitPageClass;
import pageclasses.HomePageClass;
import pageclasses.LoginPageClass;
import pageclasses.RegisterAPatientPageClass;
import retry.RetryAnalyzer;

public class ActiveVisitTestClass extends BaseClass {
	
	
	LoginPageClass lp;
	HomePageClass hp;
	RegisterAPatientPageClass rp;
	ActiveVisitPageClass av;
	
  @Test(dataProviderClass=DataProviderClassOne.class,dataProvider="login",retryAnalyzer = RetryAnalyzer.class)
  public void verifyThePatientIsNotDisplayedInActiveVisitsWhenVisitNotStarted(String uName,String paswrd) throws IOException {
	  	
	  	lp=new LoginPageClass(driver);
		lp.logInAsRegistrationDesk(uName, paswrd);
		
		hp=new HomePageClass(driver);
		hp.clickOnRegisterAPatient();
		
		rp=new RegisterAPatientPageClass(driver);
		String gName=rp.readStringData(5, 4);
		String fName=rp.readStringData(6, 4);
		rp.enterFullName(gName,fName);
		rp.selectGender(1);
		
		
		rp.selectBirthDateOfPatient(rp.readIntegerData(8, 1));
		rp.selectBirthMonthOfPatient(2);
		rp.selectYearOfPatient(rp.readIntegerData(10, 1));
		
		
		rp.selectAddressOfPatient(rp.readStringData(11, 1));
		rp.selectAddress2OfPatient(rp.readStringData(12, 1));
		rp.selectCityOfPatient(rp.readStringData(13, 1));
		rp.selectStateOfPatient(rp.readStringData(14, 1));
		rp.selectPostalCodeOfPatient(rp.readIntegerData(15, 1));
	
		rp.selectPhoneNumberOfPatient(rp.readIntegerData(16, 1));
		
		rp.selectPatientRelationship(2);
		rp.selectRelativeName(rp.readStringData(17, 1));
		
		rp.selectConfirmButton();
		
		rp.clickOnHomePageButton();
		
		hp.clickOnActiveVisitButton();
		
		av=new ActiveVisitPageClass(driver);
		
		Boolean actualResult=av.isPatientNameDisplayed(gName.concat(fName));
		Assert.assertFalse(actualResult);
		}
  
  @Test(dataProviderClass=DataProviderClassOne.class,dataProvider="login",retryAnalyzer = RetryAnalyzer.class)
  public void verifyThePatientIsInActiveVisitsWhenVisitStarts(String uname,String paswrd) throws IOException {
	
	  	lp=new LoginPageClass(driver);
		lp.logInAsRegistrationDesk(uname, paswrd);
	  
	  	hp=new HomePageClass(driver);
		hp.clickOnRegisterAPatient();
		
		rp=new RegisterAPatientPageClass(driver);
		String gName=rp.readStringData(5, 6);
		String fName=rp.readStringData(6, 6);
		rp.enterFullName(gName,fName);
		rp.selectGender(1);
		
		
		rp.selectBirthDateOfPatient(rp.readIntegerData(8, 1));
		rp.selectBirthMonthOfPatient(2);
		rp.selectYearOfPatient(rp.readIntegerData(10, 1));
		
		
		rp.selectAddressOfPatient(rp.readStringData(11, 1));
		rp.selectAddress2OfPatient(rp.readStringData(12, 1));
		rp.selectCityOfPatient(rp.readStringData(13, 1));
		rp.selectStateOfPatient(rp.readStringData(14, 1));
		rp.selectPostalCodeOfPatient(rp.readIntegerData(15, 1));
	
		rp.selectPhoneNumberOfPatient(rp.readIntegerData(16, 1));
		
		rp.selectPatientRelationship(2);
		rp.selectRelativeName(rp.readStringData(17, 1));
		
		rp.selectConfirmButton();
		
		rp.clickOnStartVisit();
		rp.clickOnStartAVisitConfirm();
		
		av=new ActiveVisitPageClass(driver);
		Boolean actualResult=av.isPatientNameDisplayed(gName.concat(fName));
		Assert.assertFalse(actualResult);
	  
  }
  
}
