package proy.galeria.consola;
import java.io.IOException;
import java.util.Map;

import proy.galeria.inventario.*;
import proy.galeria.persistencia.*;

public class Consola 
{
	public static void main(String[] args)
	{
		String rutaArchivo = "C:\\Users\\JULIAN_PC\\Documents\\piezas.csv"; // Ruta del archivo CSV
        try {
            Map<String, Pieza> piezas = PersistenciaPiezas.cargarPiezas(rutaArchivo);
            // Hacer algo con el mapa de piezas cargadas, como mostrarlas en la consola
            for (Map.Entry<String, Pieza> entry : piezas.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Pieza: " + entry.getValue());
            }
        } catch (IOException e) {
            System.err.println("Error al cargar las piezas desde el archivo CSV: " + e.getMessage());
        }
    }
}