package Ejercicio1;

/**
 * Esta es una clase abstracta que representa una figura tridimensional en un espacio tridimensional.
 * Extiende la clase Figura y proporciona un método abstracto para calcular el volumen de la figura tridimensional.
 * Las clases concretas deben implementar este método.
 *
 * @author Grupo 1 - Laboratorio 7 - Ejercicio 1
 */
public abstract class FiguraTridimensional extends Figura {

    /**
     * Constructor de la clase FiguraTridimensional.
     *
     * @param nombre El nombre o etiqueta de la figura tridimensional.
     */
    public FiguraTridimensional(String nombre) {
        super(nombre);
    }

    /**
     * Calcula y devuelve el volumen de la figura tridimensional.
     *
     * @return El volumen de la figura tridimensional.
     */
    public abstract double obtenerVolumen();
}

