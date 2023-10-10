package Ejercicio1;

/**
 * Esta clase representa una esfera en un espacio tridimensional.
 * Extiende la clase FiguraTridimensional y proporciona funcionalidad específica para una esfera.
 *
 * @author Grupo 1 - Laboratorio 7 - Ejercicio 1
 */
public final class Esfera extends FiguraTridimensional {

    private double radio;

    /**
     * Constructor de la clase Esfera.
     *
     * @param nombre El nombre o etiqueta de la esfera.
     * @param radio  El radio de la esfera.
     */
    public Esfera(String nombre, double radio) {
        super(nombre);
        setRadio(radio);
    }

    /**
     * Obtiene el radio de la esfera.
     *
     * @return El radio de la esfera.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el radio de la esfera.
     *
     * @param radio El radio de la esfera.
     */
    public void setRadio(double radio) {
        if (radio > 0)
            this.radio = radio;
        else
            this.radio = 5; // Valor predeterminado si el radio es no válido.
    }

    /**
     * Calcula y devuelve el volumen de la esfera.
     *
     * @return El volumen de la esfera.
     */
    @Override
    public double obtenerVolumen() {
        return ((double)4 / 3) * Math.PI * radio * radio * radio;
    }

    /**
     * Calcula y devuelve el área superficial de la esfera.
     *
     * @return El área superficial de la esfera.
     */
    @Override
    public double obtenerArea() {
        return 4 * Math.PI * radio * radio;
    }
}

