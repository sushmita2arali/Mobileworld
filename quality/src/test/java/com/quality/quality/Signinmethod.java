package com.quality.quality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Signinmethod {
	
		public class SignIn {
		 
		@Test    
		   public void launchBrowser() throws Exception {
			
			 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sushmita.arali\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	            WebDriver driver = new ChromeDriver();
		    driver =  new ChromeDriver();
		    driver.get("https://mobileworld.banyanpro.com/");
		    Thread.sleep(1000);
		    driver.findElement(By.className("my-sm-0")).click();
		    driver.findElement(By.id("username")).sendKeys("sushmita.arali");
		    driver.findElement(By.name("password")).sendKeys("Sush@123");
		    driver.findElement(By.cssSelector("label.custom-control-label")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.className("btn-primary")).click();
		}
		
		

	    @DataProvider(name="SignIn")
	          public void getdata()
	          {
	    	Object[][] data=new Object[2][7];
	    	data [0][0]="Sushmita";
	    	data[0][1]="arali";
	       data[0][2]="sushmita@gmail.com";
	       data[0][3]="Sush@123";
	       data[0][4]="23/04/2000";
	       data[0][5]="8453392322";
	       data[0][6]="helloworld";
	       data[1][0]="Sushmitaaralisush";
	       data[1][1]="Arali";
	       data[1][2]="sushmitagmail.com";
	       data[1][3]="Sushma@123";
	   	   data[1][4]="3/12/22000";
	       data[1][5]="9876543223456";
	   	   data[1][6]="qualitest";
	          }
	}


}
