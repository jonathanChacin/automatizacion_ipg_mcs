package pa.com.banistmo.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.banistmo.exceptions.steps.BusquedaTransaccionException;
import pa.com.banistmo.model.DatosBusquedaTransaccion;
import pa.com.banistmo.questions.SeMuestreMensajeDeCampoObligatorio;
import pa.com.banistmo.questions.SeMuestreMensajeTransaccionNoEncontrada;
import pa.com.banistmo.questions.SeMuestrenLosDatosDeLaTransaccionBuscada;
import pa.com.banistmo.tasks.BuscarTransaccion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import java.util.List;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.*;
import static pa.com.banistmo.exceptions.steps.BusquedaTransaccionException.*;

public class StepsBusquedaTransaccionIpgMcs {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Cuando("^realizo la buqueda de transaccion en IPG MCS por (.*)$")
    public void realizoLaBuquedaDeTransaccionEnIPGMCSPorCriterioDeBusqueda(String criterioDeBusqueda, List<DatosBusquedaTransaccion> datosBusquedaTransaccion) {
        theActorInTheSpotlight().attemptsTo(BuscarTransaccion.enIpgMcs(criterioDeBusqueda,datosBusquedaTransaccion.get(0)));
        theActorInTheSpotlight().remember("datosBusquedaTransaccion", datosBusquedaTransaccion.get(0));

    }

    @Entonces("^verifico que se muestre la informacion de la transaccion$")
    public void verificoQueSeMuestreLaInformacionDeLaTransaccion() {
        DatosBusquedaTransaccion datosBusquedaTransaccion = theActorInTheSpotlight().recall("datosBusquedaTransaccion");

        theActorInTheSpotlight().should(seeThat(SeMuestrenLosDatosDeLaTransaccionBuscada
                .enIpgMcs(datosBusquedaTransaccion),is(equalTo(datosBusquedaTransaccion.toMap())))
                    .orComplainWith(BusquedaTransaccionException.class, MENSAJE_BUSQUEDA_TRANSACCION_NO_ENCONTRADA));
    }


    @Entonces("^verifico que se muestre el mensaje (.*) notificando que no se encontro la transaccion buscada$")
    public void verificoQueSeMuestreElMensajeMensajeTransaccionNoEncontradaNotificandoQueNoSeEncontroLaTransaccionBuscada(String mensajeTransaccionNoEncontrada) {
        theActorInTheSpotlight().should(seeThat(SeMuestreMensajeTransaccionNoEncontrada.enIpgMcs(mensajeTransaccionNoEncontrada))
                .orComplainWith(BusquedaTransaccionException.class,MENSAJE_BUSQUEDA_TRANSACCION_VACIA));
    }

    @Entonces("^verifico que se muestre el mensaje (.*\n?.*) notificando que existen campos obligatorios por diligenciar$")
    public void verificoQueSeMuestreElMensajeMensajeCampoObligatorioNotificandoQueExistenCamposObligatoriosPorDiligenciar(String mensajeCampoObligatorio) {
        theActorInTheSpotlight().should(seeThat(SeMuestreMensajeDeCampoObligatorio.enBuscarTransaccionIpgMcs(mensajeCampoObligatorio))
                .orComplainWith(BusquedaTransaccionException.class,MENSAJE_BUSQUEDA_TRANSACCION_CAMPOS_OBLIGATORIOS));
    }

}
