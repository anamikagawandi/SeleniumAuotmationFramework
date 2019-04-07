package com.assignment.pages;

import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.assignment.base.TestBase;
import com.assignment.util.FindByUtil;
import com.assignment.util.GeneralUtils;
import com.assignment.util.WaitUtil;

public class SignUpDetailPage extends TestBase {
	
	
	GeneralUtils gen;
	public SignUpDetailPage()
	{
		gen = new GeneralUtils();
	}
	
	
	public ArrayList<String> getDomain()
	{
		WaitUtil.waitForInteract(FindByUtil.findByXpath("//input[@id='regionalSite']", driver), driver);
		FindByUtil.findByXpath("//input[@id='regionalSite']", driver).click();
		
		WaitUtil.waitFor(FindByUtil.findByXpath("//div[@id='focused-input']/div/div/div", driver), driver);
		
		
		ArrayList<String> domain=new ArrayList<String>();
		
		List<WebElement> data = driver.findElements(By.xpath("//div[@id='focused-input']/div/div/div"));
		
		for(WebElement e : data)
		{
			domain.add(e.getAttribute("value").toLowerCase());
		}
		
		return domain;
	}
		
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}

}
