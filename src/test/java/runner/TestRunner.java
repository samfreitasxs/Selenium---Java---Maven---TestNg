package runner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"StepDefinition", "utility" }, // Remova "src/test/java/" dos pacotes
        plugin = {"pretty","html:target/cucumber-html-report", "json:cucumber.json"}
)
public class TestRunner {
}
