package com.jgate.packages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasses.TestBase;
import com.utilpackage.TestUtil;

public class Homepage extends TestBase {
	
	
	
	@FindBy(xpath="//input[@id='textField']")
      WebElement BasicSearchTextXpath;
	
	@FindBy(xpath="//input[@class='submit']")
	   WebElement Basicsearchbutton;
	
	
	
	 public Homepage()
	 {
		 PageFactory.initElements(driver, this);
	 } 
	
	
	// Returns results page object ..
	
	public Resultspage clickonsearchbutton(String search)
	{
		//System.out.println(BasicSearchTextXpath);
		//BasicSearchTextXpath.click();
		BasicSearchTextXpath.sendKeys(search);
		System.out.println(search);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);	
		Basicsearchbutton.click();
		return new Resultspage();
		
	}
	    
	
}
