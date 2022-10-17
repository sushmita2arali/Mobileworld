package com.quality.quality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signupmethod {
	
    
@Test    
   public void launchBrowser() throws Exception {
	
	 //System.setProperty("webdriver.chrome.driver","C:\\Users\\sushmita.arali\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriverManager.edgedriver().setup();
     WebDriver driver = new EdgeDriver();
    driver =  new ChromeDriver();
    driver.get("https://mobileworld.banyanpro.com/");
    driver.findElement(By.className("my-sm-0")).click();
    driver.findElement(By.linkText("Sign up")).click();
    driver.findElement(By.id("myName")).sendKeys("Sushmita");    
    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Arali");
    driver.findElement(By.cssSelector("input[placeholder='Enter Email']")).sendKeys("Sushmita@gmail.com");
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Sush@123");
    driver.findElement(By.cssSelector("input[type='date']")).sendKeys("23/04/2000");
    driver.findElement(By.cssSelector("div[class='col-md-3'] input[name='gender']")).click();
    driver.findElement(By.cssSelector("input[placeholder='91XXXXXXXXXX']")).sendKeys("8453392322");
    driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Hello world!");
    driver.findElement(By.className("btn-info")).click();    
}
}



