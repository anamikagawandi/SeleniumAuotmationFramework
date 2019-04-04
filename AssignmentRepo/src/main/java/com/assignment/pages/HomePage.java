package com.assignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.assignment.base.TestBase;

public class HomePage extends TestBase{
	
	HomePage()
	{
		super();
		super.initialization();
	}
	
	
	
	public void goToSignUp()
	{
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		driver.findElement(By.xpath("//a[@data-testid='sign_up_free']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abana@gmail.com");
		driver.findElement(By.xpath("//input[@name='password1']")).sendKeys("abana@gmail.com");
		Select s=new Select(driver.findElement(By.xpath("//div[@id='s2id_layer_postedby']/child::a/child::span[text()='Select' and @class='select2-chosen']")));
		s.selectByIndex(0);
		
	}

	
	public static void main(String args[])
	{
		HomePage h=new HomePage();
		h.goToSignUp();
		
	}
}
