package com.baseclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utilpackage.TestUtil;

public class TestBase {
 
	// Global Variable
	  public static WebDriver driver;
	  public static Properties prop;
	  
	  
	 //Create Constructor and read the properties
	public  TestBase(){
		
		try{
			 prop = new Properties();
			 FileInputStream fis = new FileInputStream("E:\\MyWorkspace\\pomframework\\src\\main\\java\\com\\configurationpackage\\config.properties");
			  prop.load(fis);
			  
			 /* File file = new File("E:\\MyWorkspace\\pomframework\\src\\main\\java\\com\\configurationpackage\\config.properties");
			  String absolutePath = file.getAbsolutePath();
			  System.out.println("My project path is:\n"+ absolutePath);*/
		}
		 catch(FileNotFoundException e)
		{
			 e.printStackTrace();
		 }
		 catch(IOException e)
		{
			 e.printStackTrace();
		}
	 }
	// Intialization Method
	
	public static void initialization()
	{
	String browserName = prop.getProperty("browser");
	       if(browserName.equals("chrome"))
	       {

	    		  System.setProperty("webdriver.chrome.driver","C:\\Users\\asutosh.m\\Desktop\\chromedriver.exe");
	    	       driver = new ChromeDriver();
	    	       
	       }
	       else if (browserName.equalsIgnoreCase("Firefox"))
	       {
	    	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\asutosh.m\\Desktop\\gec\\geckodriver.exe");
	    	   driver = new FirefoxDriver();
	       }
	       
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	       System.out.println(prop.getProperty("url"));
	       driver.get(prop.getProperty("url"));
	       
	}
	
	
	
}
