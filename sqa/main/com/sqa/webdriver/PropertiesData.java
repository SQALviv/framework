package com.sqa.webdriver;

public class PropertiesData {

	public String getData(String data){
		return System.getProperty(data);
	}
}
