package com.cucumber.framework.helper.Logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cucumber.framework.helper.ConfigSettings.ConfigurationReader;

import com.cucumber.framework.helper.ConfigSettings.PropFileReading;



@SuppressWarnings("rawtypes")
public class LoggerHelper {

	private static boolean root = false;

	public static Logger getLogger(Class clas){
		ConfigurationReader obj=new PropFileReading();
		if (root) {
			return Logger.getLogger(clas);
		}
		PropertyConfigurator.configure(obj.getLog4jPropertieFilePath());
		root = true;
		return Logger.getLogger(clas);
	}
}
