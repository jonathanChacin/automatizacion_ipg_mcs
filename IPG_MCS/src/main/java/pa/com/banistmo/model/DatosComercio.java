package pa.com.banistmo.model;

import java.util.HashMap;
import java.util.Map;

public class DatosComercio {
  private String revendedor;
  private String idTienda;
  private String mcc;
  private String nombreLegal;
  private String correo;
  private String url;
  private String moneda;
  private String zonaHoraria;
  private String estado;
  private String dba;
  private String direccion1;
  private String direccion2;
  private String ciudad;
  private String codigoPostal;
  private String codigoPais;
  private String tipoContacto;
  private String nombre;
  private String correoContacto;
  private String telefono;
  private String fax;
  private String servicio1;
  private String servicio2;
  private String servicio3;
  private String puntoFinal;
  private String idTerminal;
  private String idComercio;
  private String visa;
  private String mastercard;
  private String montoLimite;

  public String getRevendedor() {
    return revendedor;
  }

  public void setRevendedor(String revendedor) {
    this.revendedor = revendedor;
  }

  public String getIdTienda() {
    return idTienda;
  }

  public void setIdTienda(String idTienda) {
    this.idTienda = idTienda;
  }

  public String getMcc() {
    return mcc;
  }

  public void setMcc(String mcc) {
    this.mcc = mcc;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getNombreLegal() {
    return nombreLegal;
  }

  public void setNombreLegal(String nombreLegal) {
    this.nombreLegal = nombreLegal;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getMoneda() {
    return moneda;
  }

  public void setMoneda(String moneda) {
    this.moneda = moneda;
  }

  public String getZonaHoraria() {
    return zonaHoraria;
  }

  public void setZonaHoraria(String zonaHoraria) {
    this.zonaHoraria = zonaHoraria;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getDba() {
    return dba;
  }

  public void setDba(String dba) {
    this.dba = dba;
  }

  public String getDireccion1() {
    return direccion1;
  }

  public void setDireccion1(String direccion1) {
    this.direccion1 = direccion1;
  }

  public String getDireccion2() {
    return direccion2;
  }

  public void setDireccion2(String direccion2) {
    this.direccion2 = direccion2;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public String getCodigoPostal() {
    return codigoPostal;
  }

  public void setCodigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
  }

  public String getCodigoPais() {
    return codigoPais;
  }

  public void setCodigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
  }

  public String getTipoContacto() {
    return tipoContacto;
  }

  public void setTipoContacto(String tipoContacto) {
    this.tipoContacto = tipoContacto;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCorreoContacto() {
    return correoContacto;
  }

  public void setCorreoContacto(String correoContacto) {
    this.correoContacto = correoContacto;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public String getServicio1() {
    return servicio1;
  }

  public void setServicio1(String servicio1) {
    this.servicio1 = servicio1;
  }

  public String getServicio2() {
    return servicio2;
  }

  public void setServicio2(String servicio2) {
    this.servicio2 = servicio2;
  }

  public String getServicio3() {
    return servicio3;
  }

  public void setServicio3(String servicio3) {
    this.servicio3 = servicio3;
  }

  public String getPuntoFinal() {
    return puntoFinal;
  }

  public void setPuntoFinal(String puntoFinal) {
    this.puntoFinal = puntoFinal;
  }

  public String getiDTerminal() {
    return idTerminal;
  }

  public void setiDTerminal(String iDTerminal) {
    this.idTerminal = iDTerminal;
  }

  public String getiDComercio() {
    return idComercio;
  }

  public void setiDComercio(String iDComercio) {
    this.idComercio = iDComercio;
  }

  public String getVisa() {
    return visa;
  }

  public void setVisa(String visa) {
    this.visa = visa;
  }

  public String getMastercard() {
    return mastercard;
  }

  public void setMastercard(String mastercard) {
    this.mastercard = mastercard;
  }

  public String getMontoLimite() {
    return montoLimite;
  }

  public void setMontoLimite(String montoLimite) {
    this.montoLimite = montoLimite;
  }

  public Map<String, String> toMap() {
    Map<String, String> map = new HashMap<>();
    map.put("revendedor", revendedor);
    map.put("idTienda", idTienda);
    map.put("mcc", mcc);
    map.put("nombreLegal", nombreLegal);
    map.put("Correo", correo);
    map.put("url", url);
    map.put("moneda", moneda);
    map.put("zonaHoraria", zonaHoraria);
    map.put("estado", estado);
    map.put("dba", dba);
    map.put("direccion1", direccion1);
    map.put("direccion2", direccion2);
    map.put("ciudad", ciudad);
    map.put("codigoPostal", codigoPostal);
    map.put("codigoPais", codigoPais);
    map.put("TipoContacto", tipoContacto);
    map.put("nombre", nombre);
    map.put("correoContacto", correoContacto);
    map.put("telefono", telefono);
    map.put("fax", fax);
    map.put("servicio1", servicio1);
    map.put("servicio2", servicio2);
    map.put("servicio3", servicio3);
    map.put("puntoFinal", puntoFinal);
    map.put("idTerminal", idTerminal);
    map.put("idComercio", idComercio);
    map.put("visa", visa);
    map.put("mastercard", mastercard);
    map.put("montoLimite", montoLimite);

    return map;
  }
}
