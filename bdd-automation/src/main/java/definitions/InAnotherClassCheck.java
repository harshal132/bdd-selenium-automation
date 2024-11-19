package definitions;

import io.cucumber.java.en.When;

public class InAnotherClassCheck {
    @When("User enters valid credentials")
    public void userEntersValidCredentials() {
        System.out.println("User enters valid credentials - ANOTHER CLASS");
    }
}
