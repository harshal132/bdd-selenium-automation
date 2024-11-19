@SmokeTests
Feature: Login feature
  # Gherkin comments
  @Tag1
  Scenario: As a user, I should be able to login with valid credentials
    Given User is on login page
    When User enters valid credentials
    And Clicks on login button
    Then User is navigated to homepage

  @Tag2
  Scenario: As a user, I should not be able to login with invalid credentials
    Given User is on login page
    When User enters invalid credentials
    And Clicks on login button
    Then Error message displayed on login screen


  # If you need examples you have to use scenario outline

#  Scenario Outline: As a user, I should be able to login with valid credentials
#    Given User is on login page
#    When User enters valid <username> and <password>
#    And Clicks on login button
#    Then User is navigated to homepage
#
#    Examples:
#      | username | password |
#      | user1 | pass1 |
#      | user2 | pass2 |