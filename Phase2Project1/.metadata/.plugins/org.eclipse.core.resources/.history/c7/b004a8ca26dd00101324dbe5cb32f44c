package TestRun;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"./Features/test.feature"},
	glue = {"StepDef", "Hooks"},
	dryRun=false,
	monochrome=true,
	tags="@E2E",
	plugin= {"pretty","html:target/Reports/sample-report.html"}
	
)

public class TestRunner {

}
