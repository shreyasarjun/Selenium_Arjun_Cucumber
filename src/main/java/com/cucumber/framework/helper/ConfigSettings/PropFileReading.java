package com.cucumber.framework.helper.ConfigSettings;

import java.io.FileInputStream;
import java.util.Properties;

import com.cucumber.framework.Browser.BrowserChoice;




public class PropFileReading implements ConfigurationReader {
	
	public  Properties prop = null;

	public PropFileReading() {
		prop = new Properties();
		try 
		{
			FileInputStream fis=new FileInputStream("C:/Cucumber/PracticeBDDCucumber/src/main/resources/Config/config.properties");
			prop.load(fis);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public String getURL() {
		return prop.getProperty("URL");
	}

	public BrowserChoice getBrowser(){
		return  BrowserChoice.valueOf(prop.getProperty("Browser"));
	}
	public String getUsername() {
		return prop.getProperty("Username");
	}

	public String getPassword() {
		return prop.getProperty("Password");
	}

	public String getChromeDriverPath() {
		return prop.getProperty("ChromeDriverPath");
	}

	public String getGeckoDriverPath() {
		return prop.getProperty("GeckoDriverPath");
	}

	public String getIEDriverPath() {
		return prop.getProperty("IEDriverPath");
	}

	public String getLog4jPropertieFilePath() {
		return prop.getProperty("Log4jPropertieFilePath");
	}

	public String getAutoItExeFileUploadPath() {
		return prop.getProperty("AutoItExeFileUploadPath");
	}
	
	public String getAutoItExeFileDownloadPath() {
		return prop.getProperty("AutoItExeFileDownloadPath");
	}

}
