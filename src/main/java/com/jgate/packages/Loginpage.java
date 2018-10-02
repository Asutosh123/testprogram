package com.jgate.packages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasses.TestBase;

public class Loginpage extends TestBase {

	    // page Object repository -- > To define page factory
	    //page libraries
	
	
	 @FindBy(name="j_username")
	 WebElement username;
	 
	 @FindBy(name="j_password")
	 WebElement password;
	 
	 @FindBy(xpath="//input[@class='com-btn']")
	  WebElement loginbuttoon; 
	 	 
	 @FindBy(xpath="//img[contains(@src,'/search/images/logo.png')]")
	 WebElement jgatelogo;
	 
	 
	 
	 // Initializing the objects by using pagefactory
	 // All the above variables will be initialize with driver. 
	 // this --> it's pointing to current class object.
	 public Loginpage()
	 {
		 PageFactory.initElements(driver, this);
		 System.out.println("Check");
	 }
	 
	 public String validloginpagetitle(){
		 
		 return driver.getTitle();
	 }
	 
	 public boolean validatejgatelogo()
	 {
		return jgatelogo.isDisplayed();
	 }
	 
	 
	 public Homepage login(String un , String pwd)
	 {
		 username.sendKeys(un);
		 password.sendKeys(pwd);
		 loginbuttoon.click();
		 
		 return new Homepage();
	 }
}
