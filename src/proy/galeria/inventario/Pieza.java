package proy.galeria.inventario;

public class Pieza 
{
	private String id;
    private String titulo;
    private String fechaCreacion;
    private String lugarCreacion;
    private String autor;
    private String tipo;
    private boolean disponibleParaVenta;
    private Double precioFijo;
    
    public Pieza(String id1, String tipo1, String titulo1, String autor1,String fechaCreacion1, String lugarCreacion1, boolean disponibleParaVenta, Double precioFijo1)
    {
        id = id1;
        tipo = tipo1;
        titulo = titulo1;
        autor = autor1;
        fechaCreacion = fechaCreacion1;
        lugarCreacion = lugarCreacion1;
        disponibleParaVenta = false;
        precioFijo = precioFijo1;
    }

	public String getId() 
	{
		return id;
	}
	@Override
	public String toString() {
        return "ID: " + id +
                ", Tipo: " + tipo +
                ", Título: " + titulo +
                ", Autor: " + autor +
                ", Año: " + fechaCreacion +
                ", Lugar: " + lugarCreacion +
                ", Disponible para venta: " + disponibleParaVenta +
                ", Precio fijo: " + precioFijo;
    }
}
