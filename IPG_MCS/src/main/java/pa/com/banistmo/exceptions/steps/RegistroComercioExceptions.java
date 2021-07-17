package pa.com.banistmo.exceptions.steps;

public class RegistroComercioExceptions extends AssertionError {

  public static final String MENSAJE_REGISTRO_COMERCIO_FALLIDO =
      "No se pudo realizar el registro del comercio";
  public static final String MENSAJE_VALIDACION_CAMPOS_OBLIGATORIOS_FALIIDA =
      "No se presenta respuesta esperada al validar campos obligatorios en el registro de comercio";
  public static final String MENSAJE_VALIDACION_REGISTRO_COMERCIO_EXISTE_FALLIDA =
      "Se obtuvo mensaje diferente al esperado al registrar un comercio ya existente";

  public RegistroComercioExceptions(String message, Throwable testErrorException) {
    super(message, testErrorException);
  }
}
