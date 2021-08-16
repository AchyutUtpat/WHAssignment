package WalletHub;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.ProfilePage;
import pageObject.ReviewsSectionPage;
import resources.BaseDetails;
import resources.Utils;

public class TestWalletHubAssignment extends BaseDetails {
	
	
		public static Logger log = LogManager.getLogger(BaseDetails.class.getName());
		public WebDriver driver;
		
		
		
		@BeforeTest
		public void initialize() throws IOException
		{
			driver=initializeDriver();
			driver.get(prop.getProperty("url2"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		@Test
		public void chooseRating() throws Exception
		{
			Utils Utls=new Utils(driver);
			ReviewsSectionPage Rsect=new ReviewsSectionPage(driver);
			
			Actions builder = new Actions(driver);
			builder.moveToElement(Rsect.ReviewStar());
			Utls.implicit_Wait2("elementToBeClickable");
			builder.moveToElement(Rsect.Review5thStar()).click().perform();
			//selecting health from policy DD
			Utls.implicit_Wait3("elementToBeClickable");
			Rsect.policyDDHealth().click();
			
			//selecting 5th star
			Utls.implicit_Wait4("elementToBeClickable");
			Rsect.PolicyHealthStar().click();
			Rsect.PolicyReview().clear();
			
			String Msg="This is automation testing assignment from WalletHub";
			Rsect.PolicyReview().sendKeys(Msg);
			Rsect.PolicyReview().submit();
			
			Utls.implicit_Wait5("elementToBeDisplayed");
			
			//navigating to profile page to see if posted review exist
			driver.navigate().to("https://wallethub.com/profile/username/reviews/");
			ProfilePage Prgpage= new ProfilePage(driver);
			String bodytext= Prgpage.BodyText().getText();
			Assert.assertTrue(bodytext.contains(bodytext), "Review is not showing in profile/review page, Failing Test!");
			System.out.println("Posted review is showing in profile/review page, Passing Test!");
			
		}
		
		
		
		@AfterTest
		public void teardown()
		{
			driver.close();
			driver.quit();
		}

}
