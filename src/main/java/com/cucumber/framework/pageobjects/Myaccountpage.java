package com.cucumber.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cucumber.framework.helper.assertionHelper.VerificationHelper;
import com.cucumber.framework.helper.generaloperations.ClickOnWebElement;
import com.cucumber.framework.helper.generaloperations.Wait;

public class Myaccountpage {
	
	public WebDriver driver;
	public Myaccountpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH, using="//*[contains(text(),'Welcome to your account')]")
	@CacheLookup
	public WebElement welcomemessage;
	
	public void VerifyWelcomeMessage(String message)
	{
		//Wait.ExplicitWait(driver, welcomemessage);
		new VerificationHelper().verifyTextEquals(welcomemessage, message);
	}
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Order history and details')]")
	@CacheLookup
	public WebElement orderhistory;
	
	public void ClickOnOrderHistory()
	{
        new ClickOnWebElement().Clickonwebelement(orderhistory);
	}
}
