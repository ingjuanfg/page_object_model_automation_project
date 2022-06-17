#language:es

  Característica: Compra de productos
    Yo como usuario de Saucedemo
    Quiero agregar productos al carrito
    Para realizar la compra de estos

    Antecedentes:
      Dado que el usuario se encuentra en la pagina
      Cuando el usuario ingrese sus credenciales
      Entonces el usuario deberia ingresar al ecommerce

    Escenario: Comprar Producto
      Dado que el usuario selecciona el producto que desea comprar
      Cuando ingresa los datos para la factura
      Entonces el usuario deberia realizar la compra correctamente
