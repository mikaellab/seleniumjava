package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesTest {
	
	private static WebDriver driver;

	public static void main(String[] args) {
	setUp();
	}
		
		
	@SuppressWarnings("deprecation")
	public static void setUp() {	
		String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.ie.driver", projectPath+"/src/test/resources/drivers/IEDriverServer.exe");	
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("ignoreProtectiveModeSettings", true);
		cap.setCapability("ignoreZoomSetting", true);
		driver = new InternetExplorerDriver(cap);
//		driver = new ChromeDriver();
	
		

		driver.get("http://automationpractice.com/index.php");
		search();

	}
	
	public static void search() {
		
		WebElement searchBox = driver.findElement(By.xpath("//div[@class='row']/child::div[2]//form[@id='searchbox']/child::input[4]"));
		searchBox.click();
		searchBox.sendKeys("dress");
		WebElement searchButton = driver.findElement(By.xpath("//button[@name='submit_search']"));
		searchButton.click();
//		WebElement wm = driver.findElement(By.xpath("//li[@class='sfHoverForce']//a[@title='Women']"));
//		wm.click();
//		WebElement tst = driver.findElement(By.xpath("//li[@class='sfHoverForce']/child::ul/child::li/child::ul/child::li//a[@title='T-shirts']"));
//		tst.click();
		
		close();
	}
	
	public static void close() {
		driver.close();
		driver.quit();
	}

}
