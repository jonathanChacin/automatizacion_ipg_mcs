package pa.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.banistmo.userinterface.RegistroComercioUserInterface;

public class SeMuestreMensajeComercioExiste implements Question<Boolean> {

  private String mensajeComercioExiste;
  private String idTienda;

  public SeMuestreMensajeComercioExiste(String idTienda, String mensajeComercioExiste) {
    this.idTienda = idTienda;
    this.mensajeComercioExiste = mensajeComercioExiste;
  }

  public static SeMuestreMensajeComercioExiste deIpgMcs(
      String idTienda, String mensajeComercioExiste) {
    return new SeMuestreMensajeComercioExiste(idTienda, mensajeComercioExiste);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    boolean resultadoInformacionComercioExiste;
    String verificaComercioExisteID =
        Text.of(RegistroComercioUserInterface.TEXTO_ERROR_COMERCIO_EXISTE)
            .viewedBy(actor)
            .asString();
    String verificaMensajeComercioExiste =
        Text.of(RegistroComercioUserInterface.TEXTO_ERROR_COMERCIO_EXISTE)
            .viewedBy(actor)
            .asString();
    if (verificaComercioExisteID.contains(idTienda)
        && verificaMensajeComercioExiste.contains(mensajeComercioExiste)) {
      resultadoInformacionComercioExiste = true;
    } else {
      resultadoInformacionComercioExiste = false;
    }

    return resultadoInformacionComercioExiste;
  }
}
