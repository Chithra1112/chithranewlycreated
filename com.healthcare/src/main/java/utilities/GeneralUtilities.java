package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {
	
	public void clickOnElement(WebElement element) {
		element.click();
	}
	
	public void clearAnElement(WebElement element) {
		element.clear();
	}
	
	public void typeToAnElement(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	public String getPageCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();
		
	}
	
 public Boolean elementIsDisplayed(WebElement element) {
	 return element.isDisplayed();
 }

 public String getTextOfAnElement(WebElement element) {
	 return element.getText();
 }
 
 public String getAttributeOfAnElement(WebElement element,String attributeType) {
	 return element.getAttribute(null);
 
}
public void clickUsingJs(WebDriver driver,WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element);
}
public void scrollToAnElementUsingJs(WebDriver driver,WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", element);
}
	
public void selectFromDropDownByIndex(WebElement element,int index) {
	Select select=new Select(element);
	select.selectByIndex(index);	
}
public void alertAccept(WebDriver driver) {
	driver.switchTo().alert().accept();
}
public void clickAnElementByUsingSendKeys(WebElement element,WebDriver driver) {
	Actions action=new Actions(driver);
	action.sendKeys(element,Keys.ENTER).build().perform();
}
public void dragAndDrop(WebElement element1,WebElement element2,WebDriver driver) {
	Actions action=new Actions(driver);
	action.dragAndDrop(element1,element2).build().perform();
}

public String getTitleOfAnElement(WebDriver driver) {
	return driver.getTitle();
}

public void selectByVisibleText(WebElement element,String visibleText) {
	Select select=new Select(element);
	select.selectByVisibleText(visibleText);
}

public void selectByValue(WebElement element,String selectByValue) {
	Select select=new Select(element);
	select.selectByValue(selectByValue);
}

public void alertDismiss(WebDriver driver) {
	driver.switchTo().alert().dismiss();
}

public void alertGetText(WebDriver driver) {
	driver.switchTo().alert().getText();
}

public void alertSendKeys(WebDriver driver,String text ) {
	driver.switchTo().alert().sendKeys(text);
}
}