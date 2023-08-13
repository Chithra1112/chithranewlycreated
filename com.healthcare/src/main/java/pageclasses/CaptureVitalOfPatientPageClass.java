package pageclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelReadClass;
import utilities.GeneralUtilities;

public class CaptureVitalOfPatientPageClass {
	
	WebDriver driver;
	GeneralUtilities gl = new GeneralUtilities();
	
	public CaptureVitalOfPatientPageClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="w8")
	WebElement height;
	
	@FindBy(id="next-button")
	WebElement nxtButton;
	
	@FindBy(id="w10")
	WebElement weight;
	
	@FindBy(id="w12")
	WebElement temperature;
	
	@FindBy(id="w14")
	WebElement pulse;			//(xpath="//input[@class='integer numeric-range focused']")
	
	@FindBy(id="w16")
	WebElement respiratoryRate;
	
	@FindBy(id="w18")
	WebElement bloodPressure1;
	
	@FindBy(id="w20")
	WebElement bloodPressure2;
	
	@FindBy(id="w22")
	WebElement oxygenSaturation;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveButton;
	
	@FindBy(xpath="(//*[contains(text(),'show details')])[3]")
	WebElement showDetails;
	
	@FindBy(xpath="//*[contains(text(),'165.0 cm')]")
	WebElement heightText;
	
	@FindBy(xpath="//*[contains(text(),'60.0 kg')]")
	WebElement weightText;
	
	@FindBy(xpath="//*[contains(text(),'40.0 DEG C')]")
	WebElement tempText;
	
	@FindBy(xpath="//*[contains(text(),'70 beats/min')]")
	WebElement pulseText;
	
	@FindBy(xpath="(//*[contains(text(),'80')])[2]")
	WebElement respiratoryText;
	
	@FindBy(xpath="//*[contains(text(),'100 mmHg')]")
	WebElement bpText1;
	
	@FindBy(xpath="//*[contains(text(),'120 mmHg')]")
	WebElement bpText2;
	
	@FindBy(xpath="//*[contains(text(),'96 %')]")
	WebElement oxygenSaturationText;
	
	public void enterVitalDetails(String h,String w,String t,String p,String r,String bp1,String bp2,String o) {
		gl.typeToAnElement(height, h);
		gl.clickOnElement(nxtButton);
		gl.typeToAnElement(weight, w);
		gl.clickOnElement(nxtButton);
		gl.clickOnElement(nxtButton);
		gl.typeToAnElement(temperature, t);
		gl.clickOnElement(nxtButton);
		gl.typeToAnElement(pulse, p);
		gl.clickOnElement(nxtButton);
		gl.typeToAnElement(respiratoryRate, r);
		gl.clickOnElement(nxtButton);
		gl.typeToAnElement(bloodPressure1, bp1);
		gl.typeToAnElement(bloodPressure2, bp2);
		gl.clickOnElement(nxtButton);
		gl.typeToAnElement(oxygenSaturation, o);
		gl.clickOnElement(nxtButton);
		gl.clickOnElement(saveButton);
	}
	
	
	public void clickOnShowDetails() {
		gl.clickUsingJs(driver, showDetails);
	}
	
	public String getTextOfHeight() {
		return gl.getTextOfAnElement(height);
	}
	
	public String getTextOfWeight() {
		return gl.getTextOfAnElement(weight);
	}
	public String getTextOfTemperature() {
		return gl.getTextOfAnElement(temperature);
	}
	public String getTextOfPulse() {
		return gl.getTextOfAnElement(pulse);
	}
	public String getTextOfRespiratoryRate() {
		return gl.getTextOfAnElement(respiratoryRate);
	}
	public String getTextOfBloodPressureOne() {
		return gl.getTextOfAnElement(bloodPressure1);
	}	
	public String getTextOfBloodPressureTwo() {
		return gl.getTextOfAnElement(bloodPressure2);
	}	
	public String getTextOfOxygenSaturation() {
		return gl.getTextOfAnElement(oxygenSaturation);
	}	
	
	public String readStringData(int a, int b) throws IOException {
		return ExcelReadClass.getStringData(a, b);
	}
	public String readIntegerData(int a, int b) throws IOException {
		return ExcelReadClass.getIntegerData(a, b);
		
	}
		
	public String getTexOfHeightText() {
		return gl.getTextOfAnElement(heightText);
	}
		
	public String getTextOfWeightText() {
		return gl.getTextOfAnElement(weightText);
	}
	
	public String getTextOfTempText() {
		return gl.getTextOfAnElement(tempText);
	}
	
	public String getTextOfPulseText() {
		return gl.getTextOfAnElement(pulseText);
	}
		
	public String getTextOfRespiratoryText() {
		return gl.getTextOfAnElement(respiratoryText);
	}	
	
	public String getTextOfBloodPressureTextOne() {
		return gl.getTextOfAnElement(bpText1);
	}
	
	public String getTextOfBloodPressureTextTwo() {
		return gl.getTextOfAnElement(bpText2);
	}
	
	public String getTextOfOxygenSaturationText() {
		return gl.getTextOfAnElement(oxygenSaturationText);
	}
}

