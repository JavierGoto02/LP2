package Ejercicio4;
/**
 * Excepción personalizada para manejar errores relacionados con la presencia de caracteres no alfabéticos en una cadena.
 * @author Grupo 1 
 */
public class CaracterNoAlfabeticoException extends Exception {

    /**
     * Construye una instancia de la excepción con un mensaje específico.
     * 
     * @param mensaje El mensaje que describe la excepción.
     */
    public CaracterNoAlfabeticoException(String mensaje) {
        super(mensaje);
    }
}
