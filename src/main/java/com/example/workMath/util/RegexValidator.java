package com.example.workMath.util;

import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.context.annotation.Configuration;

//@Service
@Configuration
public class RegexValidator {
	
	public String regexProp() throws Exception{
	
	FileInputStream fis = new FileInputStream("/Users/mario/myFolder/projects/workMath/src/main/resources/regex.properties");
	Properties props = new Properties();
	props.load(fis);
	String username = props.getProperty("namePattern");
	System.out.println(username);
	return username;
	}
	

}
