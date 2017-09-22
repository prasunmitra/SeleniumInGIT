package com.wipro.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SeleniumDemoD {
	
	WebDriver driver;
	//Test annotation
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "src/jars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.close();
	}

}
