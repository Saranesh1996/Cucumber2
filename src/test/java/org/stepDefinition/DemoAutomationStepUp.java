package org.stepDefinition;

import org.sample.BaseClass;
import org.sample.DemoAutomationPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoAutomationStepUp extends BaseClass {
DemoAutomationPojo dap;
@Given("To launch the browser and hit the  automation url")
public void toLaunchTheBrowserAndHitTheAutomationUrl() {
   browserCall();
   launchUrl("http://demo.automationtesting.in/Register.html");
}

@When("To pass the firstName and SceeondName in field")
public void toPassTheFirstNameAndSceeondNameInField() throws InterruptedException {
    dap= new DemoAutomationPojo();
    sendValues(dap.getFirstName(), "Saranesh");
    thread(2000);
    sendValues(dap.getLastName(), "Srinivasan");
}

@When("To pass the address,email and phno")
public void toPassTheAddressEmailAndPhno() throws InterruptedException {
	dap= new DemoAutomationPojo();
	sendValues(dap.getAddress(), "3/177, NorthKattuKottai, Vinaitheerthapuram,Melur post,kallakurichi");
	thread(2000);
	sendValues(dap.getEmailId(), "saran7vikki@gmail.com");
	thread(2000);
	sendValues(dap.getPhNo(), "8754833306");
	thread(2000);
}

@When("To click the gender and hobbies")
public void toClickTheGenderAndHobbies() throws InterruptedException {
	dap= new DemoAutomationPojo();
	click(dap.getRadioButton());
	thread(2000);
	click(dap.getCheckBox1());
	click(dap.getCheckbox2());
}

@When("To select languages,country,skills and dob")
public void toSelectLanguagesCountrySkillsAndDob() throws InterruptedException {
	dap= new DemoAutomationPojo();
	click(dap.getLang());
	thread(2000);
	click(dap.getEnglish());
	thread(2000);
	selectByIndex(dap.getSkills(), 7);
	thread(2000);
	click(dap.getSelectCountry());
	click(dap.getIndia());
	
	selectByVisibleText(dap.getYr(), "1996");
	selectByVisibleText(dap.getMonth(), "June");
	selectByVisibleText(dap.getDay(), "13");
	
}

@When("To enter a correct password and confirm")
public void toEnterACorrectPasswordAndConfirm() {
	dap= new DemoAutomationPojo();
}

@Then("To close the  chrome browser")
public void toCloseTheChromeBrowser() {

}

}
