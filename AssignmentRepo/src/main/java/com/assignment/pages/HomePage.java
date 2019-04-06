package com.assignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.assignment.base.TestBase;
import com.assignment.util.FindByUtil;
import com.assignment.util.GeneralUtils;
import com.assignment.util.WaitUtil;

public class HomePage extends TestBase{
	
	GeneralUtils gen;
	JavascriptExecutor executor;
	public HomePage()
	{
		super();
		super.initialization();
		executor = (JavascriptExecutor)driver;
		gen= new GeneralUtils();
	}
	
	
	
	public void goToSignUpFromLogin()
	{
		//driver.findElement(By.xpath("//a[text()='Login']")).click();
		FindByUtil.findByXpath("//a[text()='Login']", driver).click();
		
		WaitUtil.waitFor(FindByUtil.findByXpath("//input[@id='login_page']",driver), this.driver);
		
		//driver.findElement(By.cssSelector(".regi_free_link")).click();
		FindByUtil.findByCss(".regi_free_link", driver).click();
	}
	
	
	public void goToInputSignUpDetailPageTwo() {
		WaitUtil.waitForInteract(FindByUtil.findByXpath("//a[@id='btnSubmit' and text()='Next']", driver), driver);
		FindByUtil.findByXpath("//a[@id='btnSubmit' and text()='Next']", driver).click();
	}
	
	public void goToInputSignUpDetailPageThree() {
		WaitUtil.waitForInteract(FindByUtil.findByXpath("//a[@id='btnSubmit' and text()='Sign Up']", driver), driver);
		FindByUtil.findByXpath("//a[@id='btnSubmit' and text()='Sign Up']", driver).click();
	}
	
	public void inputSignUpDetailPageOne()
	{
		WaitUtil.waitFor(FindByUtil.findByXpath("//div[@id='reg_box']",driver), this.driver);
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys(prop.getProperty("username"));
		//driver.findElement(By.xpath("//input[@name='password1']")).sendKeys(prop.getProperty("password"));
		
		FindByUtil.findByXpath("//input[@name='email']", driver).sendKeys(prop.getProperty("username"));
		FindByUtil.findByXpath("//input[@name='password1']", driver).sendKeys(prop.getProperty("password"));
		
		/*//driver.findElement(By.xpath("//div[@id='s2id_layer_postedby']/child::a/child::span[text()='Select' and @class='select2-chosen']")).click();
		FindByUtil.findByXpath("//div[@id='s2id_layer_postedby']/child::a/child::span[text()='Select' and @class='select2-chosen']", driver).click();;
		
		WaitUtil.waitFor(FindByUtil.findByXpath("//div[text()='Self']",driver),this.driver);
		//driver.findElement(By.xpath("//div[text()='Self']")).click();
		FindByUtil.findByXpath("//div[text()='Self']", driver).click();;
		
		WaitUtil.waitFor(driver.findElement(By.name("gender")), driver);
		//GeneralUtil.waitForInteract(driver.findElement(By.name("gender")), driver);
*/		
		
		gen.handleSpanDropDown("//div[@id='s2id_layer_postedby']/child::a/child::span[text()='Select' and @class='select2-chosen']", "//div[text()='Self']", driver);
		
		
		executor.executeScript("document.getElementById('layer_gender-Female').click();");   //,driver.findElement(By.name("gender"))
		
		//driver.findElement(By.name("gender")).click();
		//driver.findElement(By.xpath("//a[@id='btnSubmit' and text()='Next']")).click()
	}
	

	

	public void inputSignUpDetailPageTwo()
	{
		WaitUtil.waitFor(driver.findElement(By.id("reg_box")), driver);
		FindByUtil.findByID("layer_first_name",driver).sendKeys("Anamika");
		FindByUtil.findByID("layer_last_name",driver).sendKeys("Gawandi");
		
		//Can pass values from db or properties or file. Passed static values dues to scope of the assignment
		gen.intializeSelectById("layer_day", driver).selectByValue("29");
		gen.intializeSelectById("layer_month", driver).selectByIndex(4);
		gen.intializeSelectById("layer_year", driver).selectByValue("1990");
	
		
		
		/*FindByUtil.findByID("s2id_layer_community", driver).click();
		
		WaitUtil.waitFor(FindByUtil.findByXpath("//span[text()='Hindu']",driver),this.driver);
		//driver.findElement(By.xpath("//div[text()='Self']")).click();
		FindByUtil.findByXpath("//span[text()='Hindu']", driver).click();;
		*/
		
		//gen.handleSpanDropDown("//div[@id='s2id_layer_community']", "//span[text()='Hindu']", driver);
		//gen.handleSpanDropDown("//div[@id='s2id_layer_mother_tongue']", option, driver);
		
		
		gen.intializeSelectById("layer_community", driver).selectByValue("Hindu");
		gen.intializeSelectById("layer_mother_tongue", driver).selectByValue("Marathi");
		gen.intializeSelectById("layer_countryofresidence", driver).selectByValue("India");
		
	}
	
	
	public static void main(String args[])
	{
		HomePage h=new HomePage();
		h.goToSignUpFromLogin();
		h.inputSignUpDetailPageOne();
		h.goToInputSignUpDetailPageTwo();
		h.inputSignUpDetailPageTwo();
		//h.goToInputSignUpDetailPageThree();
		
		
		//h.driver.quit();
	}
}
