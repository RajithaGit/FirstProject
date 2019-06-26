package com.qa.tests;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OpenGoogle {
	
	
  public static WebDriver driver;
  
  @BeforeMethod
  public void launchDriver() {
	  System.setProperty("webdriver.chrome.driver", "/Users/rtupaku/Practise/Drivers/chromedriver");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
	  driver.manage().window().fullscreen();
  }
  
  @Test
  public void Test1() {
	  driver.navigate().to("https://google.com");
	  System.out.println("Test 1 title is "+ driver.getTitle());
  }
  
  @Test
  public void Test2() {
	  driver.navigate().to("https://amazon.com");
	  System.out.println("Test 2 title is "+ driver.getTitle());
  }
  @AfterMethod
  public void quitDriver() {
	  driver.quit();
  }
  
}
