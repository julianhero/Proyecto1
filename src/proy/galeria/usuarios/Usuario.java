package proy.galeria.usuarios;

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
}
