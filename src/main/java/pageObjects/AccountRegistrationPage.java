package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	WebDriver driver;
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement checkdPolicy;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	public void setLastName(String Lname)
	{
		txtLastName.sendKeys(Lname);
	}
	public void setEmail(String Email)
	{
		txtEmail.sendKeys(Email);
	}
	public void setTelephone(String tel)
	{
		txtTelephone.sendKeys(tel);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void setConfirmPassword(String pwd)
	{
		txtConfirmPassword.sendKeys(pwd);
	}
	public void checkedPolicy()
	{
		checkdPolicy.click();
	}
	public void continueBtn()
	{
		//sol1
		btnContinue.click();
		//sol1
	//	btnContinue.submit();
		//sol1
	//	Actions act= new Actions(driver);
	//	act.moveToElement(btnContinue).click().perform();
		//sol1
	//	btnContinue.sendKeys(Keys.RETURN);
		
	}
	
	public String getConfirmationMsg()
	{
		try
		{
			return(msgConfirmation.getText());
			
		}catch (Exception e) 
		{
			return(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
