package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static pa.com.banistmo.userinterface.IniciarSesionUsuerInterface.*;

public class IniciarSesion implements Task {

    private String usuario;
    private String contrasena;

    public IniciarSesion(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }


    public static IniciarSesion enIpgMcs(String usuario, String contrasena) {
        return Tasks.instrumented(IniciarSesion.class, usuario, contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(usuario).into(INPUT_TEXT_USUARIO));
        actor.attemptsTo(Enter.theValue(contrasena).into(INPUT_TEXT_CONTRASENA));
        actor.attemptsTo(Click.on(BOTON_INICIAR_SESION));
    }
}
