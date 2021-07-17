package pa.com.banistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesionUsuerInterface {

    public static final Target INPUT_TEXT_USUARIO =
            Target.the("Caja de texto para intriducir el usuario")
                    .located(By.xpath("//input[@id='IDToken1']"));

    public static final Target INPUT_TEXT_CONTRASENA =
            Target.the("Caja de texto para intriducir la contraseña")
                    .located(By.xpath("//input[@id='IDToken2']"));

    public static final Target BOTON_INICIAR_SESION =
            Target.the("Boton para iniciar sesion")
                    .located(By.xpath("//input[@name='Login.Submit']"));

    public static final Target TD_TEXTO_INICIO =
            Target.the("Texto mostrado en la pagina de inicio")
                    .located(By.xpath("//table[@role='presentation']//child::tbody//child::tr//child::td[contains(text(),'Plataforma')]"));

    public static final Target H3_MENSAJE_INICIO_SESION_FALLIDA =
            Target.the("Texto mostrado cuando en el incio de sesion con credenciales incorrectas")
                    .located(By.xpath("//h3"));

    private IniciarSesionUsuerInterface(){}
}
