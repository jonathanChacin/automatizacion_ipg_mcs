# language: es
# autor: Angel Henriquez
# encoding: UTF-8

@RegistroComercio
Característica: Realizar el registro de un comercio en la aplicacion IPG MCS
  Yo como usuario
  Quiero realizar el registro del comercio en la apliacion IPG MCS
  Para poder registrar de forma completa al comercio que estará utilizando el servicio.

  Antecedentes: Ingreso a la aplicacion IPG MCS
    Dado que ingreso a la aplicacion IPG MCS
    Cuando inicio sesion

  @RegistroComercioExitoso
  Esquema del escenario: Realizar registro de comercio exitoso en IPG MCS
    Cuando registro la informacion del comercio
      | revendedor   | idTienda   | mcc   | nombreLegal   | correo   | url   | moneda   | zonaHoraria   | estado   | dba   | direccion1   | direccion2   | ciudad   | codigoPostal   | codigoPais   | tipoContacto   | nombre   | correoContacto   | telefono   | fax   | servicio1   | servicio2   | servicio3   | puntoFinal   | idTerminal   | idComercio   | visa   | mastercard        | montoLimite   |
      | <revendedor> | <idTienda> | <mcc> | <nombreLegal> | <correo> | <url> | <moneda> | <zonaHoraria> | <estado> | <dba> | <direccion1> | <direccion2> | <ciudad> | <codigoPostal> | <codigoPais> | <tipoContacto> | <nombre> | <correoContacto> | <telefono> | <fax> | <servicio1> | <servicio2> | <servicio3> | <puntoFinal> | <idTerminal> | <idComercio> | <visa> | <mastercard>      | <montoLimite> |
    Entonces valido el registro del comercio exitoso al visualizar el texto "Información comercio guardado correctamente"
    Ejemplos:
      | revendedor | idTienda | mcc  | nombreLegal   | correo             | url                     | moneda | zonaHoraria    | estado | dba     | direccion1   | direccion2 | ciudad | codigoPostal | codigoPais   | tipoContacto | nombre     | correoContacto     | telefono   | fax      | servicio1                     | servicio2                        | servicio3   | puntoFinal                 | idTerminal | idComercio  | visa | mastercard | montoLimite |
      | BANISTMO   | Aleatorio| 4214 | ComercioAut   | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama | OPEN   | Comercio | Iguana Mall | Cocle   | Penonome  | 07095        | Panama       | Director     | Juan Perez | jperez@dominio.com | 5076590012 | 774-5678 | Connect (Hosted Payment Page) | Credit Card (Brands and Options) | Payment URL | B24 Banistmo VIA CAFEX UAT | T000000    | 64000000055 | Si   | Si         | 9999        |

  @ValidarCamposObligatorios
    Esquema del escenario: Realizar validacion de campos obligatorios del registro de comercio
     Cuando registro la informacion del comercio
       | revendedor   | idTienda   | mcc   | nombreLegal   | correo   | url   | moneda   | zonaHoraria   | estado   | dba   | direccion1   | direccion2   | ciudad   | codigoPostal   | codigoPais   | tipoContacto   | nombre   | correoContacto   | telefono   | fax   | servicio1   | servicio2   | servicio3   | puntoFinal   | idTerminal   | idComercio   | visa   | mastercard        | montoLimite   |
       | <revendedor> | <idTienda> | <mcc> | <nombreLegal> | <correo> | <url> | <moneda> | <zonaHoraria> | <estado> | <dba> | <direccion1> | <direccion2> | <ciudad> | <codigoPostal> | <codigoPais> | <tipoContacto> | <nombre> | <correoContacto> | <telefono> | <fax> | <servicio1> | <servicio2> | <servicio3> | <puntoFinal> | <idTerminal> | <idComercio> | <visa> | <mastercard>      | <montoLimite> |
      Entonces valido informacion del <mensajeCampoObligatorio>
      Ejemplos:
        | revendedor | idTienda | mcc  | nombreLegal | correo             | url                     | moneda | zonaHoraria   | estado   | dba   | direccion1   | direccion2| ciudad  | codigoPostal | codigoPais   | tipoContacto  | nombre     | correoContacto    | telefono   | fax      | servicio1                     | servicio2                        | servicio3   | puntoFinal                 | idTerminal | idComercio  | visa | mastercard | montoLimite | mensajeCampoObligatorio                |
        |            | 3957635  | 4214 | Comercio001 | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama| OPEN   | Comercio | Iguana Mall | Cocle   | Penonome  | 07095        | Panama       | Director     | Juan Perez | jperez@dominio.com | 5076590012 | 774-5678 | Connect (Hosted Payment Page) | Credit Card (Brands and Options) | Payment URL | B24 Banistmo VIA CAFEX UAT | T000000    | 64000000055 | Si   | Si         | 9999        |Revendedor - Debe realizar una selección.|
        |  BANISTMO  |          | 4214 | Comercio001 | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama| OPEN   | Comercio | Iguana Mall | Cocle   | Penonome  | 07095        | Panama       | Director     | Juan Perez | jperez@dominio.com | 5076590012 | 774-5678 | Connect (Hosted Payment Page) | Credit Card (Brands and Options) | Payment URL | B24 Banistmo VIA CAFEX UAT | T000000    | 64000000055 | Si   | Si         | 9999        |Id Tienda - Debe introducir un valor.|
        |  BANISTMO  | 3957635  | 4214 |             | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama| OPEN   | Comercio | Iguana Mall | Cocle   | Penonome  | 07095        | Panama       | Director     | Juan Perez | jperez@dominio.com | 5076590012 | 774-5678 | Connect (Hosted Payment Page) | Credit Card (Brands and Options) | Payment URL | B24 Banistmo VIA CAFEX UAT | T000000    | 64000000055 | Si   | Si         | 9999        |Nombre Legal - Debe introducir un valor.|
        |  BANISTMO  | 3957635  | 4214 | Comercio001 | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama| OPEN   |          | Iguana Mall | Cocle   | Penonome  | 07095        | Panama       | Director     | Juan Perez | jperez@dominio.com | 5076590012 | 774-5678 | Connect (Hosted Payment Page) | Credit Card (Brands and Options) | Payment URL | B24 Banistmo VIA CAFEX UAT | T000000    | 64000000055 | Si   | Si         | 9999        |DBA - Debe introducir un valor.|
        |  BANISTMO  | 3957635  | 4214 | Comercio001 | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama| OPEN   | Comercio |             | Cocle   | Penonome  | 07095        | Panama       | Director     | Juan Perez | jperez@dominio.com | 5076590012 | 774-5678 | Connect (Hosted Payment Page) | Credit Card (Brands and Options) | Payment URL | B24 Banistmo VIA CAFEX UAT | T000000    | 64000000055 | Si   | Si         | 9999        |Direccion 1 - Debe introducir un valor.|
        |  BANISTMO  | 3957635  | 4214 | Comercio001 | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama| OPEN   | Comercio | Iguana Mall | Cocle   |           | 07095        | Panama       | Director     | Juan Perez | jperez@dominio.com | 5076590012 | 774-5678 | Connect (Hosted Payment Page) | Credit Card (Brands and Options) | Payment URL | B24 Banistmo VIA CAFEX UAT | T000000    | 64000000055 | Si   | Si         | 9999        |Ciudad - Debe introducir un valor.|
        |  BANISTMO  | 3957635  | 4214 | Comercio001 | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama| OPEN   | Comercio | Iguana Mall | Cocle   | Penonome  |              | Panama       | Director     | Juan Perez | jperez@dominio.com | 5076590012 | 774-5678 | Connect (Hosted Payment Page) | Credit Card (Brands and Options) | Payment URL | B24 Banistmo VIA CAFEX UAT | T000000    | 64000000055 | Si   | Si         | 9999        |Codigo postal - Debe introducir un valor.|
        |  BANISTMO  | 3957635  | 4214 | Comercio001 | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama| OPEN   | Comercio | Iguana Mall | Cocle   | Penonome  | 07095        |              | Director     | Juan Perez | jperez@dominio.com | 5076590012 | 774-5678 | Connect (Hosted Payment Page) | Credit Card (Brands and Options) | Payment URL | B24 Banistmo VIA CAFEX UAT | T000000    | 64000000055 | Si   | Si         | 9999        |Codigo de Pais - Debe realizar una selección.|
        |  BANISTMO  | 3957635  | 4214 | Comercio001 | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama| OPEN   | Comercio | Iguana Mall | Cocle   | Penonome  | 07095        | Panama       |              | Juan Perez | jperez@dominio.com | 5076590012 | 774-5678 | Connect (Hosted Payment Page) | Credit Card (Brands and Options) | Payment URL | B24 Banistmo VIA CAFEX UAT | T000000    | 64000000055 | Si   | Si         | 9999        |Tipo de contacto - Debe realizar una selección.|
        |  BANISTMO  | 3957635  | 4214 | Comercio001 | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama| OPEN   | Comercio | Iguana Mall | Cocle   | Penonome  | 07095        | Panama       | Director     |            | jperez@dominio.com | 5076590012 | 774-5678 | Connect (Hosted Payment Page) | Credit Card (Brands and Options) | Payment URL | B24 Banistmo VIA CAFEX UAT | T000000    | 64000000055 | Si   | Si         | 9999        |Nombre - Debe introducir un valor.|
        |  BANISTMO  | 3957635  | 4214 | Comercio001 | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama| OPEN   | Comercio | Iguana Mall | Cocle   | Penonome  | 07095        | Panama       | Director     | Juan Perez |                    | 5076590012 | 774-5678 | Connect (Hosted Payment Page) | Credit Card (Brands and Options) | Payment URL | B24 Banistmo VIA CAFEX UAT | T000000    | 64000000055 | Si   | Si         | 9999        |Correo electronico - Debe introducir un valor.|
        |  BANISTMO  | 3957635  | 4214 | Comercio001 | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama| OPEN   | Comercio | Iguana Mall | Cocle   | Penonome  | 07095        | Panama       | Director     | Juan Perez | jperez@dominio.com |            | 774-5678 | Connect (Hosted Payment Page) | Credit Card (Brands and Options) | Payment URL | B24 Banistmo VIA CAFEX UAT | T000000    | 64000000055 | Si   | Si         | 9999        |Telefono - Debe introducir un valor|
        |  BANISTMO  | 3957635  | 4214 | Comercio001 | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama| OPEN   | Comercio | Iguana Mall | Cocle   | Penonome  | 07095        | Panama       | Director     | Juan Perez | jperez@dominio.com | 5076590012 | 774-5678 | Connect (Hosted Payment Page) | Credit Card (Brands and Options) | Payment URL |                            | T000000    | 64000000055 | Si   | Si         | 9999        |El punto final no debe ser nulo|
        |  BANISTMO  | 3957635  | 4214 | Comercio001 | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama| OPEN   | Comercio | Iguana Mall | Cocle   | Penonome  | 07095        | Panama       | Director     | Juan Perez | jperez@dominio.com | 5076590012 | 774-5678 | Connect (Hosted Payment Page) | Credit Card (Brands and Options) | Payment URL | B24 Banistmo VIA CAFEX UAT |            | 64000000055 | Si   | Si         | 9999        |ID terminal no debe ser nulo|
        |  BANISTMO  | 3957635  | 4214 | Comercio001 | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama| OPEN   | Comercio | Iguana Mall | Cocle   | Penonome  | 07095        | Panama       | Director     | Juan Perez | jperez@dominio.com | 5076590012 | 774-5678 | Connect (Hosted Payment Page) | Credit Card (Brands and Options) | Payment URL | B24 Banistmo VIA CAFEX UAT | T000000    |             | Si   | Si         | 9999        |ID Comercio no debe ser nulo|
        |  BANISTMO  | 3957635  | 4214 | Comercio001 | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama| OPEN   | Comercio | Iguana Mall | Cocle   | Penonome  | 07095        | Panama       | Director     | Juan Perez | jperez@dominio.com | 5076590012 | 774-5678 |                               |                                  |             | B24 Banistmo VIA CAFEX UAT | T000000    | 64000000055 | Si   | Si         | 9999        |Al menos un tipo de servicio debe ser asignado a la tienda|

  @ValidarRegistroComercioExistente
  Esquema del escenario: Realizar validacion de registro de comercio existente en IPG MCS
    Cuando registro la informacion del comercio
      | revendedor   | idTienda   | mcc   | nombreLegal   | correo   | url   | moneda   | zonaHoraria   | estado   | dba   | direccion1   | direccion2   | ciudad   | codigoPostal   | codigoPais   | tipoContacto   | nombre   | correoContacto   | telefono   | fax   | servicio1   | servicio2   | servicio3   | puntoFinal   | idTerminal   | idComercio   | visa   | mastercard         | montoLimite  |
      | <revendedor> | <idTienda> | <mcc> | <nombreLegal> | <correo> | <url> | <moneda> | <zonaHoraria> | <estado> | <dba> | <direccion1> | <direccion2> | <ciudad> | <codigoPostal> | <codigoPais> | <tipoContacto> | <nombre> | <correoContacto> | <telefono> | <fax> | <servicio1> | <servicio2> | <servicio3> | <puntoFinal> | <idTerminal> | <idComercio> | <visa> | <mastercard>      | <montoLimite> |
    Entonces  verifico <idTienda> que se muestre mensaje <mensajeComercioExiste> notificando que el comercio existe
    Ejemplos:
      | revendedor | idTienda | mcc  | nombreLegal | correo             | url                     | moneda | zonaHoraria    | estado | dba     | direccion1   | direccion2 | ciudad | codigoPostal | codigoPais   | tipoContacto | nombre     | correoContacto     | telefono   | fax      | servicio1                     | servicio2                        | servicio3   | puntoFinal                 | idTerminal | idComercio  | visa | mastercard | montoLimite |mensajeComercioExiste                  |
      | BANISTMO   | 000000510| 4214 | Comercio001 | correo@dominio.com | http://www.banistmo.com | USD    | America/Panama | OPEN   | Comercio | Iguana Mall | Cocle   | Penonome  | 07095        | Panama       | Director     | Juan Perez | jperez@dominio.com | 5076590012 | 774-5678 | Connect (Hosted Payment Page) | Credit Card (Brands and Options) | Payment URL | B24 Banistmo VIA CAFEX UAT | T000000    | 64000000055 | Si   | Si         | 9999        |Por favor elegir un numero no existente|