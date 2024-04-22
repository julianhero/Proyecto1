package proy.galeria.usuarios;

import proy.galeria.comprasSubastas.Compra;
import proy.galeria.pagos.Pago;
import proy.galeria.propietariosCompradores.Comprador;
import java.time.LocalDate;

public class Usuario 
{
	protected String nombre;
    protected String email;
    protected String password;
    protected String rol;
	
	
	public static final String ROL_ADMINISTRADOR = "Administrador";
    public static final String ROL_COMPRADOR = "Comprador";
    public static final String ROL_OPERADOR = "Operador";
    public static final String ROL_CAJERO = "Cajero";

    // Constructor
    public Usuario(String nombre1, String email1, String password1, String rol1)
    {
        nombre = nombre1;
        email = email1;
        password = password1;
        rol = rol1;
    }
    
    public String getRol()
    {
    	return rol;
    }

	public boolean verificarComprador(Comprador comprador, Compra precioCompra) 
	{
		boolean Valido = false;
		if (getRol() == ROL_ADMINISTRADOR)	
		{
			if (comprador.getSaldo() >= precioCompra.getPrecioCompra())
			{
				Valido = true;
			}
		}
				
		return Valido;
	}
	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setRol(String rol) {
        this.rol = rol;
    }
	
        
    
}
