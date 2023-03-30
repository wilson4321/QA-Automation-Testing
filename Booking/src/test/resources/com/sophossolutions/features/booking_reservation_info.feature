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
Feature: Reserva en booking
  Quiero hacer una reserva en booking.com

  @tag2
  Scenario Outline: Reserva de habitacion
    Given Debo estar en la pagina de booking "Booking Home Page"
    When Ingreso los datos requeridos para reserva
      | destino      | <destino>      |
      | fechaIngreso | <fechaIngreso> |
      | fechaSalida  | <fechaSalida>  |
      | adultos      | <adultos>      |
      | niños        | <niños>        |
      | habitaciones | <habitaciones> |
    Then Valido la informacion de reserva con los filtros
      | filtro | <filtro> |

    Examples: 
      | destino   | fechaIngreso | fechaSalida  | adultos | niños | habitaciones | filtro |
      | Manizales | '2023-04-26' | '2023-05-03' |       3 | 2/2/4 |            2 |      1 |
      | Ibague    | '2023-05-31' | '2023-06-07' |       1 | 1/5   |            1 |      2 |
