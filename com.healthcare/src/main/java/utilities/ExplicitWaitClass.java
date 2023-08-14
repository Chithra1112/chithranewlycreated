package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitClass {
public WebDriverWait wait;

public void presenceOfElementLocatedWait(WebDriver driver,String xpathValue)
{
	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue)));
	
}

public void presenceOfElementLocatedWaitID(WebDriver driver,String iDValue) {
	wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(iDValue)));
}

public void elementToBeClickableWait(WebDriver driver, WebElement element) {
	wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
}
