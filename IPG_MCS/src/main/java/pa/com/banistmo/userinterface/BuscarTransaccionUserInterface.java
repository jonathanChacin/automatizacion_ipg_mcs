package pa.com.banistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarTransaccionUserInterface {

    public static final Target LINK_TRANSACCION =
            Target.the("Link para ir a la pantalla de buscar transaccion")
                    .located(By.xpath("//a[@href='/mcs/flow/transaction']"));

    public static final Target INPUT_FECHA_DESDE =
            Target.the("caja de texto para ingresar la fecha de inicio en el campo rango de fechas del pedido")
                    .located(By.xpath("//input[@id='trSearchForm:orderDateFrom']"));


    public static final Target INPUT_FECHA_HASTA =
            Target.the("caja de texto para ingresar la fecha fin en el campo rango de fechas del pedido")
                    .located(By.xpath("//input[@id='trSearchForm:orderDateTo']"));

    public static final Target INPUT_ID_TIENDA =
            Target.the("caja de texto para ingresar el id de la tienda")
                    .located(By.xpath("//input[@id='trSearchForm:storeId']"));

    public static final Target INPUT_ID_ORDEN =
            Target.the("caja de texto para ingresar el id de la orden")
                    .located(By.xpath("//input[@id='trSearchForm:orderId']"));

    public static final Target INPUT_ID_USUARIO =
            Target.the("caja de texto para ingresar el id del usuario")
                    .located(By.xpath("//input[@id='trSearchForm:userId']"));

    public static final Target INPUT_CODIGO_MONEDA =
            Target.the("caja de texto para ingresar el codigo de moneda")
                    .located(By.xpath("//input[@id='trSearchForm:ccy']"));

    public static final Target INPUT_CODIGO_APROBACION =
            Target.the("caja de texto para ingresar el codigo de aprobacion")
                    .located(By.xpath("//input[@id='trSearchForm:approval']"));

    public static final Target INPUT_ID_TERMINAL =
            Target.the("caja de texto para ingresar el id de la terminal")
                    .located(By.xpath("//input[@id='trSearchForm:tid']"));

    public static final Target INPUT_ID_TRANSACCION =
            Target.the("caja de texto para ingresar el codigo de la trasaccion")
                    .located(By.xpath("//input[@id='trSearchForm:sgsid']"));

    public static final Target SELECT_TIPO_TRANSACCION =
            Target.the("lista para seleccionar el tipo de transaccion")
                    .located(By.xpath("//select[@id='trSearchForm:trxType']"));

    public static final Target SELECT_ESTADO_TRANSACCION =
            Target.the("lista para seleccionar el estado de transaccion")
                    .located(By.xpath("//select[@id='trSearchForm:trxState']"));

    public static final Target BOTON_BUSCAR_TRANSACCION =
            Target.the("lista para seleccionar el estado de transaccion")
                    .located(By.xpath("//button[@id='trSearchForm:btnDoSearch']"));

    public static final Target LINK_MOSTRAR_DETALLE_TRANSACCION =
            Target.the("link para mostrar el detalle de la transaccion")
                    .locatedBy("//td[contains(text(),'$codigoAprobacion')]/..//child::td[@nowrap]//child::div//child::a[contains(text(),'Mostrar')]");

    public static final Target LINK_OCULTAR_DETALLE_TRANSACCION =
            Target.the("link para ocultar el detalle de la transaccion")
                    .locatedBy("//td[contains(text(),'$codigoAprobacion')]/..//child::td[@nowrap]//child::div//child::a[contains(text(),'Ocultar')]");

    public static final Target SELECT_MOSTRAR_TODOS_LOS_REGISTROS =
            Target.the("Select para mostrar todos los registros")
                    .located(By.xpath("//select[contains(@title,'Seleccionar')]"));

    public static final Target OPCION_MOSTRAR_TODOS_LOS_REGISTROS =
            Target.the("opcion para mostrar todos los registros")
                    .located(By.xpath("//option[contains(text(),'Mostrar Todo')]"));

    public static final Target TD_RESULTADO_ID_TIENDA =
            Target.the("columna que muestra el id de la tienda obtenida en la busqueda")
                    .locatedBy("//td[contains(text(),'$codigoAprobacion')]/..//child::td[4]//child::a");

    public static final Target TD_RESULTADO_TH_DETALLES =
            Target.the("titulo detalles")
                    .locatedBy("//th[contains(text(),'Detalles')]");

    public static final Target TD_RESULTADO_ID_ORDEN =
            Target.the("columna que muestra el id de la orden obtenida en la busqueda")
                    .locatedBy("//td[contains(text(),'$codigoAprobacion')]/..//child::td[3]");

    public static final Target TD_RESULTADO_ID_USUARIO =
            Target.the("columna que muestra el id del usuario obtenido en la busqueda")
                    .locatedBy("//td[contains(text(),'$codigoAprobacion')]/../child::td[15]");

    public static final Target TD_RESULTADO_CODIGO_MONEDA =
            Target.the("columna que muestra el id del codigo de la moneda obtenida en la busqueda")
                    .locatedBy("//td[contains(text(),'$codigoAprobacion')]/../child::td[9]");

    public static final Target TD_RESULTADO_CODIGO_APROBACION =
            Target.the("columna que muestra el codigo de la aprobacion obtenida en la busqueda")
                    .locatedBy("//td[contains(text(),'$codigoAprobacion')]");

    public static final Target TD_RESULTADO_ID_TERMINAL =
            Target.the("columna que muestra el id de la terminal obtenida en la busqueda")
                    .locatedBy("//td[contains(text(),'$codigoAprobacion')]/../child::td[10]");

    public static final Target TD_RESULTADO_ID_TRANSACCION =
            Target.the("columna que muestra el id de la transaccion obtenida en la busqueda")
                    .locatedBy("//table[@class='x7b']//child::tbody//child::tr[2]//child::td[contains(text(),'$idTransaccion')]");

    public static final Target TD_RESULTADO_TIPO_TRANSACCION =
            Target.the("columna que muestra el tipo de la ransaccion obtenida en la busqueda")
                    .locatedBy("//td[contains(text(),'$codigoAprobacion')]/../child::td[13]");

    public static final Target TD_RESULTADO_ESTADO_TRANSACCION =
            Target.the("columna que muestra el tipo de la ransaccion obtenida en la busqueda")
                    .locatedBy("//td[contains(text(),'$codigoAprobacion')]/../child::td[12]");

    public static final Target TD_RESULTADO_BUSQUEDA_TRANSACCION_VACIA =
            Target.the("columna que muestra el mensaje cuando las busqueda no encuentra resultados")
                    .locatedBy("//table[@class='x7b']//child::tbody//child::tr[2]//child::td[contains(text(),'No se encontro informacion')]");

    public static final Target DIV_MENSAJE_CAMPOS_OBLIGATORIOS =
            Target.the("Contenedor donde se muestra el mensaje de campos obligatorios")
                    .located(By.xpath("//div[@class='xdg']//child::ol"));

    BuscarTransaccionUserInterface() {
    }
}
