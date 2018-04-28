package com.cucumber.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.helper.assertionHelper.VerificationHelper;
import com.cucumber.framework.helper.generaloperations.ClickOnWebElement;

public class OrderHistoryPage {

	public WebDriver driver;
	public OrderHistoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH, using="//a[contains(@href,'http://automationpractice.com/index.php?controller=pdf-invoice&id_order=42003')]")
	@CacheLookup
	public WebElement pdflink;
	
	public void ClickOnPDFFileDownloadLink()
	{
	    new ClickOnWebElement().Clickonwebelement(pdflink);
	}
}
