package com.swiggy.GenericUtilis;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class getProperties {

	public static String getProperty(String key) throws IOException {
		FileInputStream reader=new FileInputStream("./src/test/resources/testData/testData.properties");
		Properties property=new Properties();
		property.load(reader);
		return property.getProperty(key);
	}
	
}
