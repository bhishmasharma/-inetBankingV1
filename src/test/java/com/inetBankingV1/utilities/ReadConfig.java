package com.inetBankingV1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	public Properties prop;
	FileInputStream ip;

	public ReadConfig() {
		
	
	File src= new File("C:\\Users\\Hemant\\eclipse-workspace\\inetBankingV1\\Configurations\\config.properties");
     
 	
	try {
		ip = new FileInputStream(src);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 	prop = new Properties();
 	try {
		prop.load(ip);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public String getApplicationUrl()
	{
		String url=prop.getProperty("Url");

		return url;
	}
	
	public String getUsername()
	{
		String username=prop.getProperty("Username");
		return username;
	}
	public String getPassword()
	{
		String password=prop.getProperty("Password");
		return password;
	}
	
	public String getcustid()
	{
		String custidss=prop.getProperty("custid");
		return custidss;
		
  }
	public String getacctype()
	{
		String acctype=prop.getProperty("acctype");
		return acctype;
	}
	public String getdeposit()
	{
		String deposit=prop.getProperty("deposit");
		return deposit;
	}
}