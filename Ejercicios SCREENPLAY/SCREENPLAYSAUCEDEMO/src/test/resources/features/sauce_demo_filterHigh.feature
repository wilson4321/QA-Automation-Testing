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
Feature: Apply high to low price filter option to invetory products

  Background: 
    Given Get into the page sauce demo "Sauce Demo Login"
    When Enter login credentials
    Then Validate message into the products page "Products"

  @tag1
  Scenario: Select high to low price filter option into products page
    Given Get into the page products "Sauce Demo Inventory"
    When Select filter option high to low "Price (high to low)"
    Then Print list of products prices ordered high to low in the console

  
