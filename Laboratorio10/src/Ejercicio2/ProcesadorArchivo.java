package Ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase para procesar archivos que contienen datos de alumnos.
 * Cada instancia de esta clase se ejecuta en un hilo separado para procesar un archivo específico.
 * Los datos del archivo deben estar en el formato "nombre, apellido, nota".
 *
 * @author Grupo 1
 */
class ProcesadorArchivo implements Runnable {
    private final String nombreArchivo;

    /**
     * Constructor de la clase ProcesadorArchivo.
     *
     * @param nombreArchivo El nombre del archivo que se va a procesar.
     */
    public ProcesadorArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    /**
     * Método principal que procesa el archivo y muestra los datos de los alumnos.
     * Abre el archivo, lee los datos y muestra los detalles de los alumnos por pantalla.
     * Finalmente, cierra el archivo.
     */
    @Override
    public void run() {
        System.out.println("Procesando archivo: " + nombreArchivo);
        try {
            // Abre el archivo con la ruta relativa
            BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(nombreArchivo)));
            String linea;

            // Lee y muestra los datos por pantalla
            while ((linea = reader.readLine()) != null) {
                String[] parts = linea.split(",");
                if (parts.length == 3) {
                    String nombre = parts[0].trim();
                    String apellido = parts[1].trim();
                    String nota = parts[2].trim();
                    System.out.println("Nombre: " + nombre + ", Apellido: " + apellido + ", Nota: " + nota);
                }
            }

            // Cierra el archivo
            reader.close();
            System.out.println("Archivo procesado y cerrado: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al procesar el archivo " + nombreArchivo);
        }
    }
}

