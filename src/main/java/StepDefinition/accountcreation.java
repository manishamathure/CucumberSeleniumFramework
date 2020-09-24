package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class accountcreation {
	WebDriver driver;
	
	@Given("^open the site and launch the application$")
	public void open_the_site_and_launch_the_application() {
		System.setProperty("webdriver.chrome.driver","C://Users//Balram//eclipse-workspace//CucumberFrameworkForRTW//src//main//java//browser//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rtw2-uat.zen3.co.uk/rtw/");
	}
	
	@Then("^user click on cookies navbar$")
	public void user_click_on_cookies_navbar() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement cookiesBtn = driver.findElement(By.xpath("//button[contains(text(),'I agree')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", cookiesBtn);
	}

	@Then("^user is on login page click on create new account link$")
	public void user_is_on_login_page_click_on_create_new_account_link() {
	    driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
	}
	
	@Then("^please enter \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void please_enter_first_name_and_last_name_and_email_and_password_and_confirm_password(String firstname, String lastname, String email, String password, String confirmpassword){
		driver.findElement(By.id("First Name")).sendKeys(firstname);
		driver.findElement(By.id("Last Name")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("Confirm Password")).sendKeys(confirmpassword);
	}	

	/*@Then("^enter \"(.*)\"$")
	public void enter_first_name(String first_name){
		driver.findElement(By.id("First Name")).sendKeys("first_name");
	}

	@Then("^enter \"(.*)\"$")
	public void enter_last_name(String last_name){
		driver.findElement(By.id("Last Name")).sendKeys("last_name");
	}

	@Then("^enter \"(.*)\"$")
	public void enter_email(String email){
		driver.findElement(By.id("Email")).sendKeys("email");
	}

	@Then("^enter \"(.*)\"$")
	public void enter_password(String password){
		driver.findElement(By.id("Password")).sendKeys("password");
	}

	@Then("^enter \"(.*)\"$")
	public void enter_confirm_password(String confirm_password){
		driver.findElement(By.id("Confirm Password")).sendKeys("confirm_password");
	}*/

	@Then("^select radio button option which describes you$")
	public void select_radio_button_option_which_describes_you(){
		WebElement businesstraveller1 = driver.findElement(By.id("mat-radio-2"));							
		businesstraveller1.click();
	}

	@Then("^click on create account button$")
	public void click_on_create_account_button()
	{
		driver.findElement(By.xpath("//button[contains(text(),'Create account')]")).click();
	}
	
	@Then ("^close the browser$")
	public void close_the_browser() 
	{
	 driver.close();
	}

}
