package pa.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.banistmo.userinterface.BuscarTransaccionUserInterface;

public class SeMuestreMensajeDeCampoObligatorio implements Question<Boolean> {

    private String mensajeCampoObligatorio;

    public SeMuestreMensajeDeCampoObligatorio(String mensajeCampoObligatorio) {
        this.mensajeCampoObligatorio = mensajeCampoObligatorio;
    }

    public static SeMuestreMensajeDeCampoObligatorio enBuscarTransaccionIpgMcs(String mensajeCampoObligatorio) {
        return new SeMuestreMensajeDeCampoObligatorio(mensajeCampoObligatorio);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(BuscarTransaccionUserInterface.DIV_MENSAJE_CAMPOS_OBLIGATORIOS)
                .viewedBy(actor).asString()
                    .contains(mensajeCampoObligatorio);
    }
}
