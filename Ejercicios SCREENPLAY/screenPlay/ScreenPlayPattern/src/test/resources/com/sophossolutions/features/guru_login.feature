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
Feature: Login into Guru page
  I want to probe the login into Guru99

  @tag1
  Scenario: Guru99 Login
    Given The user would be in Guru99 login page "Guru99 Login Page"
    When User enters the credentials "mngr480423n" and password "emumYju"
    Then Validates Home message "Manger Id : mngr480423"
