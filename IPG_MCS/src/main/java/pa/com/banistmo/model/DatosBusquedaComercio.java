package pa.com.banistmo.model;

import java.util.HashMap;
import java.util.Map;

public class DatosBusquedaComercio {
  private String idTienda;
  private String nombreLegal;
  private String revendedor;
  private String idTerminal;
  private String idComercio;
  private String fechaApertura;

  public String getIdTienda() {
    return idTienda;
  }

  public void setIdTienda(String idTienda) {
    this.idTienda = idTienda;
  }

  public String getNombreLegal() {
    return nombreLegal;
  }

  public void setNombreLegal(String nombreLegal) {
    this.nombreLegal = nombreLegal;
  }

  public String getRevendedor() {
    return revendedor;
  }

  public void setRevendedor(String revendedor) {
    this.revendedor = revendedor;
  }

  public String getIdComercio() {
    return idComercio;
  }

  public void setIdComercio(String idComercio) {
    this.idComercio = idComercio;
  }

  public String getIdTerminal() {
    return idTerminal;
  }

  public void setIdTerminal(String idTerminal) {
    this.idTerminal = idTerminal;
  }

  public String getFechaApertura() {
    return fechaApertura;
  }

  public void setFechaApertura(String fechaApertura) {
    this.fechaApertura = fechaApertura;
  }

  public Map<String, String> toMap() {
    Map<String, String> map = new HashMap<>();
    map.put("idTienda", idTienda);
    map.put("nombreLegal", nombreLegal);
    map.put("revendedor", revendedor);
    map.put("idTerminal", idTerminal);
    map.put("idComercio", idComercio);
    map.put("fechaApertura", fechaApertura);
    return map;
  }
}
