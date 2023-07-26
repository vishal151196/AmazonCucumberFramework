package TestRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\QA\\Selenium_workspace\\AmazonCucumberFramework\\src\\main\\java\\Features\\gift.feature", 
	glue = {"StepDefinitions"}, //attach stepdefinition
	plugin = {"pretty", "html:test-output.html"}, //html output
	dryRun = false, // to check correct mapping of feature and step defintions file
	monochrome = true //output comes in readable format

		)

public class MyRunner {

}
