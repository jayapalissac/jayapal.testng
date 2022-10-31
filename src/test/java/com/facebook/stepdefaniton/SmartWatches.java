package com.facebook.stepdefaniton;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SmartWatches  {
	
	 static WebDriver driver;
	 @Parameters("browser")
	@BeforeClass (groups="default")
	public static void beforeClass(String browser) {

   if(browser.equals("chrome")) {
	   
	   WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
	   
   }
   else if(browser.equals("edge")) {
	   
	   
	   WebDriverManager.edgedriver().setup();
		
	 		driver=new EdgeDriver();
   }
		
		driver.get("https://www.flipkart.com/");
  		
	  	driver.manage().window().maximize();
	 }

	@AfterClass (groups="default")
  
	public static void afterClass() {
		
	 }
     
	
	
	@Parameters({"user"})
      @Test(priority=1,groups="sanity")
       public void method1(String user)  {
    	  
    	  
    	 WebElement user1= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
    	 
    	 user1.sendKeys(user);
    	  

   }
      @Parameters({"pass"})
      @Test(priority=2,groups="sanity")
      public void method2(String pass) throws Throwable {
    	  
    	  WebElement pass1= driver.findElement(By.xpath("//input[@type='password']"));
    	  
     pass1.sendKeys(pass);
     
     WebElement log= driver.findElement(By.xpath("//button[text()='✕']"));
	  
     log.click();
     
     //
}
      @Parameters({"item"})
      @Test(priority=3,groups="sanity")
      public void method3(String name1) throws Throwable {
    	  
    	  WebElement pass1= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
    	  
     pass1.sendKeys(name1,Keys.ENTER);
     
     Assert.assertEquals("jaya","paul");
}
}


