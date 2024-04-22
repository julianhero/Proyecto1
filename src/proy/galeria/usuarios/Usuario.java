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
	
	public void registrarPago(Compra compra, double monto, String metodoPago) {
        // Aquí se registraría el pago, lo cual permitirá que la pieza involucrada sea entregada a su nuevo propietario
        // Dependiendo del método de pago, se podría realizar alguna acción adicional, como comunicarse con un servicio
        // de pagos externo o registrar la transacción en una base de datos
        
        // En este ejemplo, simplemente vamos a crear un nuevo objeto Pago y realizar el pago asociado a la compra
        int fechaPago = obtenerFechaActual(); // Supongamos que tenemos un método para obtener la fecha actual
        Pago pago = new Pago(compra, fechaPago, monto, metodoPago);
        pago.realizarPago(compra); // Procesar el pago
        
        // Aquí podrías realizar otras acciones, como actualizar el estado de la compra o notificar al comprador
        // sobre la finalización del proceso de pago
    }

    // Método de ejemplo para obtener la fecha actual
	private int obtenerFechaActual() {
        LocalDate fechaActual = LocalDate.now();
        // Formato: AAAAMMDD
        int fechaNumerica = fechaActual.getYear() * 10000 + fechaActual.getMonthValue() * 100 + fechaActual.getDayOfMonth();
        return fechaNumerica;
    }
}
