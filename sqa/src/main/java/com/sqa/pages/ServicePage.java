package com.sqa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sqa.webdriver.FirefoxWebDriver;


public class ServicePage  extends FirefoxWebDriver{
	
	private String list = "//ul[contains(@class,'list')]/li";
	
	public List<WebElement> getBrandsList(){
		return driver.findElements(By.xpath(list + "//button/img"));
	}
	
	public List<WebElement> getBrandsListOnly(){
		return driver.findElements(By.xpath(list));
	}

}
