package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.LoginTestProjectPage;

public class LoginTestProjectSteps_PF {
	
	private WebDriver driver = null;
	private LoginTestProjectPage lgn;
	
	@Given("user navigated to the page")
	public void user_navigated_to_the_page() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://example.testproject.io/web/");
		
		System.out.println("=================Browser is open.=================");
		System.out.println("Inside Step: User is navigated to the Page");
	}

	@When("^user enters (.*) and (.*)$")
	private void user_enters_username_and_password(String username, String password){
		
		lgn = new LoginTestProjectPage(driver);
		System.out.println("Inside Step: User enters username and password");
		lgn.enterUsername(username);
		lgn.enterPassword(password);
	
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
		
		System.out.println("Inside Step: user clicks on the Login button");
		lgn.clickLoginButton();
	   
	}

	@Then("page should display proper message")
	public void page_should_display_proper_message() {
		
		System.out.println("Inside Step: Login Success");
		driver.close();
		driver.quit();
		
	}


}
