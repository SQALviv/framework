package com.sqa.concepts;


import com.sqa.pages.MainPage;
import com.sqa.verifications.FixedMenuAndLogoVerification;
import com.sqa.webdriver.PropertiesData;

public interface Repository {

	PropertiesData getPropertiesData();
	
	MainPage getMainPage();
	
	FixedMenuAndLogoVerification getFixedMenuVerification();
}
