package com.cucumber.framework.helper.assertionHelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.cucumber.framework.helper.Logger.LoggerHelper;

public class VerificationHelper {
	private static final  Logger log = LoggerHelper.getLogger(VerificationHelper.class);
	
	public boolean verifyTextEquals( WebElement element,String expectedText) {
		boolean flag=false;
		try {
			String actualText=element.getText();
			if(actualText.equals(expectedText)) {
				log.info("actualText is :"+actualText+" expected text is: "+expectedText);
				return flag=true;
			}
			else {
				log.error("actualText is :"+actualText+" expected text is: "+expectedText);
				return flag;
			}
		}
		catch(Exception e) {
			log.error(e.getMessage());
			return flag;
		}
		
	}
}
