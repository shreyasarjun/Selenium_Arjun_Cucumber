package com.cucumber.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.assertionHelper.VerificationHelper;
import com.cucumber.framework.helper.generaloperations.ClickOnWebElement;
import com.cucumber.framework.helper.generaloperations.DropDownSelection;
import com.cucumber.framework.helper.generaloperations.EnterText;

public class ContactPage {
	
	public WebDriver driver;
	public ContactPage(WebDriver driver)
	{    
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID, using="id_contact")
	@CacheLookup
	public WebElement sujectheading;
	
	public void  SelectSujectHeading()
	{
		new DropDownSelection().SelectDropDownByVisibleText(sujectheading,"Customer service");
	}
	
	@FindBy(how=How.NAME, using="id_order")
	@CacheLookup
	public WebElement orderreference;
	
	public void  SelectOrderReference()
	{
		new DropDownSelection().SelectDropDownByIndex(orderreference,1);
	}
	
	@FindBy(how=How.NAME, using="id_product")
	@CacheLookup
	public WebElement product;
	
	public void  SelectProduct()
	{
		new DropDownSelection().SelectDropDownByIndex(product,0);
	}
	
	@FindBy(how=How.ID, using="fileUpload")
	@CacheLookup
	public WebElement fileupload;
	
	public void  ClickOnFileUpload()
	{
		new ClickOnWebElement().Clickonwebelement(fileupload);
	}
	
	@FindBy(how=How.ID, using="message")
	@CacheLookup
	public WebElement messagebody;
	
	public void  EnterDataOnMessageBody()
	{
		new EnterText().entertext(messagebody,"This is the best ecommerce practice automation site");
	}
	
	@FindBy(how=How.ID, using="submitMessage")
	@CacheLookup
	public WebElement sendbutton;
	
	public void  ClickOnSendButton()
	{
		new ClickOnWebElement().Clickonwebelement(sendbutton);
	}
	
	@FindBy(how=How.XPATH, using="//p[contains(text(),'Your message')]")
	@CacheLookup
	public WebElement contactusmessage;
	
	public void  VerfiyContactUsSuccessMessage()
	{
		new VerificationHelper().verifyTextEquals(contactusmessage,"Your message has been successfully sent to our team.");
	}

	
	
}
