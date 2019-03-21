package com.inetBankingV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewAccount {
	WebDriver driver;
	
	 public AddNewAccount(WebDriver driver) throws InterruptedException
	{
		
		PageFactory.initElements(driver, this);
		System.out.println("initialization done 002");
		
	}
	 
	 
	 @FindBy(name="cusid")
	 WebElement Customeridtxtbox;
	 
	 @FindBy(name="inideposit")
	 WebElement InitialDepositTextbox;
	 
	 
	 @FindBy(name="selaccount")
	 WebElement selectaccount;
	 
	 
	 @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
	 WebElement NewAccSubmit;
	 
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/div/ul/li[5]/a")
	WebElement NewAcc;
	 
	 public void Clicknewacc() throws InterruptedException
	 {
		System.out.println("in clicknew method");
		 NewAcc.click();
			Thread.sleep(5000);
	 }
	 
	 
	 public void EnterCustomerId(String custid)
	 {
		 
		 Customeridtxtbox.sendKeys(custid); 
	 }
	 
	 public void SelectAccType(String AccType)
	 {
		 
		 Select Accounttype = new Select(selectaccount);
		 Accounttype.selectByVisibleText(AccType);
		 
	 }
	 
	 public void AmountToDeposit(String deposit)
	 {
		 
		 InitialDepositTextbox.sendKeys(deposit); 
	 }
	 public void SubmitNewAcc()
	 {
		 
		 Customeridtxtbox.click(); 
	 }
	
	
	 
}
