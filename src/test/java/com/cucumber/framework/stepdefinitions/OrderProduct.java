package com.cucumber.framework.stepdefinitions;

import org.apache.log4j.Logger;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.generaloperations.MouseMoveOver;
import com.cucumber.framework.helper.generaloperations.SwitchiFrame;
import com.cucumber.framework.helper.generaloperations.Wait;
import com.cucumber.framework.helper.generaloperations.WindowsHandling;
import com.cucumber.framework.pageobjects.AddressPage;
import com.cucumber.framework.pageobjects.CartPage;
import com.cucumber.framework.pageobjects.Homepage;
import com.cucumber.framework.pageobjects.Loginpage;
import com.cucumber.framework.pageobjects.OrderConfimationPage;
import com.cucumber.framework.pageobjects.OrderSummaryPage;
import com.cucumber.framework.pageobjects.PaymentPage;
import com.cucumber.framework.pageobjects.ProductDetailsPage;
import com.cucumber.framework.pageobjects.ProductsListPage;
import com.cucumber.framework.pageobjects.ShippingPage;
import com.cucumber.framework.pageobjects.shoppingcartsummarypage;
import com.cucumber.framework.testbase.testbase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderProduct {
	
	private final Logger log = LoggerHelper.getLogger(OrderProduct.class);

	@Given("^Navigate to application site$")
	public void navigate_to_application_site() throws Throwable {	
		System.out.println("Selenium");
	}
	
	@When("^Login into the application with valid username as \"([^\"]*)\" Password as \"([^\"]*)\"$")
	public void login_into_the_application_with_valid_username_as_Password_as(String arg1, String arg2) throws Throwable {
		new Loginpage(testbase.driver).Login(arg1, arg2);
	}

	@When("^Click on Casual Dresses menu from HomePage$")
	public void click_on_Casual_Dresses_menu_from_HomePage() throws Throwable {
		new Homepage(testbase.driver).MouseMove();
		new Homepage(testbase.driver).ClickonCasualDressesLink();
	   
	}

	@When("^Click on Product from ProductsListPage$")
	public void click_on_Product_from_ProductsListPage() throws Throwable {
         new ProductsListPage(testbase.driver).ClickOnPrintedDress();
         log.info("Clicked on Printed Dress");
	}

	@When("^Click on Addtocart from ProductDetailsPage$")
	public void click_on_Addtocart_from_ProductDetailsPage() throws Throwable {
		new SwitchiFrame().Switchiframe(testbase.driver);
        new ProductDetailsPage(testbase.driver).ClickOnAddToCartButton();
        log.info("Clicked on Add to Cart Button");
	}

	@When("^Click on ProceedToCheckout from CartPage$")
	public void click_on_ProceedToCheckout_from_CartPage() throws Throwable {
	    new CartPage(testbase.driver).ClickOnProceedToCheckoutButton();
	}

	@When("^Click on ProceedToCheckout from ShoppingCartSummaryPage$")
	public void click_on_ProceedToCheckout_from_ShoppingCartSummaryPage() throws Throwable {
	   new shoppingcartsummarypage(testbase.driver).ClickOnProceedToCheckoutButton();
	}

	@When("^Click on ProceedToCheckout from AddressPage$")
	public void click_on_ProceedToCheckout_from_AddressPage() throws Throwable {
       new AddressPage(testbase.driver).ClickOnProceedToCheckoutButton();
	}

	@When("^Click on ProceedToCheckout from ShippingPage$")
	public void click_on_ProceedToCheckout_from_ShippingPage() throws Throwable {
	    new ShippingPage(testbase.driver).ClickOnCheckbox();
	    new ShippingPage(testbase.driver).ClickOnProceedToCheckoutButton();
	}

	@When("^Select the Payment Method from PaymentPage$")
	public void select_the_Payment_Method_from_PaymentPage() throws Throwable {
	    new PaymentPage(testbase.driver).ClickOnPaymentMode();
	}

	@When("^Click on Confirmation button from OrderSummaryPage$")
	public void click_on_Confirmation_button_from_OrderSummaryPage() throws Throwable {
        new OrderSummaryPage(testbase.driver).ClickOnConfirmButton();
	}

	@Then("^Verify message as \"([^\"]*)\" in OrderConfimationPage$")
	public void verify_message_as_in_OrderConfimationPage(String arg1) throws Throwable {
	     new OrderConfimationPage(testbase.driver).VerifyOrderConfimationMessage(arg1);
	}
	

}
