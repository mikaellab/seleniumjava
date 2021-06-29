Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given user is in the Login Page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to Home Page
