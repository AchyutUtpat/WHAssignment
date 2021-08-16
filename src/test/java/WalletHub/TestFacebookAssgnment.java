package WalletHub;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.FaceBookLoginPage;
import pageObject.FaceBookPage;

import resources.BaseDetails;
import resources.Utils;

public class TestFacebookAssgnment extends BaseDetails {
	public static Logger log = LogManager.getLogger(BaseDetails.class.getName());
	public WebDriver driver;
	//Declare Facebook Credentials
	String user="Enter your Username";
	String pass="Enter your Password";
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url1"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void faceBookAss() throws Exception
	{
		Utils Utls=new Utils(driver);
		FaceBookLoginPage FBLgn=new FaceBookLoginPage(driver);
		//Click on the Close Email window
		FBLgn.AddEmail().sendKeys(user);
		FBLgn.Addpwd().sendKeys(pass);
		FBLgn.LoginBtn();
		
		FaceBookPage FBPage=FBLgn.LoginBtn();
		FBPage.AcceptCookies().click();
		FBPage.WhatsMind().click();
		FBPage.ExpandedArea().click();
		FBPage.ExpandedArea().sendKeys("Hello World!");
		FBPage.PostButton().click();
		FBPage.AcntSetngs().click();
		Utls.implicit_Wait1("elementToBeClickable");
		FBPage.LogoutBtn().click();
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver.quit();
	}

}
