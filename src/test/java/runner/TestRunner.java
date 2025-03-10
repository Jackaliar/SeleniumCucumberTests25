package runner;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"src/test/java/utility", "src/test/java/stepDefinition"},
        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"}
        //, dryRun = true; verify compilation of step def & feature files
)

public class TestRunner {



}
