package com.cucumber.framework.Browser;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.internal.ElementScrollBehavior;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.cucumber.framework.helper.ConfigSettings.ConfigurationReader;
import com.cucumber.framework.helper.ConfigSettings.PropFileReading;
import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.testbase.testbase;


public class BrowserSelection {
	private static final Logger log = LoggerHelper.getLogger(BrowserSelection.class);
	ConfigurationReader obj=new PropFileReading();
	@SuppressWarnings("deprecation")
	public void ChromeBrwoser()
	{
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.prompt_for_download", true);
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", prefs);
		option.addArguments("start-maximized");
		DesiredCapabilities chrome = DesiredCapabilities.chrome();
		chrome.setJavascriptEnabled(true);
		chrome.setCapability(ChromeOptions.CAPABILITY, option);
		chrome.setCapability("pdfjs.disabled",false);
		System.setProperty("webdriver.chrome.driver",obj.getChromeDriverPath());
		testbase.driver=new ChromeDriver(chrome);
		testbase.driver.manage().window().maximize();
		testbase.driver.manage().deleteAllCookies();
		testbase.driver.get(obj.getURL());
		log.info("URL Opened "+obj.getURL());
	}
	
	@SuppressWarnings("deprecation")
	public void InternetExplorerBrowser()
	{
	
        DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
        cap.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
		cap.setCapability(InternetExplorerDriver.ELEMENT_SCROLL_BEHAVIOR,ElementScrollBehavior.BOTTOM);
		cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		//cap.setJavascriptEnabled(true);
		cap.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL,obj.getURL());
		System.setProperty("webdriver.ie.driver",obj.getIEDriverPath());
		testbase.driver=new InternetExplorerDriver(cap);
		log.info("URL Opened "+obj.getURL());
	}
	
	@SuppressWarnings("deprecation")
	public void FirefoxBrowser()
	{
		DesiredCapabilities firefox = DesiredCapabilities.firefox();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(true);
		firefox.setCapability(FirefoxDriver.PROFILE, profile);
		firefox.setCapability("marionette", true);
		System.setProperty("webdriver.gecko.driver",obj.getGeckoDriverPath());
		testbase.driver=new FirefoxDriver(firefox);
		testbase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		testbase.driver.get(obj.getURL());
		log.info("URL Opened "+obj.getURL());
	}

}
