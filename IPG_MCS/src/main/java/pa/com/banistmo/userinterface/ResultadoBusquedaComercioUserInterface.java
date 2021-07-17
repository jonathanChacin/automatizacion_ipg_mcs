package pa.com.banistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultadoBusquedaComercioUserInterface {

  public static final Target TD_RESULTADO_ID_TIENDA =
      Target.the("Columna que contiene el id de la tienda buscada")
          .located(
              By.xpath(
                  "//div[@id='merchants']//child::table//child::tbody//child::tr//child::td//child::table//child::tbody//child::tr[2]//child::td[3]"));

  public static final Target TD_RESULTADO_NOMBRE_LEGAL =
      Target.the("Columna que contiene el nombre legal buscado")
          .located(
              By.xpath(
                  "//div[@id='merchants']//child::table//child::tbody//child::tr//child::td//child::table//child::tbody//child::tr[2]//child::td[4]"));

  public static final Target TD_RESULTADO_REVENDEDOR =
      Target.the("Columna que contiene el nombre legal buscado")
          .located(
              By.xpath(
                  "//div[@id='merchants']//child::table//child::tbody//child::tr//child::td//child::table//child::tbody//child::tr[2]//child::td[5]"));

  public static final Target TD_RESULTADO_FECHA_APERTURA =
      Target.the("Columna que contiene el nombre legal buscado")
          .located(
              By.xpath(
                  "//div[@id='merchants']//child::table//child::tbody//child::tr//child::td//child::table//child::tbody//child::tr[2]//child::td[11]"));

  public static final Target TD_ID_TERMINAL =
      Target.the("Columna que contiene el id de la terminal buscada")
          .located(
              By.xpath(
                  "//div[@id='_termConfigs']//child::table[@class='x7b']//child::tbody//child::tr[2]//child::td[2]"));

  public static final Target TD_ID_COMERCIO =
      Target.the("Columna que contiene el id de la terminal buscada")
          .located(
              By.xpath(
                  "//div[@id='_termConfigs']//child::table[@class='x7b']//child::tbody//child::tr[2]//child::td[3]"));

  public static final Target SPAN_SERVICIOS =
      Target.the("Titulo de la seccion de servicios en el resultado de la busqueda")
          .located(By.xpath("//span[contains(text(),'Servicios')]"));

  public static final Target SPAN_SETEO_FRAUDE =
      Target.the("Titulo de la seccion de seteo de fraude en el resultado de la busqueda")
          .located(By.xpath("//span[contains(text(),'Seteo')]"));

  public static final Target SPAN_TITULO_RESULTADO_BUSQUEDA_COMERCIO =
      Target.the("Titulo de la pantalla de resultado de busqueda de comercio")
          .located(By.xpath("//span[contains(text(),'Resultado de busqueda de comercio')]"));

  private ResultadoBusquedaComercioUserInterface() {}
}
