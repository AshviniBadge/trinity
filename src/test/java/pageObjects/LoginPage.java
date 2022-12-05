package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/*super keyword is use to invoke the parent class (variable,methods,constructor) */
public class LoginPage extends BasePage 
{
    //constructor
	public LoginPage(WebDriver driver) 
	{
		super(driver);// not initiating driver
		//invoking parentclass(baseclass) driver
	}

	// Elements	
	@FindBy(name = "email")
	WebElement txt_email;

	@FindBy(name = "password")
	WebElement txt_password;

	@FindBy(xpath = "//button[normalize-space()='Login']")   // Login link added in step6
	WebElement btn_login;
	
		
	// Action Methods
	public void enterEmail()
	{
		txt_email.sendKeys("superadmin@incentsoft.com");
	}

	public void enterPassword() 
	{
		txt_password.sendKeys("Test123456!!");
	}
	
	public void clickLogin()    // added in step6
	{
		btn_login.click();
	}
	
	
	
}