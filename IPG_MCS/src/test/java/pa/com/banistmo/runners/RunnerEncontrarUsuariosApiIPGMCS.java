package pa.com.banistmo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/encontrar_usuarios_api_ipg_mcs.feature",
        tags = "@EncontrarUsuariosApi",
        glue = "pa.com.banistmo.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerEncontrarUsuariosApiIPGMCS {
}
