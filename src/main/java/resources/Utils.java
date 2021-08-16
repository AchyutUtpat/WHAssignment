package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	public WebDriver driver;
	public Utils(WebDriver driver) {
		this.driver=driver;
	}
	
		
	public void implicit_Wait1(String str) throws Exception{
		System.out.println("Entered into the wait");
		for(int i=0;i<60;i++){
            try{
                driver.findElement(By.cssSelector("i.hu5pjgll.lzf7d6o1.sp_09gpAzWhK7K.sx_2eadd2")).isEnabled();
                break;
            }catch(Exception e){Thread.sleep(2000);

            }   
        }
        
	}
	
	public void implicit_Wait2(String str) throws Exception{
		System.out.println("Entered into the wait");
		for(int i=0;i<60;i++){
            try{
                driver.findElement(By.xpath("//*[contains(@class,'wh-rating rating_5')]")).isEnabled();
                break;
            }catch(Exception e){Thread.sleep(2000);

            }   
        }
        
	}
	
	public void implicit_Wait3(String str) throws Exception{
		System.out.println("Entered into the wait");
		for(int i=0;i<60;i++){
            try{
                driver.findElement(By.xpath("//*[@class='dropdown-list-new']")).isEnabled();
                break;
            }catch(Exception e){Thread.sleep(2000);

            }   
        }
        
	}
	
	public void implicit_Wait4(String str) throws Exception{
		System.out.println("Entered into the wait");
		for(int i=0;i<60;i++){
            try{
            	driver.findElement(By.xpath("//*[@class='bf-icon-star-empty star bstar bf-icon-star'][5]")).isEnabled();
                break;
            }catch(Exception e){Thread.sleep(2000);

            }   
        }
        
	}

	public void implicit_Wait5(String str) throws Exception{
		System.out.println("Entered into the wait");
		for(int i=0;i<60;i++){
            try{
            	driver.findElement(By.xpath("//h1/span[contains(text(),'Your')]/a[contains(text(),'has been posted')]")).isDisplayed();
                break;
            }catch(Exception e){Thread.sleep(2000);

            }   
        }
        
	}
}
