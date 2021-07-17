package pa.com.banistmo.model;

import java.util.HashMap;
import java.util.Map;

public class DatosBusquedaTransaccion {
    private String fechaDesde;
    private String fechaHasta;
    private String idTienda;
    private String idOrden;
    private String idUsuario;
    private String codigoMoneda;
    private String codigoAprobacion;
    private String idTerminal;
    private String idTransaccion;
    private String tipoTransaccion;
    private String estadoTransaccion;

    public String getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(String idTienda) {
        this.idTienda = idTienda;
    }

    public String getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(String idOrden) {
        this.idOrden = idOrden;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public String getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public void setCodigoAprobacion(String codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public String getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(String idTerminal) {
        this.idTerminal = idTerminal;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public String getEstadoTransaccion() {
        return estadoTransaccion;
    }

    public void setEstadoTransaccion(String estadoTransaccion) {
        this.estadoTransaccion = estadoTransaccion;
    }

    public Map<String, String> toMap(){
        Map<String, String> map = new HashMap<>();
        map.put("idTienda",idTienda);
        map.put("idOrden",idOrden);
        map.put("idUsuario",idUsuario);
        map.put("codigoMoneda",codigoMoneda);
        map.put("codigoAprobacion",codigoAprobacion);
        map.put("idTerminal",idTerminal);
        map.put("idTransaccion",idTransaccion);
        map.put("tipoTransaccion",tipoTransaccion);
        map.put("estadoTransaccion",estadoTransaccion);
        return map;
    }


}
