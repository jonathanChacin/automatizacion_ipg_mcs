package pa.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static pa.com.banistmo.userinterface.BuscarLogsUserInterface.*;

public class SeMuestraMensajeDeCampoObligatorioLogs implements Question<Boolean> {
    private String mensajeCampoObligatorio;

    public SeMuestraMensajeDeCampoObligatorioLogs(String mensajeCampoObligatorio) {
        this.mensajeCampoObligatorio = mensajeCampoObligatorio;
    }

    public static SeMuestraMensajeDeCampoObligatorioLogs enBuscarLogsIpgMcs(String mensajeCampoObligatorio) {
        return new SeMuestraMensajeDeCampoObligatorioLogs(mensajeCampoObligatorio);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(MENSAJE_CAMPO_OBLIGATORIO)
                .viewedBy(actor).asString()
                    .contains(mensajeCampoObligatorio);
    }
}
