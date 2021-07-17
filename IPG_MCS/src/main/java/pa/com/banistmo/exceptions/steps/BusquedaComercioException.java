package pa.com.banistmo.exceptions.steps;

public class BusquedaComercioException extends AssertionError {

  public static final String MENSAJE_BUSQUEDA_COMERCIO_NO_ENCOTRADO =
      "Los datos del comercio encontrado no son los que se esperaban";
  public static final String MENSAJE_ERROR_COMERCIO_DATOS_INCORRECTOS =
      "Cuando se realizó la busqueda de comercio con datos incorrectos, se obtuvo un mensaje diferente al esperado";
  public static final String MENSAJE_BUSQUEDA_COMERCIO_CAMPOS_VACIOS =
      "Cuando se realizó la busqueda de comercio con campos vacios, se obtuvo un mensaje diferente al esperado";

  public BusquedaComercioException(String message, Throwable testErrorException) {
    super(message, testErrorException);
  }
}
