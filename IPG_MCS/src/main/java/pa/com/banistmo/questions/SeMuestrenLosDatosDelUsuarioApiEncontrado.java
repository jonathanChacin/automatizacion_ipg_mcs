package pa.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.banistmo.model.DatosEncontrarUsuarioApi;


import java.util.Map;


import static pa.com.banistmo.userinterface.EncontrarUsuariosApiUserInterface.*;

public class SeMuestrenLosDatosDelUsuarioApiEncontrado implements Question<Map> {

    public static SeMuestrenLosDatosDelUsuarioApiEncontrado enIpgMcs() {
        return new SeMuestrenLosDatosDelUsuarioApiEncontrado();
    }

    @Override
    public Map answeredBy(Actor actor) {

        DatosEncontrarUsuarioApi datosEncontrarUsuarioApi = new DatosEncontrarUsuarioApi();

        datosEncontrarUsuarioApi.setIdTienda(Text.of(TABLA_ID_TIENDA).viewedBy(actor).asString());
        datosEncontrarUsuarioApi.setIdUsuario(Text.of(TABLA_ID_USUARIO).viewedBy(actor).asString());
        datosEncontrarUsuarioApi.setFechaCreacion(Text.of(TABLA_FECHA_CREACION_USUARIO_API).viewedBy(actor).asString());

        return datosEncontrarUsuarioApi.toMap();
    }
}
