package pa.com.banistmo.exceptions.steps;

public class BusquedaTransaccionException extends AssertionError{

    public static final String MENSAJE_BUSQUEDA_TRANSACCION_NO_ENCONTRADA =
            "Los datos de la transaccion encontrada, no son iguales a los utilizados en la busqueda";

    public static final String MENSAJE_BUSQUEDA_TRANSACCION_VACIA =
            "Cuando se realizó la busqueda de transaccion con datos incorrectos, se obtuvo un mensaje diferente al esperado";

    public static final String MENSAJE_BUSQUEDA_TRANSACCION_CAMPOS_OBLIGATORIOS =
            "Cuando se verificaron los campos obligatorios, en el formulario de busqueda de transaccion, " +
                    "se obtuvo un mensaje diferente al esperado";

    public BusquedaTransaccionException(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }
}
