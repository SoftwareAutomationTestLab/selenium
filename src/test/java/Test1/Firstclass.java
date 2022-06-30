package Test1;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firstclass 
{
   @Test
  public void myTest1() throws MalformedURLException 
  {
      
      try
         {
           /*
           -----------------------------------
           Set Chrome Headless mode as TRUE
           -----------------------------------
           */
      ChromeOptions chromeoptions = new ChromeOptions();
      chromeoptions.setHeadless(true);
     RemoteWebDriver chrome = new RemoteWebDriver(new URL("http://hub:4444/wd/hub"), chromeoptions);
           
         
            /*
           ---------------------------------------
                Run Tests against Chrome Browser
           ---------------------------------------
           */
             chrome.get("https://www.google.com");
             System.out.print("Title is "+chrome.getTitle());
             System.out.println("From chrome Browser");

            
          
     
             }//End of TRY
             
             catch(MalformedURLException e)
           {
           System.out.println(e.getMessage());
            }

  }}


