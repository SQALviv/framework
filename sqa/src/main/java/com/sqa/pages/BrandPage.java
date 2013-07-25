package com.sqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sqa.webdriver.FirefoxWebDriver;


public class BrandPage  extends FirefoxWebDriver{
	
	public WebElement getBrandName(){
		return driver.findElement(By.xpath("//*[@id='main']/h2"));
	}

}
