package com.cucumber.framework.stepdefinitions;

import java.awt.Robot;

import com.cucumber.framework.FileUploadDownload.FileUploadDownload;
import com.cucumber.framework.helper.generaloperations.RobotFunction;
import com.cucumber.framework.helper.generaloperations.Wait;
import com.cucumber.framework.pageobjects.Homepage;
import com.cucumber.framework.pageobjects.Myaccountpage;
import com.cucumber.framework.pageobjects.OrderHistoryPage;
import com.cucumber.framework.testbase.testbase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FileDownloadScenario {
	
	@When("^Click on My Account link$")
	public void click_on_My_Account_link() throws Throwable {
	    new Homepage(testbase.driver).ClickOnMyAccountLink();
	    Wait.Static_Wait(5);
	}

	@When("^Click on Order History and details$")
	public void click_on_Order_History_and_details() throws Throwable {
	   new Myaccountpage(testbase.driver).ClickOnOrderHistory();
	   Wait.Static_Wait(5);
	}

	@When("^Click on PDF link$")
	public void click_on_PDF_link() throws Throwable {
	 new OrderHistoryPage(testbase.driver).ClickOnPDFFileDownloadLink();
	 Wait.Static_Wait(5);
	}

	@Then("^Download  the file using autoit$")
	public void download_the_file_using_autoit() throws Throwable {
	   new FileUploadDownload().FileDownloading();
	   Wait.Static_Wait(5);
	   new RobotFunction().Enter();
	}

}
