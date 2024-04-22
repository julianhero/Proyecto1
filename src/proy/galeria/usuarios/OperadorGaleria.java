package proy.galeria.usuarios;

public class OperadorGaleria extends Usuario {
    public static final String ROL_OPERADOR = "Operador";

    public OperadorGaleria(String nombre, String email, String password) {
        super(nombre, email, password, ROL_OPERADOR);
    }
}
