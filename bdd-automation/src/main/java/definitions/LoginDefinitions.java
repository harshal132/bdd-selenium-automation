package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinitions {
    @Given("User is on login page")
    public void userIsOnLoginPage() {
        System.out.println("User is on login page");
    }

//    @When("User enters valid credentials")
//    public void userEntersValidCredentials() {
//        System.out.println("User enters valid credentials");
//    }

    @And("Clicks on login button")
    public void clicksOnLoginButton() {
        System.out.println("Clicks on login button");
    }

    @Then("User is navigated to homepage")
    public void userIsNavigatedToHomepage() {
        System.out.println("User is navigated to homepage");
    }

    @When("User enters invalid credentials")
    public void userEntersInvalidCredentials() {
        System.out.println("User enters invalid credentials");
    }

    @Then("Error message displayed on login screen")
    public void errorMessageDisplayedOnLoginScreen() {
        System.out.println("Error message displayed on login screen");
    }

    @When("User enters valid {} and {}")
    public void userEntersValidAnd(String userName, String password) {
        System.out.println("Username: "+userName);
        System.out.println("Password: "+password);
    }

    @Then("User is navigated to {}")
    public void userIsNavigatedTo(String page) {
        System.out.println("User is navigated to "+page);
    }

    @Then("Verify number {}")
    public void verifyNumber(int arg0) {
        arg0 = arg0 + 20;
        System.out.println(arg0);
    }
}
