package com.sqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sqa.webdriver.FirefoxWebDriver;


public class MainPage  extends FirefoxWebDriver{
	
	public WebElement getHeader(){
		return driver.findElement(By.xpath("//*[@id='header']"));
	}
	
	public WebElement getFixedMenu(){
		return driver.findElement(By.xpath("//*[@id='floatingbar']"));
	}
	
	public WebElement getSeachButton(){
		return driver.findElement(By.xpath("//*[@id='searchButton']"));
	}
	
	public WebElement getSeachField(){
		return driver.findElement(By.xpath("//*[@id='brand']"));
	}

}
