package pa.com.banistmo.tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static pa.com.banistmo.userinterface.RegistroComercioUserInterface.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pa.com.banistmo.model.DatosComercio;

public class RegistrarComercio implements Task {

  private final DatosComercio datosComercio;

  public RegistrarComercio(DatosComercio datosComercio) {
    this.datosComercio = datosComercio;
  }

  public static RegistrarComercio enIpgMcs(DatosComercio datosComercio) {
    return Tasks.instrumented(RegistrarComercio.class, datosComercio);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(WaitUntil.the(OPCION_ATENCION_COMERCIO, isClickable()));
    actor.attemptsTo(Click.on(OPCION_ATENCION_COMERCIO));
    actor.attemptsTo(Click.on(OPCION_NUEVO_COMERCIO));
    if (TEXTO_MAESTRO.resolveFor(actor).isVisible()) {
      actor.attemptsTo(
          SelectFromOptions.byVisibleText(datosComercio.getRevendedor()).from(OPCION_REVENDEDOR));
      if (INPUT_TEXT_ID_TIENDA.resolveFor(actor).isEnabled()) {
        actor.attemptsTo(Enter.theValue(datosComercio.getIdTienda()).into(INPUT_TEXT_ID_TIENDA));
      }
      actor.attemptsTo(Enter.theValue(datosComercio.getMcc()).into(INPUT_TEXT_MCC));
      actor.attemptsTo(
          Enter.theValue(datosComercio.getNombreLegal()).into(INPUT_TEXT_NOMBRE_LEGAL));
      actor.attemptsTo(Enter.theValue(datosComercio.getCorreo()).into(INPUT_TEXT_CORREO));
      actor.attemptsTo(Enter.theValue(datosComercio.getUrl()).into(INPUT_TEXT_URL));
      actor.attemptsTo(
          SelectFromOptions.byVisibleText(datosComercio.getMoneda()).from(OPCION_MONEDA));
      actor.attemptsTo(
          SelectFromOptions.byVisibleText(datosComercio.getZonaHoraria())
              .from(OPCION_ZONA_HORARIA));
      actor.attemptsTo(
          SelectFromOptions.byVisibleText(datosComercio.getEstado()).from(OPCION_ESTADO));
      actor.attemptsTo(Enter.theValue(datosComercio.getDba()).into(INPUT_TEXT_DBA));
      actor.attemptsTo(Click.on(BOTON_SIGUIENTE));
    }
    if (TEXTO_DIRECCION.resolveFor(actor).isVisible()) {
      actor.attemptsTo(Enter.theValue(datosComercio.getDireccion1()).into(INPUT_TEXT_DIRECCION1));
      actor.attemptsTo(Enter.theValue(datosComercio.getDireccion2()).into(INPUT_TEXT_DIRECCION2));
      actor.attemptsTo(Enter.theValue(datosComercio.getCiudad()).into(INPUT_TEXT_CUIDAD));
      actor.attemptsTo(Enter.theValue(datosComercio.getEstado()).into(INPUT_TEXT_ESTADO));
      actor.attemptsTo(
          Enter.theValue(datosComercio.getCodigoPostal()).into(INPUT_TEXT_CODIGO_POSTAL));
      actor.attemptsTo(
          SelectFromOptions.byVisibleText(datosComercio.getCodigoPais()).from(OPCION_PAIS));
      actor.attemptsTo(Click.on(BOTON_SIGUIENTE));
    } else {
      return;
    }

    if (TEXTO_CONTACTO.resolveFor(actor).isVisible()) {
      actor.attemptsTo(
          SelectFromOptions.byVisibleText(datosComercio.getTipoContacto())
              .from(OPCION_TIPO_CONTACTO));
      actor.attemptsTo(Enter.theValue(datosComercio.getNombre()).into(INPUT_TEXT_NOMBRE));
      actor.attemptsTo(
          Enter.theValue(datosComercio.getCorreoContacto()).into(INPUT_TEXT_CORREO_CONTACTO));
      actor.attemptsTo(Enter.theValue(datosComercio.getTelefono()).into(INPUT_TEXT_TELEFONO));
      actor.attemptsTo(Enter.theValue(datosComercio.getFax()).into(INPUT_TEXT_FAX));
      actor.attemptsTo(Click.on(BOTON_SIGUIENTE));
    } else {
      return;
    }
    if (TEXTO_SERVICIOS.resolveFor(actor).isVisible()) {
      actor.attemptsTo(
          SelectFromOptions.byVisibleText(datosComercio.getServicio1()).from(OPCION_SERVICIO1));
      actor.attemptsTo(Click.on(BOTON_AGREGAR));
      actor.attemptsTo(
          SelectFromOptions.byVisibleText(datosComercio.getServicio2()).from(OPCION_SERVICIO2));
      actor.attemptsTo(Click.on(BOTON_AGREGAR));
      actor.attemptsTo(
          SelectFromOptions.byVisibleText(datosComercio.getServicio3()).from(OPCION_SERVICIO3));
      actor.attemptsTo(Click.on(BOTON_AGREGAR));
      if (TEXTO_CONNECT_HPP.resolveFor(actor).isVisible()) {
        actor.attemptsTo(Click.on(BOTON_AGREGAR_CLAVE));
      }
      actor.attemptsTo(Click.on(BOTON_SIGUIENTE));
    } else {
      return;
    }
    if (TEXTO_CONFIGURACION_TERMINAL.resolveFor(actor).isVisible()) {
      actor.attemptsTo(
          SelectFromOptions.byVisibleText(datosComercio.getPuntoFinal()).from(OPCION_PUNTO_FINAL));
      actor.attemptsTo(Enter.theValue(datosComercio.getiDTerminal()).into(INPUT_TEXT_ID_TERMINAL));
      actor.attemptsTo(Enter.theValue(datosComercio.getiDComercio()).into(INPUT_TEXT_ID_MERCHANT));
      if (("Si").equals(datosComercio.getVisa())) {
        actor.attemptsTo(Click.on(CHECKBOX_VISA));
      }
      if (("Si").equals(datosComercio.getMastercard())) {
        actor.attemptsTo(Click.on(CHECKBOX_MASTERCARD));
      }
      actor.attemptsTo(Click.on(BOTON_AGREGAR_ACTUALIZAR));
      if (TEXTO_ERROR.resolveFor(actor).isVisible()) {
        return;
      }
      actor.attemptsTo(Click.on(BOTON_SIGUIENTE));
    } else {
      return;
    }

    if (TEXTO_LIMITES_DE_COMPRA.resolveFor(actor).isVisible()) {
      actor.attemptsTo(
          Enter.theValue(datosComercio.getMontoLimite()).into(INPUT_TEXT_MONTO_LIMITE));
      actor.attemptsTo(Click.on(BOTON_AGREGAR_ACTUALIZAR));
      actor.attemptsTo(Click.on(BOTON_SIGUIENTE));
    } else {
      return;
    }
    if (TEXTO_SETEODEFRAUDES.resolveFor(actor).isVisible()) {
      if (TEXTO_CONECTAR_LOGOTIPOS.resolveFor(actor).isVisible()) {
        actor.attemptsTo(Click.on(BOTON_SIGUIENTE));
      } else {
        actor.attemptsTo(Click.on(BOTON_GUARDAR_TODO));
      }
    }
    if (TEXTO_CONECTAR_LOGOS.resolveFor(actor).isVisible()) {
      actor.attemptsTo(Click.on(BOTON_GUARDAR_TODO));
    }
  }
}
