package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.SuperAdminOffice;
import pageObjects.SuperAdminUsers;
import testBase.BaseClass;

public class TC_003_CreateUsersTest extends BaseClass
{

	@Test
	public void createoffice() throws InterruptedException
	{
		logger.info("----------------------------------------");
		logger.info("***  Starting TC_003_CreateUsersTest ***");
		
	 LoginPage lp=new LoginPage(driver);
	   lp.enterEmail();
	   
	   lp.enterPassword();
	 
	   lp.clickLogin();
 
	   //created object of superAdminPage class
	   SuperAdminUsers  super_Admin=new SuperAdminUsers (driver);
	 //calling method RM creation
	    
	   Thread.sleep(5000);
	    super_Admin.userRM();
	   logger.info("***  Created RM ***");
	   logger.info("***  Ended TC_003_CreateUsersTest ***");
	}
}
