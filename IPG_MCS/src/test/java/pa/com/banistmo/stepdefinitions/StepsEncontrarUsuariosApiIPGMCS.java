package pa.com.banistmo.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnlineCast;

import pa.com.banistmo.exceptions.steps.BusquedaComercioException;
import pa.com.banistmo.questions.SeMuestrenLosDatosDelUsuarioApiEncontrado;
import pa.com.banistmo.tasks.EncontrarUsuariosApi;
import pa.com.banistmo.model.DatosEncontrarUsuarioApi;
import pa.com.banistmo.util.AsignarNumeroAleatorio;


import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;



public class StepsEncontrarUsuariosApiIPGMCS {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }
    @Y("^selecciono encontrar usuarios API$")
    public void seleccionoEncontrarUsuariosAPI() {
        theActorInTheSpotlight().attemptsTo(EncontrarUsuariosApi.enIpgMcs());
    }


    @Entonces("^valido la informacion del usuario API encontrado$")
    public void validoLaInformacionDelUsuarioAPIEncontrado(List<DatosEncontrarUsuarioApi> datosEncontrarUsuarioApis) {
        theActorInTheSpotlight().remember("datosEncontrarUsuarioApi",datosEncontrarUsuarioApis.get(0));
        DatosEncontrarUsuarioApi datosUsuarioApi = theActorInTheSpotlight().recall("datosEncontrarUsuarioApi");
        theActorInTheSpotlight().should(seeThat(SeMuestrenLosDatosDelUsuarioApiEncontrado.enIpgMcs(),is(equalTo(datosUsuarioApi.toMap())))
                .orComplainWith(BusquedaComercioException.class));

    }


}
