#language: es
@testLoginmystore
Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @testLogin
  Escenario: Iniciar sesión
    Dado que me encuentro en la página de login de MyStore
    Y selecciono Iniciar sesion
    Cuando inicio sesion con las credenciales usuario: "ackerman05@hotmail.com" y contraseña: "Sudametrica123***"
    #Entonces valido que debería aparecer el texto de "Products"
