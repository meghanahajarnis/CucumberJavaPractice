Feature: Verify Login functionality

  Scenario Outline: Negative LogIn test
    Given user is on test login page
    When user enters <username> and <password>
    And user clicks on login button
    Then verify error message is displayed
    And username and password field becomes blank

   Examples:
   	|username|password|
   	|incorrectUser|Password123|
   	|student|incorrectPassword|