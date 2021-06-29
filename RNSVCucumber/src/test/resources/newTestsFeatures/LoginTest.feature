Feature: Login Functionality

  Scenario Outline: Verify logging into the application with valid account credentials
    Given I navigated to the application
    When I enter <username> and <password>
    And clicks login button
    Then I is navigated to the Home Page

    Examples: 
      | username | password |
      | Dev      | P@ssw0rd |
      | Dev      | P@ssword |
