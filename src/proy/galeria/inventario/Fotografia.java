package proy.galeria.inventario;

public class Fotografia extends Pieza {
    private String tecnica;
    private String tamano;

    public Fotografia(String id, String tipo, String titulo, String autor, String fechaCreacion, String lugarCreacion, boolean disponibleParaVenta, Double precioFijo, String estado, String tecnica, String tamano) {
        super(id, tipo, titulo, autor, fechaCreacion, lugarCreacion, disponibleParaVenta, precioFijo, estado);
        this.tecnica = tecnica;
        this.tamano = tamano;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }


}