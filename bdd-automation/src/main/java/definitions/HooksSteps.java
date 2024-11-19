package definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HooksSteps {
    // Provide tag name to run methods before specific tag -> @Before(value = "@tagName")
    @Before
    public void scenarioSetupHook(){
        // Called before each scenario
        System.out.println("---Scenario Setup Method Called---");
    }

    @After
    public void scenarioTearDownHook(){
        // Called after each scenario
        System.out.println("---Scenario Tear Down Method Called---");
    }

    @BeforeStep()
    public void stepSetupHook(){
        // Executes before every step
        System.out.println("---Step Setup Hook Method Called---");
    }
    @AfterStep
    public void stepTearDownHook(){
        // Executes after every step
        System.out.println("---Step TearDown Hook Method Called---");
    }

    @Given("User is on homepage")
    public void userIsOnHomepage() {
        System.out.println("User is on home page");
    }

    @And("User search for product")
    public void userSearchForProduct() {
        System.out.println("User search for product");
    }

    @And("User clicks search button")
    public void userClicksSearchButton() {
        System.out.println("User clicks search button");
    }

    @Then("User is navigated on Search page")
    public void userIsNavigatedOnSearchPage() {
        System.out.println("User is navigated on Search page");
    }
}
