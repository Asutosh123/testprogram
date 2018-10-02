package com.jgate.packages;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class excelread {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jgateplus.com/search/login/");
		driver.manage().window().maximize();
		
        
        
        File src=new File("C:\\Users\\asutosh.m\\Desktop\\Book1.xlsx");
    	FileInputStream fis=new FileInputStream(src);
    	XSSFWorkbook wb=new XSSFWorkbook(fis);
    	XSSFSheet sh=wb.getSheet("Sheet1");
    	int count=sh.getLastRowNum();
    	System.out.println("Total number of rows:"+count);
    	int column=sh.getRow(0).getLastCellNum();
    	System.out.println("Total number of columns:"+column);
    	
    	for(int i=0;i<= count;i++)
    	 {
    		Row row=sh.getRow(i);
    	  String userName= row.getCell(0).getStringCellValue();
    			System.out.println(" \n userName"+userName);
    			
         String  password1= row.getCell(1).getStringCellValue();
    				System.out.println("\n password1"+password1);
    			
    		driver.findElement(By.xpath("//input[@placeholder='Username/Email']")).sendKeys(userName);
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password1);
            driver.findElement(By.xpath("//input[@value='Login']")).click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            
    		
    	 }
	}
}
