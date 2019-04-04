package com.assignment.base;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.assignment.util.GeneralUtil;
import com.assignment.util.ReadPropertyFileUtil;


//This is the base class which will contain all the basic tasks like loading of config, instantiating of driver, etc.

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase()
	{
		//To load property file
		prop=ReadPropertyFileUtil.loadConfigFile();
	}

	
	public static void initialization()
	{
		String browserName = prop.getProperty("BROWSER");
		if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(GeneralUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(GeneralUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("URL"));
		
		
	}

}

