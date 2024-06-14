Feature: Verify Login functionality

  Scenario Outline: Positive LogIn test
    Given user is on test login page
    When user enters valid <username> and <password>
    And user clicks on login button
    Then verify user is navigated to correct url
    And verify sucess page contains expected text
    And verify button Log out is displayed on the sucess page

   Examples:
   	|username|password|
   	|student|Password123|
   	
  Scenario Outline: Negative LogIn test
    Given user is on test login page
    When user enters invalid <username> and <password>
    And user clicks on login button
    Then verify error message is displayed
    And username and password field becomes blank

   Examples:
   	|username|password|
   	|incorrectUser|Password123|
   	|student|incorrectPassword|
   	|incorrectUser|incorrectPassword|
		| | |