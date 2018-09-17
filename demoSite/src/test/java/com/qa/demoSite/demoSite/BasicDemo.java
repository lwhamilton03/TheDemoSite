package com.qa.demoSite.demoSite;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicDemo {

	private WebDriver driver; 
	private String str = "http://thedemosite.co.uk/";
	
	@Before 
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/Selenium/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
	}
	
	@Test
	public void basic()
	{ 
		driver.get(str);
		WebElement username = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		username.click();
		username.sendKeys("Kiwi");
		WebElement password = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		password.click();
		password.sendKeys("IH8AutomatedTesting!"); 
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
