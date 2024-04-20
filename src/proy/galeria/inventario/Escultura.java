package proy.galeria.inventario;

public class Escultura extends Pieza
{
	private Double altura;
    private Double anchura;
    private Double profundidad;
    private String materiales;
    private Double peso;
    private boolean requiereElectricidad;
    private String detallesInstalacion;

    public Escultura(String id, String titulo, int fechaCreacion, String lugarCreacion, String autor,
                     Double altura, Double anchura, Double profundidad, String materiales,
                     Double peso, boolean requiereElectricidad, String detallesInstalacion) {
        // Llama al constructor de la clase base
        super(id, titulo, fechaCreacion, lugarCreacion, autor, "escultura");
        
        // Inicializa los atributos específicos de la escultura
        this.altura = altura;
        this.anchura = anchura;
        this.profundidad = profundidad;
        this.materiales = materiales;
        this.peso = peso;
        this.requiereElectricidad = requiereElectricidad;
        this.detallesInstalacion = detallesInstalacion;
    }

    // Métodos adicionales para obtener o establecer detalles de la escultura
    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAnchura() {
        return anchura;
    }

    public void setAnchura(Double anchura) {
        this.anchura = anchura;
    }

    public Double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(Double profundidad) {
        this.profundidad = profundidad;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean isRequiereElectricidad() {
        return requiereElectricidad;
    }

    public void setRequiereElectricidad(boolean requiereElectricidad) {
        this.requiereElectricidad = requiereElectricidad;
    }

    public String getDetallesInstalacion() {
        return detallesInstalacion;
    }

    public void setDetallesInstalacion(String detallesInstalacion) {
        this.detallesInstalacion = detallesInstalacion;
    }
}
