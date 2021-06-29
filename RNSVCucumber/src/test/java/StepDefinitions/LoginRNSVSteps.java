package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginRNSVSteps {
	
	WebDriver driver = null;
	
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "D:/mika/Selenium/drivers_up/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("user is in the Login Page")
	public void user_is_in_the_login_page() {
		
		System.out.println("Inside step: user is in the login page");
		driver.navigate().to("https://rnsvcorporationapp.azurewebsites.net/");


	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		
		System.out.println("Inside step: user enters valid username and password");
		
		driver.findElement(By.id("UserName")).sendKeys("Dev");
		driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		
		System.out.println("Inside step: user clicks login button");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
	   
	}

	@Then("user is navigated to Home Page")
	public void user_is_navigated_to_home_page() {
		
		System.out.println("Inside step: user is navigated to home page");
		
		driver.getPageSource().contains("Home");
		driver.close();
		driver.quit();
	 
	}

}
