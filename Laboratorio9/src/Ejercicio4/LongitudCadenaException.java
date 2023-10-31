package Ejercicio4;
/**
 * Excepción personalizada para manejar errores relacionados con la longitud de una cadena.
 * @author Grupo 1
 */
public class LongitudCadenaException extends Exception {

    /**
     * Construye una instancia de la excepción con un mensaje específico.
     * 
     * @param mensaje El mensaje que describe la excepción.
     */
    public LongitudCadenaException(String mensaje) {
        super(mensaje);
    }
}
