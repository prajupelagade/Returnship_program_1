package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFunctionSteps {
	WebDriver driver;
	
	@Given("open the chrome browser and url of application")
	public void open_the_chrome_browser_and_url_of_application() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    System.out.println("Given done");
	    
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://ksrtc.in/oprs-web/login/show.do");
	}

	@When("Enter the username and password")
	public void enter_the_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("userName")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.id("submitBtn")).click();
	    System.out.println("when done");
	}

	@Then("Login success")
	public void login_success() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.close();
		System.out.println("Then done");
	}
}
