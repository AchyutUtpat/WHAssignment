package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookPage {
	public WebDriver driver;
	public FaceBookPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By acceptAllCks=By.cssSelector("div[aria-label='Accept All']");
	By TextArea=By.cssSelector("div[role='button'] > div > span[style*='webkit-box-orient']");
	By TextAreaExpanded = By.cssSelector("div[aria-describedby*='placeholder']");
	By PostBtn = By.cssSelector("div[aria-label='Post']");
	By AcntSetngs =By.cssSelector("div[aria-label='Account']");
	By LogoutBtn = By.cssSelector("i.hu5pjgll.lzf7d6o1.sp_09gpAzWhK7K.sx_2eadd2");
	
	
	public WebElement AcceptCookies()
	{
		System.out.println(" Accept All Cookies button");
		return driver.findElement(acceptAllCks);
	}
	
	public WebElement WhatsMind()
	{
		System.out.println(" Click on What's on Your Mind?");
		return driver.findElement(TextArea);
	}
	
	public WebElement ExpandedArea()
	{
		System.out.println(" Click on the expanded text area and add text");
		return driver.findElement(TextAreaExpanded);
	}
	
	public WebElement PostButton()
	{
		System.out.println(" Click on the expanded text area");
		return driver.findElement(PostBtn);
	}
	
	public WebElement AcntSetngs()
	{
		System.out.println(" Click on Account Settings Dropdown");
		return driver.findElement(AcntSetngs);
	}
	
	public WebElement LogoutBtn()
	{
		System.out.println(" Click on Log out button");
		return driver.findElement(LogoutBtn);
	}
	
	

}
