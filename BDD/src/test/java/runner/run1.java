package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="features",glue="steps",plugin = { "pretty", 
		                                                      "json:target/cucumber-report.json",
		                                                       "html:target/cucumber-reports.html"})

public class run1 extends AbstractTestNGCucumberTests {

}
