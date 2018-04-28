package com.cucumber.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.generaloperations.ClickOnWebElement;
import com.cucumber.framework.helper.generaloperations.Wait;

public class PaymentPage {
	
	public WebDriver driver;
	public PaymentPage(WebDriver driver)
	{    
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH, using="//a[@title='Pay by bank wire']")
	@CacheLookup
	public WebElement Paybybankwire;
	
	public void  ClickOnPaymentMode()
	{
		//Wait.ExplicitWait(driver, Paybybankwire);
		new ClickOnWebElement().Clickonwebelement(Paybybankwire);
	}



}
