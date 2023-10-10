package Ejercicio1;

/**
 * Esta clase representa un círculo en un espacio bidimensional.
 * Extiende la clase FiguraBidimensional y proporciona funcionalidad específica para un círculo.
 * Un círculo se caracteriza por su radio.
 * 
 * @author Grupo 1 - Laboratorio 7 - Ejercicio 1
 */
public class Circulo extends FiguraBidimensional
{
    private double radio;

    /**
     * Constructor de la clase Circulo.
     *
     * @param nombre El nombre o etiqueta del círculo.
     * @param radio  El radio del círculo.
     */
    public Circulo(String nombre, double radio) 
    {
        super(nombre);
        this.radio = radio;
    }
    
    /**
     * Obtiene el radio del círculo.
     *
     * @return El radio del círculo.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el radio del círculo.
     *
     * @param radio El radio del círculo.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Calcula y devuelve el área del círculo.
     *
     * @return El área del círculo.
     */
    @Override
    public double obtenerArea() 
    {
        return Math.PI * radio * radio;
    }
}

