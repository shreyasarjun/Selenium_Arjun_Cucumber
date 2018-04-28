package com.cucumber.framework.helper.generaloperations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotFunction {
	
	
	public void Enter() throws AWTException
	{
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		Wait.Static_Wait(1);
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}
