Feature: Verify Login functionality

  Scenario Outline: Positive LogIn test
    Given user is on test login page
    When user enters <username> and <password>
    And user clicks on login button
    Then verify user is navigated to correct url
    And verify new page contains expected text
    And verify button Log out is displayed on the new page

   Examples:
   	|username|password|
   	|student|Password123|