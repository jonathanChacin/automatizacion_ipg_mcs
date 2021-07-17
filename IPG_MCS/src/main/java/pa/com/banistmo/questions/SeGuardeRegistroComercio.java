package pa.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.banistmo.userinterface.RegistroComercioUserInterface;

public class SeGuardeRegistroComercio implements Question<Boolean> {

  private final String textoComercioGuardado;

  public SeGuardeRegistroComercio(String textoComercioGuardado) {
    this.textoComercioGuardado = textoComercioGuardado;
  }

  public static SeGuardeRegistroComercio deIpgMcs(String textoComercioGuardado) {
    return new SeGuardeRegistroComercio(textoComercioGuardado);
  }

  @Override
  public Boolean answeredBy(Actor actor) {

    return Text.of(RegistroComercioUserInterface.INFORMACION_GUARDADO)
        .viewedBy(actor)
        .asString()
        .contains(textoComercioGuardado);
  }
}
