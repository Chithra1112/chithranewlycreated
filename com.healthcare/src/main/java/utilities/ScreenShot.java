package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShot {
	public void takeScreenShot(WebDriver driver,String name) throws IOException {// here name is the name of test case.
		TakesScreenshot ts= (TakesScreenshot)driver;
		File screenshotFile= ts.getScreenshotAs(OutputType.FILE);
	
		String dest = System.getProperty("user.dir") + "//Test_Evidence";//it creates a folder in our test with package testevidence.
		File f1 = new File(dest);
		if (!f1.exists()) {//it checks if a folder is alrdy created
			f1.mkdirs();//to create a folder
		}
		
		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());//new date is for taking new date.time n date setting
		
		String destinationPath = System.getProperty("user.dir") + "//Test_Evidence//" + name + timeStamp + ".png";
		File finalDestination = new File(destinationPath);//to set destination path as file.
		FileHandler.copy(screenshotFile, finalDestination);//to store the screenshot file to final destination using filehandler class.
			
	}

}
