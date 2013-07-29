package com.sqa.webdriver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PropertiesData {

	public String getData(String data){
		Map<String, String> prop = new HashMap<String, String>();
		try {
			 File file = new File("src/test/resources/data.properties");
			 FileReader fr = new FileReader (file.getAbsolutePath());
	
		     BufferedReader br = new BufferedReader(fr);
	        
	         String line = null;
	         while ((line = br.readLine()) != null)
	         {
	        	 prop.put(line.split("=")[0], line.split("=")[1]);
	         }
	        
	         br.close();
	         fr.close();
		}
	        
		catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	        
	    return prop.get(data);
	}
	
	
	 
}
