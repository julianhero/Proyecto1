package proy.galeria.inventario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventario 
{
	private Map<String, Pieza> piezas; // Mapa para almacenar piezas por su ID

    public Inventario() {
        piezas = new HashMap<>();
    }

    public void agregarPieza(Pieza pieza) {
        piezas.put(pieza.getId(), pieza);
    }

    public Pieza buscarPiezaPorId(String id) {
        return piezas.get(id);
    }

    public void eliminarPieza(String id) {
        piezas.remove(id);
    }

    public List<Pieza> listarPiezas() {
        return new ArrayList<>(piezas.values());
    }
}
