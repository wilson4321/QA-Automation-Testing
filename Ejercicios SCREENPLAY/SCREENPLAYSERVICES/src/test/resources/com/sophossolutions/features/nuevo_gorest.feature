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
    Given Dado que "actor" establece la base url "Go Rest" del servicio
    When Consulta el endpoint "endpoint" y el id "id"
    Then Valida que el status sea 200 y que la respuesta contenga toda la información del usuario
      | id     |                          87763 |
      | name   | Aaratrika Nambeesan            |
      | email  | aaratrika_nambeesan@johnson.co |
      | gender | female                         |
      | status | inactive                       |
