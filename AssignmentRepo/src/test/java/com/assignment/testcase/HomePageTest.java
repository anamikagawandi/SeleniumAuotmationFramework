package com.assignment.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment.base.TestBase;
import com.assignment.pages.HomePage;


public class HomePageTest extends TestBase {
	
	HomePage homepage;
	
	public HomePageTest()
	{
		super();
	}
	
		
	@BeforeMethod
	public void setup()
	{
		initialization();
		homepage = new HomePage();
	}

	@Test(priority=1)
	public void verifyLang() throws IOException
	{
		
	}
	
	
	
	
	@Test(priority=2)
	public void goToMobilePageTest() throws IOException
	{
	
		try {
		//System.out.println(homepage.goToMobilePage());
		

		}
		catch(AssertionError e)
		{
	
		}
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		//driver.close();
		driver.quit();
	}

}
