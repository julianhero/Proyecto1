package proy.galeria.propietariosCompradores;

public class Propietario 
{
	private String id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    public Propietario(String id, String nombre, String direccion, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
}
