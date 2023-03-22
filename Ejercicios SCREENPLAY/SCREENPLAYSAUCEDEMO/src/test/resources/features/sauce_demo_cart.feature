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
Feature: Add products to cart into the sauce demo page
  I want to add products to the cart and go to checkout page

Background: 
    Given Get into the page sauce demo "Sauce Demo Login"
    When Enter login credentials
    Then Validate message into the products page "Products"

  @tag1
  Scenario: Add products and go to checkout page
    Given Get into the page sauce demo inventory "Sauce Demo Inventory"
    When Add to the cart two products
    Then Go to "Checkout"

  
