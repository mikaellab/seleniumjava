package pages;

import org.testng.AssertJUnit;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginAndEnterDetailsProjectPage {

	private WebDriver driver1 = null;

	@FindBy(id= "name")
	WebElement un_field;

	@FindBy(id = "password")
	WebElement pw_field;

	@FindBy(id= "login")
	WebElement login_button;

	//	@FindBy (xpath = "//div//p[@id='greetings']")
	//	WebElement greetings;

	@FindBy(xpath = "//div//select[@id='country']")
	WebElement cntry_dropdown;

	@FindBy(id="address")
	WebElement address_field;

	@FindBy(id="email")
	WebElement email_field;

	@FindBy(id="phone")
	WebElement phone_field;

	@FindBy(id="save")
	WebElement save_button;

	@FindBy(id="logout")
	WebElement logout_button;

	@FindBy(id="saved")
	WebElement save;


	public LoginAndEnterDetailsProjectPage (WebDriver driver) {
		this.driver1 = driver;
		PageFactory.initElements(driver, this);

		//		try {
		//			if (!driver1.getTitle().equals("TestProject Demo")) {
		//				throw new IllegalStateException("This is not the TestProject Login Page. The current Page Title is:" +driver1.getTitle());
		//			}
		//		} catch (Exception IllegalStateException) {
		//			IllegalStateException.printStackTrace();
		//		}
	}

	//	public void greetingsPage() {	
	//		greetings.getText();
	//		System.out.println("Inside Step: Proper message upon logging in:" +greetings);
	//	}

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

	public void selectCountry(String country) {
		try {
			cntry_dropdown.click();
			Thread.sleep(3000);
			Select cntry = new Select(cntry_dropdown);
			cntry.selectByVisibleText("country");
		} catch (Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
	}

	public void enterAddress(String address) {

		AssertJUnit.assertEquals(address_field.isDisplayed(), true);
		AssertJUnit.assertEquals(address_field.isEnabled(), true);
		address_field.sendKeys(address);	
	}

	public void enterEmail (String email) {

		AssertJUnit.assertEquals(email_field.isDisplayed(), true);
		AssertJUnit.assertEquals(email_field.isEnabled(), true);
		email_field.sendKeys(email);
	}

	public void enterPhone (String phone) {

		AssertJUnit.assertEquals(phone_field.isDisplayed(), true);
		AssertJUnit.assertEquals(phone_field.isEnabled(), true);
		phone_field.sendKeys(phone);
	}

	public void clickSave() {
		save_button.click();
	}

	public void savedNotice() {	
		save.getText();
		System.out.println("Inside Step: Proper message upon saving user details:" +save);
	}

	public void clickLogout() {
		logout_button.click();
	}

}
