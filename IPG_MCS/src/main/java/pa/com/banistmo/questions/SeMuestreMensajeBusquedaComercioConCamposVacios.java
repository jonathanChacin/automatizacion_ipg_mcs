package pa.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.banistmo.userinterface.BuscarComercioUserInterface;

public class SeMuestreMensajeBusquedaComercioConCamposVacios implements Question<Boolean> {

  private String mensajeBusquedaComercioCamposVacios;

  public SeMuestreMensajeBusquedaComercioConCamposVacios(
      String mensajeBusquedaComercioCamposVacios) {
    this.mensajeBusquedaComercioCamposVacios = mensajeBusquedaComercioCamposVacios;
  }

  public static SeMuestreMensajeBusquedaComercioConCamposVacios enBusquedaDeComercio(
      String mensajeBusquedaComercioCamposVacios) {
    return new SeMuestreMensajeBusquedaComercioConCamposVacios(mensajeBusquedaComercioCamposVacios);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return Text.of(BuscarComercioUserInterface.LI_MENSAJE_BUSQUEDA_COMERCIO_CAMPOS_VACIOS)
        .viewedBy(actor)
        .asString()
        .equals(mensajeBusquedaComercioCamposVacios);
  }
}
