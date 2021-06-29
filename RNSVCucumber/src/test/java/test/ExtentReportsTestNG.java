package test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportsTestNG {

	private static WebDriver driver;
	private static ExtentSparkReporter sparkTestNG;
	private static ExtentReports extent;
	private static ExtentTest ts;

	@BeforeSuite
	public void setUp() {
		
		sparkTestNG = new ExtentSparkReporter("target/SparkHtmlReports/sparkTestNG.html");
		extent = new ExtentReports();
		extent.attachReporter(sparkTestNG);
	}
	
	@BeforeTest
	public void browserSetUp() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+ "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test (priority = 0)
	public void navigateToApplication() {
		
		ts = extent.createTest("LoginTest");
		driver.get("http://www.tutorialsninja.com/demo/");;
		ts.log(Status.INFO, "Starting Test Case: Navigating to the Application");
		ts.pass("Navigated to the Application Sucessfully");


	}
    @Test (priority = 1)
	public static void myAccount() throws InterruptedException {

		driver.findElement(By.xpath("//li[@class='dropdown']//a[@title='My Account']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@title,'My Account')]/following-sibling::ul/child::li[2]")).click();
		ts.pass("Selected Login Option");
	

	}

    @Test (priority = 2)
	public static void enterCredentials() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='email' and @id='input-email']")).sendKeys("kharl0508@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='password' and @id='input-password']")).sendKeys("123abc");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		ts.pass("Login Account Successful");


	}
	
	@AfterTest
	public static void teardownTest() {

		driver.close();
		driver.quit();
		ts.pass("Closed the browser");
		ts.info("Test to verify the Login Functionality Completed");

	}
	
	@AfterSuite
	public static void flushReport() {
		extent.flush();
	}

}
