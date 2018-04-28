package com.cucumber.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.generaloperations.ClickOnWebElement;
import com.cucumber.framework.helper.generaloperations.EnterText;
import com.cucumber.framework.helper.generaloperations.MouseMoveOver;
import com.cucumber.framework.helper.generaloperations.Wait;

public class Homepage {
	
	public WebDriver driver;
	public Homepage(WebDriver driver)
	{    
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//@FindBy(how=How.LINK_TEXT, using="Sign in")
	@FindBy(how=How.XPATH, using="//a[@title='Log in to your customer account']")
	@CacheLookup
	public WebElement signin;
	
	public void  ClickOnSignLink()
	{
		//Wait.ExplicitWait(driver, signin);
		new ClickOnWebElement().Clickonwebelement(signin);
	}
	
	@FindBy(how=How.XPATH, using="//a[@title='Women']")
	@CacheLookup
	public WebElement womenmenu;
	
	public void  MouseMove()
	{
		//Wait.ExplicitWait(driver, womenmenu);
		new MouseMoveOver().mousemoveover(this.driver,womenmenu);
	}
	
	//a[contains(text(),'Casual Dresses')]
	@FindBy(how=How.XPATH, using="//*[@id='block_top_menu']//a[contains(text(),'Women')]/..//a[contains(text(),'Casual Dresses')]")
	@CacheLookup
	public WebElement casualdresses;
	
	public void  ClickonCasualDressesLink()
	{
		//Wait.ExplicitWait(driver, casualdresses);
		new ClickOnWebElement().Clickonwebelement(casualdresses);
	}
	
	@FindBy(how=How.ID, using="search_query_top")
	@CacheLookup
	public WebElement searchbox;
	
	public void  EnterSearchText(String text)
	{
		//Wait.ExplicitWait(driver, searchbox);
		new EnterText().entertext(searchbox, text);
	}
	
	@FindBy(how=How.NAME, using="submit_search")
	@CacheLookup
	public WebElement searchbutton;
	
	public void  ClickOnSubmitButton()
	{
		//Wait.ExplicitWait(driver, searchbutton);
		new ClickOnWebElement().Clickonwebelement(searchbutton);
	}
	
	
	@FindBy(how=How.LINK_TEXT, using="Contact us")
	@CacheLookup
	public WebElement contactus;
	
	public void  ClickOnContactUsLink()
	{
		new ClickOnWebElement().Clickonwebelement(contactus);
	}
	
	@FindBy(how=How.XPATH, using="//a[@title='View my customer account']")
	@CacheLookup
	public WebElement myaccountlink;
	
	public void  ClickOnMyAccountLink()
	{
		new ClickOnWebElement().Clickonwebelement(myaccountlink);
	}
}
