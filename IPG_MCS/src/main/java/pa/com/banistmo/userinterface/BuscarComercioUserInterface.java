package pa.com.banistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarComercioUserInterface {

  public static final Target LINK_ATENCIO_COMERCIO =
      Target.the("Link para ir a la pantalla de buscar comercio")
          .located(By.xpath("//a[contains(text(),'Atencion al Comercio')]"));

  public static final Target LINK_BUSCAR_COMERCIO =
      Target.the("Link para ir a la pantalla de buscar comercio")
          .located(By.xpath("//a[@href='/mcs/flow/msearch']"));

  public static final Target INPUT_TEXT_ID_TIENDA =
      Target.the("Caja de texto para ingresar el id de la tienda a buscar")
          .located(By.xpath("//input[@id='merchantId']"));

  public static final Target INPUT_TEXT_NOMBRE_LEGAL =
      Target.the("Caja de texto para ingresar el nombre legal del comercio a buscar")
          .located(By.xpath("//input[@id='legalName']"));

  public static final Target INPUT_TEXT_REVENDEDOR =
      Target.the("Caja de texto para ingresar el nombre del revendedor a buscar")
          .located(By.xpath("//input[@id='cspName']"));

  public static final Target INPUT_TEXT_ID_TERMINAL =
      Target.the("Caja de texto para ingresar el id de la terminal a buscar")
          .located(By.xpath("//input[@id='tid']"));

  public static final Target INPUT_TEXT_ID_COMERCIO =
      Target.the("Caja de texto para ingresar el id del comercio a buscar")
          .located(By.xpath("//input[@id='mid']"));

  public static final Target INPUT_TEXT_FECHA_APERTURA =
      Target.the("Caja de texto para ingresar el id del comercio a buscar")
          .located(By.xpath("//input[@id='openDate']"));

  public static final Target BOTON_BUSCAR =
      Target.the("Boton para realizar la busqueda del comercio")
          .located(By.xpath("//button[@id='btnSubmit']"));

  public static final Target IMAGEN_VER_DETALLE_COMERCIO =
      Target.the("Imagen donde se hace click para ver el datelle del comercio buscado")
          .locatedBy("//a[contains(@onclick, '$IdTienda')]");

  public static final Target LI_MENSAJE_COMERCIO_NO_ENCONTRADO =
      Target.the("elemento lista que contiene el mensaje de comercio no encontrado")
          .locatedBy(
              "//table[@id='j_idt53']//child::tbody//child::tr[2]//child::td[2]//child::div//child::ol//child::li");

  public static final Target LI_MENSAJE_BUSQUEDA_COMERCIO_CAMPOS_VACIOS =
      Target.the("elemento lista que contiene el mensaje de comercio no encontrado")
          .locatedBy(
              "//table[@id='j_idt53']//child::tbody//child::tr[2]//child::td[2]//child::div//child::ol//child::li");



  private BuscarComercioUserInterface() {}
}
