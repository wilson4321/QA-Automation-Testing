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
  Scenario: Title of your scenario
    Given Dado que "actor" establece la base url "Go Rest" del servicio
    When Consulta el endpoint "Go Rest endpoint" por medio de una peticion post
      | email  | wilson@araque.com |
      | name   | wilson            |
      | gender | male              |
      | status | active            |
    Then Validar que el status sea 201 y que el esquema sea el correcto "Json schema Gorest"
