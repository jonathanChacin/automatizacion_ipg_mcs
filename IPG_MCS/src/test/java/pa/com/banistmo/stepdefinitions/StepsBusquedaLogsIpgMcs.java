package pa.com.banistmo.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.banistmo.exceptions.steps.BusquedaLogsException;
import pa.com.banistmo.model.DatosBusquedaLogs;
import pa.com.banistmo.questions.SeMuestraMensajeDeCampoObligatorioLogs;
import pa.com.banistmo.questions.SeMuestraMensajeDeFormatoIncorrecto;
import pa.com.banistmo.questions.SeMuestranLosLogsCorrectos;
import pa.com.banistmo.tasks.BuscarLogs;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static pa.com.banistmo.exceptions.steps.BusquedaLogsException.*;

public class StepsBusquedaLogsIpgMcs {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Cuando("^realizo la busqueda de logs en IPG MCS por (.*)$")
    public void realizoLaBusquedaDeLogsEnIPGMCSPor(String criteriosDeBusqueda, List<DatosBusquedaLogs> datosBusquedaLogs) {
        theActorInTheSpotlight().attemptsTo(BuscarLogs.enIpgMcs(criteriosDeBusqueda,datosBusquedaLogs.get(0)));
    }

    @Entonces("^verifico que se muestre la (.*) del comercio$")
    public void verificoQueSeMuestreLaInfoAVerificarDelComercio(String infoAVerificar) {
        theActorInTheSpotlight().should(seeThat(SeMuestranLosLogsCorrectos.enBuscarLogsIpgMcs(infoAVerificar))
                .orComplainWith(BusquedaLogsException.class,MENSAJE_BUSQUEDA_DE_LOGS_INCORRECTA));
    }

    @Entonces("^verifico que se muestre el (.*\n?.*) de los campos$")
    public void verificoQueSeMuestreElMensajeFormatoIncorrectoDeLosCampos(String mensajeFormatoIncorrecto) {
        theActorInTheSpotlight().should(seeThat(SeMuestraMensajeDeFormatoIncorrecto
                .enBuscarLogsIpgMcs(mensajeFormatoIncorrecto))
                    .orComplainWith(BusquedaLogsException.class,MENSAJE_BUSQUEDA_LOGS_DATOS_INCORRECTOS));
    }

    @Entonces("^verifico que se muestre el (.*\n?.*) notificando que existen campos obligatorios$")
    public void verificoQueSeMuestreElNotificandoQueExistenCamposObligatorios(String mensajeCampoObligatorio) {
        theActorInTheSpotlight().should(seeThat(SeMuestraMensajeDeCampoObligatorioLogs
                .enBuscarLogsIpgMcs(mensajeCampoObligatorio))
                    .orComplainWith(BusquedaLogsException.class,MENSAJE_BUSQUEDA_LOGS_CAMPOS_OBLIGATORIOS));
    }



}
