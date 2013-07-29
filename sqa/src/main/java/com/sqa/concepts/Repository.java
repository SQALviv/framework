package com.sqa.concepts;


import com.sqa.logs.Logger;
import com.sqa.pages.BrandPage;
import com.sqa.pages.MainPage;
import com.sqa.pages.ServicePage;
import com.sqa.verifications.FixedMenuAndLogoVerification;
import com.sqa.verifications.IconMovingVerification;
import com.sqa.verifications.SearchByBrandNameVerification;
import com.sqa.webdriver.PropertiesData;

public interface Repository {

	PropertiesData getPropertiesData();
	
	Logger getLogger();
	
	/**
	 * 
	 * Page object declaration
	 */
	
	MainPage getMainPage();
	
	ServicePage getServicePage();
	
	BrandPage getBrandPage();
	
	/**
	 * 
	 * Verification declaration
	 */
	
	FixedMenuAndLogoVerification getFixedMenuVerification();
	
	SearchByBrandNameVerification getSearchByBrandNameVerification();
	
	IconMovingVerification getIconMovingVerification();
	
}
