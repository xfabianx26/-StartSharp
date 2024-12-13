



Feature: Login Validation and Dashboard Visibility
  As a user of StartSharp
  I want to enter my credentials
  So that I can log in and verify the Dashboard is visible

  Background:
    Given the user opens the StartSharp login page


  @successful
  Scenario: Successful login displays the Dashboard
    When the user enters their credentials
    Then the user validates that the credentials are correct
    And verifies that the Dashboard title is visible


  @failed
  Scenario: Unsuccessful login displays an error message
    When the user enters invalid credentials
    Then the user validates that an error message is displayed
