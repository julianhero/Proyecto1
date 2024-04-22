package proy.galeria.inventario;

public class Pintura extends Pieza {
    private String tecnica;
    private String estilo;

    public Pintura(String id, String tipo, String titulo, String autor, String fechaCreacion, String lugarCreacion, boolean disponibleParaVenta, Double precioFijo, String estado, String tecnica, String estilo) {
        super(id, tipo, titulo, autor, fechaCreacion, lugarCreacion, disponibleParaVenta, precioFijo, estado);
        this.tecnica = tecnica;
        this.estilo = estilo;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }


}