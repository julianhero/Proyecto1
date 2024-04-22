package proy.galeria.persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import proy.galeria.inventario.Pieza;

public class PersistenciaPiezas 
{
	// Método para cargar la información de las piezas en un mapa
    public static Map<String, Pieza> cargarPiezas(String rutaArchivo) throws IOException {
        Map<String, Pieza> piezas = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            // Saltar la primera línea (encabezados)
            reader.readLine();
            String linea;
            // Leer cada línea del archivo
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                // Crear un objeto Pieza y agregarlo al mapa
                Pieza pieza = new Pieza(partes[0], partes[1], partes[2], partes[3],partes[4], partes[5], Boolean.parseBoolean(partes[6]), Double.parseDouble(partes[7]), partes[8]);
                // Aquí puedes configurar los atributos específicos de la pieza si es necesario
                piezas.put(partes[0], pieza); // Utilizamos el ID de la pieza como clave
            }
        }
        return piezas;
    }
}
