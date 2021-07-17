package pa.com.banistmo.exceptions.steps;

public class InicioSesionExceptions extends AssertionError {

  public static final String MENSAJE_INICIO_SESION_FALLIDA =
      "No se pudo realizar el inicio de sesion";
  public static final String MENSAJE_ERROR_CREDENCIALES_INCORRECTAS =
      "No se muestra el mensaje de error esperado cuando se intenta iniciar sesion con credenciales";

  public InicioSesionExceptions(String message, Throwable testErrorException) {
    super(message, testErrorException);
  }
}
