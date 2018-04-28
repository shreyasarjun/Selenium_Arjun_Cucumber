package com.cucumber.framework.stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.cucumber.framework.helper.ConfigSettings.ConfigurationReader;

import com.cucumber.framework.helper.ConfigSettings.PropFileReading;

public class Dummy {
	
	@Test
	public void simple() throws InterruptedException, IOException, AWTException
	{
	
ConfigurationReader obj=new PropFileReading();
	System.out.println(obj.getChromeDriverPath());
	System.out.println(obj.getBrowser());
//		System.setProperty("webdriver.chrome.driver","C:\\Cucumber\\PracticeBDDCucumber\\src\\main\\resources\\drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		Robot robot=new Robot();
//		driver.manage().window().maximize();
//		driver.get("http://automationpractice.com/index.php?id_product=2&controller=product&search_query=BLOUSE&results=1");
//	     Thread.sleep(3000);
//	     WebElement element=driver.findElement(By.linkText("Print"));
//	     System.out.println("Before Click");
//	     try
//	     {
//	     element.click();
//	     }
//	     catch(Exception e)
//	     {
//	    	 System.out.println(e.getMessage());
//	     }
//	     robot.keyPress(KeyEvent.VK_ACCEPT);
//	     System.out.println("After Click");
//	     Thread.sleep(3000);
	}

}
