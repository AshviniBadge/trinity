package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.SuperAdminOffice;
import testBase.BaseClass;

public class TC_001_LoginTest extends BaseClass
{
	@Test
   public void Logintest() throws InterruptedException
   {
	   try
	   {	 
		   logger.info("----------------------------------------");
		   logger.info("***  Starting TC_001_LoginTest ***");
		   LoginPage lp=new LoginPage(driver);
		   
		   lp.enterEmail();
		   logger.info("***  Entered Email ***");
		   
		   lp.enterPassword();
		   logger.info("***  Entered Password ***");
		   
		   lp.clickLogin();
		   logger.info("***  Login as Super Admin ***");
		   
		   SuperAdminOffice super_Admin=new SuperAdminOffice(driver);		   
		   String text= super_Admin.getLoginName();
		  Assert.assertEquals(text, "Hi Super Admin");
		  
		   
	   }catch(Exception e)
         {
		  Assert.fail();
	     }
	   logger.info("***  Ended TC_001_LoginTest ***");
	   
	 }
	
}
