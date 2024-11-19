package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundSteps {
    @Given("User does this")
    public void userDoesThis() {
        System.out.println("User does this");
    }

    @And("User does that")
    public void userDoesThat() {
        System.out.println("User does that");
    }

    @When("User does another thing")
    public void userDoesAnotherThing() {
        System.out.println("User does another thing");
    }

    @And("User repeat it again")
    public void userRepeatItAgain() {
        System.out.println("User repeat it again");
    }

    @Then("Remove user")
    public void removeUser() {
        System.out.println("Remove user");
    }
}
