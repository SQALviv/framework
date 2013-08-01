package com.sqa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sqa.verifications.Base;


public class JavaScriptTest extends Base{

	@Test (groups = "search")
	public void javaScriptTest(){
		driver.get(repository.getPropertiesData().getData("url") + repository.getPropertiesData().getData("services_url"));
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('gbqfb').click();");
		
		
		Select realSelect = new Select(driver.findElement(By.xpath("")));
		realSelect.selectByValue("myValue");
		realSelect.selectByIndex(1);
		realSelect.selectByVisibleText("text");

		String error = repository.getSearchByBrandNameVerification().verifyThatSearchByBrandNameWorks();
		Assert.assertTrue(error.length()==0,error);
		
	}

}
