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

public class FacebookPage {
	
	public WebDriver driver;
	public FacebookPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID, using="email")
	@CacheLookup
	public WebElement fusername;
	
	public void EnterUsername()
	{
		new EnterText().entertext(fusername,"selenium@gmail.com");
	}
	
	@FindBy(how=How.ID, using="pass")
	@CacheLookup
	public WebElement fpassword;
	
	public void EnterPassword()
	{
		new EnterText().entertext(fpassword,"dummy");
	}
	@FindBy(how=How.NAME, using="login")
	@CacheLookup
	public WebElement flogin;
	
	public void ClickOnLoginButton()
	{
		new ClickOnWebElement().Clickonwebelement(flogin);
	}
	
	

}
