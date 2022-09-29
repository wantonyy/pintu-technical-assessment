package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps{
	
	WebDriver driver = null;
	
	@Given("user on login page")
	public void user_on_login_page() {
	    driver = new ChromeDriver();
	}

	@When("user tap on create account section")
	public void user_tap_on_create_account_section() {
		driver.findElement(By.linkText("No account yet? Create one")).click();
	}

	@And("user verify if user is on register page")
	public void user_verify_if_user_is_on_register_page() {
	    System.out.println("In register page");
	}

	@And("user input name {string} on name field")
	public void user_input_name_on_name_field(String string) {
		driver.findElement(By.id("Name")).sendKeys(string);
	}

	@And("user input email {string} on email field")
	public void user_input_email_on_email_field(String string) {
		driver.findElement(By.id("Email")).sendKeys(string);
	}

	@And("user input password {string} on password field")
	public void user_input_password_on_password_field(String string) {
		driver.findElement(By.id("Password")).sendKeys(string);
	}

	@And("user input confirm password {string} on confirm password field")
	public void user_input_confirm_password_on_confirm_password_field(String string) {
		driver.findElement(By.id("Confirm Password")).sendKeys(string);
	}

	@And("user tap register button")
	public void user_tap_register_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("Register")).click();
	}

	@Then("system will pop up registration success notification")
	public void system_will_pop_up_registration_success_notification() {
	    if(driver.findElement(By.linkText("Registration Successful")).equals("Registration Successful")) {
	    	System.out.println("Registration Success!");
	    }else{
	    	System.out.println("Registration Failed");
	    };
	    driver.close();
	}
	
	@Then("system will pop up notifcation that indicate email already existed")
	public void system_will_pop_up_notifcation_that_indicate_email_already_existed() {
		if(driver.findElement(By.linkText("Email Already Exists")).equals("Email Already Exists")) {
	    	System.out.println("Already Registered!");
	    }else{
	    	System.out.println("Not Yet Registered Account");
	    };
	    driver.close();
	}
	
	@Then("system will show error message on email field")
	public void system_will_show_error_message_on_email_field() {
		if(driver.findElement(By.linkText("Enter Valid Email")).equals("Enter Valid Email")) {
	    	System.out.println("Condition Fulfilled");
	    }else{
	    	System.out.println("Condition Unfulfilled");
	    };
	    driver.close();
	}
	
	@Then("system will show error message on confirm password field")
	public void system_will_show_error_message_on_confirm_password_field() {
		if(driver.findElement(By.linkText("Password Does Not Matches")).equals("Password Does Not Matches")) {
	    	System.out.println("Condition Fulfilled");
	    }else{
	    	System.out.println("Condition Unfulfilled");
	    };
	    driver.close();
	}


}