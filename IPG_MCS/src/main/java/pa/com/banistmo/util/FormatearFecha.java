package pa.com.banistmo.util;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import pa.com.banistmo.exceptions.util.FechaParseException;

public class FormatearFecha {

  private FormatearFecha() {}

  public static String deBusquedaAResultado(String fechaDeConsulta) {

    Date fecha = new Date();
    try {
      fecha = new SimpleDateFormat("dd.MM.yyyy").parse(fechaDeConsulta);
    } catch (ParseException e) {
      throw new FechaParseException(e, fechaDeConsulta);
    }

    DateFormatSymbols symbols = new DateFormatSymbols(new Locale("es", "MX"));

    String[] meses = {
      "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"
    };
    symbols.setShortMonths(meses);

    DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", symbols);

    return dateFormat.format(fecha);
  }
}
