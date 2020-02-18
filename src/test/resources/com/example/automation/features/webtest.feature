Feature: test

  Scenario: 1. Create a new account
    Given a new user to website "http://automationpractice.com/index.php"
    When the user clicks signin
    Then they see option to create a new account
    And  enters the details to register
    Then user is registered

  Scenario: 2. Login
    Given a new user to website "http://automationpractice.com/index.php"
    When the user clicks signin
    And user enters signin details
    Then user is logged in


#  Scenario: 3. Find the most expensive dress and add it to the cart
#  Scenario: 4. Log out and back in again, ensuring the dress is still in the cart