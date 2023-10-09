package Ejercicio1;

/**
 * Esta clase representa un cubo en un espacio tridimensional.
 * Extiende la clase FiguraTridimensional y proporciona funcionalidad específica para un cubo.
 *
 * @author Grupo 1 - Laboratorio 7
 */
public final class Cubo extends FiguraTridimensional {

    private double lado;

    /**
     * Constructor de la clase Cubo.
     *
     * @param lado   La longitud del lado del cubo.
     * @param nombre El nombre o etiqueta del cubo.
     */
    public Cubo(double lado, String nombre) {
        super(nombre);
        setLado(lado);
    }

    /**
     * Obtiene la longitud del lado del cubo.
     *
     * @return La longitud del lado del cubo.
     */
    public double getLado() {
        return lado;
    }

    /**
     * Establece la longitud del lado del cubo.
     *
     * @param lado La longitud del lado del cubo.
     */
    public void setLado(double lado) {
        if (lado > 0)
            this.lado = lado;
        else
            this.lado = 5; // Valor predeterminado si el lado es no válido.
    }

    /**
     * Calcula y devuelve el volumen del cubo.
     *
     * @return El volumen del cubo.
     */
    @Override
    public double obtenerVolumen() {
        return lado * lado * lado;
    }

    /**
     * Calcula y devuelve el área superficial del cubo.
     *
     * @return El área superficial del cubo.
     */
    @Override
    public double obtenerArea() {
        return 6 * lado * lado;
    }
}
