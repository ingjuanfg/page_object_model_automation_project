#language:es

  Característica: Envio de correo

    Antecedentes:
    Dado que estoy en el inicio de sesion de gmail
    Cuando digite mi usuario "pruebavalidacionch@gmail.com" y contrasena "123456prueba"

    Escenario: Prueba exitosa
    Y cree un nuevo correo para destinatario "pruebavalidacionch@gmail.com" asunto "Correo de Prueba" y cuerpo de mensaje "Texto de Prueba"
    Entonces el email debe ser enviado con exito