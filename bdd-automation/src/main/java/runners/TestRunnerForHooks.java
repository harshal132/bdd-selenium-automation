package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;

// features -> Provide path of directory where feature files are saved
// glue -> package name where the step definitions are available
// monochrome -> true/false -> not much difference

// plugin -> pretty to get reports
//    - html: html file path , junit: xml file path, json: json file path

// tags -> include tags which test cases to be included

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources/features/hookstest.feature"},
        glue = {"definitions"},
        // monochrome = true,
        plugin = {"pretty","html:src/main/resources/reports/reports.html"},
        tags = "@HooksTest")

public class TestRunnerForHooks {

}
