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
    private String estado;
    
    public static final String ESTADO_EXHIBICION = "Exhibicion";
    public static final String ESTADO_BODEGA = "Bodega";
    public static final String ESTADO_VENDIDO = "Vendido";
    public static final String ESTADO_BLOQUEADA= "Bloqueada";
    public static final String ESTADO_CONSIGNACION = "Consignacion";
    
    public Pieza(String id1, String tipo1, String titulo1, String autor1,String fechaCreacion1, String lugarCreacion1, boolean disponibleParaVenta, Double precioFijo1, String estado1)
    {
        id = id1;
        tipo = tipo1;
        titulo = titulo1;
        autor = autor1;
        fechaCreacion = fechaCreacion1;
        lugarCreacion = lugarCreacion1;
        disponibleParaVenta = false;
        precioFijo = precioFijo1;
        estado = estado1;
    }

	public String getId() 
	{
		return id;
	}
	public String getestado() 
	{
		return estado;
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
                ", Precio fijo: " + precioFijo +
                ", Estado: " + estado;
    }

	public Double getPrecioFijo() {
		// TODO Auto-generated method stub
		return precioFijo;
	}

	public boolean isDisponibleParaVenta() {
		// TODO Auto-generated method stub
		return disponibleParaVenta;
	}

	public boolean isBloqueada() 
	{
		// TODO Auto-generated method stub
		boolean bloqueada = false;
		if(estado == ESTADO_BLOQUEADA )
		{
			bloqueada = true;
		}
		
		return bloqueada;
	}

	public boolean isVendida() 
	{
		boolean vendida = false;
		if(estado == ESTADO_VENDIDO )
		{
			vendida = true;
		}
		
		return vendida;
	}

	public boolean isEnBodega() 
	{
		boolean bodega = false;
		if(estado == ESTADO_BODEGA )
		{
			bodega = true;
		}
		
		return bodega;
	}

	public void setVendida(String estado1) 
	{
		estado = estado1;
	}

	public void setBloqueada(String estadoBloqueada) {
		estado = estadoBloqueada;
		
	}
}
