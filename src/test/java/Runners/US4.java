package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Accounts and @SmokeTest and @Regression",
        features = {"src/test/java/FeatureFiles/_US4_.feature"},
        glue = {"StepDefinitions"}
)
public class US4 extends AbstractTestNGCucumberTests {
}