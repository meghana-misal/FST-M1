@activity5
Feature: Login Test


  Scenario Outline: Testing Login with Example
    Given User is on Login page
    When User enters "<Usernames>" and "<passwords>"
    Then Read the page title and confirmation message
    And Close the Browser
    Examples:
      | Usernames | passwords |
      | admin     | password  |
      | adminUser | Password  |