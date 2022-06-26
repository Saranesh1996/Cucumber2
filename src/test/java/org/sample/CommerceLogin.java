package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommerceLogin extends BaseClass {

	public CommerceLogin() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	private WebElement textName;
	@FindBy(id="Password")
	private WebElement textPassword;
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginClick;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutBtn;
	public WebElement getTextName() {
		return textName;
	}
	public WebElement getTextPassword() {
		return textPassword;
	}
	public WebElement getLoginClick() {
		return loginClick;
	}
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	
	
}
