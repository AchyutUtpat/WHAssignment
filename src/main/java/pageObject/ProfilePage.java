package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
	
	public WebDriver driver;
	public ProfilePage(WebDriver driver) {
		this.driver=driver;
	}

	By bodytx= By.tagName("body");
	
	public WebElement BodyText() {
		System.out.println(" Find Elelment body text");
		return driver.findElement(bodytx);
	}
	

}
