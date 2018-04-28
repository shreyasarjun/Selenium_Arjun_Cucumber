package com.cucumber.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.generaloperations.ClickOnWebElement;
import com.cucumber.framework.helper.generaloperations.Wait;

public class OrderSummaryPage {
	
	public WebDriver driver;
	public OrderSummaryPage(WebDriver driver)
	{    
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'I confirm my order')]")
	@CacheLookup
	public WebElement confirmbutton;
	
	public void  ClickOnConfirmButton()
	{
		//Wait.ExplicitWait(driver, confirmbutton);
		new ClickOnWebElement().Clickonwebelement(confirmbutton);
	}



}
