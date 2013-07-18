package java.com.sqa.concepts;

import java.com.sqa.pages.MainPage;
import java.com.sqa.verifications.FixedMenuAndLogoVerification;
import java.com.sqa.webdriver.PropertiesData;

public interface Repository {

	PropertiesData getPropertiesData();
	
	MainPage getMainPage();
	
	FixedMenuAndLogoVerification getFixedMenuVerification();
}
