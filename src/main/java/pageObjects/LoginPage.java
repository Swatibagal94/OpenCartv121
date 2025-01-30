package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	WebDriver driver;
	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement txtEmailAdd;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement txtpassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginbtn;
	
	
	public void setEmailAdd(String email)
	{
		txtEmailAdd.sendKeys(email);
	}
	
	public void setpassword(String pass)
	{
		txtpassword.sendKeys(pass);
	}
	public void loginbtn()
	{
		loginbtn.click();
	}
}
