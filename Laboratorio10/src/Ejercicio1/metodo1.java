package Ejercicio1;
/**
 * @author Grupo 1 
 * La clase metodo1 extiende la clase Thread y sobrescribe el método run().
 * Proporciona una implementación simple que imprime un mensaje en la consola.
 */
public class metodo1 extends Thread {

    /**
     * Este método se ejecuta cuando el hilo asociado a la instancia de la clase
     * Metodo1 se inicia mediante el método start().
     * Imprime un mensaje indicando que la clase ha sido extendida con Thread.
     */
    @Override
    public void run() {
        System.out.println("Extendido con Thread");
    }
}
