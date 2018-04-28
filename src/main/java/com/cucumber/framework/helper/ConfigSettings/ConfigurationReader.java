package com.cucumber.framework.helper.ConfigSettings;

import com.cucumber.framework.Browser.BrowserChoice;

public interface ConfigurationReader {
	
	public String getURL();
	public BrowserChoice getBrowser();
	public String getUsername();
	public String getPassword();
	public String getChromeDriverPath();
	public String getGeckoDriverPath();
	public String getIEDriverPath();
	public String getLog4jPropertieFilePath();
	public String getAutoItExeFileUploadPath();
	public String getAutoItExeFileDownloadPath();

}
