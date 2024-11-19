package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = "definitions",
        monochrome = true,
        plugin = {"pretty","html:src/main/resources/reports/reports.html"},
        tags = "@Tag1")
public class TestRunnerWithTestNG  extends AbstractTestNGCucumberTests {

}
