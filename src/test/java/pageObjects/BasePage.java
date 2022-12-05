package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage 
{
	 WebDriver driver;
	 public BasePage(WebDriver driver) 
	     {
		     this.driver=driver;//initiating driver
		     PageFactory.initElements(driver,this);//locating element using @FindBy method
	     }
	   	   
}

//this constructor will be use by all the page object classes
//constuctor getting driver from BaseClass	
//(Package(testBase)-->Class(BaseClass)-->Method(SetUp))-->static WebDriver driver 