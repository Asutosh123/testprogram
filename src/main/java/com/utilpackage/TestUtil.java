package com.utilpackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclasses.TestBase;

public class TestUtil extends TestBase{

	 public static long IMPLICIT_WAIT= 20;
	 
	 public void switchToFrame()
	 {
		 driver.switchTo().frame("mainpannel");

	 }
	 
	 WebDriverWait wait = new WebDriverWait(driver,20);
	  
	  
	  public static void windowhandlethrougharraylist()
	  {
		       String parent =  driver.getWindowHandle();
		       
		       System.out.println("parent window count is :" + parent);
		       
		       Set<String> allwindows =  driver.getWindowHandles();
		       
		       System.out.println("All window counts are" +allwindows );
		       ArrayList<String>  tabs = new ArrayList<String>(allwindows);
		       driver.switchTo().window(tabs.get(2));
		       
		       
	  
}
/*
	    public void screenshot()
	     {
	    	   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	  //  FileUtils.copyFile(src, new File("E:\\MyWorkspace\\pomframework\\Screenshots\\error.png") );
	    	
	    	    
	     }
	    
	    public static String getScreenshots(WebDriver driver,String screenshotName) throws IOException
	    {
	     String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	     TakesScreenshot ts= (TakesScreenshot)driver;
	     File src= ts.getScreenshotAs(OutputType.FILE);
	     String destination=System.getProperty("user.dir")+"/FailedScreenshots/"+screenshotName+dateName+".png";
	     File finalDestination=new File(destination);
	     FileUtils.copyFile(src, finalDestination);
	     return destination;
	   
	    }*/


	}

