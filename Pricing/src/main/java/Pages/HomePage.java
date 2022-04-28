package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	
  private static String pageUrl = "https://www.google.com.au";
  private WebDriver driver ;
  
  //locators
	//name=q
	
  @FindBy(name="q")
	WebElement searchbar;
  
  @FindBy(name="btnK")
  WebElement searchButton;
	
	//Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		driver.get(pageUrl);
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	public void ClickSearch()
	{
		searchbar.sendKeys("SecurePay");
		searchbar.sendKeys(Keys.ENTER);
	WebElement result = pageUrl.find_element_by_tag_name("h3");
		result.click();
	
		
		
		
	}
	
	

}
