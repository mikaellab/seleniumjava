Feature: login

  Scenario Outline: check login funtionality
    Given user navigated to the page
    When user enters <username> and <password>
    And clicks on Login button
    Then page should display proper message

    Examples: 
      | username | password |
      | kharl    |    12345 |
      | kendrick |    12345 |
