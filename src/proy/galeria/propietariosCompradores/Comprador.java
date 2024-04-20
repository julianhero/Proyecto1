package proy.galeria.propietariosCompradores;

public class Comprador 
{
	private String id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private Double limiteCredito;
    
    public Comprador(String id, String nombre, String direccion, String telefono, String email, Double limiteCredito) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.limiteCredito = limiteCredito;
    }
}
