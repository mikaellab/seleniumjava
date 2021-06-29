//package StepDefinitions;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.*;
//
//import io.cucumber.java.en.*;
//import pages.LoginAndEnterDetailsProjectPage;
//import pages.LoginTestProjectPage;
//
//public class LoginAndEnterDetailsTestProjectSteps_PF {
//    private WebDriver driver = null;
//	// private LoginTestProjectPage login;
//	private LoginAndEnterDetailsProjectPage test_form;
//	
//	// @BeforeMethod
//	@Given("user is on the Login Page")
//	public void user_is_on_the_login_page() {
//
//		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://example.testproject.io/web/");
//		
//		System.out.println("=================Browser is open.=================");
//		System.out.println("Inside Step: User is navigated to the Page");
//	    
//	}
//    // @Test
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_un_and_pw(String un, String pw) {
//		test_form = new LoginAndEnterDetailsProjectPage (driver);
//		System.out.println("Inside Step: User enters username and password ");
//		test_form.enterUsername(un);
//		test_form.enterPassword(pw);
//		
//	}
//   
//	@And("clicks on the Login button")
//	public void clicks_on_the_login_btn() {
//		System.out.println("Inside Step: User clicks on the Login button");
//		test_form.clickLoginButton();
//	
//	}
//	
//  
//	@Then("user is navigated to Test Form")
//	public void user_is_navigated_to_test_form() {
//    	
//	    System.out.println("=====================Test Form =====================");
//
//	}
//
//
//    @Given("user in on the Test Form")
//	public void user_in_on_the_test_form() {
//    	
//    	
//	    System.out.println("Inside Test: User is on the Test Form Page");
//	}
//
//
//	@When("^user selects (.*)$")
//	public void user_selects_country(String country) {
//		
//	   test_form.selectCountry("country");
//	 
//	}
//
//
//	@And("^enters (.*), (.*), (.*)$")
//	public void enters_address_email_phone(String address, String email, String phone) {
//	    test_form.enterAddress(address);
//	    test_form.enterEmail(email);
//	    test_form.enterPhone(phone);
//	}
//
//	
//	@And("clicks Save Button")
//	public void clicks_save_button() {
//	   test_form.clickSave();
//	}
//
//
//	@Then("user details should be saved")
//	public void user_details_should_be_saved() {
//	    test_form.savedNotice(); 
//	}
//
//	
//	@When("user clicks Logout button")
//	public void user_clicks_logout_button() {
//	    test_form.clickLogout();
//	}
//	
//
//	@Then("User is navigated to Login Page")
//	public void user_is_navigated_back_to_the_login_page() {	
//		System.out.println("Inside Step: User is navigated back to Login Page");		
//	}
//
//    // @AfterMethod
//	public void teardownTest() {
//		driver.close();
//		driver.quit();
//		System.out.println("===============Login and Test From functionality testing done=============");
//	}
//
//}
