package proy.galeria.comprasSubastas;

import proy.galeria.inventario.Pieza;
import proy.galeria.propietariosCompradores.Comprador;

public class Compra 
{
	private Pieza pieza;
    private Comprador comprador;
    private int fechaCompra;
    private Double precioCompra;
    
    public Compra(Pieza pieza, Comprador comprador, int fechaCompra, Double precioCompra) 
    {
        this.pieza = pieza;
        this.comprador = comprador;
        this.fechaCompra = fechaCompra;
        this.precioCompra = precioCompra;
    }

}
