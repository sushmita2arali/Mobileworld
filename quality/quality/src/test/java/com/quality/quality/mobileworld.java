package com.quality.quality;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

//import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mobileworld{
	WebDriver driver;

    /**
     * This function will execute before each Test tag in testng.xml
     * @param browser
     * @throws Exception
     */
    @BeforeTest
   // @Parameters("browser")
    public void setup(String browser) throws Exception{
        //Check if parameter passed from TestNG is 'firefox'
    	 if(browser.equalsIgnoreCase("firefox")){
    	        //create firefox instance
    		 WebDriverManager.firefoxdriver().setup();
    	            driver = new FirefoxDriver();
    	        }
       
        //Check if parameter passed as 'chrome'
        else if(browser.equalsIgnoreCase("chrome")){
            //set path to chromedriver.exe
           // System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sushmita.arali\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe.");
            //create chrome instance
    		WebDriverManager.chromedriver().setup();
    		//WebDriver driver = new ChromeDriver();
            driver = new ChromeDriver();
        }
        //Check if parameter passed as 'Edge'
                else if(browser.equalsIgnoreCase("Edge")){
                    //set path to Edge.exe
                 //   System.setProperty("webdriver.edge.driver",".");
                    //create Edge instance
                	WebDriverManager.edgedriver().setup();
                    //WebDriver driver = new EdgeDriver();
                    driver = new EdgeDriver();
                }
        else{
            //If no browser passed throw exception
            throw new Exception("Browser is not correct");
        }
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }  
  }


