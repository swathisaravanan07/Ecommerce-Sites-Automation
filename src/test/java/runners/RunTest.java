package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/feature",  // Path to feature files
    glue = "steps",                            // Path to step definitions
    plugin = {"pretty", "html:target/cucumber-reports.html"}, // Reports
    monochrome = true,                         // Clean console output
    dryRun = false                             // Set to true to check step mapping
)
public class RunTest {
}

