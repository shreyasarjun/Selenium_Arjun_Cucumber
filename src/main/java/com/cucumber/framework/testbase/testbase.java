package com.cucumber.framework.testbase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.cucumber.framework.Browser.BrowserChoice;
import com.cucumber.framework.Browser.BrowserSelection;
import com.cucumber.framework.helper.ConfigSettings.ConfigurationReader;
import com.cucumber.framework.helper.ConfigSettings.PropFileReading;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.generaloperations.MouseMoveOver;
import com.cucumber.framework.helper.generaloperations.Wait;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class testbase {
	
	private static final Logger log = LoggerHelper.getLogger(testbase.class);
	public static WebDriver driver;
	//public static String browser=null;
	
	public static   void Broswer_Initialization()
	{
		ConfigurationReader obj=new PropFileReading();
		BrowserChoice browser=obj.getBrowser();
	    switch(browser)
	    {
	    
	    case Chrome:
	    	System.out.println("Selected Browser "+browser); 
	    	new BrowserSelection().ChromeBrwoser();
	    	break;
	    	
	    case Firefox:
	    	System.out.println("Selected Browser "+browser); 
	    	new BrowserSelection().FirefoxBrowser();
	    	break;
	    	
	    case InternetExplorer:
	    	System.out.println("Selected Browser "+browser);
	    	new BrowserSelection().InternetExplorerBrowser();
	    	break;
	    	
	    default: 
	    	System.out.println("Wrong Broswer Selected");
	    
	    }
	}
	

	

	
	

}
