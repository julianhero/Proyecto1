package proy.galeria.propietariosCompradores;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import proy.galeria.comprasSubastas.Compra;
import proy.galeria.inventario.Pieza;
import proy.galeria.usuarios.*;
public class Comprador extends Usuario
{
	private String id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private Double limiteCredito;
    private Map<String, Pieza> piezasCompradas;
    
    public Comprador(String nombre1, String email1, String password1, String rol1,String id, String nombre, String direccion, String telefono, String email, Double limiteCredito) {
        super(nombre1, email1, password1, rol1);
    	this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.limiteCredito = limiteCredito;
        this.piezasCompradas = new HashMap<>();
    }

	
    public void agregarPiezaComprada(String id, Pieza pieza) {
        piezasCompradas.put(id, pieza);
    }
    
    public Double getSaldo() 
	{
		// TODO Auto-generated method stub
		return limiteCredito;
	}

	public void descontarSaldo(Compra precioCompra) 
	{
		limiteCredito = limiteCredito - precioCompra.getPrecioCompra();
		
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

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
