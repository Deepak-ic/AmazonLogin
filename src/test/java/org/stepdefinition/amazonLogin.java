package org.stepdefinition;

import org.bas.baseClass;
import org.pojo.amazonPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class amazonLogin extends baseClass {

	amazonPojo a;

	@Given("To launch the edge browser and maximize the window")
	public void to_launch_the_edge_browser_and_maximize_the_window() {
		launchBrowser();
		WindowsMaximazer();
	}

	@When("To Launch the Amazon Url")
	public void to_Launch_the_Amazon_Url() {
		launchUrl(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}

	@When("To pass emailID or mobile number and click the continue button")
	public void to_pass_emailID_or_mobile_number_and_click_the_continue_button() {
		a = new amazonPojo();
		passText("deepak@gmail.com", a.getEmail());
		clckBtn(a.getContinueBtn());
	}

	@When("To pass password to password field text box")
	public void to_pass_password_to_password_field_text_box() {
		a = new amazonPojo();
		passText("1234567876", a.getPass());
	}

	@When("To click the signIn button")
	public void to_click_the_signIn_button() {
		a = new amazonPojo();
		clckBtn(a.getSignIn());
	}

	@Then("To close the edge browser")
	public void to_close_the_edge_browser() {
		closeBrowser();
	}

}
