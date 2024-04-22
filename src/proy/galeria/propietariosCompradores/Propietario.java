package proy.galeria.propietariosCompradores;
import java.util.HashMap;
import java.util.Map;

import proy.galeria.inventario.Pieza;
import proy.galeria.usuarios.*;

public class Propietario extends Usuario
{
	private String id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private Map<String, Pieza> piezasActuales;
    public Propietario(String nombre1, String email1, String password1, String rol1,String id, String nombre, String direccion, String telefono, String email) 
    {
        super(nombre1, email1, password1, rol1);
    	this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.piezasActuales = new HashMap<>();
    }
    public void agregarPiezaActual(String id, Pieza pieza) {
        piezasActuales.put(id, pieza);
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
