package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import pa.com.banistmo.model.DatosBusquedaTransaccion;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static pa.com.banistmo.userinterface.BuscarTransaccionUserInterface.*;

public class BuscarTransaccion implements Task {

    private static final String BUSCAR_POR_RANGO_FECHA = "rangoFecha";
    private static final String BUSCAR_POR_ID_TIENDA = "idTienda";
    private static final String BUSCAR_POR_ID_ORDEN = "idOrden";
    private static final String BUSCAR_POR_ID_USUARIO = "idUsuario";
    private static final String BUSCAR_POR_COD_MONEDA = "codMoneda";
    private static final String BUSCAR_POR_COD_APROBACION = "codAprobacion";
    private static final String BUSCAR_POR_ID_TERMINAL = "idTerminal";
    private static final String BUSCAR_POR_ID_TRANSACCION = "idTransaccion";
    private static final String BUSCAR_POR_TIPO_TRANSACCION = "tipoTransaccion";
    private static final String BUSCAR_POR_ESTADO_TRANSACCION = "estadoTransaccion";

    private static final Target BUSQUEDA_POR_FECHA_DESDE = INPUT_FECHA_DESDE;
    private static final Target BUSQUEDA_POR_FECHA_HASTA = INPUT_FECHA_HASTA;
    private static final Target BUSQUEDA_POR_ID_TIENDA = INPUT_ID_TIENDA;
    private static final Target BUSQUEDA_POR_ID_ORDEN = INPUT_ID_ORDEN;
    private static final Target BUSQUEDA_POR_ID_USUARIO = INPUT_ID_USUARIO;
    private static final Target BUSQUEDA_POR_COD_MONEDA = INPUT_CODIGO_MONEDA;
    private static final Target BUSQUEDA_POR_COD_APROBACION = INPUT_CODIGO_APROBACION;
    private static final Target BUSQUEDA_POR_ID_TERMINAL = INPUT_ID_TERMINAL;
    private static final Target BUSQUEDA_POR_ID_TRANSACCION = INPUT_ID_TRANSACCION;
    private static final Target BUSQUEDA_POR_TIPO_TRANSACCION = SELECT_TIPO_TRANSACCION;
    private static final Target BUSQUEDA_POR_ESTADO_TRANSACCION = SELECT_ESTADO_TRANSACCION;

    private final String criterioDeBusqueda;
    private Target inputFechaDesde;
    private Target inputFechaHasta;
    private Target inputBuscar;
    private String valorFechaDesde;
    private String valorFechaHasta;
    private String valorABuscar;
    private final DatosBusquedaTransaccion datosBusquedaTransaccion;


    public BuscarTransaccion(String criterioDeBusqueda, DatosBusquedaTransaccion datosBusquedaTransaccion) {
        this.criterioDeBusqueda = criterioDeBusqueda;
        this.datosBusquedaTransaccion = datosBusquedaTransaccion;
    }


    public static BuscarTransaccion enIpgMcs(String criterioDeBusqueda, DatosBusquedaTransaccion datosBusquedaTransaccion) {
        return Tasks.instrumented(BuscarTransaccion.class, criterioDeBusqueda, datosBusquedaTransaccion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (criterioDeBusqueda) {

            case BUSCAR_POR_RANGO_FECHA:
                buscarPorRangoFecha();
                break;

            case BUSCAR_POR_ID_TIENDA:
                buscarPorIdTienda();
                break;

            case BUSCAR_POR_ID_ORDEN:
                buscarPorIdOrden();
                break;

            case BUSCAR_POR_ID_USUARIO:
                buscarPorIdUsuario();
                break;

            case BUSCAR_POR_COD_MONEDA:
                buscarPorCodigoMoneda();
                break;

            case BUSCAR_POR_COD_APROBACION:
                buscarPorCodigoAprobacion();
                break;

            case BUSCAR_POR_ID_TERMINAL:
                buscarPorIdTerminal();
                break;

            case BUSCAR_POR_ID_TRANSACCION:
                buscarPorIdTransaccion();
                break;

            case BUSCAR_POR_TIPO_TRANSACCION:
                buscarPorTipoTransaccion();
                break;

            case BUSCAR_POR_ESTADO_TRANSACCION:
                buscarPorEstadoTransaccion();
                break;

            default:
                break;
        }

        actor.attemptsTo(Click.on(LINK_TRANSACCION));
        actor.attemptsTo(Enter.theValue(valorFechaDesde).into(inputFechaDesde));
        actor.attemptsTo(Enter.theValue(valorFechaHasta).into(inputFechaHasta));

        if (inputBuscar.equals(BUSQUEDA_POR_TIPO_TRANSACCION) || inputBuscar.equals(BUSQUEDA_POR_ESTADO_TRANSACCION)) {
            actor.attemptsTo(SelectFromOptions.byVisibleText(valorABuscar).from(inputBuscar));
        } else {
            actor.attemptsTo(Enter.theValue(valorABuscar).into(inputBuscar));
        }

        actor.attemptsTo(Click.on(BOTON_BUSCAR_TRANSACCION));

        if (OPCION_MOSTRAR_TODOS_LOS_REGISTROS.resolveFor(actor).isPresent()) {
            actor.attemptsTo(SelectFromOptions.byValue("all").from(SELECT_MOSTRAR_TODOS_LOS_REGISTROS));
        }

        if (!TD_RESULTADO_BUSQUEDA_TRANSACCION_VACIA.resolveFor(actor).isVisible()) {
            actor.attemptsTo(WaitUntil.the(LINK_MOSTRAR_DETALLE_TRANSACCION.getCssOrXPathSelector()
                    .replace("$codigoAprobacion", datosBusquedaTransaccion.getCodigoAprobacion()), isVisible()));

            actor.attemptsTo(Scroll.to(By.xpath(LINK_MOSTRAR_DETALLE_TRANSACCION.getCssOrXPathSelector()
                    .replace("$codigoAprobacion", datosBusquedaTransaccion.getCodigoAprobacion()))));

            actor.attemptsTo(Click.on(LINK_MOSTRAR_DETALLE_TRANSACCION.getCssOrXPathSelector()
                    .replace("$codigoAprobacion", datosBusquedaTransaccion.getCodigoAprobacion())));

        } else if (TD_RESULTADO_BUSQUEDA_TRANSACCION_VACIA.resolveFor(actor).isVisible()) {
            return;
        }
    }

    private void buscarPorRangoFecha() {
        inputFechaDesde = BUSQUEDA_POR_FECHA_DESDE;
        inputFechaHasta = BUSQUEDA_POR_FECHA_HASTA;
        inputBuscar = BUSQUEDA_POR_ID_TIENDA;
        valorFechaDesde = datosBusquedaTransaccion.getFechaDesde();
        valorFechaHasta = datosBusquedaTransaccion.getFechaHasta();
        valorABuscar = "";
    }

    private void buscarPorIdTienda() {
        inputFechaDesde = BUSQUEDA_POR_FECHA_DESDE;
        inputFechaHasta = BUSQUEDA_POR_FECHA_HASTA;
        inputBuscar = BUSQUEDA_POR_ID_TIENDA;
        valorFechaDesde = datosBusquedaTransaccion.getFechaDesde();
        valorFechaHasta = datosBusquedaTransaccion.getFechaHasta();
        valorABuscar = datosBusquedaTransaccion.getIdTienda();
    }

    private void buscarPorIdOrden() {
        inputFechaDesde = BUSQUEDA_POR_FECHA_DESDE;
        inputFechaHasta = BUSQUEDA_POR_FECHA_HASTA;
        inputBuscar = BUSQUEDA_POR_ID_ORDEN;
        valorFechaDesde = datosBusquedaTransaccion.getFechaDesde();
        valorFechaHasta = datosBusquedaTransaccion.getFechaHasta();
        valorABuscar = datosBusquedaTransaccion.getIdOrden();
    }

    private void buscarPorIdUsuario() {
        inputFechaDesde = BUSQUEDA_POR_FECHA_DESDE;
        inputFechaHasta = BUSQUEDA_POR_FECHA_HASTA;
        inputBuscar = BUSQUEDA_POR_ID_USUARIO;
        valorFechaDesde = datosBusquedaTransaccion.getFechaDesde();
        valorFechaHasta = datosBusquedaTransaccion.getFechaHasta();
        valorABuscar = datosBusquedaTransaccion.getIdUsuario();
    }

    private void buscarPorCodigoMoneda() {
        inputFechaDesde = BUSQUEDA_POR_FECHA_DESDE;
        inputFechaHasta = BUSQUEDA_POR_FECHA_HASTA;
        inputBuscar = BUSQUEDA_POR_COD_MONEDA;
        valorFechaDesde = datosBusquedaTransaccion.getFechaDesde();
        valorFechaHasta = datosBusquedaTransaccion.getFechaHasta();
        valorABuscar = datosBusquedaTransaccion.getCodigoMoneda();
    }

    private void buscarPorCodigoAprobacion() {
        inputFechaDesde = BUSQUEDA_POR_FECHA_DESDE;
        inputFechaHasta = BUSQUEDA_POR_FECHA_HASTA;
        inputBuscar = BUSQUEDA_POR_COD_APROBACION;
        valorFechaDesde = datosBusquedaTransaccion.getFechaDesde();
        valorFechaHasta = datosBusquedaTransaccion.getFechaHasta();
        valorABuscar = datosBusquedaTransaccion.getCodigoAprobacion();
    }

    private void buscarPorIdTerminal() {
        inputFechaDesde = BUSQUEDA_POR_FECHA_DESDE;
        inputFechaHasta = BUSQUEDA_POR_FECHA_HASTA;
        inputBuscar = BUSQUEDA_POR_ID_TERMINAL;
        valorFechaDesde = datosBusquedaTransaccion.getFechaDesde();
        valorFechaHasta = datosBusquedaTransaccion.getFechaHasta();
        valorABuscar = datosBusquedaTransaccion.getIdTerminal();
    }

    private void buscarPorIdTransaccion() {
        inputFechaDesde = BUSQUEDA_POR_FECHA_DESDE;
        inputFechaHasta = BUSQUEDA_POR_FECHA_HASTA;
        inputBuscar = BUSQUEDA_POR_ID_TRANSACCION;
        valorFechaDesde = datosBusquedaTransaccion.getFechaDesde();
        valorFechaHasta = datosBusquedaTransaccion.getFechaHasta();
        valorABuscar = datosBusquedaTransaccion.getIdTransaccion();
    }

    private void buscarPorTipoTransaccion() {
        inputFechaDesde = BUSQUEDA_POR_FECHA_DESDE;
        inputFechaHasta = BUSQUEDA_POR_FECHA_HASTA;
        inputBuscar = BUSQUEDA_POR_TIPO_TRANSACCION;
        valorFechaDesde = datosBusquedaTransaccion.getFechaDesde();
        valorFechaHasta = datosBusquedaTransaccion.getFechaHasta();
        valorABuscar = datosBusquedaTransaccion.getTipoTransaccion();
    }

    private void buscarPorEstadoTransaccion() {
        inputFechaDesde = BUSQUEDA_POR_FECHA_DESDE;
        inputFechaHasta = BUSQUEDA_POR_FECHA_HASTA;
        inputBuscar = BUSQUEDA_POR_ESTADO_TRANSACCION;
        valorFechaDesde = datosBusquedaTransaccion.getFechaDesde();
        valorFechaHasta = datosBusquedaTransaccion.getFechaHasta();
        valorABuscar = datosBusquedaTransaccion.getEstadoTransaccion();
    }

}
