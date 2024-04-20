package proy.galeria.inventario;

public class Pieza 
{
	private String id;
    private String titulo;
    private int fechaCreacion;
    private String lugarCreacion;
    private String autor;
    private String tipo;
    private boolean disponibleParaVenta;
    private Double precioFijo;
    
    public Pieza(String id1, String titulo1, int fechaCreacion1, String lugarCreacion1, String autor1, String tipo1)
    {
        id = id1;
        titulo = titulo1;
        fechaCreacion = fechaCreacion1;
        lugarCreacion = lugarCreacion1;
        autor = autor1;
        tipo = tipo1;
        disponibleParaVenta = false;
    }

	public String getId() 
	{
		return id;
	}
}
