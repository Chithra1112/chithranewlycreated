package pageclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelReadClass;
import utilities.GeneralUtilities;

public class LoginPageClass {
	
	WebDriver driver;
	
	GeneralUtilities gl=new GeneralUtilities();
	
	public LoginPageClass(WebDriver driver) {//test class driver is parametrized.
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath = "//li[text()='Registration Desk']")
	WebElement registrationDesk;
	
	@FindBy(id="loginButton")
	WebElement logIn;
	
	
	public void logInAsRegistrationDesk(String uname,String paswrd) {
		gl.typeToAnElement(username, uname);
		gl.typeToAnElement(password, paswrd);
		gl.clickOnElement(registrationDesk);
		gl.clickOnElement(logIn);
	}
	
	public String readStringData(int a, int b) throws IOException {
		return ExcelReadClass.getStringData(a, b);
}
}

