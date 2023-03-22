Feature: Iniciar sesion de forma exitosa en la pagina Guru99
  Yo como aprendiz de sophos academy
  Necesito inciar sesión la página de guru
  Para validar que el mensaje de bienvenida sea correcto

  Scenario Outline: Iniciar sesion en Guru99
    Given Deseo ir a la pagina "Sauce Demo"
    When Ingresar las credenciales
      | user     | standard_user |
      | password | secret_sauce  |
    Then Validar que se pueda visualizar la pagina PRODUCTS
