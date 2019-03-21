package com.inetBankingV1.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testng_rundemo {

	WebDriver driver;
	@Test
	public void testing()

	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hemant\\eclipse-workspace\\inetBankingV1\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
	}
	
}
