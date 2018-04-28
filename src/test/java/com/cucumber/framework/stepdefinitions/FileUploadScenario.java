package com.cucumber.framework.stepdefinitions;

import com.cucumber.framework.FileUploadDownload.FileUploadDownload;
import com.cucumber.framework.helper.generaloperations.Wait;
import com.cucumber.framework.pageobjects.ContactPage;
import com.cucumber.framework.pageobjects.Homepage;
import com.cucumber.framework.testbase.testbase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FileUploadScenario {

	@When("^Click on Contact us link in home page$")
	public void click_on_Contact_us_link_in_home_page() throws Throwable {
	  new Homepage(testbase.driver).ClickOnContactUsLink();
	  Wait.Static_Wait(3);
	}

	@When("^Select Suject Heading as \"([^\"]*)\"$")
	public void select_Suject_Heading_as(String arg1) throws Throwable {
	    new ContactPage(testbase.driver).SelectSujectHeading();
	    Wait.Static_Wait(3);
	}

	@When("^Select Order reference$")
	public void select_Order_reference() throws Throwable {
		new ContactPage(testbase.driver).SelectOrderReference();
		 Wait.Static_Wait(7);
	}

	@When("^Select the product$")
	public void select_the_product() throws Throwable {
		new ContactPage(testbase.driver).SelectProduct();
		 Wait.Static_Wait(3);
	}
	
	@When("^Enter some comments on message body$")
	public void enter_some_comments_on_message_body() throws Throwable {
		new ContactPage(testbase.driver).EnterDataOnMessageBody();
		 Wait.Static_Wait(3);	
	}

	@When("^Upload File$")
	public void upload_File() throws Throwable {
		new ContactPage(testbase.driver).ClickOnFileUpload();
		 Wait.Static_Wait(3);
		new FileUploadDownload().FileUploading();
		 Wait.Static_Wait(3);
	}
	

	@When("^Click on Send Button$")
	public void click_on_Send_Button() throws Throwable {
		new ContactPage(testbase.driver).ClickOnSendButton();
		 Wait.Static_Wait(3);
	}

	@Then("^Verify Success message$")
	public void verify_Success_message() throws Throwable {
	   new ContactPage(testbase.driver).VerfiyContactUsSuccessMessage();
	   Wait.Static_Wait(3);
	}

}
