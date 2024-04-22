package proy.galeria.inventario;

public class Video extends Pieza {
    private String duracion;
    private String formato;

    public Video(String id, String tipo, String titulo, String autor, String fechaCreacion, String lugarCreacion, boolean disponibleParaVenta, Double precioFijo, String estado, String duracion, String formato) {
        super(id, tipo, titulo, autor, fechaCreacion, lugarCreacion, disponibleParaVenta, precioFijo, estado);
        this.duracion = duracion;
        this.formato = formato;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

}
