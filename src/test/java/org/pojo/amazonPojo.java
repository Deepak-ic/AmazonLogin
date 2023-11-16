package org.pojo;

import org.bas.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPojo extends baseClass{

	public amazonPojo() {
		PageFactory.initElements(driver, this);
	}
	
//	email or mobile number field 
	@FindBy(id = "ap_email")
	private WebElement email;
	
//	Continue button
	@FindBy(id = "continue")
	private WebElement continueBtn;
	
//	password field
	@FindBy(id = "ap_password")
	private WebElement pass;
	
//	Sign in button
	@FindBy(id = "signInSubmit")
	private WebElement signIn;

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public void setContinueBtn(WebElement continueBtn) {
		this.continueBtn = continueBtn;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public void setSignIn(WebElement signIn) {
		this.signIn = signIn;
	}

}
