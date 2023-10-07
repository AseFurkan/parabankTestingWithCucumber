package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(

        tags = "@Accounts and @Smoke and @Regression",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}

)

public class US1_Runner extends AbstractTestNGCucumberTests {
}
