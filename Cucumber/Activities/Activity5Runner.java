package CucumberTests;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = {"stepdefinitions"},
        tags = "@activity5"
)
public class Activity5Runner {
}
