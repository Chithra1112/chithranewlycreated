package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitClass {
	FluentWait<WebDriver> wait1;
	
public void elementToBeClickableWaitName(WebDriver driver,String nameValue) {
	wait1=new WebDriverWait(driver, null).withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(5))
			.ignoring(NoSuchElementException.class);
	wait1.until(ExpectedConditions.elementToBeClickable(By.name(nameValue)));
}

public void presenceOfElementLocatedWaitXpath(WebDriver driver,String xpathValue) {
	wait1=new WebDriverWait(driver,null).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5))
			.ignoring(NoSuchElementException.class);
	wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue)));
}

public void presenceOfElementLocatedWaitID(WebDriver driver,String iDValue) {
	wait1=new WebDriverWait(driver,null).withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(5))
			.ignoring(NoSuchElementException.class);
	wait1.until(ExpectedConditions.presenceOfElementLocated(By.id(iDValue)));	
}

public void presenceOfElementLocatedWait(WebDriver driver,WebElement element) {
	wait1=new WebDriverWait(driver,null).withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(5))
			.ignoring(NoSuchElementException.class);
	wait1.until(ExpectedConditions.elementToBeClickable(element));
}
}

