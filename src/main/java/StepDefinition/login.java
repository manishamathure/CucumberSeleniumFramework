package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class login {
	WebDriver driver;

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
	System.setProperty("webdriver.chrome.driver","C://Users//Home//eclipse-workspace//CucumberFrameworkForRTW//src//main//java//browser//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://rtw.oneworld.com/");
	}
	@Then("^user click on cookies$")
	public void click_on_cookies() {
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	WebElement cookiesBtn = driver.findElement(By.xpath("//button[contains(text(),'I agree')]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", cookiesBtn);
    }
	@Then("^user enter email ID and password$")
	public void user_enter_email_ID_and_password() {
	driver.findElement(By.id("Email")).sendKeys("samreenb@zen3.co.uk");
	driver.findElement(By.id("Password")).sendKeys("Test@1234");
	}
	@And("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", loginBtn);
	Thread.sleep(16000);	
	}
	@Then ("^user click on logout button$")
	public void user_click_on_logout_button() throws Throwable {
	driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}	
	
	@Then ("^browser is closed$")
	public void browser_is_closed() {
	driver.close();
	}
}
