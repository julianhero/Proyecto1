package proy.galeria.consola;
import java.io.IOException;
import java.util.Scanner;
import java.util.Map;

import proy.galeria.inventario.*;
import proy.galeria.persistencia.*;
import proy.galeria.usuarios.CajeroGaleria;

public class Consola 
{
	public static void main(String[] args)
	{
		
		String rutaArchivo = "C:\\Users\\JULIAN_PC\\Documents\\piezas.csv"; // Ruta del archivo CSV
        try {
            Map<String, Pieza> piezas = PersistenciaPiezas.cargarPiezas(rutaArchivo);
            for (Map.Entry<String, Pieza> entry : piezas.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Pieza: " + entry.getValue());
            }
        } catch (IOException e) {
            System.err.println("Error al cargar las piezas desde el archivo CSV: " + e.getMessage());
        
        }
	
       
       	Scanner scanner = new Scanner(System.in);
        CajeroGaleria cajero = new CajeroGaleria(rutaArchivo, rutaArchivo, rutaArchivo, rutaArchivo); //

                // Menú de opciones
                while (true) {
                    System.out.println("\n--- Menú de opciones ---");
                    System.out.println("1. Realizar compra");
                    System.out.println("2. Salir");
                    System.out.print("Ingrese el número de la opción deseada: ");
                    int opcion = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea pendiente

                    // Manejo de opciones
                    switch (opcion) {
                        case 1:
                            System.out.println("\n--- Realizar compra ---");
                            System.out.print("Ingrese el monto de la compra: ");
                            double montoCompra = scanner.nextDouble();
                            scanner.nextLine(); 
                            System.out.print("Ingrese el método de pago (Tarjeta de crédito, Transferencia electrónica, Efectivo): ");
                            String metodoPago = scanner.nextLine();
                            //cajero.realizarCompra(montoCompra, metodoPago);
                            System.out.println("Compra realizada con éxito.");
                            break;
                        case 2:
                            System.out.println("Saliendo del programa...");
                            System.exit(0); // Salir del programa
                        default:
                            System.out.println("Opción no válida. Por favor, ingrese un número válido.");
                    }
                }
            }
}
