package com.sqa.verifications;

import java.util.Random;

public class SearchByBrandNameVerification extends Base {

	public String verifyThatSearchByBrandNameWorks(){
		String outResults="";
		
		int brandsLength = repository.getServicePage().getBrandsList().size();
		Random rand = new Random();
		int i = rand.nextInt(brandsLength);
		
		String brandName = repository.getServicePage().getBrandsList().get(i).getAttribute("alt");
		repository.getMainPage().getSeachField().click();
		repository.getMainPage().getSeachField().sendKeys(brandName);
		repository.getMainPage().getSeachButton().click();
		
		String brandNameTitle = repository.getBrandPage().getBrandName().getText();
		
		if(!brandName.equals(brandNameTitle))
			outResults = "Name is not appropriate \n";
		
		return outResults;
	}
	
}
