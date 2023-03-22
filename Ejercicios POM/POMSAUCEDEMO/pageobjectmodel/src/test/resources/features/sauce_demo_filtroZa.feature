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
Feature: Ingreso y escojo filtro Z a la A
  Quiero visualizar los elementos del filto Z-A
Background:
    Given Deseo ir a la pagina "Sauce Demo"
    When Ingresar las credenciales
      | user     | standard_user |
      | password | secret_sauce  |
    Then Validar que se pueda visualizar la pagina PRODUCTS

  @tag1
  Scenario: Estoy en el filtro de la Z a la A
    Given El usuario debe estar en la pagina inventory "Sauce Inventory"
    When Seleccionar filtro Z a la A
    |filtro|Name (Z to A)|
    Then I validate the outcomes


