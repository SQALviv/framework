package com.sqa.verifications;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class IconMovingVerification extends Base {

	public String verifyThatIconCanBeMoved(){
		String outResults="";
		
		int size = repository.getServicePage().getBrandsList().size();
		
		WebElement brandNameFirst = repository.getServicePage().getBrandsList().get(1);
		
		WebElement brandNameSecond = repository.getServicePage().getBrandsList().get(size - 1);

		Point firstPosition = brandNameFirst.getLocation();
		
		Actions builder = new Actions(driver);
		repository.getLogger().log(1, "Move 1-st icon to last position");
		builder.dragAndDrop(brandNameFirst, brandNameSecond).build().perform();
		//builder.clickAndHold(brandNameFirst).moveToElement(brandNameSecond).release(brandNameFirst).build().perform();
		
		Point secondPosition = brandNameSecond.getLocation();
		
		
		if(firstPosition==secondPosition)
			outResults = "Position was not changed \n";
		
		
		
		return outResults;
	}
	
}
