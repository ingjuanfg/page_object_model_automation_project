# language:es

  Característica: Compra exitosa
  Yo como usuario deseo realizar una compra
  en la pagina

  Antecedentes: login exitoso
    Dado que un usuario desea ingresar ala pagina
    Cuando el usuario ingresa las credecenciales correctas
    Entonces puede ingresar a la pagina

  Esquema del escenario: : Compra exitosa
    Cuando el usuario desea comprar un <ARTICULO>
    Entonces el usuario puede ver su articulo en el carrito de compras
    Y el usuario ingresa sus datos para finalizar la compra
    Ejemplos:
    |ARTICULO|
    |Bolt T-Shirt  |
    |Backpack      |
    |Onesie        |
    |T-Shirt Red   |
