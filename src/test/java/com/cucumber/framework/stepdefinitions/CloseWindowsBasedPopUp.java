package com.cucumber.framework.stepdefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.generaloperations.Wait;
import com.cucumber.framework.pageobjects.ReviewPage;
import com.cucumber.framework.testbase.testbase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CloseWindowsBasedPopUp {
	private final Logger log = LoggerHelper.getLogger(CloseWindowsBasedPopUp.class);
	
	@When("^Click on Print button on product details page$")
	public void click_on_Print_button_on_product_details_page() throws Throwable {
		log.info("Before Clicking on Print Button");
	   new ReviewPage(testbase.driver).ClickOnPrintLink();
	   log.info("After Clicked on Print Button");
	}

	@Then("^Close the windows based popup window$")
	public void close_the_windows_based_popup_window() throws Throwable {
	  Wait.Static_Wait(10);
	  Runtime.getRuntime().exec("C:\\Cucumber\\PracticeBDDCucumber\\src\\main\\resources\\AutoIt\\FileDownload.exe");
	  log.info("Windows based popup closed");
	
	}

}
