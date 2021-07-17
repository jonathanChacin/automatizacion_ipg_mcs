# language: es
# autor: Jonathan Chacin
# encoding: UTF-8

@BusquedaDeComercioEnIPGMCS
Característica: Realizar la busqueda de comercio en la aplicacion IPG MCS
  Yo como usuario
  Quiero realizarla busqueda de comercio en la aplicacion IPG MCS
  Para obtener los datos de los comercios registrados.

  Antecedentes: Ingreso a la aplicacion IPG MCS e inicio sesion
    Dado que ingreso a la aplicacion IPG MCS
    Cuando inicio sesion

  @BusquedaExitosaDeComercio
  Esquema del escenario:  Realizar la busqueda de comercio
    Cuando realizo la busqueda del comercio por <criterioDeBusqueda>
      |idTienda   |nombreLegal  |revendedor  |idTerminal   |idComercio  |fechaApertura  |
      |<idTienda> |<nombreLegal>|<revendedor>|<idTerminal> |<idComercio>|<fechaApertura>|
    Entonces verifico que se muestre la informacion del comercio
    Ejemplos:
    |criterioDeBusqueda |idTienda     |nombreLegal        |revendedor  |idTerminal|idComercio  |fechaApertura |
    |Tienda             |8112000000529|La Casa del Medico |BANISTMO    |T0000529  |640000000529|04.05.2021    |
    |nombreLegal        |8112000000529|La Casa del Medico |BANISTMO    |T0000529  |640000000529|04.05.2021    |
    |Revendedor         |8112000000529|La Casa del Medico |BANISTMO    |T0000529  |640000000529|04.05.2021    |
    |Terminal           |8112000000529|La Casa del Medico |BANISTMO    |T0000529  |640000000529|04.05.2021    |
    |Comercio           |8112000000529|La Casa del Medico |BANISTMO    |T0000529  |640000000529|04.05.2021    |
    |fechaApertura      |8112001000018|Almacen Gallo PTY  |BANISTMO    |T1000018  |640001000018|06.04.2021    |

  @BusquedaDeComercioConDatosIncorrectos
  Esquema del escenario:  Verificar que no se muestre informacion del comercio al realizar la busqueda con datos incorrectos
    Cuando realizo la busqueda del comercio por <criterioDeBusqueda>
      |idTienda   |nombreLegal  |revendedor  |idTerminal   |idComercio  |fechaApertura  |
      |<idTienda> |<nombreLegal>|<revendedor>|<idTerminal> |<idComercio>|<fechaApertura>|
    Entonces verifico que se muestre el mensaje <mensajeComercioNoEncontrado> notificando que no se encontro el comercio buscado
    Ejemplos:
      |criterioDeBusqueda |idTienda     |nombreLegal        |revendedor  |idTerminal|idComercio  |fechaApertura |mensajeComercioNoEncontrado                                       |
      |Tienda             |7777777777777|XXXXXXXXXXXXXXXXXX |Un Banco    |Terminal  |640077777777|04.05.2019    |No se encontraron datos con los criterios de búsqueda selecionados|
      |nombreLegal        |7777777777777|XXXXXX  XXXXXXXXXX |Un Banco    |Terminal  |640077777777|04.05.2019    |No se encontraron datos con los criterios de búsqueda selecionados|
      |Revendedor         |7777777777777|XXXXXX  XXXXXXXXXX |Un Banco    |Terminal  |640077777777|04.05.2019    |No se encontraron datos con los criterios de búsqueda selecionados|
      |Terminal           |7777777777777|XXXXXX  XXXXXXXXXX |Un Banco    |Terminal  |640077777777|04.05.2019    |No se encontraron datos con los criterios de búsqueda selecionados|
      |Comercio           |7777777777777|XXXXXX  XXXXXXXXXX |Un Banco    |Terminal  |640077777777|04.05.2019    |No se encontraron datos con los criterios de búsqueda selecionados|
      |fechaApertura      |7777777777777|XXXXXX  XXXXXXXXXX |Un Banco    |Terminal  |640077777777|04.05.2019    |No se encontraron datos con los criterios de búsqueda selecionados|

  @BusquedaDeComercioConCamposVacios
  Esquema del escenario: Verificar que se muestre un mensaje al intentar buscar un comercio dejando los campos del formulario vacios
    Cuando realizo la busqueda del comercio por <criterioDeBusqueda>
      |idTienda   |nombreLegal  |revendedor  |idTerminal   |idComercio  |fechaApertura  |
      |<idTienda> |<nombreLegal>|<revendedor>|<idTerminal> |<idComercio>|<fechaApertura>|
    Entonces valido que se muestre el mensaje <mensajeBusquedaComercioCamposVacios> notificando que se debe seleccionar al menos un criterio de busqueda
    Ejemplos:
      |criterioDeBusqueda |idTienda     |nombreLegal|revendedor|idTerminal|idComercio|fechaApertura|mensajeBusquedaComercioCamposVacios  |
      |vacio              |             |           |          |          |          |             |Al menos un criterio debe ser llenado|