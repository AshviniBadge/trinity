package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuperAdminOffice extends BasePage
{
	//constructor
	public SuperAdminOffice(WebDriver driver) 
	{
		super(driver);
	}
	
	//Elements
	@FindBy(xpath="//div[@class='user-name']")
	WebElement loginName;
	
//user element
	
	
//office element
	@FindBy(xpath="//a[normalize-space()='OFFICES LIST']")	
	WebElement offList_supAdmin;
	
	@FindBy(xpath="//button[normalize-space()='ADD OFFICE']")
	WebElement addOffice_supAdmin;
	
	@FindBy(xpath="//input[@placeholder='Enter Office Name']")
	WebElement officeName;
	
	//parentoffice testbox 
	@FindBy(xpath="//div[@class=' css-ackcql']//input[@id='react-select-2-input']")
	WebElement txt_parentOffice;
	
	@FindBy(xpath="//div[@class=' css-26l3qy-menu']//div[@tabindex='-1']")
	List<WebElement> dropDown_ParentOffice;
	
	@FindBy(xpath="//div[@class=' css-ackcql']//input[@id='react-select-4-input']")
	WebElement txt_officeSelectRM;
	
	@FindBy(xpath="//div[@class=' css-26l3qy-menu']//div[@tabindex='-1']")
	List<WebElement> dropDown_officeSelectRM;
	
	@FindBy(xpath="//button[@class='ui blue button'][text()='ADD OFFICE']")
	WebElement btn_addOffice;
	
	
	
	public String getLoginName()
	{
		String txt=loginName.getText();
		return txt;
		
	}
	
	public void firstLevelOffice() throws InterruptedException
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", offList_supAdmin);//offList_supAdmin.click();
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", addOffice_supAdmin);//addOffice_supAdmin.click();
		
		Thread.sleep(1000);
		officeName.sendKeys("L1-OFF-2023");	
		
		txt_officeSelectRM.click();
		
		System.out.println("total RM " + dropDown_officeSelectRM.size());
		
		for(WebElement rm:dropDown_officeSelectRM)
		{
			rm.getText().equals("RM2 668");
			rm.click();
			break;
		}
		
		Thread.sleep(1000);
		btn_addOffice.click();
		Thread.sleep(5000);
	}
	
	public void secondLevelOffice() throws InterruptedException
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", offList_supAdmin);//offList_supAdmin.click();
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", addOffice_supAdmin);//addOffice_supAdmin.click();
		
		Thread.sleep(1000);
		officeName.sendKeys("L2-OFF-2023");
		
		txt_parentOffice.click();
		System.out.println("total offices" + dropDown_ParentOffice.size());
		
	    Thread.sleep(10000);			
		int options=dropDown_ParentOffice.size();
			
		for(int i=0; i<options; i++)
		{
			if(dropDown_ParentOffice.get(i).getText().equals("L1-OFF-2023"))
			{
				dropDown_ParentOffice.get(i).click();
				break;
			}
		}
		
		Thread.sleep(1000);
		txt_officeSelectRM.click();
		
		System.out.println("total RM " + dropDown_officeSelectRM.size());
		
		for(WebElement rm:dropDown_officeSelectRM)
		{
			rm.getText().equals("RM2 668");
			rm.click();
			break;
		}
		Thread.sleep(1000);
        btn_addOffice.click();
        Thread.sleep(5000);
	}
	
	 public void thirdLevelOffice() throws InterruptedException
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", offList_supAdmin);//offList_supAdmin.click();
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", addOffice_supAdmin);//addOffice_supAdmin.click();
		
		Thread.sleep(1000);
		officeName.sendKeys("L3-OFF-2023");
		
		
		txt_parentOffice.click();
		System.out.println("total offices" + dropDown_ParentOffice.size());
		
	    Thread.sleep(5000);			
		int options=dropDown_ParentOffice.size();
			
		for(int i=0; i<options; i++)
		{
			if(dropDown_ParentOffice.get(i).getText().equals("L2-OFF-2023"))
			{
				dropDown_ParentOffice.get(i).click();
				break;
			}
		}
		
		Thread.sleep(1000);
		txt_officeSelectRM.click();
		
		System.out.println("total RM " + dropDown_officeSelectRM.size());
		
		for(WebElement rm:dropDown_officeSelectRM)
		{
			rm.getText().equals("RM2 668");
			rm.click();
			break;
		}
		Thread.sleep(1000);
        btn_addOffice.click();
        Thread.sleep(5000);
	}
	 
}
	
	
