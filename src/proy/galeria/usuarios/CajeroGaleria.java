package proy.galeria.usuarios;

import java.util.ArrayList;
import java.util.List;

import proy.galeria.pagos.Pago;


public class CajeroGaleria extends Usuario {
    private List<Pago> pagosRegistrados;

    public CajeroGaleria(String nombre1, String email1, String password1, String rol1) {
        super(nombre1, email1, password1, rol1);
        this.pagosRegistrados = new ArrayList<>();
    }

    public void registrarPago(Pago pago) {
        // Agregar el pago a la lista de pagos registrados
        pagosRegistrados.add(pago);
    }
    public List<Pago> getPagosRegistrados() {
        return pagosRegistrados;
    }

    public void setPagosRegistrados(List<Pago> pagosRegistrados) {
        this.pagosRegistrados = pagosRegistrados;
    }
}
