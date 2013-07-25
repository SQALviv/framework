package com.sqa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sqa.webdriver.FirefoxWebDriver;


public class ServicePage  extends FirefoxWebDriver{
	
	public String getServiceUrl(){
		return "/services.php";
	}
	
	public List<WebElement> getBrandsList(){
		return driver.findElements(By.xpath("//ul[contains(@class,'list')]/li//button/img"));
	}

}
