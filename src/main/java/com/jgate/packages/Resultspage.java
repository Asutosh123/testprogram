package com.jgate.packages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasses.TestBase;
import com.utilpackage.TestUtil;

public class Resultspage extends TestBase {

	  @FindBy(xpath="(//h3[@class='value'])[1]")
	    WebElement accordionclick;
	  
	  
	  @FindBy(xpath="(//a[@class='full-txt'])[2]")
	      WebElement fulltextbuttonclick;
	    

		 public Resultspage()
		 {
			 PageFactory.initElements(driver, this);
		 } 
		 
		 public void articleaccordionclick() throws InterruptedException
		 {
			 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			accordionclick.click();
			 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);	
			 fulltextbuttonclick.click();
			/* Set<String> windows=driver.getWindowHandles();
			 System.out.println("window counts :" +windows);
	          Iterator<String> itr=windows.iterator();
	          String pid=itr.next();
	          System.out.println("parent window counts :" +pid);
	         // driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);	
	          String cid1=itr.next();
	          System.out.println("child window counts :" +cid1);
	         // String cid2=itr.next();
	         // driver.switchTo().window(cid2);
	        //  driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);	
	          System.out.println(cid1);
	          Thread.sleep(6000);
	          System.out.println(driver.getTitle());
	         driver.findElement(By.xpath("(//span[text()='Article Fulltext'])[1]")).click();
			 driver.close();*/
			 
			 String parent= driver.getWindowHandle();
			 
			 
			 Set<String> windows1=driver.getWindowHandles();
			 int count=windows1.size();
			 System.out.println("Total active windows"+count);

			 for(String child:windows1)
			 {
			 	if(!parent.equalsIgnoreCase(child)){
			 	driver.switchTo().window(child);
			 	driver.findElement(By.xpath("//span[text()='Article Fulltext']")).click();
			 	String page=driver.getTitle();
			 	System.out.println("LR Page:"+page);
			  
			 
			 
		 }
			 }	 
}
}