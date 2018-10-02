package com.jgate.packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasses.TestBase;

public class JournalFinder extends TestBase {

	 
	 @FindBy(id="journal")
	    WebElement JournalFinderButton; 
	 
	 
	 public JournalFinder()
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	
	  public void Journalfinderclick()
	  {
		  JournalFinderButton.click();
	  }
	 
}
