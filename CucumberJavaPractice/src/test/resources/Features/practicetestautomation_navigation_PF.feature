Feature: Verify page navigation

  Scenario: navigation to practice test login page
    Given Browser is open
    And user is on test page
    When user clicks on practice link
    And user clicks on test login page link
    Then verify user is navigated to correct url
    And verify new page contains expected text
