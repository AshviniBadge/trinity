package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.SuperAdminOffice;
import testBase.BaseClass;

public class TC_002_CreateOfficesTest extends BaseClass
{
	@Test
	public void createoffice() throws InterruptedException
	{
		logger.info("----------------------------------------");
		logger.info("***  Starting TC_002_CreateOfficesTest ***");
	 LoginPage lp=new LoginPage(driver);
	   lp.enterEmail();
	   
	   lp.enterPassword();
	 
	   lp.clickLogin();
 
	   //created object of superAdminPage class
	   SuperAdminOffice super_Admin=new SuperAdminOffice(driver);
	 	   
	 //calling method level-1 office creation
	  super_Admin.firstLevelOffice();
	   logger.info("***  Created Level-1 office ***");
	   Thread.sleep(5000);
	   
	   logger.info("***  calling method level-2 office creation ***");
	 //calling method level-2 office creation
	  super_Admin.secondLevelOffice();
	   logger.info("***  Created Level-2 office ***");
	   logger.info("***  Ended TC_002_CreateOfficesTest ***");
	   
	   super_Admin.thirdLevelOffice();
	   logger.info("***  Created Level-3 office ***");
	   logger.info("***  Ended TC_002_CreateOfficesTest ***");
	   
	}
}
