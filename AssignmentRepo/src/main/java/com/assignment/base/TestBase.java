package com.assignment.base;


import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.assignment.util.WaitUtil;
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
		
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(WaitUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(WaitUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("URL"));
		//driver.navigate().refresh();
		
	}

}

