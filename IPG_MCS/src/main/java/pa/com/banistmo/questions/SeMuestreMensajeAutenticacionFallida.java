package pa.com.banistmo.questions;

import static pa.com.banistmo.userinterface.IniciarSesionUsuerInterface.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SeMuestreMensajeAutenticacionFallida implements Question<Boolean> {

  private String textoAutenticacionFallida;

  public SeMuestreMensajeAutenticacionFallida(String textoAutenticacionFallida) {
    this.textoAutenticacionFallida = textoAutenticacionFallida;
  }

  public static SeMuestreMensajeAutenticacionFallida enInicioDeSesion(
      String textoAutenticacionFallida) {
    return new SeMuestreMensajeAutenticacionFallida(textoAutenticacionFallida);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return Text.of(H3_MENSAJE_INICIO_SESION_FALLIDA)
        .viewedBy(actor)
        .asString()
        .equals(textoAutenticacionFallida);
  }
}
