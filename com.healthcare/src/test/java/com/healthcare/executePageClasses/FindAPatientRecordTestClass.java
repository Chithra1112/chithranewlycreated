package com.healthcare.executePageClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.FindAPatientRecordPageClass;
import pageclasses.HomePageClass;
import pageclasses.LoginPageClass;
import pageclasses.RegisterAPatientPageClass;
import retry.RetryAnalyzer;

public class FindAPatientRecordTestClass extends BaseClass {

	LoginPageClass lp;
	HomePageClass hp;
	RegisterAPatientPageClass rp;
	FindAPatientRecordPageClass fp;

	@Test(dataProviderClass = DataProviderClassOne.class, dataProvider = "login",retryAnalyzer = RetryAnalyzer.class,groups = {"group2"})
	public void verifyTheRegisteredPatientIsFoundOrNotInPatientRecordTable(String uname, String paswrd)
			throws IOException {

		lp = new LoginPageClass(driver);
		lp.logInAsRegistrationDesk(uname, paswrd);

		hp = new HomePageClass(driver);
		hp.clickOnFindAPatientRecord();

		fp = new FindAPatientRecordPageClass(driver);
		fp.clickOnSearchByIdOrName();
	
		String gName=fp.readStringData(5, 2);
		String fName=fp.readStringData(6, 2);
		Boolean actualResult = fp.isPatientNameDisplayed(gName.concat(" ").concat(fName));
	
		System.out.println(gName.concat(fName));
		Assert.assertTrue(actualResult);
	}
}
