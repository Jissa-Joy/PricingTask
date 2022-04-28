package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	

	//driver.findElement(By.linkText("Standard pricing")).click();
	@FindBy(linkText="Standard pricing")
	WebElement link;
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	//Actions:
		public String validatePricingTitle(){
			return driver.getTitle();
		}
		
	//	public Poli()
		{
			
			WebElement learnMore = driver.findElement(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/section[3]/div[2]/div/div/div/div/div[1]/div/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", learnMore);
			
		//	return new Poli();
		}

}
