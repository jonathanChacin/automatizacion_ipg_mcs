package pa.com.banistmo.tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static pa.com.banistmo.userinterface.BuscarComercioUserInterface.*;
import static pa.com.banistmo.userinterface.ResultadoBusquedaComercioUserInterface.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pa.com.banistmo.model.DatosBusquedaComercio;

public class BuscarComercio implements Task {

  private static final String BUSCAR_POR_ID_TIENDA = "Tienda";
  private static final String BUSCAR_POR_NOMBRE_LEGAL = "nombreLegal";
  private static final String BUSCAR_POR_REVENDEDOR = "Revendedor";
  private static final String BUSCAR_POR_ID_TERMINAL = "Terminal";
  private static final String BUSCAR_POR_ID_COMERCIO = "Comercio";
  private static final String BUSCAR_POR_FECHA_APERTURA = "fechaApertura";
  private static final String BUSCAR_POR_CAMPOS_VACIOS = "vacio";

  private static final Target BUSQUEDA_POR_ID_TIENDA = INPUT_TEXT_ID_TIENDA;
  private static final Target BUSQUEDA_POR_NOMBRE_LEGAL = INPUT_TEXT_NOMBRE_LEGAL;
  private static final Target BUSQUEDA_POR_REVENDEDOR = INPUT_TEXT_REVENDEDOR;
  private static final Target BUSQUEDA_POR_ID_TERMINAL = INPUT_TEXT_ID_TERMINAL;
  private static final Target BUSQUEDA_POR_ID_COMERCIO = INPUT_TEXT_ID_COMERCIO;
  private static final Target BUSQUEDA_POR_FECHA_APERTURA = INPUT_TEXT_FECHA_APERTURA;

  private String criterioDeBusqueda;
  private String valorABuscar;
  private Target inputBuscar;

  private DatosBusquedaComercio datosBusquedaComercio;

  public BuscarComercio(String criterioDeBusqueda, DatosBusquedaComercio datosBusquedaComercio) {
    this.criterioDeBusqueda = criterioDeBusqueda;
    this.datosBusquedaComercio = datosBusquedaComercio;
  }

  public static BuscarComercio enIpgMcs(
      String criterioDeBusqueda, DatosBusquedaComercio datosBusquedaComercio) {
    return Tasks.instrumented(BuscarComercio.class, criterioDeBusqueda, datosBusquedaComercio);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {

    if (criterioDeBusqueda.equals(BUSCAR_POR_ID_TIENDA)) {
      inputBuscar = BUSQUEDA_POR_ID_TIENDA;
      valorABuscar = datosBusquedaComercio.getIdTienda();

    } else if (criterioDeBusqueda.equals(BUSCAR_POR_NOMBRE_LEGAL)) {
      inputBuscar = BUSQUEDA_POR_NOMBRE_LEGAL;
      valorABuscar = datosBusquedaComercio.getNombreLegal();

    } else if (criterioDeBusqueda.equals(BUSCAR_POR_REVENDEDOR)) {
      inputBuscar = BUSQUEDA_POR_REVENDEDOR;
      valorABuscar = datosBusquedaComercio.getRevendedor();

    } else if (criterioDeBusqueda.equals(BUSCAR_POR_ID_TERMINAL)) {
      inputBuscar = BUSQUEDA_POR_ID_TERMINAL;
      valorABuscar = datosBusquedaComercio.getIdTerminal();

    } else if (criterioDeBusqueda.equals(BUSCAR_POR_ID_COMERCIO)) {
      inputBuscar = BUSQUEDA_POR_ID_COMERCIO;
      valorABuscar = datosBusquedaComercio.getIdComercio();

    } else if (criterioDeBusqueda.equals(BUSCAR_POR_FECHA_APERTURA)) {
      inputBuscar = BUSQUEDA_POR_FECHA_APERTURA;
      valorABuscar = datosBusquedaComercio.getFechaApertura();
    }
    actor.attemptsTo(WaitUntil.the(LINK_ATENCIO_COMERCIO, isClickable()));
    actor.attemptsTo(Click.on(LINK_ATENCIO_COMERCIO));
    actor.attemptsTo(WaitUntil.the(LINK_BUSCAR_COMERCIO, isClickable()));
    actor.attemptsTo(Click.on(LINK_BUSCAR_COMERCIO));

    if (!criterioDeBusqueda.equals(BUSCAR_POR_CAMPOS_VACIOS)) {
      actor.attemptsTo(Enter.theValue(valorABuscar.trim()).into(inputBuscar));
      actor.attemptsTo(Click.on(BOTON_BUSCAR));
    } else {
      actor.attemptsTo(Click.on(BOTON_BUSCAR));
    }
    if (SPAN_TITULO_RESULTADO_BUSQUEDA_COMERCIO.resolveFor(actor).isVisible()) {
      actor.attemptsTo(
          Click.on(
              IMAGEN_VER_DETALLE_COMERCIO
                  .getCssOrXPathSelector()
                  .replace("$IdTienda", datosBusquedaComercio.getIdTienda())));
      actor.attemptsTo(Scroll.to(SPAN_SERVICIOS));
      actor.attemptsTo(Scroll.to(SPAN_SETEO_FRAUDE));
    }
  }
}
