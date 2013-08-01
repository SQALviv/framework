package com.sqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sqa.webdriver.FirefoxWebDriver;


public class BrandPage  extends FirefoxWebDriver{
	
	public WebElement getBrandName(){
		return driver.findElement(By.xpath("//*[@id='main']/h2"));
	}
	
	
	public static WebElement explicitWait()  
	 {  
	      WebDriverWait wait = new WebDriverWait(driver, 30);  
	      return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));  
	 }   

}
