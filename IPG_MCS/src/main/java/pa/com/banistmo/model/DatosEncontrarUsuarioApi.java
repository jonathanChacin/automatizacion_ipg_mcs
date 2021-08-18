package pa.com.banistmo.model;

import java.util.HashMap;
import java.util.Map;

public class DatosEncontrarUsuarioApi  {

    private String idTienda;
    private String idUsuario;
    private String fechaCreacion;


    public String getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(String idTienda) {
        this.idTienda = idTienda;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Map<String, String> toMap(){
        Map<String, String> map = new HashMap<>();
        map.put("idTienda",idTienda);
        map.put("idUsuario",idUsuario);
        map.put("fechaCreacion",fechaCreacion);
        return map;
    }


}
