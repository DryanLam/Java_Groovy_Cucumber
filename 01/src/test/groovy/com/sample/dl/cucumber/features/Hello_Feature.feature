@UI
Feature: Hello feature
  @steptest
  Scenario: As Admin user I am using BDD
    Given I go to home page
    And I am at home page
    When I type valid search
    Then Home page is displayed properly

  @smoketest
  Scenario: As Guest user I am using BDD
    Given I navigate to home page
    When I am unable to type valid search
    And I am not able to type valid search
    Then Home page is not displayed at the moment