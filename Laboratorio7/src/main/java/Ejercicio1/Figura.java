package Ejercicio1;

/**
 * Esta es una clase abstracta que representa una figura en un espacio bidimensional o tridimensional.
 * Las clases concretas deben extender esta clase y proporcionar una implementación para el cálculo del área.
 * Cada figura tiene un nombre o etiqueta asociada.
 * 
 * @author Grupo 1 - Laboratorio 7 - Ejercicio 1
 */
public abstract class Figura 
{
    private String nombre;

    /**
     * Constructor de la clase Figura.
     *
     * @param nombre El nombre o etiqueta de la figura.
     */
    Figura(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre o etiqueta de la figura.
     *
     * @return El nombre o etiqueta de la figura.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre o etiqueta de la figura.
     *
     * @param nombre El nombre o etiqueta de la figura.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Calcula y devuelve el área de la figura.
     *
     * @return El área de la figura.
     */
    public abstract double obtenerArea();
}
