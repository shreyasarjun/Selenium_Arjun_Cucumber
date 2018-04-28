package com.cucumber.framework.helper.generaloperations;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.generaloperations.ClickOnWebElement;

public class EnterText {
	
	private static final Logger log = LoggerHelper.getLogger(EnterText.class);
	public void entertext(WebElement element,String data)
	{
		try
		{
			element.sendKeys(data);
			log.info("Sendkeys Enetered data as: "+data);
		}
		catch(Exception e)
		{
			log.error("entertext error message is: "+e.getMessage());
		}
	}

}
