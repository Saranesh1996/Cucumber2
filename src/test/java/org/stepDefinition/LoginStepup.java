package org.stepDefinition;

import org.junit.Assert;
import org.sample.BaseClass;
import org.sample.CommerceLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepup  extends BaseClass{
	 CommerceLogin cl;
	
	
	@Given("To launch the browser and hit the url")
	public void to_launch_the_browser_and_hit_the_url() {
	  browserCall();
	  launchUrl("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	@When("To pass the username in the userName field")
	public void to_pass_the_username_in_the_userName_field() {
	 CommerceLogin cl = new CommerceLogin();
	 sendValues(cl.getTextName(), "");
	 
			 
	}

	@When("To pass the Password in the password field")
	public void to_pass_the_Password_in_the_password_field() {
           cl = new CommerceLogin();
           sendValues(cl.getTextPassword(), "");
	}

	@When("To click the login button")
	public void to_click_the_login_button() throws InterruptedException {
		 cl = new CommerceLogin();
		 click(cl.getLoginClick());
		 thread(3000);
	}

	@Then("Page title should be dashboard")
	public void page_title_should_be_dashboard() {
		 if (driver.getPageSource().contains("Login was unsuccessful.")) {
			closeBrowser();;
		 }
	}

	@When("To click the logout button")
	public void to_click_the_logout_button() throws InterruptedException {
		 cl = new CommerceLogin();
		 click(cl.getLogoutBtn());
		 thread(2000);
	}

	@Then("Page title back as Store login page")
	public void page_title_back_as_Store_login_page() {
		 if (driver.getPageSource().contains("Welcome, please sign in!")) {
			System.out.println("login and logout wwas successsful");
		}
	}
	@Then("close the browser")
	public void close_the_browser() {
	 closeBrowser();
	}
}
