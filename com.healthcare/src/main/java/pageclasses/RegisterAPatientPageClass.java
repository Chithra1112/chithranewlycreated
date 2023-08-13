package pageclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelReadClass;
import utilities.GeneralUtilities;

public class RegisterAPatientPageClass {
	WebDriver driver;

	GeneralUtilities gl = new GeneralUtilities();

	public RegisterAPatientPageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@class='required focused ui-autocomplete-input']")
	WebElement givenName;

	@FindBy(name = "familyName")
	WebElement familyName;

	@FindBy(id = "next-button")
	WebElement nextButton;

	@FindBy(id = "gender-field")
	WebElement selectGender;

	@FindBy(id = "birthdateDay-field")
	WebElement selectDate;

	@FindBy(id = "birthdateMonth-field")
	WebElement selectMonth;

	@FindBy(id = "birthdateYear-field")
	WebElement selectYear;

	@FindBy(id = "address1")
	WebElement address1;

	@FindBy(id = "address2")
	WebElement address2;

	@FindBy(id = "cityVillage")
	WebElement cityVillage;

	@FindBy(id = "stateProvince")
	WebElement stateProvince;

	@FindBy(id = "postalCode")
	WebElement postalCode;

	@FindBy(name = "phoneNumber")
	WebElement phoneNumber;

	@FindBy(id = "relationship_type")
	WebElement patientRelation;

	@FindBy(xpath = "//input[@placeholder='Person Name']")
	WebElement relativeName;

	@FindBy(id = "submit")
	WebElement confirmButton;

	@FindBy(xpath = "//*[@class='PersonName-givenName']")
	WebElement newPatientName;

	@FindBy(xpath = "//a[contains(@href,'javascript:delPatient.showDeletePatient')]")
	WebElement deleteAPatient;
	
	@FindBy(xpath="//input[@id='delete-reason']")
	WebElement deletePatientReason;
	
	@FindBy(xpath="(//button[text()='Confirm'])[4]")
	WebElement confirm;
	
	@FindBy(xpath="//a[@href='/openmrs/index.htm']")
	WebElement homePageButton;
	
	@FindBy(id="org.openmrs.module.coreapps.createVisit")
	WebElement startVisit;
	
	@FindBy(xpath="//button[@id='start-visit-with-visittype-confirm']")
	WebElement startAVisitConfirm;
	
	@FindBy(id="referenceapplication.realTime.vitals")
	WebElement captureVitals;
	
	public void enterFullName(String gname, String fname) {
		gl.typeToAnElement(givenName, gname);
		gl.typeToAnElement(familyName, fname);
		gl.clickOnElement(nextButton);

	}

	public void selectGender(int index) {
		gl.selectFromDropDownByIndex(selectGender, index);
		gl.clickOnElement(nextButton);

	}

	public void selectBirthDateOfPatient(String dname) {
		gl.typeToAnElement(selectDate, dname);
	}

	public void selectBirthMonthOfPatient(int index) {
		gl.selectFromDropDownByIndex(selectMonth, index);
	}

	public void selectYearOfPatient(String yname) {
		gl.typeToAnElement(selectYear, yname);
		gl.clickOnElement(nextButton);
	}

	public void selectAddressOfPatient(String addressOne) {
		gl.typeToAnElement(address1, addressOne);

	}

	public void selectAddress2OfPatient(String addressTwo) {
		gl.typeToAnElement(address2, addressTwo);
	}

	public void selectCityOfPatient(String city) {
		gl.typeToAnElement(cityVillage, city);
	}

	public void selectStateOfPatient(String state) {
		gl.typeToAnElement(stateProvince, state);
	}

	public void selectPostalCodeOfPatient(String postalcode) {
		gl.typeToAnElement(postalCode, postalcode);
		gl.clickOnElement(nextButton);
	}

	public void selectPhoneNumberOfPatient(String phoneNo) {
		gl.typeToAnElement(phoneNumber, phoneNo);
		gl.clickOnElement(nextButton);
	}

	public void selectPatientRelationship(int index) {
		gl.selectFromDropDownByIndex(patientRelation, index);
	}

	public void selectRelativeName(String relativeName) {
		gl.typeToAnElement(patientRelation, relativeName);
		gl.clickOnElement(nextButton);
	}

	public void selectConfirmButton() {
		gl.clickOnElement(confirmButton);
	}

	public String selectTextFromList() {
		return gl.getTextOfAnElement(newPatientName);

	}

	public String readStringData(int a, int b) throws IOException {
		return ExcelReadClass.getStringData(a, b);

	}

	public String readIntegerData(int a, int b) throws IOException {
		return ExcelReadClass.getIntegerData(a, b);

	}

	public void clickOndeleteAPatient() {
		gl.clickOnElement(deleteAPatient);

	}
	public void enterAReasonFordeleteAPatient(String reasonText) {
		gl.typeToAnElement(deletePatientReason, reasonText);
	}
	
	public void clickOnConfirm() {
		gl.clickOnElement(confirm);
	}
	
	public void clickOnHomePageButton() {
		gl.clickOnElement(homePageButton);
		gl.clickOnElement(homePageButton);
	}
	
	public void clickOnStartVisit() {
		gl.clickOnElement(startVisit);
	}
	
	public void clickOnStartAVisitConfirm() {
		gl.clickOnElement(startAVisitConfirm);
	}
	
	public void clickOnCaptureVitals() {
		captureVitals.click();
	}
	
}



