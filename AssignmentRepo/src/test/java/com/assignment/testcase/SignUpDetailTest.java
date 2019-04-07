package com.assignment.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.assignment.base.TestBase;
import com.assignment.pages.HomePage;
import com.assignment.pages.SignUpDetailPage;
import com.assignment.util.JsonUtil;

public class SignUpDetailTest extends TestBase{
	
HomePage homepage;
SignUpDetailPage signup;
	
	public SignUpDetailTest()
	{
		super();
	}
	
	
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		homepage = new HomePage();
	}
	
	
	
	
	@DataProvider(name="getDomainData")
	public String[][] getCommunityData()
	{
		return new JsonUtil().getDomain();
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
	
	
	@Test(priority=0,dataProvider="getDomainData")
	public void verifyDomain(String community)
	{
		homepage.goToSignUpFromLogin(community);
		homepage.inputSignUpDetailPageOne();
		homepage.goToInputSignUpDetailPageTwo();
		homepage.inputSignUpDetailPageTwo();
		signup=homepage.goToInputSignUpDetailPageThree();
		
		try {
			Assert.assertTrue(signup.getDomain().contains(community.toLowerCase()));	
		}
		catch(AssertionError ae)
		{
			System.out.println("This domain is not present in the list : "+community);
			//this is to fail the testcase
			throw new AssertionError();
		}
	
	}

}
