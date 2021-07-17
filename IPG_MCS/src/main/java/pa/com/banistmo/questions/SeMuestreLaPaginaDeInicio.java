package pa.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.banistmo.userinterface.IniciarSesionUsuerInterface;

public class SeMuestreLaPaginaDeInicio implements Question<Boolean> {

  private String textoDelInicio;

  public SeMuestreLaPaginaDeInicio(String textoDelInicio) {
    this.textoDelInicio = textoDelInicio;
  }

  public static SeMuestreLaPaginaDeInicio deIpgMcs(String textoDelInicio) {
    return new SeMuestreLaPaginaDeInicio(textoDelInicio);
  }

  @Override
  public Boolean answeredBy(Actor actor) {

    return Text.of(IniciarSesionUsuerInterface.TD_TEXTO_INICIO)
        .viewedBy(actor)
        .asString()
        .contains(textoDelInicio);
  }
}
