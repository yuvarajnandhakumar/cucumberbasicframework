package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//src//test//resources//Flipakrt.feature",
		glue={"org.stepdefinition"},
		tags={"@login1"},
		dryRun=false,
		monochrome=true,
		plugin={"html:target","json:target/reports.json"}
		
		
		)

public class TestRunner {

}
