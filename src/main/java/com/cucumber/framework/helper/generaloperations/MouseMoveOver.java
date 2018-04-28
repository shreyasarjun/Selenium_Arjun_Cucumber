package com.cucumber.framework.helper.generaloperations;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cucumber.framework.helper.Logger.LoggerHelper;

public class MouseMoveOver {
	private static final Logger log = LoggerHelper.getLogger(MouseMoveOver.class);
	public void mousemoveover(WebDriver driver,WebElement element)
	{
		try
		{
	      Actions action=new Actions(driver);
		  action.moveToElement(element).perform();
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		}
		catch(Exception e)
		{
			log.error(e.getMessage());
		}
	}

}
