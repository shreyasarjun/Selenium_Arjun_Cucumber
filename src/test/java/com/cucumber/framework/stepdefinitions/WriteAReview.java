package com.cucumber.framework.stepdefinitions;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.cucumber.framework.helper.generaloperations.SwitchAlert;
import com.cucumber.framework.helper.generaloperations.SwitchWindows;
import com.cucumber.framework.helper.generaloperations.SwitchiFrame;
import com.cucumber.framework.helper.generaloperations.Wait;
import com.cucumber.framework.pageobjects.ProductDetailsPage;
import com.cucumber.framework.pageobjects.ReviewPage;
import com.cucumber.framework.testbase.testbase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WriteAReview {
	
	@When("^Click on Write a review$")
	public void click_on_Write_a_review() throws Throwable {
	    new ProductDetailsPage(testbase.driver).ClickOnWriteAReviewLink();
	}

	@When("^Fill all fields and click on Send button$")
	public void fill_all_fields_and_click_on_Send_button() throws Throwable {
	     new ReviewPage(testbase.driver).WriteAReviewOnProduct();
	}

	@When("^Read the text message from popup window$")
	public void read_the_text_message_from_popup_window() throws Throwable {
	  new ReviewPage(testbase.driver).VerifyReviewConfirmationMessage();
	}

	@Then("^Click on OK on review submitted confimation popup$")
	public void click_on_OK_on_review_submitted_confimation_popup() throws Throwable {
		new ReviewPage(testbase.driver).ClickOnOKButton();
	}


}
