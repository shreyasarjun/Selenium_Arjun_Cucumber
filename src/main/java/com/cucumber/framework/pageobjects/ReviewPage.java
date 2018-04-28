package com.cucumber.framework.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.assertionHelper.VerificationHelper;
import com.cucumber.framework.helper.generaloperations.ClickOnWebElement;
import com.cucumber.framework.helper.generaloperations.EnterText;
import com.cucumber.framework.helper.generaloperations.Wait;
import com.cucumber.framework.testbase.testbase;

public class ReviewPage {
	
	private final Logger log = LoggerHelper.getLogger(ReviewPage.class);
	public WebDriver driver;
	public ReviewPage(WebDriver driver)
	{    
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID, using="comment_title")
	@CacheLookup
	public WebElement reviewtitle;
	
	public void  EnterReviewTitle()
	{
		new EnterText().entertext(reviewtitle,"automation testing");
	}
	
	@FindBy(how=How.ID, using="content")
	@CacheLookup
	public WebElement comment;
	
	public void  EnterComment()
	{
		new EnterText().entertext(comment,"Selenium is web based open source automation api");
	}
	
	@FindBy(how=How.ID, using="submitNewMessage")
	@CacheLookup
	public WebElement send;
	
	public void  ClickOnSendButton()
	{
		new ClickOnWebElement().Clickonwebelement(send);
	}
	
	public void WriteAReviewOnProduct()
	{
		EnterReviewTitle();
		EnterComment();
		ClickOnSendButton();
	}
	
	@FindBy(how=How.XPATH, using="//p[contains(text(),'Your comment has')]")
	@CacheLookup
	public WebElement ReviewConfirmationMessage;
	
	public void  VerifyReviewConfirmationMessage()
	{
		new VerificationHelper().verifyTextEquals(ReviewConfirmationMessage, "Your comment has been added and will be available once approved by a moderator");
	}
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'OK')]")
	@CacheLookup
	public WebElement okbutton;
	
	public void  ClickOnOKButton()
	{
		new ClickOnWebElement().Clickonwebelement(okbutton);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Print")
	@CacheLookup
	public WebElement printlink;
	
	public void  ClickOnPrintLink()
	{
		//new ClickOnWebElement().Clickonwebelement(printlink);
		JavascriptExecutor js=(JavascriptExecutor)testbase.driver;
		js.executeScript("arguments[0].click();", printlink);
	}

}
