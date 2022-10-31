package com.facebook.stepdefaniton;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	 static WebDriver driver;
	 
	 @DataProvider(name="user1")
	 
	 public Object[][]userName(){
		 
		 return new Object[][] {{"jaya"}};
	 }
	 
 @DataProvider(name="pass")
	 
	 public Object[][]passName(){
		 
		 return new Object[][] {{"paul"}};
	 }
 
 @DataProvider(name="name")
 
 public Object[][]mobname(){
	 
	 return new Object[][] {{"realme"}};
 }

	
	 @BeforeClass(groups="default")
	public static void beforeClass() {
  
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
  		
	  	driver.manage().window().maximize();
		 	
		
		 
	 }

	@AfterClass (groups="default")
  
	public static void afterClass() {
		
	 }
 
      @Test(priority=1,dataProvider="user1",groups="sanity")
       public void method1(String user1)  {
    	  
    	  
    	 WebElement user= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
    	 
    	 user.sendKeys(user1);
    	  

   }
      
      @Test(priority=2,dataProvider="pass",groups="sanity")
      public void method2(String pass) throws Throwable {
    	  
    	  WebElement pass1= driver.findElement(By.xpath("//input[@type='password']"));
    	  
     pass1.sendKeys(pass);
     
     WebElement log= driver.findElement(By.xpath("//button[text()='✕']"));
	  
     log.click();
     
     //
}
      
      @Test(priority=3,dataProvider="name",groups="sanity")
      public void method3(String name) throws Throwable {
    	  
    	  WebElement pass1= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
    	  
     pass1.sendKeys(name,Keys.ENTER);
     
     
}
}