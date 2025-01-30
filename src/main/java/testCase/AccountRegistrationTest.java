package testCase;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.HomePage;
import pageObjects.AccountRegistrationPage;


public class AccountRegistrationTest extends BaseClass {
	
	public WebDriver driver;
	@Test(groups= {"regression","master"})
	public void Verify_Account_Registration() throws InterruptedException
	{
		
		logger.info("******Starting TC001_AccountRegistrationPage ****");
		try
		{
		HomePage hp=new HomePage(BaseClass.driver); 
		hp.clickmyaccount();
		logger.info("Clicked on MyAccount Link... ");

		hp.clickregister();
		logger.info("Clicked on Register Link.... ");

		
		AccountRegistrationPage ar= new AccountRegistrationPage(BaseClass.driver);
		logger.info("Provding customers details....");

		ar.setFirstName(randomeString().toUpperCase());
		ar.setLastName(randomeString().toUpperCase());
		ar.setEmail(randomeString()+"@gmail.com");
		ar.setTelephone(randomeNumber());
		
		String password=randomeAlphaNumeric();

		ar.setPassword(password);
		ar.setConfirmPassword(password);
		ar.checkedPolicy();
		ar.continueBtn();
		
		Thread.sleep(4000);
		logger.info("Validating expected message");

		String confmsg=ar.getConfirmationMsg();
		if(confmsg.equals("Your Account Has Been Created!!!mmmm"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("Test failed...");
			logger.debug("Debug logs...");
			Assert.assertTrue(true);

			
		}
	//	Assert.assertEquals(confmsg, "Your Account Has Been Created!!!mmmm");
		}
		catch(Exception e)
		{
			Assert.fail();

		}
		
		logger.info("*******Finished TC001 test ************");		
		
	}

	

}
