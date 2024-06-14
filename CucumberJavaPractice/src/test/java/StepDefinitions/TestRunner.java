package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/practicetestautomation_loginWithHooks_PF.feature",
		glue = "StepDefinitions",
		plugin = {"pretty", "html:target/HTMLReports",
							"json:target/JSONReports/jsonReport.json", 
							"junit:target/JUNITReports/junitReport.xml"}
		)

public class TestRunner {

}
