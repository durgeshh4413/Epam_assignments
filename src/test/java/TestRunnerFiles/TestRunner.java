package TestRunnerFiles;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags = "@test", features = {"epam_onboarding_625745/src/test/java/feature"}, glue = {"StepDefinitions"},
plugin = {})

	public class TestRunner extends AbstractTestNGCucumberTests{
	
}

