package pa.com.banistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EditarComercioUserInterface {

    public static final Target BOTON_EDITAR=
            Target.the("Boton de editar comercio")
                    .located(By.xpath("//button[@id='doEdit']"));
    //Informacion Maestro
    public static final Target TEXTO_MAESTRO=
            Target.the("Texto para identificar pagina de maestro de comercio")
                    .located(By.xpath("//span[contains(text(),'Informacion Maestra de Comercio')]"));
    public static final Target INPUT_TEXT_MCC=
            Target.the("Numero de mcc")
                    .located(By.xpath("//input[@id='sic']"));

    public static final Target INPUT_TEXT_NOMBRE_LEGAL=
            Target.the("Nombre legal del comercio")
                    .located(By.xpath("//input[@id='legalName']"));

    public static final Target INPUT_TEXT_URL=
            Target.the("URL del comercio")
                    .located(By.xpath("//input[@id='url']"));
    public static final Target INPUT_TEXT_CORREO=
            Target.the("URL del comercio")
                    .located(By.xpath("//input[@id='ispEmail']"));
    public static final Target OPCION_MONEDA =
            Target.the("Opcion de moneda")
                    .located(By.xpath("//select[@id='defaultCurrencyCode']"));
    public static final Target OPCION_ZONA_HORARIA =
            Target.the("Opcion de zona horaria")
                    .located(By.xpath("//select[@id='timezone']"));
    public static final Target OPCION_ESTADO =
            Target.the("Opcion de estado del comercio")
                    .located(By.xpath("//select[@id='status']"));
    public static final Target INPUT_TEXT_DBA=
            Target.the("DBA del comercio")
                    .located(By.xpath("//input[@id='dba']"));
    //Informacion de Direccion
    public static final Target TEXTO_DIRECCION=
            Target.the("Texto para identificar pagina de direccion")
                    .located(By.xpath("//span[contains(text(),'Direccion')]"));
    public static final Target INPUT_TEXT_DIRECCION1=
            Target.the("Direccion1 del comercio")
                    .located(By.xpath("//input[@id='address1']"));
    public static final Target INPUT_TEXT_DIRECCION2=
            Target.the("Direccion2 del comercio")
                    .located(By.xpath("//input[@id='address2']"));
    public static final Target INPUT_TEXT_CUIDAD=
            Target.the("Ciudad de ubicacion del comercio")
                    .located(By.xpath("//input[@id='city']"));
    public static final Target INPUT_TEXT_ESTADO=
            Target.the("Estado donde se ubica el comercio")
                    .located(By.xpath("//input[@id='state']"));
    public static final Target INPUT_TEXT_CODIGO_POSTAL=
            Target.the("Codigo Postal del comercio")
                    .located(By.xpath("//input[@id='zip']"));
    public static final Target OPCION_PAIS =
            Target.the("Pais donde se encuentra el comercio")
                    .located(By.xpath("//select[@id='countryAlphaCode']"));
    //Informacion de contacto
    public static final Target TEXTO_CONTACTO=
            Target.the("Texto para identificar pagina de contacto")
                    .located(By.xpath("//span[contains(text(),'Contacto')]"));
    public static final Target OPCION_TIPO_CONTACTO=
            Target.the("Tipo de contacto del comercio")
                    .located(By.xpath("//select[@id='contactType']"));
    public static final Target INPUT_TEXT_NOMBRE=
            Target.the("Nombre del contacto del comercio")
                    .located(By.xpath("//input[@id='name']"));
    public static final Target INPUT_TEXT_CORREO_CONTACTO=
            Target.the("correo del contacto del comercio")
                    .located(By.xpath("//input[@id='email']"));
    public static final Target INPUT_TEXT_TELEFONO=
            Target.the("Telefono del contacto del comercio")
                    .located(By.xpath("//input[@id='phone']"));
    public static final Target INPUT_TEXT_FAX=
            Target.the("Fax del contacto del comercio")
                    .located(By.xpath("//input[@id='fax']"));
    //Servicios
    public static final Target TEXTO_SERVICIOS=
            Target.the("Texto para identificar pagina de servicios")
                    .located(By.xpath("//span[contains(text(),'Servicios')]"));
    public static final Target OPCION_SERVICIO1=
            Target.the("Servicio 1")
                    .located(By.xpath("//select[@id='j_idt79']"));
    public static final Target BOTON_AGREGAR=
            Target.the("Boton para agregar los servicios")
                    .located(By.xpath("//button[contains(text(),'Agregar')]"));
    public static final Target TEXTO_CONNECT_HPP=
            Target.the("texto para verificar que se agrego servicio connect")
                    .located(By.xpath("//td[contains(text(),'Connect (Hosted Payment Page')]"));
    public static final Target TEXTO_CREDIT_CARD=
            Target.the("texto para verificar que se agrego servicio credit card")
                    .located(By.xpath("//td[contains(text(),'Credit Card (Brands and Options)')]"));
    public static final Target TEXTO_PAYMENT_URL=
            Target.the("texto para verificar que se agrego servicio payment url")
                    .located(By.xpath("//td[contains(text(),'Payment URL')]"));
    public static final Target TEXTO_RECURRING_PAYMENTS=
            Target.the("texto para verificar que se agrego servicio recurring payments")
                    .located(By.xpath("//td[contains(text(),'Recurring Payments / Periodic Billing')]"));
    public static final Target BOTON_SIGUIENTE=
            Target.the("Boton siguiente menu")
                    .located(By.xpath("//button[contains(text(),'Siguiente')]"));
    //Terminal
    public static final Target TEXTO_CONFIGURACION_TERMINAL=
            Target.the("Texto para identificar pagina de configuracion de terminal")
                    .located(By.xpath("//span[contains(text(),'Terminal')]"));
    public static final Target OPCION_PUNTO_FINAL=
            Target.the("Punto final")
                    .located(By.xpath("//select[@id='endpoint']"));
    public static final Target INPUT_TEXT_ID_TERMINAL=
            Target.the("Terminal ID del comercio")
                    .located(By.xpath("//input[@id='terminalId']"));
    public static final Target INPUT_TEXT_ID_MERCHANT=
            Target.the("MERCHANT ID del comercio")
                    .located(By.xpath("//input[@id='merchantId']"));
    public static final Target CHECKBOX_VISA=
            Target.the("SELECCION DE MARCA VISA")
                    .located(By.xpath("//input[@id='brandBitMaps:0']"));
    public static final Target CHECKBOX_MASTERCARD=
            Target.the("SELECCION DE MARCA MASTERCARD")
                    .located(By.xpath("//input[@id='brandBitMaps:1']"));
    public static final Target BOTON_AGREGAR_ACTUALIZAR=
            Target.the("Boton agregar")
                    .located(By.xpath("//button[@id='btnAddRow']"));
    //Monto Limite
    public static final Target TEXTO_LIMITES_DE_COMPRA=
            Target.the("Texto para identificar pagina de limites de compra")
                    .located(By.xpath("//span[contains(text(),'Limites de compra')]"));
    public static final Target INPUT_TEXT_MONTO_LIMITE=
            Target.the("Monto limite de una transaccion del comercio")
                    .located(By.xpath("//input[@id='maxOrderAmt']"));
    public static final Target TEXTO_SETEODEFRAUDES=
            Target.the("Texto para identificar pagina de seteodefraudes")
                    .located(By.xpath(" //span[contains(text(),'Seteodefraudes')]"));
    public static final Target TEXTO_CONECTAR_LOGOTIPOS=
            Target.the("Texto para identificar que esta habiltada la sesion de logotipos")
                    .located(By.xpath("//div[contains(text(),'Conectar Logotipos')]"));
    public static final Target BOTON_GUARDAR_TODO=
            Target.the("Boton guardar todo")
                    .located(By.xpath("//button[@id='btnSaveall']"));
    public static final Target TEXTO_CONECTAR_LOGOS=
            Target.the("Texto para identificar pagina de conectar logos")
                    .located(By.xpath("//span[contains(text(),'Conectar Logos')]"));
    public static final Target TEXTO_ERROR=
            Target.the("Texto para identificar pagina de conectar logos")
                    .located(By.xpath("//span[contains(text(),'Error')]"));



    private EditarComercioUserInterface(){}
}
