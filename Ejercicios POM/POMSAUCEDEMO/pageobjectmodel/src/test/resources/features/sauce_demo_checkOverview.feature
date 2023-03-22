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
Feature: Title of your feature
  I want to use this template for my feature file

 Background: 
 #Realizar login
    Given Deseo ir a la pagina "Sauce Demo"
    When Ingresar las credenciales
      | user     | standard_user |
      | password | secret_sauce  |
    Then Validar que se pueda visualizar la pagina PRODUCTS
 
 #Selecciono un filtro
    Given El usuario debe estar en la pagina inventory "Sauce Inventory"
    When Seleccionar filtro Z a la A
    |filtro|Name (Z to A)|
    Then I validate the outcomes
 
    
# Seleccionar productos y agregar al carrito de compra
    When Agregar al carrito de compra dos productos
    Then Pasar a la pagina Sauce Checkout
    
#Diligenciar datos de entrega
    Given El usuario ingresa a la pagina  "Sauce Checkout Information"
    When Diligencia el formulario con los datos personales requeridos
      | firsName   | Desirae   |
      | lastName   | Zimmerman |
      | postalCode |    578986 |
    Then Visualiza que su informacion sea enviada correctamente al oprimir el boton
    
#Chequear informacion de precios y pagina final    
    @tag1
  Scenario: Chequear Info de la compra
    Given El usuario se encuentra en la pagina "Sauce Checkout Overview"
    When Verifica sus productos seleccionados
    Then Observa su informacion de pago y finaliza compra "Thank you for your order!"
    