package pa.com.banistmo.exceptions.steps;

public class BusquedaLogsException extends AssertionError{

    public static final String MENSAJE_BUSQUEDA_DE_LOGS_INCORRECTA =
            "Los Logs no fueron encontrados";

    public static final String MENSAJE_BUSQUEDA_LOGS_CAMPOS_OBLIGATORIOS =
            "Cuando se verificaron los campos obligatorios, en el formulario de busqueda de logs, " +
                    "se obtuvo un mensaje diferente al esperado";

    public static final String MENSAJE_BUSQUEDA_LOGS_DATOS_INCORRECTOS =
            "Cuando se verificaron que los datos sean incorrectos, en el formulario de busqueda de logs, " +
                    "se obtuvo un mensaje diferente al esperado";


    public BusquedaLogsException(String message, Throwable testErrorException){
        super(message, testErrorException);
    }
}
