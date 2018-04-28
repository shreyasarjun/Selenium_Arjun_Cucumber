package com.cucumber.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.generaloperations.ClickOnWebElement;
import com.cucumber.framework.helper.generaloperations.EnterText;
import com.cucumber.framework.helper.generaloperations.Wait;

public class PinterestPage {
	
	public WebDriver driver;
	public PinterestPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH, using="//*[@name='id']")
	@CacheLookup
	public WebElement pusername;
	
	public void EnterUsername()
	{
		new EnterText().entertext(pusername,"qtp@gmail.com");
	}
	
	@FindBy(how=How.NAME, using="password")
	@CacheLookup
	public WebElement ppassword;
	
	public void EnterPassword()
	{
		new EnterText().entertext(ppassword,"dsdjj43423");
	}
	
	@FindBy(how=How.XPATH, using="//button[@class='red SignupButton active']")
	@CacheLookup
	public WebElement pcontiunebutton;
	
	public void ClickOnContiuneButton()
	{
		new ClickOnWebElement().Clickonwebelement(pcontiunebutton);
	}
	

}
