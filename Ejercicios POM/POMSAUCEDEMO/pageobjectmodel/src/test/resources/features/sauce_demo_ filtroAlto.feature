@tag
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given Deseo ir a la pagina "Sauce Demo"
    When Ingresar las credenciales
      | user     | standard_user |
      | password | secret_sauce  |
    Then Validar que se pueda visualizar la pagina PRODUCTS

  @tag1
  Scenario: Filtrar productos por precio de mayor a menor
    Given The user have been sign up in the page inventory "Sauce Inventory"
    When Seleccionar el filtro precio mas alto a mas bajo
      | filtro | Price (high to low) |
    Then Validar que se ordenen los productos disponibles del precio mas bajo al mas alto