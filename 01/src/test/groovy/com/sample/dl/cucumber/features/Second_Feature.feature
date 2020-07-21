Feature: Second feature

  Background: UI based testing
    Given I go to home page

  @steptest
  Scenario: As Admin user I am using BDD
    When I am at home page
    And I type valid search
    Then Home page is displayed properly

#  @smoketest
#  Scenario: As Admin user I am using BDD twice
#    Given I am at home page
#    When I type valid search
#    Then Home page is displayed properly
#
#  @smoketest
#  Scenario: As Guest user I am using BDD twice
#    Given I go to home page
#    When I am unable to type valid search
#    Then Home page is not displayed at the moment