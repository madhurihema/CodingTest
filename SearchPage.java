package com.examples.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;



public class SearchPage {
	
	
	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object 
	//of the class is created
	 public SearchPage(WebDriver driver) {
	          this.driver = driver;
	 }
	 
	//Locator for Search field
	 By searchBox = By.name("q");
	 
	 public void enterSearch() {
		 
		 driver.findElement(searchBox).sendKeys("ducks");
	     driver.findElement(searchBox).sendKeys(Keys.RETURN);
	     
		 }

}
