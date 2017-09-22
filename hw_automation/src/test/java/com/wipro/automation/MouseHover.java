package com.wipro.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHover {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		System.setProperty("webdriver.chrome.driver", "src/jars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://jquery.com/download/");
	}
	
	@Test
	public void test() throws Exception
	{
		Actions action = new Actions(driver);
		WebElement Mainele = driver.findElement(By.xpath("//*[@id='global-nav']/nav/div/ul[2]/li[2]/a"));
		
		Thread.sleep(3000);
		action.moveToElement(Mainele);
		
		Thread.sleep(3000);
		WebElement subMenu = driver.findElement(By.xpath("//*[@id='global-nav']/nav/div/ul[2]/li[2]/ul/li[4]/a"));
		
		Thread.sleep(3000);
		action.moveToElement(subMenu);
		
		
		
		action.click().build().perform();
	}
	
	
	
	
	
}
