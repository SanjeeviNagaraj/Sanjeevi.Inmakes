package org.stepdefinition;

import org.bas.BaseClass;
import org.cuc.SigNpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbRegistration extends BaseClass {
	SigNpojo s;
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
	    launchBrowser();
	    WindowMaximize();
	}

	@When("To launch url of facebook application")
	public void to_launch_url_of_facebook_application() {
	   launchUrl("https://en-gb.facebook.com/");
	}

	@When("To click and create new account button")
	public void to_click_and_create_new_account_button() {
	    s=new SigNpojo();
	    clickBtn(s.getCreateNewAccount());
	}

	@When("To pass scecondname in secondname textbox")
	public void to_pass_scecondname_in_secondname_textbox() throws InterruptedException {
		Thread.sleep(3000);
		 s=new SigNpojo();
		 passText("sanju", s.getFirstNameTxtBox());
	}

	@When("To pass firstname in firstname textbox")
	public void to_pass_firstname_in_firstname_textbox() {
		 s=new SigNpojo();
		 passText("shsasti", s.getSecondNameTxtBox());
	}

	@When("To pass mobilenumber or email in email textbox")
	public void to_pass_mobilenumber_or_email_in_email_textbox() {
		 s=new SigNpojo();
		 passText("sanju@gmail.com", s.getMobileOrEmailTextBox());
	}

	@When("To create new password using new password textbox")
	public void to_create_new_password_using_new_password_textbox() {
	   passText("azar", s.getNewPassword());
	}

	@Then("To close the Chrome browser")
	public void to_close_the_Chrome_browser() {
	    closeEntireBrowser();
	}


}
