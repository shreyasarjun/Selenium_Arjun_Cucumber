package com.cucumber.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:feature/OrderProduct.feature" }, glue = {
		"classpath:com.cucumber.framework.stepdefinitions" }, tags={"@KUSHALNAGAR"},plugin = {"html:target/cucumber-html-report"})
public class FunctionalTest extends AbstractTestNGCucumberTests {

}
