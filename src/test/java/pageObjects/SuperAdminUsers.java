package pageObjects;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuperAdminUsers extends BasePage
{
	//constructor
		public SuperAdminUsers(WebDriver driver) 
		{
			super(driver);
		}
	
	@FindBy(xpath="//a[text()='USERS LIST']")
	WebElement userList_supAdmin;
	
	@FindBy(xpath="//button[normalize-space()='CREATE USER']")
	WebElement createUser_supAdmin;
	
	@FindBy(xpath="//input[@placeholder='First name']")
	WebElement user_firstName;
	
	@FindBy(xpath="//input[@placeholder='Last name']")
	WebElement user_lastName;
	
	@FindBy(xpath="//input[@placeholder='e-mail']")
	WebElement user_email;
	
	@FindBy(xpath="//input[@id='react-select-2-input']")
	WebElement txt_userSelectRole;
	
	@FindBy(xpath="//div[@class=' css-11unzgr']//div[@tabindex='-1']")
	List<WebElement> dropDown_selectRole;
	
	@FindBy(xpath="//button[@class='ui blue button'][text()='CREATE USER']")
	WebElement btn_createUser;
	
	public void userRM() throws InterruptedException
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		//String generatedString2 = RandomStringUtils.randomNumeric(10);
		
		userList_supAdmin.click();
		 Thread.sleep(3000);
		createUser_supAdmin.click();
		 Thread.sleep(1000);
		user_firstName.sendKeys("RM");
		 Thread.sleep(1000);
		user_lastName.sendKeys(generatedString);
		 Thread.sleep(1000);
		
		user_email.sendKeys("RM-2023-"+generatedString.toLowerCase()+"@gmail.com");
		 Thread.sleep(1000);
		 txt_userSelectRole.click();
		
		System.out.println("Roles" + dropDown_selectRole.size());
		
		for(WebElement rl:dropDown_selectRole)
		{
			rl.getText().equals("RM");
			rl.click();
			break;
		}
		Thread.sleep(5000);
		btn_createUser.click();
		Thread.sleep(1000);
	}
	
}
