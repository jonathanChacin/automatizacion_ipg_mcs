# language: es
# autor: Jonathan Chacin
# encoding: UTF-8

@BusquedaDeTransaccionEnIPGMCS
Característica: Realizar la busqueda de transaccion en la aplicacion IPG MCS
  Yo como usuario
  Quiero realizarla busqueda de transaccion en la aplicacion IPG MCS
  Para obtener los datos de las transacciones realizadas.

  Antecedentes: Ingreso a la aplicacion IPG MCS e inicio sesion
    Dado que ingreso a la aplicacion IPG MCS
    Cuando inicio sesion

  @BusquedaExitosaDeTransaccion
  Esquema del escenario: Realizar la busqueda exitosa de transaccion en IPG MCS
    Cuando realizo la buqueda de transaccion en IPG MCS por <criterioDeBusqueda>
      |fechaDesde  |fechaHasta   |idTienda   |idOrden  |idUsuario  |codigoMoneda  |codigoAprobacion  |idTerminal   |idTransaccion  |tipoTransaccion  |estadoTransaccion  |
      |<fechaDesde>|<fechaHasta> |<idTienda> |<idOrden>|<idUsuario>|<codigoMoneda>|<codigoAprobacion>|<idTerminal> |<idTransaccion>|<tipoTransaccion>|<estadoTransaccion>|
    Entonces verifico que se muestre la informacion de la transaccion
    Ejemplos:
    |criterioDeBusqueda|fechaDesde  |fechaHasta   |idTienda     |idOrden                                  |idUsuario    |codigoMoneda  |codigoAprobacion               |idTerminal   |idTransaccion  |tipoTransaccion  |estadoTransaccion  |
    |rangoFecha        |01.06.2021  |30.06.2021   |8112000000529|VT-07826bc6-5e80-485e-b1c3-a0392f5c480f  |8112000000529|840           |Y:001207:4564310323:PPXX:879613|T0000529     |84564310323    |sale             |captured           |
    |idTienda          |01.06.2021  |30.06.2021   |8112000000529|VT-07826bc6-5e80-485e-b1c3-a0392f5c480f  |8112000000529|840           |Y:001207:4564310323:PPXX:879613|T0000529     |84564310323    |sale             |captured           |
    |idOrden           |01.06.2021  |30.06.2021   |8112000000529|VT-07826bc6-5e80-485e-b1c3-a0392f5c480f  |8112000000529|840           |Y:001207:4564310323:PPXX:879613|T0000529     |84564310323    |sale             |captured           |
    |idUsuario         |01.06.2021  |30.06.2021   |8112000000529|VT-07826bc6-5e80-485e-b1c3-a0392f5c480f  |8112000000529|840           |Y:001207:4564310323:PPXX:879613|T0000529     |84564310323    |sale             |captured           |
    |codMoneda         |01.06.2021  |30.06.2021   |8112000000529|VT-07826bc6-5e80-485e-b1c3-a0392f5c480f  |8112000000529|840           |Y:001207:4564310323:PPXX:879613|T0000529     |84564310323    |sale             |captured           |
    |codAprobacion     |01.06.2021  |30.06.2021   |8112000000529|VT-07826bc6-5e80-485e-b1c3-a0392f5c480f  |8112000000529|840           |Y:001207:4564310323:PPXX:879613|T0000529     |84564310323    |sale             |captured           |
    |idTerminal        |01.06.2021  |30.06.2021   |8112000000529|VT-07826bc6-5e80-485e-b1c3-a0392f5c480f  |8112000000529|840           |Y:001207:4564310323:PPXX:879613|T0000529     |84564310323    |sale             |captured           |
    |idTransaccion     |01.06.2021  |30.06.2021   |8112000000529|VT-07826bc6-5e80-485e-b1c3-a0392f5c480f  |8112000000529|840           |Y:001207:4564310323:PPXX:879613|T0000529     |84564310323    |sale             |captured           |
    |tipoTransaccion   |01.06.2021  |30.06.2021   |8112000000529|VT-07826bc6-5e80-485e-b1c3-a0392f5c480f  |8112000000529|840           |Y:001207:4564310323:PPXX:879613|T0000529     |84564310323    |sale             |captured           |
    |estadoTransaccion |01.06.2021  |30.06.2021   |8112000000529|VT-07826bc6-5e80-485e-b1c3-a0392f5c480f  |8112000000529|840           |Y:001207:4564310323:PPXX:879613|T0000529     |84564310323    |sale             |captured           |

  @BusquedaDeTransaccionConDatosIncorrectos
  Esquema del escenario: Verificar que no se muestre informacion de la transaccion al realizar la busqueda con datos incorrectos
    Cuando realizo la buqueda de transaccion en IPG MCS por <criterioDeBusqueda>
      |fechaDesde  |fechaHasta   |idTienda   |idOrden  |idUsuario  |codigoMoneda  |codigoAprobacion  |idTerminal   |idTransaccion  |tipoTransaccion  |estadoTransaccion  |
      |<fechaDesde>|<fechaHasta> |<idTienda> |<idOrden>|<idUsuario>|<codigoMoneda>|<codigoAprobacion>|<idTerminal> |<idTransaccion>|<tipoTransaccion>|<estadoTransaccion>|
    Entonces verifico que se muestre el mensaje <mensajeTransaccionNoEncontrada> notificando que no se encontro la transaccion buscada
    Ejemplos:
      |criterioDeBusqueda|fechaDesde  |fechaHasta   |idTienda     |idOrden      |idUsuario    |codigoMoneda|codigoAprobacion|idTerminal   |idTransaccion  |tipoTransaccion        |estadoTransaccion      |mensajeTransaccionNoEncontrada|
      |rangoFecha        |01.06.2019  |30.06.2019   |8112000000700|VT-1-2-3-4-5 |5152000000529|001         |Y:1:2:PPXX:3    |R000000R     |12345678901    |-- Nada Seleccionado --|-- Nada Seleccionado --|No se encontro informacion    |
      |idTienda          |01.06.2021  |30.06.2021   |8112000000700|VT-1-2-3-4-5 |5152000000529|001         |Y:1:2:PPXX:3    |R000000R     |12345678901    |-- Nada Seleccionado --|-- Nada Seleccionado --|No se encontro informacion    |
      |idOrden           |01.06.2021  |30.06.2021   |8112000000700|VT-1-2-3-4-5 |5152000000529|001         |Y:1:2:PPXX:3    |R000000R     |12345678901    |-- Nada Seleccionado --|-- Nada Seleccionado --|No se encontro informacion    |
      |idUsuario         |01.06.2021  |30.06.2021   |8112000000700|VT-1-2-3-4-5 |5152000000529|001         |Y:1:2:PPXX:3    |R000000R     |12345678901    |-- Nada Seleccionado --|-- Nada Seleccionado --|No se encontro informacion    |
      |codMoneda         |01.06.2021  |30.06.2021   |8112000000700|VT-1-2-3-4-5 |5152000000529|001         |Y:1:2:PPXX:3    |R000000R     |12345678901    |-- Nada Seleccionado --|-- Nada Seleccionado --|No se encontro informacion    |
      |codAprobacion     |01.06.2021  |30.06.2021   |8112000000700|VT-1-2-3-4-5 |5152000000529|001         |Y:1:2:PPXX:3    |R000000R     |12345678901    |-- Nada Seleccionado --|-- Nada Seleccionado --|No se encontro informacion    |
      |idTerminal        |01.06.2021  |30.06.2021   |8112000000700|VT-1-2-3-4-5 |5152000000529|001         |Y:1:2:PPXX:3    |R000000R     |12345678901    |-- Nada Seleccionado --|-- Nada Seleccionado --|No se encontro informacion    |
      |idTransaccion     |01.06.2021  |30.06.2021   |8112000000700|VT-1-2-3-4-5 |5152000000529|001         |Y:1:2:PPXX:3    |R000000R     |12345678901    |-- Nada Seleccionado --|-- Nada Seleccionado --|No se encontro informacion    |

  @VerificacionDeCamposObligatoriosEnLaBusquedaDeTransaccion
  Esquema del escenario: Verificar campos obligatorios en el formulario de busqueda de transaccion de IPG MCS
    Cuando realizo la buqueda de transaccion en IPG MCS por <criterioDeBusqueda>
      |fechaDesde  |fechaHasta   |idTienda   |idOrden  |idUsuario  |codigoMoneda  |codigoAprobacion  |idTerminal   |idTransaccion  |tipoTransaccion  |estadoTransaccion  |
      |<fechaDesde>|<fechaHasta> |<idTienda> |<idOrden>|<idUsuario>|<codigoMoneda>|<codigoAprobacion>|<idTerminal> |<idTransaccion>|<tipoTransaccion>|<estadoTransaccion>|
    Entonces verifico que se muestre el mensaje <mensajeCampoObligatorio> notificando que existen campos obligatorios por diligenciar
    Ejemplos:
      |criterioDeBusqueda|fechaDesde  |fechaHasta   |idTienda     |idOrden      |idUsuario    |codigoMoneda|codigoAprobacion|idTerminal   |idTransaccion  |tipoTransaccion        |estadoTransaccion      |mensajeCampoObligatorio                              |
      |rangoFecha        |            |30.06.2019   |8112000000700|VT-1-2-3-4-5 |5152000000529|001         |Y:1:2:PPXX:3    |R000000R     |12345678901    |-- Nada Seleccionado --|-- Nada Seleccionado --|Rango de fecha del pedido - Debe introducir un valor.|
      |rangoFecha        |01.06.2021  |             |8112000000700|VT-1-2-3-4-5 |5152000000529|001         |Y:1:2:PPXX:3    |R000000R     |12345678901    |-- Nada Seleccionado --|-- Nada Seleccionado --|Debe introducir un valor. - Debe introducir un valor.|
      |rangoFecha        |            |             |8112000000700|VT-1-2-3-4-5 |5152000000529|001         |Y:1:2:PPXX:3    |R000000R     |12345678901    |-- Nada Seleccionado --|-- Nada Seleccionado --|Rango de fecha del pedido - Debe introducir un valor.\nDebe introducir un valor. - Debe introducir un valor.|