package com.jgate.testcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

//import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclasses.TestBase;
import com.jgate.packages.Homepage;
import com.jgate.packages.Loginpage;
import com.jgate.packages.Resultspage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utilpackage.TestUtil;

public class Resultspagetest extends TestBase{

	Loginpage loginpage; 
	Homepage homepage;
	Resultspage results;
	TestUtil testutil;
	public ExtentReports extent;
	ExtentTest test;
	
	public Resultspagetest() {
		
         super();
	}


	
	 @BeforeMethod
     public void Setup()
     {
	 initialization();
	 loginpage = new Loginpage();
	 homepage =loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	 homepage.clickonsearchbutton(prop.getProperty("searchterm"));
	
     }
	 
	 
	 @Test
	     public void articleaccordionwithfulltext() throws IOException, InterruptedException
	     {
		    results = new Resultspage();
		 System.out.println("Start...");
		 results.articleaccordionclick();
		 System.out.println("Ends...");
		       
		 
	     }
	
	 
	   
	  }
	 
	 


