package com.cucumber.framework.stepdefinitions;

import org.apache.log4j.Logger;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.generaloperations.Wait;
import com.cucumber.framework.pageobjects.Homepage;
import com.cucumber.framework.pageobjects.Loginpage;
import com.cucumber.framework.pageobjects.Myaccountpage;
import com.cucumber.framework.testbase.testbase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginapplication  {
	Homepage homepage;
	Loginpage loginpage;
	Myaccountpage myaccountpage;
	private final Logger log = LoggerHelper.getLogger(loginapplication.class);
	
	@Before
	public void Initialization()
	{
		testbase.Broswer_Initialization();
	}

	
	@Given("^Navigate to application$")
	public void navigate_to_application() throws Throwable {	
		System.out.println("Navigation");
	}

	@When("^Click on Sign in link$")
	public void click_on_Sign_in_link() throws Throwable {
	   homepage=new Homepage(testbase.driver);
	   homepage.ClickOnSignLink();
	   log.info("Clicked on Signin Link");
	}

	@When("^Enter username as \"([^\"]*)\"$")
	public void enter_username_as(String arg1) throws Throwable {
	    loginpage=new Loginpage(testbase.driver);
	    loginpage.EnterUsername(arg1);
	    log.info("username entered as "+arg1);
	}

	@When("^Enter password as \"([^\"]*)\"$")
	public void enter_password_as(String arg1) throws Throwable {
	     loginpage.EnterPassword(arg1);
	     log.info("password enetred as "+arg1);
	}

	@When("^Click on Sign In button$")
	public void click_on_Sign_In_button() throws Throwable {
		  loginpage.ClickOnSignButton();
		  log.info("Clicked on Signin Submit Button");
	}

	@Then("^User should be able to login, Able to see success message \"([^\"]*)\"$")
	public void user_should_be_able_to_login_Able_to_see_success_message(String arg1) throws Throwable {
		myaccountpage=new Myaccountpage(testbase.driver);
		myaccountpage.VerifyWelcomeMessage(arg1);
		homepage.MouseMove();
	}
	
	@After
	public void tear_down()
	{
		Wait.Static_Wait(5);
		testbase.driver.quit();
		log.info("Browser Closed");
	}
	



}
