package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StandardPricing {
	 private WebDriver driver ;
	
	@FindBy(className="link")
	WebElement stdPricing;
	
	
	//click standards pricing link
	
	public void Enter() {
	stdPricing.click();
	
	}
	
	//locate Learn More button 
	/*[@id="gatsby-focus-wrapper"]/main/section[3]/div[2]/div/div/div/div/div[1]/div/a */
	WebElement Element = driver.findElement(By.xpath("*[@id=\"gatsby-focus-wrapper\"]/main/section[3]/div[2]/div/div/div/div/div[1]/div/a"));
	
	 /* Scroll down the page till element is found */
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView()", Element);
	
	

}
