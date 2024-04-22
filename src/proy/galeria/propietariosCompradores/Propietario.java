package proy.galeria.propietariosCompradores;
import proy.galeria.usuarios.*;

public class Propietario extends Usuario
{
	private String id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    public Propietario(String nombre1, String email1, String password1, String rol1,String id, String nombre, String direccion, String telefono, String email) 
    {
        super(nombre1, email1, password1, rol1);
    	this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
}
