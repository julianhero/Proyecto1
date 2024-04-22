package proy.galeria.pagos;

import java.time.LocalDate;

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

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public int getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(int fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    private int obtenerFechaActual() {
        LocalDate fechaActual = LocalDate.now();
        // Formato: AAAAMMDD
        int fechaNumerica = fechaActual.getYear() * 10000 + fechaActual.getMonthValue() * 100 + fechaActual.getDayOfMonth();
        return fechaNumerica;
    }
    
    public void realizarPago(Compra compra, double monto, String metodoPago) {
        // Obtener la fecha actual
        int fechaPago = obtenerFechaActual();

        // Crear un objeto Pago con los datos proporcionados
        Pago pago = new Pago(compra, fechaPago, monto, metodoPago);
    }
    
    
}
