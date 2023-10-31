package Ejercicio2;

/**
 * Clase principal que inicia la aplicación para procesar archivos de datos de alumnos.
 * Esta clase crea hilos para procesar archivos con nombres específicos y los inicia para su procesamiento.
 *
 * @author Grupo 1
 */
public class Main {
    /**
     * Método principal de la aplicación.
     * Crea hilos para procesar archivos de datos de alumnos y los inicia.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        // Nombres de los archivos de prueba
        String[] archivos = {"archivo1.txt", "archivo2.txt", "archivo3.txt"};

        // Crear e iniciar un hilo para cada archivo
        for (String nombreArchivo : archivos) {
            Thread thread = new Thread(new ProcesadorArchivo(nombreArchivo));
            thread.start();
        }
    }
}
