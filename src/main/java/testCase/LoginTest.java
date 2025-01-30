package testCase;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class LoginTest extends BaseClass {

	public WebDriver driver;
	
	@Test(groups= {"sanity","master"})
	public void Verify_Login() throws IOException
	{
		logger.info("****Stating TC002 LoginTest");


	try
	{
		//HomePage
		HomePage hp= new HomePage(BaseClass.driver);
		hp.clickmyaccount();
		hp.clicklogin();
		
		//Login
		LoginPage lp= new LoginPage(BaseClass.driver);
		logger.info("Provding Login details.....");
		lp.setEmailAdd(p.getProperty("email"));
		lp.setpassword(p.getProperty("password"));
		lp.loginbtn();
		
		//MyAccountPage
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetPage = macc.isMyAccountPageExists();
		Assert.assertEquals(targetPage, true);
		
		Assert.assertTrue(targetPage);
		
		logger.info("*****Finished TC0002******");
	}
	catch(Exception e)
	{
		Assert.fail();
	}

	}
	
}
