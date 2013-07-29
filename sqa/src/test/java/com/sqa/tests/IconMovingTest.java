package com.sqa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sqa.verifications.Base;


public class IconMovingTest extends Base{

	@Test (groups = "search")
	public void checkSearchingWorks(){
		repository.getLogger().log(1, "Go to /services.php page");
		driver.get(repository.getPropertiesData().getData("url") + repository.getPropertiesData().getData("services_url"));
		String error = repository.getIconMovingVerification().verifyThatIconCanBeMoved();
		repository.getLogger().log(1, "Verify that position is changed");
		Assert.assertTrue(error.length()==0,error);
		
	}

}
