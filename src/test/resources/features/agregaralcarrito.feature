# language: es
Característica: Agregar productos al carrito

  Antecedentes:
    Dado que estoy en la página de inicio de SauceDemo
    Cuando ingreso el usuario 'standard_user' y la contraseña 'secret_sauce'
    @agregaralcarrito
  Escenario: Agregar un producto al carrito
      Dado agrego el producto 'Sauce Labs Backpack' al carrito
      Cuando procedo a terminar el checkout
    Entonces  veremos la compra exitosa

