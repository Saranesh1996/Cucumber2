package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLogin extends BaseClass{

	public GmailLogin() {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
			
	}
	
	@FindBy(id="identifierId")
	private WebElement emailId;
	
	@FindBy(xpath="//*[@id=\'identifierNext\']/div/button/span")
	private WebElement nextId;
	
	
	@FindBy(name="password")
	private WebElement passId;
	
	@FindBy(xpath="//*[@id=\'passwordNext\']/div/button/span")
	private WebElement clickId;

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getNextId() {
		return nextId;
	}

	public WebElement getPassId() {
		return passId;
	}

	public WebElement getClickId() {
		return clickId;
	}
}
