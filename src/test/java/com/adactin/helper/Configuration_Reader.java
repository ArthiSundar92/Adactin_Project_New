package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		
		File f = new File("C:\\Users\\USER\\eclipse-workspace\\Adactin_Project1\\src\\test\\java\\com\\adactin\\properties\\configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		// load
		
		p.load(fis);
		 
	}
	
	public String getBrowser() {
		
		String browser = p.getProperty("browser");
		
		return browser;

	}
	
	public String getUrl() {
		
		String url = p.getProperty("url");
		
		return url;

	}
	
	public  String getUsername() {
		
		String username = p.getProperty("username");
		
		return username;

	}

	
	public  String getPassword() {
		
		String password = p.getProperty("password");
		
		return password;

	}
	

}
