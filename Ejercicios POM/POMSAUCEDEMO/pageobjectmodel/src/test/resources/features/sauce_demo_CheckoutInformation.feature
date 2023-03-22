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
  Scenario: Rellenar el formulario con la informacion detallada del cliente que realiza una compra
    Given El usuario ingresa a la pagina  "Sauce Checkout Information"
    When Diligencia el formulario con los datos personales requeridos
      | firsName   | Desirae   |
      | lastName   | Zimmerman |
      | postalCode |    578986 |
    Then Visualiza que su informacion sea enviada correctamente al oprimir el boton
