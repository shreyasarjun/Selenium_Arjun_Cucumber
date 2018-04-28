package com.cucumber.framework.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.generaloperations.ClickOnWebElement;
import com.cucumber.framework.helper.generaloperations.Wait;
import com.cucumber.framework.stepdefinitions.OrderProduct;
import com.cucumber.framework.testbase.testbase;

public class ProductDetailsPage {
	private final Logger log = LoggerHelper.getLogger(ProductDetailsPage.class);
	public WebDriver driver;
	public ProductDetailsPage(WebDriver driver)
	{    
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH, using=".//*[@id='add_to_cart']/button")
	@CacheLookup
	public WebElement addcartbutton;
	
	public void  ClickOnAddToCartButton()
	{
		Wait.Static_Wait(3);
		Wait.ExplicitWait(driver, addcartbutton);
		new ClickOnWebElement().Clickonwebelement(addcartbutton);
	}
	
	@FindBy(how=How.XPATH, using="//button[@class='btn btn-default btn-facebook']")
	@CacheLookup
	public WebElement FShare;
	
	public void  ClickOnFShareButton()
	{
		//Wait.ExplicitWait(driver, FShare);
		new ClickOnWebElement().Clickonwebelement(FShare);
	}
	
	@FindBy(how=How.XPATH, using="//button[@class='btn btn-default btn-pinterest']")
	@CacheLookup
	public WebElement Pinterest;
	
	public void  ClickOnPinterestButton()
	{
		//Wait.ExplicitWait(driver, Pinterest);
		new ClickOnWebElement().Clickonwebelement(Pinterest);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Write a review")
	@CacheLookup
	public WebElement reviewlink;
	
	public void  ClickOnWriteAReviewLink()
	{
		//Wait.ExplicitWait(driver, Pinterest);
		new ClickOnWebElement().Clickonwebelement(reviewlink);
	}
	

	

	


}
