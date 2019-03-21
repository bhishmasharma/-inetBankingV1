package com.inetBankingV1.testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.inetBankingV1.pageObjects.AddNewAccount;
import com.inetBankingV1.pageObjects.LoginPage;
import com.inetBankingV1.utilities.ReadConfig;

public class TC_AddNewAccount_002 extends BaseClass {
	AddNewAccount ac;
@Test
public void addingNewAccounts() throws InterruptedException
{
LoginPage lp = new LoginPage(driver);

driver.get(url);
logger.info("URL is opened");


lp.setUsername(Username);
logger.info("Username Entered");


lp.setPassword(Password);
logger.info("Password Entered");

lp.Submit();


ac =new AddNewAccount(driver);
ac.Clicknewacc();
ac.EnterCustomerId(readconfigfile.getcustid());




}
}