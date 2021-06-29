package pages;

import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTestProjectPage {
	
	private WebDriver driver = null;
	
	@FindBy(id= "name")
	WebElement un_field;
	
	@FindBy(id = "password")
	WebElement pw_field;
	
	@FindBy(id= "login")
	WebElement login_button;
	
	public LoginTestProjectPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username) {
		
		AssertJUnit.assertEquals(un_field.isDisplayed(), true);
		AssertJUnit.assertEquals(un_field.isEnabled(), true);
		un_field.sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		
		AssertJUnit.assertEquals(pw_field.isDisplayed(), true);
		AssertJUnit.assertEquals(pw_field.isEnabled(), true);
		pw_field.sendKeys(password);
	}
	
	public void clickLoginButton() {
		login_button.click();
	}

}
