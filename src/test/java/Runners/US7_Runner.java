package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Contact and and @Regression",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)
public class US7_Runner extends AbstractTestNGCucumberTests {
}
