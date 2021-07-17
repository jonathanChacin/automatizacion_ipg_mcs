package pa.com.banistmo.exceptions.util;

public class FechaParseException extends RuntimeException {

  public FechaParseException(Throwable e, String fechaConsulta) {
    super(
        "No fue posible formatear la fecha,"
            + fechaConsulta
            + " .La fecha debe estar en formato dd.MM.yyyy",
        e);
  }
}
