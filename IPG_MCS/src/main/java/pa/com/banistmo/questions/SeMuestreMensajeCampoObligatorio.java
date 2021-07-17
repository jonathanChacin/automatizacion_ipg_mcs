package pa.com.banistmo.questions;

import static pa.com.banistmo.userinterface.RegistroComercioUserInterface.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SeMuestreMensajeCampoObligatorio implements Question<Boolean> {

  private final String mensajeCampoObligatorio;

  public SeMuestreMensajeCampoObligatorio(String mensajeCampoObligatorio) {
    this.mensajeCampoObligatorio = mensajeCampoObligatorio;
  }

  public static SeMuestreMensajeCampoObligatorio deIpgMcs(String mensajeCampoObligatorio) {
    return new SeMuestreMensajeCampoObligatorio(mensajeCampoObligatorio);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean verificaAsercionCampoObligatorio;

    if (TEXTO_ERROR_CAMPO_OBLIGATORIO.resolveFor(actor).isVisible()) {
      String validaCampoObligatorio1 =
          Text.of(TEXTO_ERROR_CAMPO_OBLIGATORIO).viewedBy(actor).asString();
      verificaAsercionCampoObligatorio = validaCampoObligatorio1.contains(mensajeCampoObligatorio);
      return verificaAsercionCampoObligatorio;
    }

    if (TEXTO_ERROR_CAMPO_OBLIGATORIO2.resolveFor(actor).isVisible()) {

      String validaCampoObligatorio2 =
          Text.of(TEXTO_ERROR_CAMPO_OBLIGATORIO2).viewedBy(actor).asString();
      verificaAsercionCampoObligatorio = validaCampoObligatorio2.contains(mensajeCampoObligatorio);

    } else {
      verificaAsercionCampoObligatorio = false;
    }

    return verificaAsercionCampoObligatorio;
  }
}
