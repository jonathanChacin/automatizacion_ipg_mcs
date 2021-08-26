package pa.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static pa.com.banistmo.userinterface.BuscarLogsUserInterface.*;

public class SeMuestranLosLogsCorrectos implements Question<Boolean> {
    private String infoAVerificar;

    public SeMuestranLosLogsCorrectos(String infoAVerificar) {
        this.infoAVerificar = infoAVerificar;
    }

    public static SeMuestranLosLogsCorrectos enBuscarLogsIpgMcs(String infoAVerificar) {
        return new SeMuestranLosLogsCorrectos(infoAVerificar);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(VERIFICAR_INFO_TIENDA)
                .viewedBy(actor).asString()
                    .contains(infoAVerificar);
    }
}
