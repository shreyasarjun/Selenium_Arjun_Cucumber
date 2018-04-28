package com.cucumber.framework.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.generaloperations.ClickOnWebElement;
import com.cucumber.framework.helper.generaloperations.Wait;

public class CartPage {
	
	public WebDriver driver;
	public CartPage(WebDriver driver)
	{    
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Proceed to checkout')]")
	@CacheLookup
	public WebElement proceedtocheckout1;
	
	public void  ClickOnProceedToCheckoutButton()
	{
		//Wait.ExplicitWait(driver, proceedtocheckout1);
		new ClickOnWebElement().Clickonwebelement(proceedtocheckout1);
	}



}
