package proy.galeria.propietariosCompradores;

import proy.galeria.comprasSubastas.Compra;
import proy.galeria.usuarios.*;
public class Comprador extends Usuario
{
	private String id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private Double limiteCredito;
    
    public Comprador(String nombre1, String email1, String password1, String rol1,String id, String nombre, String direccion, String telefono, String email, Double limiteCredito) {
        super(nombre1, email1, password1, rol1);
    	this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.limiteCredito = limiteCredito;
    }

	public Double getSaldo() {
		// TODO Auto-generated method stub
		return limiteCredito;
	}

	public void descontarSaldo(Compra precioCompra) 
	{
		limiteCredito = limiteCredito - precioCompra.getPrecioCompra();
	}
}
