package com.inetBankingV1.testcase;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankingV1.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	BaseClass bc= new BaseClass();
	LoginPage lp;
	
	@Test
	public void loginTest() throws IOException
	{
		System.out.println(Thread.currentThread().getId());
		System.out.println(" in loginTest ");
		
		
		driver.get(url);
		logger.info("URL is opened");
		
		lp = new LoginPage(driver);
	
		lp.setUsername(Username);
		logger.info("Username Entered");
		
		
		lp.setPassword(Password);
		logger.info("Password Entered");
		bc.captureScreenshot(driver,"without webdriver passenter");
		
		lp.Submit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			
			logger.info("Login testcase Passed");
		}
		else
		{
			bc.captureScreenshot(driver,"loginfailed");
			Assert.assertTrue(false);
			logger.info("Login testcase Failed");
			
		}
		
	}
	
}

