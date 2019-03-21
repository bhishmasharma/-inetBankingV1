package com.inetBankingV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	 public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
		
		
	}

	
	@FindBy(name="uid")
	WebElement EnterUsername;	
	 
	
	@FindBy(name="password")
	WebElement EnterPassword;
	

	@FindBy(name="btnLogin")
	WebElement SubmitButton;

	
	public void setUsername(String Uname)
	{
		
		EnterUsername.sendKeys(Uname);
	}
	
	public void setPassword(String pswd)
	{

		EnterPassword.sendKeys(pswd);
	}
	
	public void Submit()
	{
		SubmitButton.click();
	}
	

}

