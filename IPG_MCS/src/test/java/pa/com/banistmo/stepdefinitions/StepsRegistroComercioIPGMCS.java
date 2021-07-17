package pa.com.banistmo.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static pa.com.banistmo.exceptions.steps.RegistroComercioExceptions.*;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import java.util.List;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.banistmo.exceptions.steps.RegistroComercioExceptions;
import pa.com.banistmo.model.DatosComercio;
import pa.com.banistmo.questions.SeGuardeRegistroComercio;
import pa.com.banistmo.questions.SeMuestreMensajeCampoObligatorio;
import pa.com.banistmo.questions.SeMuestreMensajeComercioExiste;
import pa.com.banistmo.tasks.RegistrarComercio;
import pa.com.banistmo.util.AsignarNumeroAleatorio;

public class StepsRegistroComercioIPGMCS {

  @Before
  public void setStage() {
    setTheStage(new OnlineCast());
  }

  @Cuando("^registro la informacion del comercio$")
  public void registroLaInformacionDelComercio(List<DatosComercio> datosRegistroComercio) {
    DatosComercio datosComercio =
        AsignarNumeroAleatorio.deTiendaSiEsNecesario(datosRegistroComercio.get(0));
    theActorInTheSpotlight().attemptsTo(RegistrarComercio.enIpgMcs(datosComercio));
  }

  @Entonces("^valido el registro del comercio exitoso al visualizar el texto \"([^\"]*)\"$")
  public void validoElRegistroDelComercioExitosoAlVisualizarElTexto(String textoComercioGuardado) {
    theActorInTheSpotlight()
        .should(
            seeThat(SeGuardeRegistroComercio.deIpgMcs(textoComercioGuardado))
                .orComplainWith(
                    RegistroComercioExceptions.class, MENSAJE_REGISTRO_COMERCIO_FALLIDO));
  }

  @Entonces("^valido informacion del (.*)$")
  public void validoInformacionDelMensajeCampoObligatorio(String mensajeCampoObligatorio) {
    theActorInTheSpotlight()
        .should(
            seeThat(SeMuestreMensajeCampoObligatorio.deIpgMcs(mensajeCampoObligatorio))
                .orComplainWith(
                    RegistroComercioExceptions.class,
                    MENSAJE_VALIDACION_CAMPOS_OBLIGATORIOS_FALIIDA));
  }

  @Entonces("^verifico (.*) que se muestre mensaje (.*) notificando que el comercio existe$")
  public void
      verificoIdTiendaQueSeMuestreMensajeMensajeComercioExisteNotificandoQueElComercioExiste(
          String idTienda, String mensajeComercioExiste) {
    theActorInTheSpotlight()
        .should(
            seeThat(SeMuestreMensajeComercioExiste.deIpgMcs(idTienda, mensajeComercioExiste))
                .orComplainWith(
                    RegistroComercioExceptions.class,
                    MENSAJE_VALIDACION_REGISTRO_COMERCIO_EXISTE_FALLIDA));
  }
}
