package Ejercicio1;
/**
 * @author Grupo 1 - Laboratorio 10 - Ejercicio 1
 * La clase metodo2 implementa la interfaz Runnable.
 * Proporciona una implementación simple del método run() que imprime un mensaje en la consola.
 */
public class metodo2 implements Runnable {

    /**
     * Este método se ejecuta cuando un hilo asociado a una instancia de la clase
     * Metodo2 se inicia mediante el constructor de Thread o mediante un Executor.
     * Imprime un mensaje indicando que la clase ha sido implementada con Runnable.
     */
    @Override
    public void run() {
        System.out.println("Implementado con Runnable");
    }
}
