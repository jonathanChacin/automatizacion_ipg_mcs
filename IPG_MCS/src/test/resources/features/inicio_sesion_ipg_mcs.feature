# language: es
# autor: Jonathan Chacin
# encoding: UTF-8

@InicioDeSesion
Característica: Realizar el inicio de sesion en la aplicacion IPG MCS
  Yo como usuario
  Quiero realizar el inicio de sesion en la aplicacion IPG MCS
  Para ingresar al sistema.

  Antecedentes: Ingreso a la aplicacion IPG MCS
    Dado que ingreso a la aplicacion IPG MCS

  @IncioSesionExitoso
  Escenario: Realizar inicio de sesion exitoso en IPG MCS
    Cuando inicio sesion
    Entonces verfico el inicio de sesion exitosa al visualizar el texto "Plataforma de pago de internet"

  @InicioSesionConCredencialesIncorrectas
  Esquema del escenario: Verificar que se muestre mensaje de error al intentar iniciar sesion con credenciales incorrectas
    Cuando inicio sesion con <usuario> y <contrasena>
    Entonces verifica el inicio de sesion fallida con mensaje <mensajeInicioSesionFallida>
    Ejemplos:
      |usuario|contrasena|mensajeInicioSesionFallida|
      |       |          |Fallo de autenticación.   |
      |ksant  |1111      |Fallo de autenticación.   |
      |ksant  |          |Fallo de autenticación.   |
      |       |1111      |Fallo de autenticación.   |