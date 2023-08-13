package com.healthcare.executePageClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.CaptureVitalOfPatientPageClass;
import pageclasses.HomePageClass;
import pageclasses.LoginPageClass;
import pageclasses.RegisterAPatientPageClass;

public class CaptureVitalsOfPatientTestClass extends BaseClass{
	LoginPageClass lp;
	HomePageClass hp;
	RegisterAPatientPageClass rp;
	CaptureVitalOfPatientPageClass cp;
	
  @Test(dataProviderClass=DataProviderClassOne.class,dataProvider="login")
  public void verifyAllAddVitalDetailsOfRegisteredPatient(String uname,String paswrd) throws IOException {
	  
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
		
		rp.clickOnStartVisit();
		rp.clickOnStartAVisitConfirm();
		
		rp.clickOnCaptureVitals();
		
		cp=new CaptureVitalOfPatientPageClass(driver);
		cp.enterVitalDetails("165", "60", "40", "70","80", "100", "120","96");
		
		cp.clickOnShowDetails();
		
		String actualResult=cp.getTexOfHeightText().concat(cp.getTextOfWeightText().concat(cp.getTextOfTempText().concat(cp.getTextOfPulseText().concat(cp.getTextOfRespiratoryText().concat(cp.getTextOfBloodPressureTextOne().concat(cp.getTextOfBloodPressureTextTwo().concat(cp.getTextOfOxygenSaturationText())))))));
		//String expResult="cp.readIntegerData(18, 3);cp.readIntegerData(18, 4);cp.readIntegerData(18, 5);cp.readIntegerData(18, 6);cp.readIntegerData(18, 7);cp.readIntegerData(18, 8);cp.readIntegerData(18, 9);cp.readIntegerData(18, 10)";
		String expectedResult="165.0 cm60.0 kg40.0 DEG C70 beats/min80100 mmHg120 mmHg96 %";
		Assert.assertEquals(actualResult, expectedResult);
  }
}

		

