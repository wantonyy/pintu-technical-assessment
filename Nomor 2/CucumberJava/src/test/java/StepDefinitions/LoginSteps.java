package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver = null;

	@Given("user open VERSION V4 app")
	public void user_open_version_v4_app() {
		System.out.println("Inside Step - user open version v4 app");
		driver = new ChromeDriver();
	}

	@When("user on login page")
	public void user_on_login_page() {
		System.out.println("Inside Step - user is on login page");
	}

	@When("user input email {email} in email field")
	public void user_input_email_in_email_field(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
	}

	@And("user input password {password} in password field")
	public void user_input_password_in_password_field(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("user tap on login button")
	public void user_tap_on_login_button() {
		driver.findElement(By.id("login")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		driver.findElement(By.linkText("Android New Line Learning"));
		driver.close();
	}

	@Then("system will show error on the email field")
	public void system_will_show_error_on_the_email_field() {

		driver.findElement(By.linkText("Wrong Email or Password"));
		driver.close();
	}

}
