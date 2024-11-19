@HooksTest
Feature: Testing hooks example
  Scenario: Testing hooks
    Given User is on homepage
    And User search for product
    And User clicks search button
    Then User is navigated on Search page
