#language:es

  Característica: Compra de productos
    Yo como usuario de saucedemo
    Quiero agregar productos al carrito
    Para realizar la compra de estos

    Antecedentes:
      Dado que el usuario se encuentra en la pagina
      Cuando el usuario ingrese sus credenciales

    Escenario: login exitoso
      Entonces el usuario deberia entrar el ecomerce

    Escenario:  Comprar producto
      Cuando  el usuario agrega el producto al carrito
      Y realiza el checkout de la compra
      Entonces  el deberia realizar una compra exitosa
