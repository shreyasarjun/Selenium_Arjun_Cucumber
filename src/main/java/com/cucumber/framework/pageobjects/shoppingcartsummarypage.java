package com.cucumber.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.generaloperations.ClickOnWebElement;
import com.cucumber.framework.helper.generaloperations.Wait;

public class shoppingcartsummarypage {
	
	public WebDriver driver;
	public shoppingcartsummarypage(WebDriver driver)
	{    
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH, using="//a[@title='Proceed to checkout'][@class='button btn btn-default standard-checkout button-medium']")
	@CacheLookup
	public WebElement proceedtocheckout2;
	
	public void  ClickOnProceedToCheckoutButton()
	{
		//Wait.ExplicitWait(driver, proceedtocheckout2);
		new ClickOnWebElement().Clickonwebelement(proceedtocheckout2);
	}




}
