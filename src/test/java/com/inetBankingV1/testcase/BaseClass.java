package com.inetBankingV1.testcase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.inetBankingV1.utilities.ReadConfig;
public class BaseClass {
	ReadConfig readconfigfile = new ReadConfig();
	public  String url = readconfigfile.getApplicationUrl();

	public String Username = readconfigfile.getUsername();
	public String Password = readconfigfile.getPassword();
	public static Logger logger;
	 static WebDriver driver;
	
	
	@BeforeClass
	public void setup()
	{ 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hemant\\eclipse-workspace\\inetBankingV1\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("browser launched");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		
		logger = Logger.getLogger("inetBanking");
		PropertyConfigurator.configure("Log4j.properties");
		
	}
	
	
	
	@AfterClass
	public void teardown()
	{
		
	}
	
	public void captureScreenshot(WebDriver driver,String scrname) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target =new File(System.getProperty("user.dir")+"/Screenshots/"+scrname+".png");
		FileUtils.copyFile(source,target);
		System.out.println("Screenshot taken");
	}
	
}
