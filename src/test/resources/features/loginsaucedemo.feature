# language: es

Característica: Login a SauceDemo

  Escenario: Iniciar sesión exitosamente
    Dado que estoy en la página de inicio de SauceDemo
    Cuando ingreso el usuario 'standard_user' y la contraseña 'secret_sauce'
    Entonces debería ver la página de productos
