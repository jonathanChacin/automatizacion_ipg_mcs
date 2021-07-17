package pa.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import pa.com.banistmo.model.DatosBusquedaTransaccion;
import java.util.Map;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static pa.com.banistmo.userinterface.BuscarTransaccionUserInterface.*;

public class SeMuestrenLosDatosDeLaTransaccionBuscada implements Question<Map> {

    private DatosBusquedaTransaccion datosBusquedaTransaccion;
    private static final String CODIGO_APROBACION_A_CAMBIAR = "$codigoAprobacion";

    public SeMuestrenLosDatosDeLaTransaccionBuscada(DatosBusquedaTransaccion datosBusquedaTransaccion) {
        this.datosBusquedaTransaccion = datosBusquedaTransaccion;
    }

    public static SeMuestrenLosDatosDeLaTransaccionBuscada enIpgMcs(DatosBusquedaTransaccion datosBusquedaTransaccion) {
        return new SeMuestrenLosDatosDeLaTransaccionBuscada(datosBusquedaTransaccion);
    }

    @Override
    public Map answeredBy(Actor actor) {

        DatosBusquedaTransaccion datosBusquedaObtenidos = new DatosBusquedaTransaccion();

        actor.attemptsTo(WaitUntil.the(LINK_OCULTAR_DETALLE_TRANSACCION.getCssOrXPathSelector()
                .replace(CODIGO_APROBACION_A_CAMBIAR,datosBusquedaTransaccion.getCodigoAprobacion()),isVisible()));

        datosBusquedaObtenidos.setIdTienda(Text.of(TD_RESULTADO_ID_TIENDA.getCssOrXPathSelector()
                .replace(CODIGO_APROBACION_A_CAMBIAR,datosBusquedaTransaccion.getCodigoAprobacion()))
                    .viewedBy(actor).asString());

        datosBusquedaObtenidos.setIdOrden((Text.of(TD_RESULTADO_ID_ORDEN.getCssOrXPathSelector()
                .replace(CODIGO_APROBACION_A_CAMBIAR, datosBusquedaTransaccion.getCodigoAprobacion()))
                .viewedBy(actor).asString()));

        datosBusquedaObtenidos.setIdUsuario((Text.of(TD_RESULTADO_ID_USUARIO.getCssOrXPathSelector()
                .replace(CODIGO_APROBACION_A_CAMBIAR, datosBusquedaTransaccion.getCodigoAprobacion()))
                .viewedBy(actor).asString()));

        datosBusquedaObtenidos.setCodigoMoneda((Text.of(TD_RESULTADO_CODIGO_MONEDA.getCssOrXPathSelector()
                .replace(CODIGO_APROBACION_A_CAMBIAR, datosBusquedaTransaccion.getCodigoAprobacion()))
                .viewedBy(actor).asString()));

        datosBusquedaObtenidos.setCodigoAprobacion((Text.of(TD_RESULTADO_CODIGO_APROBACION.getCssOrXPathSelector()
                .replace(CODIGO_APROBACION_A_CAMBIAR, datosBusquedaTransaccion.getCodigoAprobacion()))
                .viewedBy(actor).asString()));

        datosBusquedaObtenidos.setIdTerminal((Text.of(TD_RESULTADO_ID_TERMINAL.getCssOrXPathSelector()
                .replace(CODIGO_APROBACION_A_CAMBIAR, datosBusquedaTransaccion.getCodigoAprobacion()))
                .viewedBy(actor).asString()));

        datosBusquedaObtenidos.setIdTransaccion((Text.of(TD_RESULTADO_ID_TRANSACCION.getCssOrXPathSelector()
                .replace("$idTransaccion", datosBusquedaTransaccion.getIdTransaccion()))
                .viewedBy(actor).asString()));

        datosBusquedaObtenidos.setTipoTransaccion((Text.of(TD_RESULTADO_TIPO_TRANSACCION.getCssOrXPathSelector()
                .replace(CODIGO_APROBACION_A_CAMBIAR, datosBusquedaTransaccion.getCodigoAprobacion()))
                .viewedBy(actor).asString()));

        datosBusquedaObtenidos.setEstadoTransaccion((Text.of(TD_RESULTADO_ESTADO_TRANSACCION.getCssOrXPathSelector()
                .replace(CODIGO_APROBACION_A_CAMBIAR, datosBusquedaTransaccion.getCodigoAprobacion()))
                .viewedBy(actor).asString()));

        return datosBusquedaObtenidos.toMap();
    }
}
