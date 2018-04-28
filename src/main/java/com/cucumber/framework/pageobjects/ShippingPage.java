package com.cucumber.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.generaloperations.ClickOnWebElement;
import com.cucumber.framework.helper.generaloperations.Wait;

public class ShippingPage {
	
	public WebDriver driver;
	public ShippingPage(WebDriver driver)
	{    
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH, using="//button[@name='processCarrier']")
	@CacheLookup
	public WebElement proceedtocheckout4;
	
	public void  ClickOnProceedToCheckoutButton()
	{
		new ClickOnWebElement().Clickonwebelement(proceedtocheckout4);
	}
	
	@FindBy(how=How.ID, using="cgv")
	@CacheLookup
	public WebElement termcondition;
	
	public void  ClickOnCheckbox()
	{
		//Wait.ExplicitWait(driver, termcondition);
		new ClickOnWebElement().Clickonwebelement(termcondition);
	}
	

	

}
