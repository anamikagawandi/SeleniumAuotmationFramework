package com.assignment.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.assignment.base.TestBase;
import com.assignment.pages.HomePage;
import com.assignment.util.JsonUtil;


public class HomePageTest extends TestBase {
	
	HomePage homepage;
	
	public HomePageTest()
	{
		super();
	}
	
	
	@DataProvider(name="getData")
	public String[][] getCommunityData()
	{
		return new JsonUtil().getDomainLang();
	}
	
	
		
	@BeforeMethod
	public void setup()
	{
		initialization();
		homepage = new HomePage();
	}

	@Test(priority=1,dataProvider="getData")
	public void verifyLang(String community,String lang) throws IOException
	{
		System.out.println(community);
		System.out.println(lang);
		if(!lang.equalsIgnoreCase("null"))
		{
			Assert.assertTrue(homepage.getLanguages(community).contains(lang.toLowerCase()));;
		}
			
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}

}
