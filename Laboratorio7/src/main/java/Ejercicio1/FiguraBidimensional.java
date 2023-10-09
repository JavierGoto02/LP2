package Ejercicio1;

/**
 * Esta es una clase abstracta que representa una figura bidimensional en un espacio bidimensional.
 * Extiende la clase Figura y sirve como una base para las figuras bidimensionales concretas.
 *
 * @author Grupo 1 - Laboratorio 7
 */
public abstract class FiguraBidimensional extends Figura {

    /**
     * Constructor de la clase FiguraBidimensional.
     *
     * @param nombre El nombre o etiqueta de la figura bidimensional.
     */
    public FiguraBidimensional(String nombre) {
        super(nombre);
    }
}
