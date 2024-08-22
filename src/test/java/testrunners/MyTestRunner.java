package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = {"src/test/resources/apfeatures"},
glue = {"stepdefinitions", "apphooks"},
plugin = {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags = ""

)

public class MyTestRunner extends AbstractTestNGCucumberTests {
	
	

}
