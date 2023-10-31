
package Ejercicio3;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Grupo 1 - Laboratorio 10 - Ejercicio 3
 */
public class Carrera {
    /**
     * Clase interna que representa a un piloto de Fórmula 1.
     */
    private static class Piloto extends Thread {
        private final String nombre;
        private final int prioridad;
        
        /**
         * Constructor para inicializar un piloto con un nombre y una prioridad.
         *
         * @param nombre    El nombre del piloto.
         * @param prioridad La prioridad del piloto (mayor valor indica mayor prioridad).
         */
        public Piloto(String nombre, int prioridad) {
            this.nombre = nombre;
            this.prioridad = prioridad;
            setPriority(prioridad);
        }
        /*
         * Muestra un mensaje indicando que el piloto ha salido a la pista y luego
         * realiza un bucle para simular el avance a través de las 30 vueltas.
         * Después de completar todas las vueltas, muestra un mensaje indicando que
         * el piloto ha llegado a la meta.
         */
        @Override
        public void run() {
            System.out.println("Sale 🏁" + nombre + " 🏁");   
            for (int i = 1; i <= 30; i++) {
                System.out.println(i + "a. vuelta - " + nombre);
            }
            System.out.println("\nLlegó a la meta " + nombre + "\n");
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> prioridades = new ArrayList<>();
        Random rand = new Random();
        while (prioridades.size() < 3){
            int numero = rand.nextInt(10 - 1) + 1;
            if (!prioridades.contains(numero))
                prioridades.add(numero);    
        }
        System.out.println(prioridades);
        Carrera.Piloto piloto1 = new Carrera.Piloto("Piloto 1", prioridades.remove(0));
        Carrera.Piloto piloto2 = new Carrera.Piloto("Piloto 2", prioridades.remove(0));
        Carrera.Piloto piloto3 = new Carrera.Piloto("Piloto 3", prioridades.remove(0));

        piloto1.start();
        piloto2.start();
        piloto3.start();
    }
}