#language:es

Característica: Agregar al carrito
	Yo como usuario de Saucedemo
	Quiero agregar productos al carrito
	Para realizar la compra de estos

	Antecedentes:
		Dado que el usuario se encuentra en la pagina
		Cuando el usuario ingrese sus credenciales
			| usuario  | standard_user|
			| clave |secret_sauce|

	Esquema del escenario: realizar la compra en saucedemo
		Cuando el usuario agrega producto al carrito
		Y realiza el checkout de la compra
			| nombre   | apellido   | postal         |
			| <nombre> | <apellido> | <codigoPostal> |
		Entonces el usuario realiza una compra exitosa
		Ejemplos:
			| nombre | apellido | codigoPostal |
			| cesar  | castano  | 20007        |
			| Maria  | Lopez  | 67440007        |


