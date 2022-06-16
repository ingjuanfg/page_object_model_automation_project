#language:es

Característica: Compra de productos
  Yo como usuario de Saucedemo
  Quiero agregar productos al carrito
  Para realizar la compra de estos

  Antecedentes: estar logueado en Saucedemo
    Dado que el usuario se encuentra logueado en la pagina

  Esquema del escenario: Hacer checkout de un <producto>
    Cuando el usuario agrega un <producto> al carrito
    Y realiza el checkout con su <nombre>, su <apellido> y su <codigoPostal>
    Ejemplos:
      | producto              | nombre | apellido | codigoPostal |
      | Sauce Labs Bike Light | Ana    | Leal     | 01010        |
      | Sauce Labs Onesie     | Pedro  | Lopez    | 03535        |