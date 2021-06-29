package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsTest {


	private static WebDriver driver = null;
	private static ExtentSparkReporter spark;
	private static ExtentReports reports = new ExtentReports();
	private static ExtentTest test;
	private static ExtentTest test2;

	public static void main(String[] args) {

		spark = new ExtentSparkReporter("target/SparkHtmlReports/spark.html");
		reports.attachReporter(spark);

		setUp();
	}
	public static void setUp() {

		System.out.println("Inside step: user is on the home page");
		System.setProperty("webdriver.chrome.driver", "D:/mika/Selenium/drivers_up/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		test = reports.createTest("RegisterTest");
		test.log(Status.INFO, "Starting Test Case: Navigating to the Application");
		driver.get("http://www.tutorialsninja.com/demo/");
		test.pass("Navigated to the Application Sucessfully");
		myAccount();

	}

	public static void myAccount() {

		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[@title='My Account']//following-sibling::ul//child::li[1]")).click();
		test.pass("Selected Register Option");
		enterCredentials();

	}


	public static void enterCredentials() {
		driver.findElement(By.id("input-firstname")).sendKeys("kharl");
		driver.findElement(By.id("input-lastname")).sendKeys("deandrei");
		driver.findElement(By.id("input-email")).sendKeys("kharl0508@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("0908107740");
		driver.findElement(By.id("input-password")).sendKeys("123abc");
		driver.findElement(By.id("input-confirm")).sendKeys("123abc");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		test.pass("All fields have been filled; Register Account Successful");
		teardownTest();

	}

	public static void teardownTest() {

		driver.close();
		driver.quit();
		test.pass("Closed the browser");
		test.info("Test to verify the Register Functionality Completed");
		setUp1();


	}

	public static void setUp1() {

			System.setProperty("webdriver.chrome.driver", "D:/mika/Selenium/drivers_up/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();	
			test2 = reports.createTest("Register Test case two");
			test2.log(Status.INFO, "Starting Test Case Two: Navigating to the Application");
			driver.get("http://www.tutorialsninja.com/demo/");
			test2.pass("Navigated to the Application Sucessfully");
			myAccount1();

		}

		public static void myAccount1() {

			driver.findElement(By.xpath("//a[@title='My Account']")).click();
			driver.findElement(By.xpath("//a[@title='My Account']//following-sibling::ul//child::li[1]")).click();
			test2.pass("Selected Register Option");
			enterCredentials1();

		}


		public static void enterCredentials1() {
			driver.findElement(By.id("input-firstname")).sendKeys("kharl");
			driver.findElement(By.id("input-lastname")).sendKeys("deandrei");
			driver.findElement(By.id("input-email")).sendKeys("kharl0508@gmail.com");
			driver.findElement(By.id("input-telephone")).sendKeys("0908107740");
			driver.findElement(By.id("input-password")).sendKeys("123abc");
			driver.findElement(By.id("input-confirm")).sendKeys("123abc");
			driver.findElement(By.xpath("//input[@name='agree']")).click();
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
			test2.fail("All fields have been filled; Register Account Successful");
			teardownTest1();

		}

		public static void teardownTest1() {

			driver.close();
			driver.quit();
			test2.pass("Closed the browser");
			test2.info("Test to verify the Register Functionality Completed");
			reports.flush();
		}



	}

