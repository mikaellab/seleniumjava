Feature: feature to test register functionality

  Scenario Outline: check the register fuctionality by filling account details on the fields
    Given navigate to the URL
    When user is on the home page
    And user clicks My Account dropmenu
    And selects Register
    Then user is navigated to Register Page
    When user enters new account <firstname>, <lastname>, <email>, <telephone>, <password>, <confirmpassword>, on the fields
    And clicks on the Privacy Policy
    And clicks on the Submit button
    Then user is navigated on the Account Success Page and display proper <message>

    Examples: 
      | firstname | lastname | email                | telephone   | password | confirmpassword | message |
      | kendrick  | daile    | kendrick26@gmail.com | 09084107740 | pass123  | pass123         | Your Account Has Been Created! |
      | kharl     | deandrei | kharl08@gmail.com    | 09084107740 | pass123  | pass123         | Your Account Has Been Created! |
      
