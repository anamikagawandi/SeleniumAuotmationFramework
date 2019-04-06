package com.assignment.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.assignment.base.TestBase;

public class FindByUtil extends TestBase{

	
	public static WebElement findByID(String id,WebDriver driver)
	{
		return driver.findElement(By.id(id));
	}
	
	
	public static WebElement findByXpath(String xpath,WebDriver driver)
	{
		return driver.findElement(By.xpath(xpath));
	}
	

	public static WebElement findByCss(String css,WebDriver driver)
	{
		return driver.findElement(By.cssSelector(css));
	}
}
