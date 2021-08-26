package pa.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static pa.com.banistmo.userinterface.BuscarLogsUserInterface.*;

public class SeMuestraMensajeDeFormatoIncorrecto implements Question<Boolean> {
    private String menssajeFormatoIncorrecto;

    public SeMuestraMensajeDeFormatoIncorrecto(String menssajeFormatoIncorrecto) {
        this.menssajeFormatoIncorrecto = menssajeFormatoIncorrecto;
    }

    public static SeMuestraMensajeDeFormatoIncorrecto enBuscarLogsIpgMcs(String mensajeFormatoIncorrecto) {
        return new SeMuestraMensajeDeFormatoIncorrecto(mensajeFormatoIncorrecto);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(MENSAJE_DATOS_INCORRECTOS)
                .viewedBy(actor).asString()
                    .contains(menssajeFormatoIncorrecto);
    }
}
