package pa.com.banistmo.questions;

import static pa.com.banistmo.userinterface.ResultadoBusquedaComercioUserInterface.*;

import java.util.Map;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.banistmo.model.DatosBusquedaComercio;

public class SeMuestrenLosDatosDelComercioBuscado implements Question<Map> {

  public static SeMuestrenLosDatosDelComercioBuscado enIpgMcs() {
    return new SeMuestrenLosDatosDelComercioBuscado();
  }

  @Override
  public Map answeredBy(Actor actor) {

    DatosBusquedaComercio datosBusquedaComercio = new DatosBusquedaComercio();
    datosBusquedaComercio.setIdTienda(Text.of(TD_RESULTADO_ID_TIENDA).viewedBy(actor).asString());
    datosBusquedaComercio.setNombreLegal(Text.of(TD_RESULTADO_NOMBRE_LEGAL).viewedBy(actor).asString());
    datosBusquedaComercio.setRevendedor(Text.of(TD_RESULTADO_REVENDEDOR).viewedBy(actor).asString());
    datosBusquedaComercio.setIdTerminal(Text.of(TD_ID_TERMINAL).viewedBy(actor).asString());
    datosBusquedaComercio.setIdComercio(Text.of(TD_ID_COMERCIO).viewedBy(actor).asString());
    datosBusquedaComercio.setFechaApertura(Text.of(TD_RESULTADO_FECHA_APERTURA).viewedBy(actor).asString());
    return datosBusquedaComercio.toMap();
  }
}
