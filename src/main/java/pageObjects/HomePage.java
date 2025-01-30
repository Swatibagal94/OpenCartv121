package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
@FindBy(xpath = "//span[text()='My Account']")
WebElement linkmyAccount;

@FindBy(xpath = "(//a[text()='Register'])[1]")
WebElement linkregister;

@FindBy(xpath="//a[text()='Login']")
WebElement linklogin;

public void clickmyaccount()
{
	linkmyAccount.click();
}

public void clickregister()
{
	linkregister.click();
}
public void clicklogin()
{
	linklogin.click();
}


}
