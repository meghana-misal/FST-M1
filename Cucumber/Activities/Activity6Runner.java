package CucumberTests;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = {"stepdefinitions"},
        tags = "@activity5",
        //plugin = {"pretty"}, //This will print in the console.
       // plugin = {"html: test-reports"}, //This will create a new folder named test-reports.
        plugin = {"json: json-report.json"},//This will create a new file named json-report.json in test-reports folder
        monochrome = true
)

public class Activity6Runner {
}
