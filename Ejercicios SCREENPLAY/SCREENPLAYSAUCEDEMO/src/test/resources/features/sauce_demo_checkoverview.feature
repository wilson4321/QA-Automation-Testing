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
Feature: Check bill
  I want to check my purchase

  Background:
  
  #Ingreso a la pagina
    Given Get into the page sauce demo "Sauce Demo Login"
    When Enter login credentials
    Then Validate message into the products page "Products"

#Selecciono un filtro

   Given User get into the page products "Sauce Demo Inventory"
    When User select filter option high to low "Price (low to high)"
    Then Print list of products prices ordered low to High in the console
    
    #Agrego dos elementos
    When Add to the cart two products

#Informacion de envio
    Given Get into the page checkout:Information "Sauce Demo Checkout Information"
    When Enter personal information into de form "Desirae" and "Zimmerman" and "578986"
    Then Validate title of the CheckOverview page

#checkOverview y chqueo pagina final
  @tag1
  Scenario: Check purchase details
    Given Be on the page checkout:Overview "Sauce Demo Checkout Overview"
    When Check the selected products
    Then check payment information and finalize the purchase "Thank you for your order!"
