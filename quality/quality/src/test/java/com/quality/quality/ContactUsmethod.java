package com.quality.quality;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ContactUsmethod {
   


	@Test
    public void launchBrowser () throws Exception {
      //Object webDriverManager;
    //webDriverManager.
	
	 // System.setProperty("webdriver.edge.driver", "file:///C:/Users/sushmita.arali/Downloads/edgedriver_mac64(1)\\msedgedriver.exe");
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\sushmita.arali\\Downloads\\chromedriver_win32\\chromedriver.exe");
       // ChromeDriver driver = new ChormeDriver();
            driver.get("https://mobileworld.banyanpro.com/contact.html");    
            driver.findElement(By.linkText("Support")).click();
            driver.findElement(By.linkText("Contact Us")).click();
           
            String parenthandle = driver.getWindowHandle();
            Thread.sleep(1000);
           Set<String> handles = driver.getWindowHandles();
           Thread.sleep(1000);
            for(String handel : handles) {
                Thread.sleep(1000);
                
               if(!handel.equals(parenthandle)) {
                   driver.switchTo().window(handel);
           
                   driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Sushmita");
                   driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Sushmita@gmail.com");
                   driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("84322987");
                   driver.findElement(By.xpath("//textarea[@placeholder='Message']")).sendKeys("Bingo");
                   driver.findElement(By.className("btn")).click();
                   
                 
                   
                                  }
            }       
        }
   }

