package pa.com.banistmo.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.*;
import static pa.com.banistmo.exceptions.steps.BusquedaComercioException.*;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import java.util.List;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.banistmo.exceptions.steps.BusquedaComercioException;
import pa.com.banistmo.model.DatosBusquedaComercio;
import pa.com.banistmo.questions.SeMuestreMensajeBusquedaComercioConCamposVacios;
import pa.com.banistmo.questions.SeMuestreMensajeDeComercioNoEncontrado;
import pa.com.banistmo.questions.SeMuestrenLosDatosDelComercioBuscado;
import pa.com.banistmo.tasks.BuscarComercio;
import pa.com.banistmo.util.FormatearFecha;

public class StepsBusquedaComercioIpgMcs {

  @Before
  public void setStage() {
    setTheStage(new OnlineCast());
  }

  @Cuando("^realizo la busqueda del comercio por (.*)$")
  public void realizoLaBusquedaDelComercioPorCriterioDeBusqueda(
      String criterioDeBusqueda, List<DatosBusquedaComercio> datosBusquedaComercios) {
    theActorInTheSpotlight()
        .attemptsTo(BuscarComercio.enIpgMcs(criterioDeBusqueda, datosBusquedaComercios.get(0)));
    theActorInTheSpotlight().remember("datosBusquedaComercios", datosBusquedaComercios.get(0));
  }

  @Entonces("^verifico que se muestre la informacion del comercio$")
  public void verificoQueSeMuestreLaInformacionDelComercio() {

    DatosBusquedaComercio datosBusqueda = theActorInTheSpotlight().recall("datosBusquedaComercios");
    ;
    datosBusqueda.setFechaApertura(
        FormatearFecha.deBusquedaAResultado(datosBusqueda.getFechaApertura()));
    theActorInTheSpotlight()
        .should(
            seeThat(
                    SeMuestrenLosDatosDelComercioBuscado.enIpgMcs(),
                    is(equalTo(datosBusqueda.toMap())))
                .orComplainWith(
                    BusquedaComercioException.class, MENSAJE_BUSQUEDA_COMERCIO_NO_ENCOTRADO));
  }

  @Entonces(
      "^verifico que se muestre el mensaje (.*) notificando que no se encontro el comercio buscado$")
  public void
      verificoQueSeMuestreElMensajeMensajeComercioNoEncontradoNotificandoQueNoSeEncontroElComercioBuscado(
          String mensajeComercionNoEncotrado) {
    theActorInTheSpotlight()
        .should(
            seeThat(
                    SeMuestreMensajeDeComercioNoEncontrado.enBusquedaDeComercio(
                        mensajeComercionNoEncotrado))
                .orComplainWith(
                    BusquedaComercioException.class, MENSAJE_ERROR_COMERCIO_DATOS_INCORRECTOS));
  }

  @Entonces(
      "^valido que se muestre el mensaje (.*) notificando que se debe seleccionar al menos un criterio de busqueda$")
  public void
      validoQueSeMuestreElMensajeMensajeBusquedaComercioCamposVaciosNotificandoQueSeDebeSeleccionarAlMenosUnCriterioDeBusqueda(
          String mensajeBusquedaComercioCamposVacios) {
    theActorInTheSpotlight()
        .should(
            seeThat(
                    SeMuestreMensajeBusquedaComercioConCamposVacios.enBusquedaDeComercio(
                        mensajeBusquedaComercioCamposVacios))
                .orComplainWith(
                    BusquedaComercioException.class, MENSAJE_BUSQUEDA_COMERCIO_CAMPOS_VACIOS));
  }
}
