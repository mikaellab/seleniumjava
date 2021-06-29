package newTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.en.*;
import newTestsPages.LoginPage;

public class LoginWithValidCredentials {

	WebDriver driver;
	LoginPage login;
	ExtentSparkReporter spark;
	ExtentReports reports;
	ExtentTest test;
	
	
   // @BeforeSuite
	public void setUp() {
    	
		spark = new ExtentSparkReporter("target/SparkHtmlReports/newTests.html");
		reports = new ExtentReports();
		reports.attachReporter(spark);
	}
    
   // @BeforeTest
    @Given("I navigated to the application")
	public void user_navigated_to_the_application() {
		
    	String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+ ("/src/test/resources/drivers/chromedriver.exe"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rnsvcorporationapp.azurewebsites.net/");
		
	}
    
   // @Test (priority = 0)
	@When("^I enter (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
    	test = reports.createTest("Login with valid credentials");	
    	login = new LoginPage(driver);
		login.enterUn(username);
	    login.enterPw(password);
	    test.log(Status.INFO, "User entered valid Username and Password");
	
	}
    
    //@Test (priority = 1)
	@And("clicks login button")
	public void clicks_login_button() {
		login.clickLoginButton();
    	test.log(Status.INFO, "User clicked Login Button");
	
	}
    
   // @Test (priority = 2)
	@Then("I is navigated to the Home Page")
	public void user_is_navigated_to_the_home_page() {
    	LoginPage login = new LoginPage(driver);
    	test.log(Status.INFO, "User is navigated to the expected Page: Home Page");
    	login.confirmSuccessfulLogin();
		
	}
    
  //  @AfterTest
    public void closeBrowser() {
    	driver.close();
    
    	test.log(Status.INFO, "Browser Closed. Login with Valid Credentials Test PASSED");
    }
    
   // @AfterSuite
    public void tearDownTest() {
    	driver.quit();
    	reports.flush();
    	
    }

}
