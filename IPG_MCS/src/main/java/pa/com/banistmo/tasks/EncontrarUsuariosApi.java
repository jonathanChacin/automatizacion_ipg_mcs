package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static pa.com.banistmo.userinterface.EncontrarUsuariosApiUserInterface.*;


public class EncontrarUsuariosApi implements Task {




    public static EncontrarUsuariosApi enIpgMcs() {
        return Tasks.instrumented(EncontrarUsuariosApi.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LINK_ENCONTRAR_USUARIOS_API));


    }
}