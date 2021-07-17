package pa.com.banistmo.questions;

import static pa.com.banistmo.userinterface.BuscarComercioUserInterface.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SeMuestreMensajeDeComercioNoEncontrado implements Question<Boolean> {

  private String mensajeComercionNoEncotrado;

  public SeMuestreMensajeDeComercioNoEncontrado(String mensajeComercionNoEncotrado) {
    this.mensajeComercionNoEncotrado = mensajeComercionNoEncotrado;
  }

  public static SeMuestreMensajeDeComercioNoEncontrado enBusquedaDeComercio(
      String mensajeComercionNoEncotrado) {
    return new SeMuestreMensajeDeComercioNoEncontrado(mensajeComercionNoEncotrado);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return Text.of(LI_MENSAJE_COMERCIO_NO_ENCONTRADO)
        .viewedBy(actor)
        .asString()
        .equals(mensajeComercionNoEncotrado);
  }
}
