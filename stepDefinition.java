package com.examples.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class stepDefinition {
	
	WebDriver dr;
	@Given("^navigate to google$")
	public void navigate(){
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.navigate().to("https://www.google.com/");;         
	       }
	
	
	@When ("^Enter 'Ducks' in to google search box and Search$")
	public void search(String searchWord){
		
		By searchBox = By.name("q");
		
		dr.findElement(searchBox).sendKeys(searchWord);
	    dr.findElement(searchBox).sendKeys(Keys.RETURN);
	}
	       
	       
	@Then("^Verify that search is successful$")
	public void verifySuccessful(){
		
      System.out.println("Wikipedia Page title is : " + dr.getTitle());
    	
    	String actualText = dr.getTitle();
	    String expectedText = "Duck - Wikipedia";
   
	   Assert.assertTrue("Login not successful",expectedText.equals(actualText));
	}

}
