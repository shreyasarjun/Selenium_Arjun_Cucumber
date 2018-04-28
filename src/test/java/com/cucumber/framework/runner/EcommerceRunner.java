package com.cucumber.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = { "classpath:feature/login.feature" }, 
		glue = {	"classpath:com.cucumber.framework.stepdefinitions" },
		tags={"@SEL"},
		plugin = {"html:target/cucumber-html-report"})
public class EcommerceRunner extends AbstractTestNGCucumberTests {

}
