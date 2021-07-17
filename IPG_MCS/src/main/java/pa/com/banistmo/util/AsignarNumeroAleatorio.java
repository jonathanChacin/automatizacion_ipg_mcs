package pa.com.banistmo.util;

import org.apache.commons.lang3.RandomStringUtils;
import pa.com.banistmo.model.DatosComercio;

public class AsignarNumeroAleatorio {
  AsignarNumeroAleatorio() {}

  public static DatosComercio deTiendaSiEsNecesario(DatosComercio datosComercio) {

    if (("Aleatorio").equals(datosComercio.getIdTienda())) {
      datosComercio.setIdTienda(RandomStringUtils.randomNumeric(8));
    }
    return datosComercio;
  }
}
