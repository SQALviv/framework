package com.sqa.implementation;


import com.sqa.concepts.Repository;
import com.sqa.pages.MainPage;
import com.sqa.verifications.FixedMenuAndLogoVerification;
import com.sqa.webdriver.PropertiesData;

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