package com.healthcare.executePageClasses;

import org.testng.annotations.Test;

import utilities.ExcelReadClass;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderClassOne {

  @DataProvider
  public Object[][] dp() throws IOException {
    return new Object[][] {
      new Object[] {ExcelReadClass.getStringData(2,4),ExcelReadClass.getStringData(3, 4) },
      new Object[] { ExcelReadClass.getStringData(2,5),ExcelReadClass.getStringData(3,5) },
      new Object[] {ExcelReadClass.getStringData(2,6),ExcelReadClass.getStringData(3,6)}
    };
  }
  
  @DataProvider
  public Object[][] login() throws IOException{
	  return new Object[][] {
		  new Object[] {ExcelReadClass.getStringData(2,1),ExcelReadClass.getStringData(3,1)}
	  };
  }
}
