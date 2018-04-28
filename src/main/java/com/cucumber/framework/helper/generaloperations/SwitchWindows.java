package com.cucumber.framework.helper.generaloperations;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.pageobjects.FacebookPage;
import com.cucumber.framework.pageobjects.PinterestPage;
import com.cucumber.framework.stepdefinitions.ShareProductOnSocialMedia;
import com.cucumber.framework.testbase.testbase;

public class SwitchWindows {
	private final static Logger log = LoggerHelper.getLogger(ShareProductOnSocialMedia.class);
	String Title=null;
	WebDriver Newwindow;
	public String handle;
	public static String HomeWindow;
	public void switchwindows() 
	{   
		try
		{
		Set<String> windows=testbase.driver.getWindowHandles();
		for(String handle:windows)
		{
			log.info("Individual New Window Id: "+handle);
			Newwindow=testbase.driver.switchTo().window(handle);
			Title=Newwindow.getTitle();
			log.info("Title of Window: "+Title);
			Newwindow.manage().window().maximize();
			SwitchOperations();
		}
		}
		catch(Exception e)
		{
			log.error("Switching between windows Error Message: "+e);
		}	
		finally
		{
			testbase.driver.switchTo().window(SwitchWindows.HomeWindow);
		}
		
	}
	public void ParentWindowID()
	{
		 HomeWindow=testbase.driver.getWindowHandle();
		log.info("HomeWindow Id: "+HomeWindow);
		
	}
	
	public void SwitchOperations() 
	{
		if (Title.equalsIgnoreCase("Blouse | Scooters"))
		{
			PinterestPage pinterestPage=new PinterestPage(testbase.driver);
			pinterestPage.EnterUsername();
			pinterestPage.EnterPassword();
			pinterestPage.ClickOnContiuneButton();
			Wait.Static_Wait(5);
			Newwindow.close();
        }
		else if(Title.equalsIgnoreCase("Facebook"))
		{
			FacebookPage facebookPage=new FacebookPage(testbase.driver);
			facebookPage.EnterUsername();
			facebookPage.EnterPassword();
			facebookPage.ClickOnLoginButton();
			Wait.Static_Wait(5);
			Newwindow.close();
		}
	}
	

}