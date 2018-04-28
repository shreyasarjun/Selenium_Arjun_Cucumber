package com.cucumber.framework.helper.generaloperations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {
	
	public void SelectDropDownByVisibleText(WebElement element,String VisisbleText)
	{
		Select select=new Select(element);
		select.selectByVisibleText(VisisbleText);
	}
	
	public void SelectDropDownByValue(WebElement element,String Value)
	{
		Select select=new Select(element);
		select.selectByValue(Value);
	}
	
	public void SelectDropDownByIndex(WebElement element,int Index)
	{
		Select select=new Select(element);
		select.selectByIndex(Index);
	}

}
