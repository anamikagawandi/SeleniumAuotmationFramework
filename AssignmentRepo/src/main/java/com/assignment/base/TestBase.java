package com.assignment.base;


import java.util.Arrays;
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
		
		//System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
		//driver = new FirefoxDriver();
		
		
	/*	Map<String, Object> prefs = new HashMap<String, Object>();
		//To Turns off multiple download warning
		prefs.put("profile.default_content_settings.popups", 0);

		prefs.put( "profile.content_settings.pattern_pairs.*.multiple-automatic-downloads", 1 );

		//Turns off download prompt
		prefs.put("download.prompt_for_download", false);
		prefs.put("credentials_enable_service", false);
		//To Stop Save password propmts
		prefs.put("password_manager_enabled", false);

		ChromeOptions options = new ChromeOptions();
		options.addArguments("chrome.switches","--disable-extensions");
		//To Disable any browser notifications
		options.addArguments("--disable-notifications");
		//To disable yellow strip info bar which prompts info messages
		options.addArguments("disable-infobars");

		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver", "Chromedriver path");
		options.addArguments("--test-type");
		
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("chrome.switches", Arrays.asList("--disable-javascript"));
		caps.setJavascriptEnabled(false);*/
		
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(WaitUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(WaitUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		//driver.get(prop.getProperty("URL"));
		//driver.navigate().refresh();
		
	}

}

