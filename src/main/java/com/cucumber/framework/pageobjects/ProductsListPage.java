package com.cucumber.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.generaloperations.ClickOnWebElement;
import com.cucumber.framework.helper.generaloperations.MouseMoveOver;
import com.cucumber.framework.helper.generaloperations.Wait;

public class ProductsListPage {
	
	public WebDriver driver;
	public ProductsListPage(WebDriver driver)
	{    
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH, using="//img[@title='Printed Dress']")
	@CacheLookup
	public WebElement printeddress;
	
	public void  ClickOnPrintedDress()
	{
		//Wait.ExplicitWait(driver, printeddress);
		new ClickOnWebElement().Clickonwebelement(printeddress);
	}
	
	@FindBy(how=How.XPATH, using="//img[@title='Blouse']")
	@CacheLookup
	public WebElement Blouse;
	
	public void  MovetoElementBlouse()
	{
		//Wait.ExplicitWait(driver, Blouse);
		new MouseMoveOver().mousemoveover(driver, Blouse);
	}
	
	@FindBy(how=How.XPATH, using="//*[contains(text(),'More')]")
	@CacheLookup
	public WebElement more;
	
	public void  ClickOnMoreButton()
	{
		//Wait.ExplicitWait(driver, more);
		new ClickOnWebElement().Clickonwebelement(more);
	}

}
