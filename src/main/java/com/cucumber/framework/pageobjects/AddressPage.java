package com.cucumber.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.generaloperations.ClickOnWebElement;
import com.cucumber.framework.helper.generaloperations.Wait;

public class AddressPage {

	public WebDriver driver;
	public AddressPage(WebDriver driver)
	{    
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH, using="//button[@name='processAddress']")
	@CacheLookup
	public WebElement proceedtocheckout3;
	
	public void  ClickOnProceedToCheckoutButton()
	{
		//Wait.ExplicitWait(driver, proceedtocheckout3);
		new ClickOnWebElement().Clickonwebelement(proceedtocheckout3);
	}

}
