package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pages.RegisterNinjaPage;

import static org.junit.Assert.*;

public class RegisterNinjaSteps_POM {
	
	private static WebDriver driver = null;
	RegisterNinjaPage register;
	
	
	
	@Given("navigate to the URL")
	public void navigate_to_the_URL () {
		
		System.out.println("Inside step: user is on the home page");
		System.setProperty("webdriver.chrome.driver", "D:/mika/Selenium/drivers_up/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("http://www.tutorialsninja.com/demo/");
		
		
	}
	
	@When("user is on the home page")
	public void user_is_on_the_home_page() {
		
		String title = driver.getTitle();
		System.out.println("Inside step: user is on the home page" +title);
		
	}

	@And("user clicks My Account dropmenu")
	public void user_clicks_my_account_dropmenu() {
		
		register = new RegisterNinjaPage(driver);
		System.out.println("Inside step: user clicks My Account");
		register.dropdownMenu();
	}

	@And("selects Register")
	public void selects_register() {
		
		System.out.println("Inside step: user selects Register option");
		register.selectRegister();
	 
	}

	@Then("user is navigated to Register Page")
	public void user_is_navigated_to_register_page() {
		
		System.out.println("Inside step: user clicks Register");
	 
	}

	@When("^user enters new account (.*), (.*), (.*), (.*), (.*), (.*)$")
	public void user_enters_new_account_firstname_lastname_email_telephone_password_confirmpassword_on_the_fields
	(String firstname, String lastname, String email, String tel, String password, String confirmpassword) throws InterruptedException {
		
		//register = new registerPage(driver);
		
		register.enterFirstname(firstname);
		Thread.sleep(2000);
		register.enterLastname(lastname);
		Thread.sleep(2000);
		register.enterEmail(email);
		Thread.sleep(2000);
		register.enterTel(tel);
		Thread.sleep(2000);
		register.enterPassword(password);
		Thread.sleep(2000);
		register.confirmPassword(confirmpassword);		
		Thread.sleep(2000);
		System.out.println("Inside step: user enters new account details on the fields");
		
	}
	
	@And("clicks on the Privacy Policy")
	public void clicks_on_the_Privacy_Policy() {
		
		System.out.println("Inside step: user clicks on the Privacy Policy");
		register.policy();
		
	}

	@And("clicks on the Submit button")
	
	public void clicks_on_the_submit_button() throws InterruptedException {
		
		System.out.println("Inside step: user clicks submit button");
		register.submit();
		
		Thread.sleep(5000);
	 
	}

	@Then("user is navigated on the Account Success Page and display proper <message>")
	public void user_is_navigated_on_the_account_success_page() {
		
		System.out.println("Inside step: user is navigated on the Account Success page");
		
		driver.getPageSource().contains("My Account");
		//driver.close();
		//driver.quit();
		
	 
	}


}
