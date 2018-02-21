package library;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	
	public static void captureScreenshot(WebDriver driver,String Screenshotname) throws Exception{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./Screenshots/"+Screenshotname+".png"));
		System.out.println("screenshot is taken");
		//System.out.println("another way of uploading repo");
	}
	
}
