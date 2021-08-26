package pa.com.banistmo.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/busqueda_de_logs.feature",
        tags = "@BusquedaDeLogsEnIPGMCS",
        glue = "pa.com.banistmo.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerBusquedaDeLogsIpgMcs {
}
