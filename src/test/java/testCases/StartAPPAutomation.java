package testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartAPPAutomation
{
	public WebDriver driver;
	// Login page
			@FindBy(name = "email")
			WebElement txt_email;

			@FindBy(name = "password")
			WebElement txt_password;

			@FindBy(xpath = "//button[normalize-space()='Login']")   // Login link added in step6
			WebElement btn_login;
	//Startapp page
			@FindBy(xpath = "//a[normalize-space()='START APP']")   
			WebElement btn_StartApp;
			
			@FindBy(xpath = "//div[normalize-space()='select the sales user']")   
			WebElement txt_salesUserName;
			
			@FindBy(xpath = "//div[@role='listbox']//div[@user_name='[object Object]']")   
			List<WebElement> dropDown_salesUserName;
			
			@FindBy(xpath = "//input[@name='dbaName']")   
			WebElement txt_dbaName;
			
			@FindBy(xpath = "(//input[@name='business_email'])[1]")   
			WebElement txt_merchantEmail;
			
			@FindBy(xpath = "(//input[@name='business_name'])[1]")   
			WebElement txt_merchantContactName;
			
			//@FindBy(xpath = "")   
			//WebElement ;
    public void Setup() throws InterruptedException
    {
    	WebDriver driver=new ChromeDriver();
    	PageFactory.initElements(driver,this);
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    //Declaration
    	WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(60));	
    	driver.get("https://trinity-apps-client.web.app/");
    	driver.manage().window().maximize();
    	//JavascriptExecutor js=driver;
    	txt_email.sendKeys("100RM@GMAIL.COM");
    	txt_password.sendKeys("ashvini123");
    	btn_login.click();
    	Thread.sleep(5000);
    //usage
    	WebElement btn_StartApp= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='START APP']")));
    	btn_StartApp.click();
    	
	}
    
    public void StartAppPage() throws InterruptedException
    {
    	JavascriptExecutor js=(JavascriptExecutor)driver ;
    	//JavascriptExecutor js=driver;
		
		js.executeScript("arguments[0].click();", txt_salesUserName); //txt_salesUserName.click();	
    	Thread.sleep(10000);
    	 //Declaration
    	//WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(60));
    	//usage
    	//WebElement txt_salesUserName= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()='select the sales user']")));
    	
    	System.out.println("total sales user " + dropDown_salesUserName.size());
		
		for(WebElement rm:dropDown_salesUserName)
		{
			rm.getText().equals("100-SU-L1");
			rm.click();
			break;
		}
    	txt_dbaName.sendKeys("DBA1001");
    	txt_merchantEmail.sendKeys("ashvini.testing1@gmail.com");
    	txt_merchantContactName.sendKeys("Ashvini");
    	
    }
	
	public static void main(String[] args) throws InterruptedException 
	{
		StartAPPAutomation st=new StartAPPAutomation();
		st.Setup();
		st.StartAppPage();
	}

}
