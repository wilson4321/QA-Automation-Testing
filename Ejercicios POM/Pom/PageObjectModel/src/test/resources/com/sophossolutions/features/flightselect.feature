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
Feature: seleccionar opcion flight
  Yo como automatizador voy a probar la seleccion de la opcion flight.

#Con el background puedo unir mi automatizacion anterior.
  Background: 
    Given El usuario debe estar en la pagina Mecury Tour "https://demo.guru99.com/test/newtours/"
    When Ingresa credenciales y se autentica el user "wilsonaraquer" y password "wilson2023"
    Then valida el mensaje de la pagina Home "Login Successfully"

  @tag1
  Scenario: Reserva de vuelo
    Given El usuario esta en la seccion de Flights "New Tours Flight Page"
    When Ingresa los datos solicitados
      | type          | roundtrip       |
      | passenger     |               3 |
      | departingFrom | Paris           |
      | onMonth       | March           |
      | onDay         |              20 |
      | arriving      | Zurich          |
      | returning     | November        |
      | returningDay  |              11 |
      | serviceClass  | First           |
      | airline       | Pangea Airlines |
    Then Valida que esta en la seccion Reserva finalizada "After flight finder - No Seats Avaialble "
