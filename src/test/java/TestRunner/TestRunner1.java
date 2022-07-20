package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


/*import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features//Cucumber2.feature",
glue= {"stepdefinition"})
public class TestRunner1 {

}*/


@CucumberOptions(features="src//test//resources//Features1",
glue= {"stepdefinition"},
plugin = {"pretty","html:target/HTML_Reports.html","json:target/JSON_Reports/json_report.json",
		"junit:target/JUNIT_Reports/junit_report.xml"}, monochrome = true)

public class TestRunner1 extends AbstractTestNGCucumberTests 
{

}