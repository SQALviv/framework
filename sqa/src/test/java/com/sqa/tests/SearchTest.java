package com.sqa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sqa.verifications.Base;


public class SearchTest extends Base{

	@Test (groups = "search")
	public void checkSearchingWorks(){
		driver.get(repository.getMainPage().getBaseUrl() + repository.getServicePage().getServiceUrl());
		String error = repository.getSearchByBrandNameVerification().verifyThatSearchByBrandNameWorks();
		Assert.assertTrue(error.length()==0,error);
		
	}

}
