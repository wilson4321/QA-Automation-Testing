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
Feature: Fill out personal information to finish the invoice generation associated with the order

  Background:
    Given Get into the page sauce demo "Sauce Demo Login"
    When Enter login credentials
    Then Validate message into the products page "Products"
    When Add to the cart two products

  @tag1
  Scenario: Fill out personal information about purchase with valid information
    Given Get into the page checkout:Information "Sauce Demo Checkout Information"
    When Enter personal information into de form "Desirae" and "Zimmerman" and "578986"
    Then Validate title of the CheckOverview page
