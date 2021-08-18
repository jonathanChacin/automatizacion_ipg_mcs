package pa.com.banistmo.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.banistmo.exceptions.steps.RegistroComercioExceptions;
import pa.com.banistmo.model.DatosComercio;
import pa.com.banistmo.questions.SeGuardeRegistroComercio;
import pa.com.banistmo.questions.SeMuestreMensajeCampoObligatorio;
import pa.com.banistmo.tasks.EditarComercio;



import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static pa.com.banistmo.exceptions.steps.RegistroComercioExceptions.*;


public class StepsEditarComercioIPGMCS {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }


    @Y("^edito la informacion del comercio$")
    public void editoLaInformacionDelComercio (List<DatosComercio> datosRegistroComercio){
        theActorInTheSpotlight().attemptsTo(EditarComercio.enIpgMcs(datosRegistroComercio.get(0)));
    }

    @Entonces("^valido la edicion del comercio exitosa al visualizar el texto \"([^\"]*)\"$")
    public void validoLaEdicionDelComercioExitosaAlVisualizarElTexto(String textoComercioGuardado) throws Throwable {
        theActorInTheSpotlight().should(seeThat(SeGuardeRegistroComercio.deIpgMcs(textoComercioGuardado))
                .orComplainWith(RegistroComercioExceptions.class,MENSAJE_REGISTRO_COMERCIO_FALLIDO));

    }

    @Entonces("^valido despues de editar el comercio la informacion del (.*)$")
    public void validoDespuesDeEditarElComercioLaInformacionDelMensajeCampoObligatorio(String mensajeCampoObligatorio) {
        theActorInTheSpotlight().should(seeThat(SeMuestreMensajeCampoObligatorio.deIpgMcs(mensajeCampoObligatorio))
                .orComplainWith(RegistroComercioExceptions.class,MENSAJE_VALIDACION_CAMPOS_OBLIGATORIOS_FALIIDA));
    }
}
