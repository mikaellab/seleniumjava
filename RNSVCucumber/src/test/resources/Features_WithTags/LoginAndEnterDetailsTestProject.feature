@mustRun
Feature: test login and test form functionality

  Scenario Outline: login with valid details
    Given user is on the Login Page
    When user enters <un> and <pw>
    And clicks on the Login button
    Then user is navigated to Test Form

    Examples: 
      | un       | pw    |
      | kyle     | 12345 |
      | kharl    | 12345 |
      | kendrick | 12345 |

  Scenario Outline: fill out test form
    Given user in on the Test Form
    When user selects <country>
    And enters <address>, <email>, <phone>
    And clicks Save Button
    Then user details should be saved
    When user clicks Logout button
    Then user is navigated to Login Page

    Examples: 
      | country    |
      | Austria    |
      | Afganistan |
      | Alaska     |

    Examples: 
      | address | email              | phone       |
      | Pasig   | 12345abc@gmail.com | 09084107740 |
      | Seoul   | 12345abc@gmail.com | 09084107740 |
      | Macau   | 12345abc@gmail.com | 09084107740 |
