package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DemoAutomationPojo  extends BaseClass {
	
	public DemoAutomationPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement FirstName;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement LastName;
	@FindBy(xpath="//textarea[@rows='3']")
	private WebElement Address;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailId;
	@FindBy(xpath="//input[@type='tel']")
	private WebElement phNo;
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement RadioButton;
	

	@FindBy(id="checkbox1")
	private WebElement checkBox1;
	public WebElement getCheckBox1() {
		return checkBox1;
	}
	public WebElement getIndia() {
		return india;
	}
	public WebElement getCheckbox2() {
		return checkbox2;
	}
	@FindBy(id="checkbox2")
	
	private WebElement checkbox2;
	@FindBy(id="msdd")
	private WebElement Lang;
	
	@FindBy(xpath="//a[text()='English']")
	private WebElement english;
	
	public WebElement getEnglish() {
		return english;
	}
	@FindBy(id="Skills")
	private WebElement skills;
	@FindBy(id="countries")
	private WebElement country;
	
	@FindBy(xpath="//span[@class='select2-selection select2-selection--single']")
	private WebElement selectCountry;
	@FindBy(xpath="//li[text()='India']")
	private WebElement india;
	@FindBy(id="yearbox")
	private WebElement yr;
	@FindBy(id="daybox")
	private WebElement day;
	@FindBy(xpath="(//select[@type='text'])[4]")
	private WebElement month;
	@FindBy(id="firstpassword")
	private WebElement firstPass;
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getEmailId() {
		return emailId;
	}
	public WebElement getPhNo() {
		return phNo;
	}
	public WebElement getRadioButton() {
		return RadioButton;
	}
	
	public WebElement getLang() {
		return Lang;
	}
	public WebElement getSkills() {
		return skills;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getSelectCountry() {
		return selectCountry;
	}
	public WebElement getYr() {
		return yr;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getFirstPass() {
		return firstPass;
	}
	
}
