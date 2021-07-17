package pa.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static pa.com.banistmo.userinterface.BuscarTransaccionUserInterface.*;

public class SeMuestreMensajeTransaccionNoEncontrada implements Question<Boolean> {

    private String mensajeTransaccionNoEncontrada;

    public SeMuestreMensajeTransaccionNoEncontrada(String mensajeTransaccionNoEncontrada) {
        this.mensajeTransaccionNoEncontrada = mensajeTransaccionNoEncontrada;
    }

    public static SeMuestreMensajeTransaccionNoEncontrada enIpgMcs(String mensajeTransaccionNoEncontrada) {
        return new SeMuestreMensajeTransaccionNoEncontrada(mensajeTransaccionNoEncontrada);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(TD_RESULTADO_BUSQUEDA_TRANSACCION_VACIA)
                .viewedBy(actor).asString().equals(mensajeTransaccionNoEncontrada);
    }
}
