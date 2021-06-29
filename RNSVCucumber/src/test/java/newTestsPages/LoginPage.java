package newTestsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	@FindBy (id = "UserName")
	private WebElement un;

	@FindBy (id = "Password")
	private WebElement pw;

	@FindBy (xpath = "//button[contains(text(),'Sign in')]")
	WebElement loginbtn;



	public LoginPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
//		try {
//			if(!driver.getTitle().equalsIgnoreCase("login")) {
//				throw new IllegalStateException("This is not the Login Page" +driver.getTitle());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//			
//	}
	
		
	public void enterUn (String username) {
		un.sendKeys(username);

	}
	
	public void enterPw (String password) {
		pw.sendKeys(password);	
	}
	
	public void clickLoginButton() {
		loginbtn.click();
	}
	
	public void confirmSuccessfulLogin() {
		
		try {
			if(!driver.getTitle().equalsIgnoreCase("Home")) {	
				System.out.println("Expected Navigation Result Error. The title of the page is:" +driver.getTitle());
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
