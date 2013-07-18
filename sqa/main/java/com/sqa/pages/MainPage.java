package java.com.sqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.com.sqa.webdriver.FirefoxWebDriver;

public class MainPage  extends FirefoxWebDriver{
	
	public String getBaseUrl(){
		return "http://test-2012.zayco.com.ua";
	}
	
	public WebElement getHeader(){
		return driver.findElement(By.xpath("//*[@id='header']"));
	}
	
	public WebElement getFixedMenu(){
		return driver.findElement(By.xpath("//*[@id='floatingbar']"));
	}
	
	public WebElement getSeachButton(){
		return driver.findElement(By.xpath("//*[@id='searchButton']"));
	}

}
