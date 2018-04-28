package com.cucumber.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.assertionHelper.VerificationHelper;
import com.cucumber.framework.helper.generaloperations.ClickOnWebElement;
import com.cucumber.framework.helper.generaloperations.Wait;

public class OrderConfimationPage {
	
	public WebDriver driver;
	public OrderConfimationPage(WebDriver driver)
	{    
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH, using="//h1[contains(text(),'Order confirmation')]")
	@CacheLookup
	public WebElement orderconfimationtext;
	
	public void  VerifyOrderConfimationMessage(String expectedText)
	{
		//Wait.ExplicitWait(driver, orderconfimationtext);
		new VerificationHelper().verifyTextEquals(orderconfimationtext, expectedText);
	}


}
