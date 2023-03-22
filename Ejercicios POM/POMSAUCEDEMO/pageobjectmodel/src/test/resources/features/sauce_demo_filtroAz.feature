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
Feature: Filtrado de la A la Z
  Como automatizadores queremos ver que funcione el filtro A-Z
  
  Background:
    Given Deseo ir a la pagina "Sauce Demo"
    When Ingresar las credenciales
      | user     | standard_user |
      | password | secret_sauce  |
    Then Validar que se pueda visualizar la pagina PRODUCTS

  @tag1
  Scenario: Filtro A-Z
    Given El usuario deberia de estar en la pagina Inventory "Sauce Inventory"
    When El usuario selecciona la opcion de filtro A-Z
    |filtrado|Name (A to Z)|
    Then Ver el resultado en consola



