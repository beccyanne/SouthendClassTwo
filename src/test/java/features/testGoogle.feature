Feature: Homepage search

  Scenario: Valid search
    Given I am on the google homepage
    When I search for HMRC
    Then I see a list of results

  Scenario: Invalid search
    Given I am on the google homepage
    When I do an invalid search
    Then I see an error message

