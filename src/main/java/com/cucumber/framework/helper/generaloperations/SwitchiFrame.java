package com.cucumber.framework.helper.generaloperations;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.cucumber.framework.helper.Logger.LoggerHelper;


public class SwitchiFrame {
	private final Logger log = LoggerHelper.getLogger(SwitchiFrame.class);
	public void Switchiframe(WebDriver driver)
	{
		try
		{
		driver.switchTo().frame(0);
		log.info("Switched to iFrame");
		}
		catch(Exception e)
		{
			log.error("Frame Handling Error Message "+e.getMessage());
		}
	}

}
