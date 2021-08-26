package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import pa.com.banistmo.model.DatosBusquedaLogs;

import static pa.com.banistmo.userinterface.BuscarLogsUserInterface.*;

public class BuscarLogs implements Task {

    private static final String BUSCAR_POR_ID_TIENDA = "idTienda";
    private static final String BUSCAR_POR_ID_ORDEN = "idOrden";

    private static final Target BUSQUEDA_POR_ID_TIENDA = IMPUT_TIENDA_ID;
    private static final Target BUSQUEDA_POR_ID_ORDEN = IMPUT_ORDEN_ID;

    private final String criteriosDeBusqueda;
    private Target inputBuscar;
    private Target inputIdTienda;
    private String valorBuscar;
    private String valorBuscarIdTienda;
    DatosBusquedaLogs datosBusquedaLogs;

    public BuscarLogs(String criteriosDeBusqueda,DatosBusquedaLogs datosBusquedaLogs) {
        this.criteriosDeBusqueda = criteriosDeBusqueda;
        this.datosBusquedaLogs = datosBusquedaLogs;
    }

    public static BuscarLogs enIpgMcs(String criteriosDeBusqueda,DatosBusquedaLogs datosBusquedaLogs) {
        return Tasks.instrumented(BuscarLogs.class,criteriosDeBusqueda,datosBusquedaLogs);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (criteriosDeBusqueda){

            case BUSCAR_POR_ID_TIENDA:
                buscarPorIdTienda();
                break;

            case BUSCAR_POR_ID_ORDEN:
                buscarPorIdOrden();
                break;

            default:
                break;
        }

        actor.attemptsTo(Click.on(INICIO_DE_SESION));
        actor.attemptsTo(Enter.theValue(datosBusquedaLogs.getFechaDesde()).into(INPUT_FECHA_DESDE));
        actor.attemptsTo(Click.on(CLICK_EN_PANTALLA));
        actor.attemptsTo(Enter.theValue(datosBusquedaLogs.getFechaHasta()).into(INPUT_FECHA_HASTA));
        actor.attemptsTo(Click.on(CLICK_EN_PANTALLA));

        if(inputBuscar.equals(BUSQUEDA_POR_ID_TIENDA)){
            actor.attemptsTo(Enter.theValue(valorBuscar).into(inputBuscar));
        }else if(inputBuscar.equals(BUSQUEDA_POR_ID_ORDEN)) {
            actor.attemptsTo(Enter.theValue(valorBuscarIdTienda).into(inputIdTienda));
            actor.attemptsTo(Enter.theValue(valorBuscar).into(inputBuscar));
        }

        actor.attemptsTo(Click.on(BOTON_BUSCAR));

    }

    private void buscarPorIdTienda() {
        inputBuscar = BUSQUEDA_POR_ID_TIENDA;
        valorBuscar = datosBusquedaLogs.getIdTienda();
    }

    private void buscarPorIdOrden() {
        inputIdTienda = BUSQUEDA_POR_ID_TIENDA;
        inputBuscar = BUSQUEDA_POR_ID_ORDEN;
        valorBuscar = datosBusquedaLogs.getIdOrden();
        valorBuscarIdTienda = datosBusquedaLogs.getIdTienda();
    }

}
