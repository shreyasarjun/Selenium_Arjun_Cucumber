package com.cucumber.framework.helper.generaloperations;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cucumber.framework.helper.Logger.LoggerHelper;

public class SwitchAlert {
	private final Logger log = LoggerHelper.getLogger(SwitchAlert.class);
	public void Switchalert(WebDriver driver)
	{
		try
		{
		driver.switchTo().alert();
		log.info("Switched to Alert");
		}
		catch(Exception e)
		{
			log.error("Alert Handling Error Message "+e.getMessage());
		}
	}

}
