package pageclasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class HomePageClass {

	WebDriver driver;
	
	GeneralUtilities gl=new GeneralUtilities();
	
	public HomePageClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h4[contains(text(),'Logged in as Super User')]")
	WebElement welcomeMessage;
	
	@FindBy(id="error-message")
	WebElement invalidMessage;
	
	
	@FindBy(xpath="//a[@class='btn btn-default btn-lg button app big align-self-center']")
	List<WebElement>allTiles;
	
	
	@FindBy(xpath="//a[contains(@id,'referenceapplication-registrationapp')]")
	WebElement registerAPatient;
	
	@FindBy(xpath="//a[contains(@id,'openmrs-module-coreapps-activeVisitsHomepageLink-extension')]")
	WebElement activeVisit;
	
	@FindBy(xpath="//a[@href='/openmrs/referenceapplication/home.page']")
	WebElement openMrsLogo;
	
	@FindBy(xpath="//a[contains(@id,'coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension')]")
	WebElement findPatientRecord;
	
	public String getTextOfWelcomeMessage() {
		return gl.getTextOfAnElement(welcomeMessage);
		
	}
	
	public Boolean isAllTilesAreDisplayed() {
		
		for(WebElement webElement:allTiles) {
			gl.elementIsDisplayed(webElement);	
	
		  return true;
	}

			 return false;
	}
	
	public void clickOnRegisterAPatient() {
		gl.clickOnElement(registerAPatient);
	}
	
	
	public String getTextOfInvalidUser() {
		return gl.getTextOfAnElement(invalidMessage);
		
	}
	
	public void clickOnActiveVisitButton() {
		gl.clickOnElement(activeVisit);	
	}
 
	public Boolean logoIsDisplayedOrNotInHomepage() {
		return gl.elementIsDisplayed(openMrsLogo);
		
	}

	public void clickOnFindAPatientRecord() {
		gl.clickOnElement(findPatientRecord);
		
	}
}

		
	

