package com.quality.quality;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactUs {
    
    @Test
    public void contact() throws Exception {
      
            System.setProperty("webdriver.chrome.driver","C:\\Users\\sushmita.arali\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://mobileworld.banyanpro.com/");    
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
                   driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Sushmita.arali");
                   driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Sushmita@gmail.com");
                   driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("8453392322");
                   driver.findElement(By.xpath("//textarea[@placeholder='Message']")).sendKeys("Bingo");
                   driver.findElement(By.className("btn")).click(); 
                   driver.close();
               }
            
            }
                
        }





   }

