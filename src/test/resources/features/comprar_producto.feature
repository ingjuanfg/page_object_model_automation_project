#language:es

Característica: Compra de productos
  Yo como usuario de Saucedemo
  Quiero comprar un productos
  Para hacer uso de el

  Antecedentes:
    Dado que el usuario se encuentra en la pagina
    Cuando el usuario ingrese sus credenciales

  Escenario: Compra de producto
    Dado que el usuario agrega al carrito el producto Sauce Labs Backpack
    Cuando el usuario realice la compra
    Entonces el usuario deberia ver la compra exitosa