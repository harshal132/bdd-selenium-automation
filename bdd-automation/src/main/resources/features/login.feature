@SmokeTests
Feature: Login feature
  # Gherkin comments
  @Tag1
  Scenario: As a user, I should be able to login with valid credentials
    Given User is on login page
    When User enters valid credentials
    And Clicks on login button
    Then User navigated to homepage of website

  @Tag2
  Scenario: As a user, I should not be able to login with invalid credentials
    Given User is on login page
    When User enters invalid credentials
    And Clicks on login button
    Then Error message displayed on login screen

  # If you need examples you have to use scenario outline
  @Tag3
  Scenario Outline: As a user, I should be able to login with valid credentials
    Given User is on login page
    When User enters valid <username> and <password>
    And Clicks on login button
    Then User is navigated to <page>
    Then Verify number <value>

    Examples:
      | username | password | page    | value |
      | user1    | pass1    | web     | 10    |
      | user2    | pass2    | address | 20    |
      | user3    |          | blah    | 30    |
      # we can use empty for null value