package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookLoginPage {
	public WebDriver driver;
	public FaceBookLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	By emailadd=By.xpath("//input[@id='email']");
	By pwd=By.xpath("//input[@id='pass']");
	By LoginBtn=By.name("login");
	
	public WebElement AddEmail()
	{
		System.out.println("Enter email address");
		return driver.findElement(emailadd);
	}
	
	public WebElement Addpwd()
	{
		System.out.println("Enter password address");
		return driver.findElement(pwd);
	}
	public FaceBookPage LoginBtn()
	{
		driver.findElement(LoginBtn).click();
		FaceBookPage FBPage=new FaceBookPage(driver);
		return FBPage;
	}

}
