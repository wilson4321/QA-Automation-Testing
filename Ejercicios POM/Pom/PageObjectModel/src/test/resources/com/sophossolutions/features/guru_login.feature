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
Feature: Login intro Guru page
  Yo como automatizador voy a probar el logueo de usuarios en la pagina guru.

  @tag1
  Scenario: Title of your scenario
    Given El usuario debe estar en la pagina guru99 <url>
    When Ingresa credenciales <user> y se autentica <password>
    Then Y valida el mensaje de la pagina Home <validacion>


   Examples:   
  |                 url         |      user   |password |       validacion       |
  |"https://demo.guru99.com/V4/"|"mngr480423n"|"emumYju"|"Manger Id : mngr480423"|
