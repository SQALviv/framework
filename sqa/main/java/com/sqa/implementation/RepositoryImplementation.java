package java.com.sqa.implementation;

import java.com.sqa.concepts.Repository;
import java.com.sqa.pages.MainPage;
import java.com.sqa.verifications.FixedMenuAndLogoVerification;
import java.com.sqa.webdriver.PropertiesData;

public class RepositoryImplementation implements Repository {

	public PropertiesData getPropertiesData() {
		return new PropertiesData();
	}

	public MainPage getMainPage() {
		return new MainPage();
	}

	public FixedMenuAndLogoVerification getFixedMenuVerification() {
		return new FixedMenuAndLogoVerification();
	}

	
}
