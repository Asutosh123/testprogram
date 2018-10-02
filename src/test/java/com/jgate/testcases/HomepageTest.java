package com.jgate.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclasses.TestBase;
import com.jgate.packages.Homepage;
import com.jgate.packages.Loginpage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utilpackage.TestUtil;

public class HomepageTest extends TestBase{
    
	Loginpage loginpage; 
	Homepage homepage;
	public ExtentReports extent ;
	 public ExtentTest logger; 
	 public WebDriver driver;
	
	  public HomepageTest()
	  {
		  super();
	  }
	  
	 @BeforeMethod
     public void Setup()
     {
	 initialization();
	 
	 loginpage = new Loginpage();
	 homepage =loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	 
	 
	 
     }
	 
	 
	 
	 @Test (priority =1)
	 
	 public void verifyresultspage()
	 {
		  homepage = new Homepage();		         
		  homepage.clickonsearchbutton(prop.getProperty("searchterm"));	   
	 }
	 
	 
	/*  @AfterTest
	  public void EndREPORT()
	  {
	   extent.flush();
	   extent.close();
	  }*/
	 
	 @AfterMethod
	 
	 public void TearDown(ITestResult result) throws IOException
	  {
	  
}
}