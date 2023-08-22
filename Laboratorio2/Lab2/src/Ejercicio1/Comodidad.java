package Ejercicio1;

/**
 * @author Grupo 1 - LP2 - FPUNA
 * Interfaz que desiga propiedades y métodos relevantes a la comodidad dentro de un vehículo.
 */
public interface Comodidad {
    // Propiedades de la interfaz

    /**
     * Método para verificar si se cuenta con un aire acondicionado.
     * @return true si se tiene un dispositivo de aire acondicionado, false si no.
     */
    boolean tieneAireAcondicionado();

    /**
     * Método para verificar si se cuenta con un sistema de entretenimiento
     * @return true si se tiene un dispositivo de entretenimiento, false si no.
     */
    boolean tieneSistemaDeEntretenimiento();

    // Métodos de la interfaz

    /**
     * Método para ajustar la temperatura del aire acondicionado.
     * @param temperatura Temperatura en grados Celsius.
     */
    void ajustarTemperatura(int temperatura);

    /**
     * Método para reproducir una música en el sistema de entretenimiento existente.
     * @param nombreCancion nombre de la canción que se va a reproducir.
     */
    void reproducirMusica(String nombreCancion);

}
