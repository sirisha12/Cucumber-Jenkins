package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinitions {
	private WebDriver driver;

	private String baseUrl;

	@Before
	public void testsetup() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		baseUrl = "http://localhost/sirisha/index.html";
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		System.out.println("Before method executed");
	}

	@After
	public void testshutdown() {
		System.out.println("After method executed");
		driver.quit();

	}

	@Given("^User is in homepage$")
	public void user_is_in_homepage() throws Throwable {

		driver.get(baseUrl);
	}

	@When("^User check the checkbox$")
	public void user_check_the_checkbox() throws Throwable {

		driver.findElement(By.id("checkbox")).click();

	}

	@When("^Click on next button$")
	public void click_on_next_button() throws Throwable {

		driver.findElement(By.id("next")).click();

	}

	@Then("^User successfully go to signup page$")
	public void user_successfully_go_to_signup_page() throws Throwable {

		System.out.println("User successfully go to signup page");

	}

	@When("^User want to fill all details in signup page$")
	public void user_want_to_fill_all_details() throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("forenames")));
		
		driver.findElement(By.id("forenames")).sendKeys("Sirisha");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("surename")));

		driver.findElement(By.id("surename")).sendKeys("Nalam");

		driver.findElement(By.id("radiof")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address1")));

		driver.findElement(By.id("address1")).sendKeys("H.No 1-68/4&5, Arunodaya Colony, Blue Dart Courier Building");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address2")));
		
		driver.findElement(By.id("address2")).sendKeys("Madhapur");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city")));

		driver.findElement(By.id("city")).sendKeys("Hyderabad");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postalcode")));

		driver.findElement(By.id("postalcode")).sendKeys("500081");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("telephone")));

		driver.findElement(By.id("telephone")).sendKeys("9494634250");

		Select country = new Select(driver.findElement(By.xpath(".//*[@id='form']/form/select")));

		country.selectByVisibleText("India");

	}

	@When("^Click on submit button$")
	public void click_on_submit_button() throws Throwable {

		driver.findElement(By.xpath("//input[@id='submit']")).click();

	}

	@Then("^User successfully go to booking page$")
	public void user_successfully_go_to_booking_page() throws Throwable {

		System.out.println("User successfully go to booking page");

	}

	@Then("^User want to fill all details in booking page$")
	public void user_want_to_fill_all_details_in_booking_page() throws Throwable {

		Select departure = new Select(driver.findElement(By.xpath(".//*[@id='depart']/select")));

		departure.selectByValue("New York");

		driver.findElement(By.id("datepicker")).sendKeys("29/09/2015");

		Select arrival = new Select(driver.findElement(By.xpath(".//*[@id='arrive']/select")));

		arrival.selectByVisibleText("Sydney");

		driver.findElement(By.id("datepicker1")).sendKeys("15/10/2015");
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='passengers']/input")));

		driver.findElement(By.xpath(".//*[@id='passengers']/input")).sendKeys("3");

		driver.findElement(By.id("tripcheckbox")).click();

		driver.findElement(By.id("aisle")).click();

		driver.findElement(By.id("business")).click();

	}

	@When("^click on confirm button$")
	public void click_on_confirm_button() throws Throwable {

		driver.findElement(By.id("confirm")).click();

	}

	@Then("^User successfully go to Payment page$")
	public void user_successfully_go_to_Payment_page() throws Throwable {

		System.out.println("User successfully go to Payment page");
	}

	@Then("^User want to fill all details in Payment page$")
	public void user_want_to_fill_all_details_in_Payment_page() throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ccnum")));
		
		driver.findElement(By.id("ccnum")).sendKeys("1234567890");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ccname")));

		driver.findElement(By.id("ccname")).sendKeys("Sirisha");

		Select expiry = new Select(driver.findElement(By.id("ccmonth")));

		expiry.selectByVisibleText("December");

		Select date = new Select(driver.findElement(By.id("ccyear")));

		date.selectByVisibleText("2018");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ccvc")));

		driver.findElement(By.id("ccvc")).sendKeys("234");

	}

	@When("^click on pay now button$")
	public void click_on_pay_now_button() throws Throwable {

		driver.findElement(By.id("paynow")).click();

	}

	@Then("^User successfully go to confirmation page$")
	public void user_successfully_go_to_confirmation_page() throws Throwable {

		System.out.println("User successfully go to Confirmation page");
	}

	@When("^Click on Home button$")
	public void click_on_Home_button() throws Throwable {

		driver.findElement(By.id("home")).click();

	}

	@Then("^User go to home page$")
	public void user_go_to_home_page() throws Throwable {

		System.out.println("User successfully go to Home page");

	}

}
