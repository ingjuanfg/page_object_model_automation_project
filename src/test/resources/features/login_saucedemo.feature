#language:es

  Característica: Compra de productos
    Yo como usuario de Saucedemo
    Quiero agregar productos al carrito
    Para realizar la compra de estos

    Antecedentes:
      Dado que el usuario se encuentra en la pagina
      Cuando el usuario ingrese sus credenciales

    Escenario: Login exitoso
      Entonces el usuario deberia ingresar al ecommerce

    Escenario: Realizar la compra de un producto
      Cuando el usuario agrega el producto al carrito
      Y realiza checkout de la compra
      Entonces el deberia realizar una compra exitosa

