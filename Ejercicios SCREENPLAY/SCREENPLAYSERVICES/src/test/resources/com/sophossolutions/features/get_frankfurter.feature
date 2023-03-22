#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario outline
    Given the "actor" establish the base "frankfurter"
    When I check for the endpoint "Endpoint api"
    Then I verify the status code 200 and the info "Json schema frank"
      | amount |                      1.0 |
      | base   | EUR                      |
      | date   | 2023-03-13               |
      | rates  | [GBP:0.8837, USD:1.0706] |
    And prueba
