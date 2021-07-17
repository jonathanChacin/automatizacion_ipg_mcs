package pa.com.banistmo.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static pa.com.banistmo.exceptions.steps.InicioSesionExceptions.*;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.banistmo.exceptions.steps.InicioSesionExceptions;
import pa.com.banistmo.questions.SeMuestreLaPaginaDeInicio;
import pa.com.banistmo.questions.SeMuestreMensajeAutenticacionFallida;
import pa.com.banistmo.tasks.AbrirPagina;
import pa.com.banistmo.tasks.IniciarSesion;

public class StepsInicioSesionIPGMCS {

  @Before
  public void setStage() {
    setTheStage(new OnlineCast());
  }

  @Dado("^que ingreso a la aplicacion IPG MCS$")
  public void queIngresoALaAplicacionIPGMCS() {
    theActorCalled("Usuario").wasAbleTo(AbrirPagina.ipgMcs());
  }

  @Cuando("^inicio sesion$")
  public void inicioSesion() {
    String usuario = System.getenv().get("usuarioMcs");
    String contrasena = System.getenv().get("contrasenaMcs");
    theActorInTheSpotlight().attemptsTo(IniciarSesion.enIpgMcs(usuario, contrasena));
  }

  @Cuando("^inicio sesion con (.*) y (.*)$")
  public void incioSesionConUsuarioYContrasena(String usuario, String contrasena) {
    theActorInTheSpotlight().attemptsTo(IniciarSesion.enIpgMcs(usuario, contrasena));
  }

  @Entonces("^verfico el inicio de sesion exitosa al visualizar el texto \"([^\"]*)\"$")
  public void verficoElInicioDeSesionExitosaAlVisualizarElTexto(String textoDelInicio) {
    theActorInTheSpotlight()
        .should(
            seeThat(SeMuestreLaPaginaDeInicio.deIpgMcs(textoDelInicio))
                .orComplainWith(InicioSesionExceptions.class, MENSAJE_INICIO_SESION_FALLIDA));
  }

  @Entonces("^verifica el inicio de sesion fallida con mensaje (.*)$")
  public void verificaElInicioDeSesionFallidaConMensajeMensajeInicioSesionFallida(
      String mensajeAutenticacionFallida) {
    theActorInTheSpotlight()
        .should(
            seeThat(
                    SeMuestreMensajeAutenticacionFallida.enInicioDeSesion(
                        mensajeAutenticacionFallida))
                .orComplainWith(
                    InicioSesionExceptions.class, MENSAJE_ERROR_CREDENCIALES_INCORRECTAS));
  }
}
