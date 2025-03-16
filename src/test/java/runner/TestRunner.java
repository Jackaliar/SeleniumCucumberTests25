package runner;

//import cucumber.api.junit.Cucumber;
//import cucumber.api.CucumberOptions;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utility", "stepDefinition"},
        //plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"}
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}
        //tags = "@Regression or @Functional"
        //, dryRun = true; verify compilation of step def & feature files
)

public class TestRunner {



}
