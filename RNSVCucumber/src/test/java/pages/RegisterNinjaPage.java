package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class RegisterNinjaPage {
	
	protected WebDriver driver = null;
	
	private By myAccount = By.xpath("//a[@title='My Account']");
    private By register_option = By.xpath("//a[@title='My Account']//following-sibling::ul//child::li[1]");
	private By input_firstname = By.id("input-firstname");
	private By input_lastname = By.id("input-lastname");
	private By input_email = By.id("input-email");
	private By input_tel = By.id("input-telephone");
	private By input_password = By.id("input-password");
	private By input_confirm_password = By.id("input-confirm");
	private By privacy = By.xpath("//input[@name='agree']");
	private By submit_button = By.xpath("//input[@value='Continue']");
	
	
	public RegisterNinjaPage(WebDriver driver) {
		this.driver = driver;
		
		if (!driver.getTitle().equals("Your Store")) {
			throw new IllegalStateException("This is not the Home Page. The current page title is:" +driver.getTitle());
		
		}
	}
	
	public void dropdownMenu() {
		driver.findElement(myAccount).click();
	}
	
	public void selectRegister() {
		
		driver.findElement(register_option).click();
		
	}
	public void enterFirstname(String firstname){ 

		driver.findElement(input_firstname).sendKeys(firstname);
	}
	public void enterLastname(String lastname){ 
		
		driver.findElement(input_lastname).sendKeys(lastname);
	}
	
	public void enterEmail(String email){ 
		
		driver.findElement(input_email).sendKeys(email);
	}
	public void enterTel(String tel) {
		
		driver.findElement(input_tel).sendKeys(tel);
	}
	public void enterPassword(String password) {
		
		driver.findElement(input_password).sendKeys(password);
	}
	
	public void confirmPassword(String confirm_password) {
		
		driver.findElement(input_confirm_password).sendKeys(confirm_password);
	}
	
    public void policy() {
    	driver.findElement(privacy).click();
 
    }
	
	public void submit() {
		
	    driver.findElement(submit_button).click();
	}
	
	
}
