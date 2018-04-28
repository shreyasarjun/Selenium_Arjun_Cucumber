package com.cucumber.framework.helper.generaloperations;

import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.cucumber.framework.helper.Logger.LoggerHelper;


public class ClickOnWebElement {
	
private static final Logger log = LoggerHelper.getLogger(ClickOnWebElement.class);
	
	public void Clickonwebelement(WebElement element) {  
		try
		{
	          element.click();
		}
		catch(Exception e)
		{
			log.info(element);
			log.error("Clickonwebelement error message is: "+e.getMessage());
		}
	}


}
