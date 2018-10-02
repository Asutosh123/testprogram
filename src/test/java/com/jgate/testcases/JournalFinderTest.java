package com.jgate.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclasses.TestBase;
import com.jgate.packages.Homepage;
import com.jgate.packages.JournalFinder;
import com.jgate.packages.Loginpage;

public class JournalFinderTest extends TestBase {
    
	  Loginpage loginpage;
	  Homepage homepage;
	  JournalFinder journalfinder;
	  
	  
	  public JournalFinderTest()
	  {
		  super();
	  }
	 
	  @BeforeMethod
	          public void setup()
	          {
		           initialization();
		           
		           loginpage  = new Loginpage();
		         homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		           
	          }
	          
	    @Test
	       public void journalfinder()
	    {
	    	    //   journalfinder = new JournalFinder();
	    	       journalfinder.Journalfinderclick();
	    	         
	    }
	  
	  @AfterMethod
	       public void teradown()
	       {
		     driver.quit();
	       }
	       
	       
	  
	   
}
