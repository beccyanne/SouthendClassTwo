Feature: Homepage search

  Scenario: BBC Homepage loads
    Given I am on the BBC Homepage
    Then the BBC News banner is displayed

  Scenario: BBC Sport page loads
    Given I am on the BBC Homepage
    When I click the Sports page link
    Then The BBC Sports Page is displayed
    When I click the Golf link
    Then The Golf page is displayed