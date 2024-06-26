package proy.galeria.comprasSubastas;

import proy.galeria.inventario.Pieza;
import proy.galeria.pagos.Pago;
import proy.galeria.propietariosCompradores.Comprador;
import proy.galeria.usuarios.*;

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
    
    public Double getPrecioCompra()
    {
    	return precioCompra;
    }
    
    public void realizarCompra(Pago pagos, Usuario admin, Compra precioCompra, Pieza estado) {
        if (pieza.isBloqueada() && !pieza.isVendida()) {
            boolean verificacion = admin.verificarComprador(comprador, precioCompra);
            if (verificacion) {
                if (pieza.isDisponibleParaVenta() || pieza.isEnBodega()) {
                    if (comprador.getSaldo() >= getPrecioCompra()) {
                        pieza.setVendida(pieza.ESTADO_VENDIDO);
                        pieza.setBloqueada(pieza.ESTADO_BLOQUEADA); // Desbloquear la pieza si se vende con éxito
                        comprador.descontarSaldo(precioCompra);
                        pagos.realizarPago(precioCompra, fechaCompra, null); // Realizar el pago a la galería
                    }
                }
            } else {
                // Si la verificación falla, desbloquear la pieza y revertir la compra
                pieza.setBloqueada(estado.getestado());
            }
        }
    }
    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public int getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(int fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Double getPrecioCompra1() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }
}


