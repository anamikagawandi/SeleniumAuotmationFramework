package com.assignment.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.assignment.base.TestBase;

public class GeneralUtils extends TestBase{
	
	public Select intializeSelectById(String s,WebDriver driver)
	{
		return new Select(driver.findElement(By.id(s)));
	}

	public Select intializeSelectByName(String s,WebDriver driver)
	{
		return new Select(driver.findElement(By.name(s)));
	}

	
	public void handleSpanDropDown(String menu,String option, WebDriver driver)
	{
		FindByUtil.findByXpath(menu, driver).click();
		
		WaitUtil.waitFor(FindByUtil.findByXpath(option,driver),driver);
		//driver.findElement(By.xpath("//div[text()='Self']")).click();
		FindByUtil.findByXpath(option, driver).click();;
		
	}
	
}
