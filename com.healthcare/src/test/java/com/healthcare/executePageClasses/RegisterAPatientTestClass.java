package com.healthcare.executePageClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.FindAPatientRecordPageClass;
import pageclasses.HomePageClass;
import pageclasses.LoginPageClass;
import pageclasses.RegisterAPatientPageClass;
import retry.RetryAnalyzer;

public class RegisterAPatientTestClass extends BaseClass {
	LoginPageClass lp;
	HomePageClass hp;
	RegisterAPatientPageClass rp;
	FindAPatientRecordPageClass fp;

	@Test(dataProviderClass=DataProviderClassOne.class,dataProvider="login",retryAnalyzer = RetryAnalyzer.class)
	
	public void verifyToRegisterAPatient(String uname,String paswrd) throws IOException{
		
		lp=new LoginPageClass(driver);
		lp.logInAsRegistrationDesk(uname, paswrd);
		
		hp=new HomePageClass(driver);
		hp.clickOnRegisterAPatient();
		
		rp=new RegisterAPatientPageClass(driver);
		
		rp.enterFullName(rp.readStringData(5, 2),rp.readStringData(6, 2));
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
	
		rp.selectTextFromList();
		
		String actualOutcome=rp.selectTextFromList();
		String expectedOutcome=rp.readStringData(5, 2);
		
		Assert.assertEquals(actualOutcome,expectedOutcome);
	}
	
	@Test(dataProviderClass=DataProviderClassOne.class,dataProvider="login",retryAnalyzer = RetryAnalyzer.class)
	
	public void verifyToDeleteARegisteredPatient(String uname,String paswrd) throws IOException{
		
		lp=new LoginPageClass(driver);
		lp.logInAsRegistrationDesk(uname, paswrd);
		
		hp=new HomePageClass(driver);
		hp.clickOnRegisterAPatient();
		
		rp=new RegisterAPatientPageClass(driver);
		String gName=rp.readStringData(5, 1);
		String fName=rp.readStringData(6, 1);
		rp.enterFullName(rp.readStringData(5, 1),rp.readStringData(6, 1));
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
		rp.clickOndeleteAPatient();
		
		rp.enterAReasonFordeleteAPatient("not needed");
		rp.clickOnConfirm();
		
		fp=new FindAPatientRecordPageClass(driver);
		Boolean actualResult=fp.isPatientNameDisplayed(gName.concat(" ").concat(fName));
		
		System.out.println(gName.concat(fName));
		Assert.assertFalse(actualResult);

	
}
}