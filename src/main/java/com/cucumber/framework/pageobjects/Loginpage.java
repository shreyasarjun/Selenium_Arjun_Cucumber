package com.cucumber.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import com.cucumber.framework.helper.generaloperations.ClickOnWebElement;
import com.cucumber.framework.helper.generaloperations.Wait;

public class Loginpage {
	
	public WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.NAME, using="email")
	@CacheLookup
	public WebElement email;
	
	public void EnterUsername(String emailaddress)
	{
		//Wait.ExplicitWait(driver, email);
		new com.cucumber.framework.helper.generaloperations.EnterText().entertext(email, emailaddress);
	}
	
	@FindBy(how=How.ID, using="passwd")
	@CacheLookup
	public WebElement passwd ;
	
	public void EnterPassword(String password)
	{
		//Wait.ExplicitWait(driver, passwd);
		new com.cucumber.framework.helper.generaloperations.EnterText().entertext(passwd, password);
	}
	
	@FindBy(how=How.XPATH, using="//*[@name='SubmitLogin']")
	@CacheLookup
	public WebElement signinbutton;
	
	public void ClickOnSignButton()
	{
		//Wait.ExplicitWait(driver, signinbutton);
		new ClickOnWebElement().Clickonwebelement(signinbutton);
	}

	public void Login(String emailaddress,String password)
	{
		new Homepage(driver).ClickOnSignLink();
		EnterUsername(emailaddress);
		EnterPassword(password);
		ClickOnSignButton();
	}
	
}
