package com.jgate.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclasses.TestBase;
import com.jgate.packages.Homepage;
import com.jgate.packages.Loginpage;

public class LoginpageTest extends TestBase {
	
	 Loginpage loginpage;
	 Homepage homepage;
	
      public LoginpageTest(){
    	   super();
    	  
      }
	 @BeforeMethod
	     public void Setup()
	     {
		 initialization();
		 loginpage = new Loginpage();
		 
	     }
	 
	 @Test (priority=1)
	     public void loginpagetitletest()
	     {
		 String title = loginpage.validloginpagetitle();
		 Assert.assertEquals(title, "Login Page");
	     }
	  @Test(priority=2)
	      public void jgatelogoimagetest()
	      {
		     boolean flag =  loginpage.validatejgatelogo();
		    Assert.assertTrue(flag);
		       
	      }
	   @Test (priority=3)
	     public void loginTest()
	     {
		 homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	     }
	 
	 
	 @AfterMethod
	    public void tearDown()
	    {
		 driver.quit();
	    }
	     
}
