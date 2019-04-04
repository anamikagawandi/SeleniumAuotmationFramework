package com.assignment.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//ReadPropertyFileUtil is a util class to read config file
public class ReadPropertyFileUtil {
	
public static Properties prop;
	
	public static Properties loadConfigFile()
	{
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(".\\src\\main\\java\\com\\assignment\\config\\config.properties");
			prop.load(ip);
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return prop;
	}
	

}
