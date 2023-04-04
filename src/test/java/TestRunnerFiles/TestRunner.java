package TestRunnerFiles;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags = "@test", features = "src/test/java/feature", glue = {"StepDefinitions"},
plugin = {"html:target/cucumber-report.html", "pretty"})

	public class TestRunner extends AbstractTestNGCucumberTests{
	
}

