Feature: Verify Error message

  Scenario: Invalid username
    Given user is on test login page
    When user enters invalid username and valid password
    And user clicks on login button
    Then verify invalid username error message 

    	
  Scenario: Invalid password
    Given user is on test login page
    When user enters valid username and invalid password
    And user clicks on login button
    Then verify invalid password error message 
