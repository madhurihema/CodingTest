package com.examples.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.examples.test.SearchPage;
import com.examples.test.ResultsPage;




public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
				"/Users/hemamadhuri/selenium/selenium-java-3.141.59/geckodriver");

		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.navigate().to("https://www.google.com/");
		   
			
			//Creating object of google search page
			SearchPage search = new SearchPage(driver);
			 
			 //Creating object of results page
			 ResultsPage results = new ResultsPage(driver);
		 
			//Enter ducks in to Search box and Enter
			 search.enterSearch();
			 Thread.sleep(3000);
			 
			 //Get Page Title and Verify
			 System.out.println("Page title is : " + driver.getTitle());
			 
			 String actual = driver.getTitle();
		     String expected = "ducks - Google Search";

		        if (actual.equals(expected)) {
		                   System.out.println("Test Passed!");
		        } else {
		                   System.out.println("Test Failed");
		        }
			
		   // From the results click on Wikipedia and Verify Ducks     
		      
			 // Go to Wikipedia
		     results.goToResultPage();
			 
			 //Verify Ducks in Wikipedia
			 boolean verify = results.verifyDucks();
			 
			 if(verify) {
				 System.out.println("Test Passed!");
				 
			 } else {
				 
				 System.out.println("Test Failed");
				 
			 }
			 
			 
			
			 // Close Driver 
			 driver.quit();
			 
		
	}

}
