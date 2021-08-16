package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReviewsSectionPage {

	
	public WebDriver driver;
	public ReviewsSectionPage(WebDriver driver) {
		this.driver=driver;
	}

	By review_stars=By.xpath("//*[contains(@class,'wh-rating rating_5')]");
	By review_5th_Star=By.xpath("//*[contains(@class,'wh-rating-choices-holder')]/a[5]");
	By policyDD=By.xpath("//*[@class='dropdown-list-new']");
	By policyDDHealth=By.xpath("//a[contains(@data-target,'Health')]");
	By PolicyHealthStar=By.xpath("//*[@class='bf-icon-star-empty star bstar bf-icon-star'][5]");
	By PolicyReview=By.xpath("//textarea[@name='review' and @id='review-content']");
	
	
	public WebElement ReviewStar() {
		System.out.println(" Click on the review");
		return driver.findElement(review_stars);
	}
	
	public WebElement Review5thStar() {
		System.out.println(" Click on the 5th star review");
		return driver.findElement(review_5th_Star);
	}
	
	public WebElement PolicyDD() {
		System.out.println(" Selecting health from policy DD");
		return driver.findElement(policyDD);
	}
	
	public WebElement policyDDHealth() {
		System.out.println(" Selecting health from policy DD Health");
		return driver.findElement(policyDDHealth);
	}
	
	public WebElement PolicyHealthStar() {
		System.out.println(" Selecting policy health star");
		return driver.findElement(PolicyHealthStar);
	}
	
	public WebElement PolicyReview() {
		System.out.println(" Adding policy review");
		return driver.findElement(PolicyReview);
	}
	
	
}
