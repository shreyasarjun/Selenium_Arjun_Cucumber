package com.cucumber.framework.helper.generaloperations;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.framework.helper.Logger.LoggerHelper;

public class Wait {
	private final static Logger log = LoggerHelper.getLogger(Wait.class);
	public static void Static_Wait(int seconds)
	{
		try
		{
			TimeUnit.SECONDS.sleep(seconds);
			log.info("Waiting for "+seconds+" Seconds");
		} 
		catch (Exception e) 
		{
			log.error("Exception in wait: "+e.getMessage());
		}

	}
	
	public static void ImplicitlyWait(WebDriver driver,int seconds)
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
			log.info("ImplicitlyWait invoked");
		}
		catch(Exception e)
		{
			log.error("ImplicitlyWait Error Message: "+e.getMessage());
		}
	}
	
	public static void ExplicitWait(WebDriver driver,WebElement element)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(element));
			log.info("ExplicitWait invoked for element: "+element);
		}
		catch(Exception e)
		{
			log.error("ExplicitWait Error Message: "+e.getMessage());
		}
	}

}
