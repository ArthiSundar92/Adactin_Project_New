package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", 
glue = "com\\adactin\\stepdefinition",
monochrome = true,
dryRun = false,
strict = true,
tags = {"@Smoketest ","@Sanitytest"},
plugin = { "html:Reports/htmlreport",
			"pretty",
			"json:Reports/JSON_report.json"
}
)



public class Runner {
	
	public static WebDriver driver;

	@BeforeClass

	public static void setUp() {

		driver = Base_Class.getBrowser("chrome");

	}

	@AfterClass

	public static void tearDown() {

		Base_Class.close();

	}


	
	
}
