# language: es
# autor: Angel Henriquez
# encoding: UTF-8

@EncontrarUsuariosApi
Característica: Realizar la busqueda usuarios API de un comercio en la aplicacion IPG MCS
  Yo como usuario
  Quiero realizar la busqueda de usuarios API de comercio en la apliacion IPG MCS
  Para poder gestionar las credenciales de los comercios.

  Antecedentes: Ingreso a la aplicacion IPG MCS
    Dado que ingreso a la aplicacion IPG MCS
    Cuando inicio sesion

  @EncontarUsuariosApiExitoso
  Esquema del escenario: Realizar busqueda de usuarios API exitoso en IPG MCS
    Cuando realizo la busqueda del comercio por <criterioDeBusqueda>
      |idTienda   |nombreLegal  |revendedor  |idTerminal   |idComercio  |fechaApertura  |
      |<idTienda> |<nombreLegal>|<revendedor>|<idTerminal> |<idComercio>|<fechaApertura>|
    Y selecciono encontrar usuarios API
    Entonces valido la informacion del usuario API encontrado
      |idTienda  |idUsuario  | fechaCreacion |
      |<idTienda>|<idUsuario>|<fechaCreacion>|
    Ejemplos:
      | criterioDeBusqueda| idTienda     | idUsuario                     | fechaCreacion   |
      | Tienda            | 811219376079 | 	WS811219376079._.CERT1PRUEBA |      3/08/2021  |






