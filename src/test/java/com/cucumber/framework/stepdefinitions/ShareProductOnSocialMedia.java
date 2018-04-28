package com.cucumber.framework.stepdefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.generaloperations.SwitchWindows;
import com.cucumber.framework.pageobjects.Homepage;
import com.cucumber.framework.pageobjects.Loginpage;
import com.cucumber.framework.pageobjects.ProductDetailsPage;
import com.cucumber.framework.pageobjects.ProductsListPage;
import com.cucumber.framework.testbase.testbase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShareProductOnSocialMedia {
	
	private final Logger log = LoggerHelper.getLogger(ShareProductOnSocialMedia.class);
	
	@Given("^Login into application$")
	public void login_into_application() throws Throwable {
		new Loginpage(testbase.driver).Login("seleniumcucumber@gmail.com", "dummy");
	}
	@When("^Serach product as \"([^\"]*)\" in serach bar of the homepage$")
	public void serach_product_as_in_serach_bar_of_the_homepage(String arg1) throws Throwable {
        new Homepage(testbase.driver).EnterSearchText(arg1);
        new Homepage(testbase.driver).ClickOnSubmitButton();
	}

	@When("^Click on More button on the product surface$")
	public void click_on_More_button_on_the_product_surface() throws Throwable {
	       new ProductsListPage(testbase.driver).MovetoElementBlouse();
	       new ProductsListPage(testbase.driver).ClickOnMoreButton();
	}

	@When("^Click on Facebook Share button in productdetails page$")
	public void click_on_Facebook_Share_button_in_productdetails_page() throws Throwable {
		   new SwitchWindows().ParentWindowID();
	       new ProductDetailsPage(testbase.driver).ClickOnFShareButton();
	       log.info("Clicked on FShare Button");
	      
	}

	@When("^Click on Pinterest Share button in productdetails page$")
	public void click_on_Pinterest_Share_button_in_productdetails_page() throws Throwable {
		new ProductDetailsPage(testbase.driver).ClickOnPinterestButton();
		log.info("Clicked on Pinterest Button");
	}

	@Then("^Switch to respective windows and perform some opertations and close windows$")
	public void switch_to_respective_windows_and_perform_some_opertations_and_close_windows() throws Throwable {
	   new SwitchWindows().switchwindows();
	}

	@Then("^Switch back to Parent wondow and perform some opertaions on parent window$")
	public void switch_back_to_Parent_wondow_and_perform_some_opertaions_on_parent_window() throws Throwable {
		testbase.driver.findElement(By.xpath(".//*[@id='add_to_cart']/button")).click();
	}



}
