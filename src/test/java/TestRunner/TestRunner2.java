package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//resources//Features",
glue= {"stepdefinition"},
plugin= {"pretty","html:target/HTML_Reports.html","json:target/JSON_Reports/json_report.json",
		"junit:target/JUNIT_Reports/junit_report.xml"}, monochrome = true)



public class TestRunner2 extends AbstractTestNGCucumberTests {

}
