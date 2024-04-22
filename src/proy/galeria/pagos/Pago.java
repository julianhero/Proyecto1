package proy.galeria.pagos;

import proy.galeria.comprasSubastas.Compra;

public class Pago 
{
	private Compra compra;
    private int fechaPago;
    private Double monto;
    private String metodoPago; // Tarjeta de crédito, transferencia electrónica, efectivo

    public Pago(Compra compra, int fechaPago, Double monto, String metodoPago) {
        this.compra = compra;
        this.fechaPago = fechaPago;
        this.monto = monto;
        this.metodoPago = metodoPago;
    }

	public void realizarPago(Compra precioCompra) 
	{
		
		
	}

}
