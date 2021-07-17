package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

  public static AbrirPagina ipgMcs() {
    return Tasks.instrumented(AbrirPagina.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String url = System.getenv().get("urlIpgMcs");
    actor.attemptsTo(Open.url(url));
  }
}
