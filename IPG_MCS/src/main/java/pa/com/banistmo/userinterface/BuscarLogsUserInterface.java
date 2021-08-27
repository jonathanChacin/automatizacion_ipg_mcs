package pa.com.banistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarLogsUserInterface {

    public static final Target INICIO_DE_SESION =
            Target.the("Link para ir a la pantalla de busqeda de logs")
                .located(By.xpath("//a[@href='/mcs/flow/logging']"));

    public static final Target INPUT_FECHA_DESDE =
            Target.the("Caja de texto donde se introduce desde que fecha se buscaran los logs")
                .located(By.id("fromTime"));

    public static final Target INPUT_FECHA_HASTA =
            Target.the("Caja de texto dode se introduce hasta que fecha se buscaran los logs")
                .located(By.id("toTime"));

    public static final Target IMPUT_TIENDA_ID =
            Target.the("Caja de texto donde se introduce el ID del comercio")
                .located(By.id("storeId"));

    public static final Target IMPUT_ORDEN_ID =
            Target.the("Caja de texto donde se introduce el ID de la orden")
                    .located(By.id("orderId"));

    public static final Target BOTON_BUSCAR =
            Target.the("Boton para relalizar la busqueda de logs")
                .located(By.id("btnSearch"));

    public static final Target CLICK_EN_PANTALLA =
            Target.the("Da click en la pantalla")
                .located(By.xpath("//span[contains(text(),'Buscar Entradas de Inicio de Sesión')]"));

    public static final Target VERIFICAR_INFO_TIENDA =
            Target.the("Texto donde verificaremos que los logs sean correctos")
                .located(By.xpath("//pre"));

    public static final Target MENSAJE_CAMPO_OBLIGATORIO =
            Target.the("Texto donde verificaremos que los campos son obligatorios")
                    .located(By.id("j_idt60__LIST__"));

    public static final Target MENSAJE_DATOS_INCORRECTOS =
            Target.the("Texto donde verificaremos que los datos son incorrectos")
                    .located(By.id("j_idt60__LIST__"));

}
