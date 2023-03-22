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
    Given Dado que "actor" estblece la base url "Go Rest"
    When Consulta el endpoint "endpoint"
    Then Validar que el status sea 200 y el schema "Json schema Gorest"
      | id     |                              997308 |
      | name   | Agnivesh Ahuja                      |
      | email  | agnivesh_ahuja@lindgren-murazik.biz |
      | gender | male                                |
      | status | active                              |
