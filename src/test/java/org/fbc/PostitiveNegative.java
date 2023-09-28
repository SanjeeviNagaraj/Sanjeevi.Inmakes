package org.fbc;

import org.bas.BaseClass;
import org.cuc.FbLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PostitiveNegative extends BaseClass {
	FbLog f;
	@Given("To launch the chrome browser and maximizewindow")
	public void to_launch_the_chrome_browser_and_maximizewindow() {
	    launchBrowser();
	    WindowMaximize();
	}

	@When("To launch the url of the facebook apllication")
	public void to_launch_the_url_of_the_facebook_apllication() {
		launchUrl("https://en-gb.facebook.com/");
	    	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
	    
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
	    
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
	   
	}

	@When("To Check Wheather navigate to the home page or not")
	public void to_Check_Wheather_navigate_to_the_home_page_or_not() {
	   f=new FbLog();
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	   closeEntireBrowser();	}

	

}
