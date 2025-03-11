package runner;

//import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utility", "stepDefinition"},
        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"}
        //, dryRun = true; verify compilation of step def & feature files
)

public class TestRunner {



}
