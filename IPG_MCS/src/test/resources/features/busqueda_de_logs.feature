# language: es
# autor: Jose Santamaria
# encoding: UTF-8

@BusquedaDeLogsEnIPGMCS
Característica: Realizar la busqueda de logs en la aplicacion IPG MCS
  Yo como usuario
  Quiero realizar la busqueda de logs en la aplicacion IPG MCS
  Para verificar los logs generados

  Antecedentes: Ingreso a la aplicacion IPG MCS e inicio sesion
    Dado que ingreso a la aplicacion IPG MCS
    Cuando inicio sesion


@BusquedaExitosaDeLogs
Esquema del escenario: Realizar la busqueda exitosa de los logs en IPG MCS
  Cuando realizo la busqueda de logs en IPG MCS por <criteriosDeBusqueda>
    |fechaDesde  |fechaHasta  |idTienda  |idOrden  |
    |<fechaDesde>|<fechaHasta>|<idTienda>|<idOrden>|
  Entonces verifico que se muestre la <infoAVerificar> del comercio
  Ejemplos:
    |criteriosDeBusqueda|fechaDesde         |fechaHasta         |idTienda     |idOrden                                |infoAVerificar                                  |
    |idTienda           |01.08.2021 13:40:17|30.08.2021 17:40:17|8112000013768|                                       |STORE_ID=8112000013768                          |
    |idOrden            |01.08.2021 13:40:17|30.08.2021 17:40:17|8112000013768|VT-a3ad4b09-f461-42ca-a1d6-0df67a59bf4d|ORDER_ID=VT-a3ad4b09-f461-42ca-a1d6-0df67a59bf4d|

  @BusquedaDeLogsConDatosIncorrectos
  Esquema del escenario: Realizar la busqueda con datos incorrectos de los logs en IPG MCS
    Cuando realizo la busqueda de logs en IPG MCS por <criteriosDeBusqueda>
      |fechaDesde  |fechaHasta  |idTienda  |
      |<fechaDesde>|<fechaHasta>|<idTienda>|
    Entonces verifico que se muestre el <mensajeFormatoIncorrecto> de los campos
    Ejemplos:
      |criteriosDeBusqueda|fechaDesde         |fechaHasta         |idTienda     |mensajeFormatoIncorrecto              |
      |idTienda           |01.08.2021         |30.08.2021 17:40:17|8112000013768|La fecha no tiene el formato correcto.|
      |idTienda           |01.08.2021 13:40:17|30.08.2021         |8112000013768|La fecha no tiene el formato correcto.|
      |idTienda           |01.08.2021         |30.08.2021         |8112000013768|La fecha no tiene el formato correcto.\nLa fecha no tiene el formato correcto.|

@VerificacionDeCamposObligatoriosEnLaBusquedaDeLogs
Esquema del escenario: Verificar campos obligatorios en el formulario de busqueda de logs de IPG MCS
  Cuando realizo la busqueda de logs en IPG MCS por <criteriosDeBusqueda>
    |fechaDesde  |fechaHasta  |idTienda  |
    |<fechaDesde>|<fechaHasta>|<idTienda>|
  Entonces verifico que se muestre el <mensajeCampoObligatorio> notificando que existen campos obligatorios
  Ejemplos:
    |criteriosDeBusqueda|fechaDesde         |fechaHasta         |idTienda     |mensajeCampoObligatorio                     |
    |idTienda           |                   |30.08.2021 17:40:17|8112000013768|Se necesita un valor.                       |
    |idTienda           |01.08.2021 13:40:17|                   |8112000013768|Se necesita un valor.                       |
    |idTienda           |                   |                   |8112000013768|Se necesita un valor.\nSe necesita un valor.|
    |idTienda           |01.08.2021 13:40:17|30.08.2021 17:40:17|             | - Debe introducir un valor.                |


