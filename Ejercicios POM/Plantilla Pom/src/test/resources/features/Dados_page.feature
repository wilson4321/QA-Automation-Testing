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
Feature: Jugar en pagina de dados
  I want to use this template for my feature file

  @tag1
  Scenario: Jugar con dados
    Given Dado que me encuentro en la pagina de jugar dados "Pagina inicial"
    When Realizo roll con la cantidad deseada
      | type   | 0 |
      | number | 5 |
    Then Valido el mensaje de correct "correct" 
