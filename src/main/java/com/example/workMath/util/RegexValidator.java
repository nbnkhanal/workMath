package com.example.workMath.util;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.stereotype.Component;

//@Service
//@Configuration
@Component
public class RegexValidator {
	String username = "";
	InputStream inputStream;
	public String regexProp() throws Exception{
	
	try {
	Properties props = new Properties();
	String propFileName = "regex.properties";	
	inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
	 
	if (inputStream != null) {
		props.load(inputStream);
	} else {
		throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
	}
	String regexValue = props.getProperty("namePattern");
	username = regexValue;
	System.out.println("regex value is -------><>"+username);
	} catch (Exception e) {
		System.out.println("Exception: " + e);
	} finally {
		inputStream.close();
	}
	System.out.println("uname is ------> " + username);
	return username;
	}
	

}
