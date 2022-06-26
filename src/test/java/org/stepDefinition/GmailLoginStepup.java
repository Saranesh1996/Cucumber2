package org.stepDefinition;

import org.sample.BaseClass;
import org.sample.GmailLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailLoginStepup extends BaseClass {
 GmailLogin gml;
@Given("To launch the browser and hit the gmail url")
public void toLaunchTheBrowserAndHitTheGmailUrl() {
    browserCall();
    launchUrl("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
}

@When("To enter valid email")
public void toEnterValidEmail() throws InterruptedException {
   gml= new GmailLogin();
   
   sendValues(gml.getEmailId(), "saran7vikki@gmail.com");
   Thread.sleep(2000);
}

@When("To click the next button")
public void toClickTheNextButton() throws InterruptedException {
	gml= new GmailLogin();

	click(gml.getNextId());
	Thread.sleep(3000);
}

@When("To enter invalid password")
public void toEnterInvalidPassword() throws InterruptedException {
	gml= new GmailLogin();
	
	sendValues(gml.getPassId(), "vuduka109");
	Thread.sleep(3000);
}

@When("To click the sign in button")
public void toClickTheSignInButton() throws InterruptedException {
	gml= new GmailLogin();

	click(gml.getClickId());
	Thread.sleep(3000);
   
}

@Then("To close the browser")
public void toCloseTheBrowser() {
    closeBrowser();
}
}
