package pa.com.banistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EncontrarUsuariosApiUserInterface {


    public static final Target LINK_ENCONTRAR_USUARIOS_API=
            Target.the("Link para ir a la pantalla de encontrar usuarios API")
                    .located(By.xpath("//img[@src='/mcs/images/user.gif']"));
    public static final Target TABLA_ID_TIENDA=
            Target.the("Dato de la ID tienda")
                    .located(By.xpath("//div[@id='j_idt58']//child::tr[2]//child::td[4]"));
    public static final Target TABLA_ID_USUARIO=
            Target.the("Dato del ID Usuario")
                    .located(By.xpath("//div[@id='j_idt58']//child::tr[2]//child::td[5]"));
    public static final Target TABLA_FECHA_CREACION_USUARIO_API=
            Target.the("Fecha de creacion usuario API")
                    .located(By.xpath("//div[@id='j_idt58']//child::tr[2]//child::td[7]"));


    private EncontrarUsuariosApiUserInterface(){}
}
