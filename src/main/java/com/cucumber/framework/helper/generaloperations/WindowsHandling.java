package com.cucumber.framework.helper.generaloperations;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowsHandling {
	
	public void Windowshandling(WebDriver driver)
	{
		
		String CurrentWindow=driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String NewWindow : allWindowHandles) {
			if (!NewWindow.equals(CurrentWindow)) {
				driver.switchTo().window(NewWindow);
				driver.close();
			}
		}
	}

}
