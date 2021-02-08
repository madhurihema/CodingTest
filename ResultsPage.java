package com.examples.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ResultsPage {
	
     WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object 
	//of the class is created
	 public ResultsPage(WebDriver driver) {
	          this.driver = driver;
	 }
	 
	//Locator for Search field
	 By resultElement = By.xpath("//span[contains(text(),'Duck - Wikipedia')]");

	 public void goToResultPage() {
		 
		 driver.findElement(resultElement).click();
		 
		 }
	 
    public boolean  verifyDucks() {
		 
    	System.out.println("Wikipedia Page title is : " + driver.getTitle());
    	
    	String actual = driver.getTitle();
	     String expected = "Duck - Wikipedia";

	        if (actual.equals(expected)) {
	                   return true;
	        } else {
	                   return false;
	        }
		 
		 }


}
