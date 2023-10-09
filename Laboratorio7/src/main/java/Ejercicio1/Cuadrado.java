package Ejercicio1;

/**
 * Esta clase representa un cuadrado en un espacio bidimensional.
 * Extiende la clase FiguraBidimensional y proporciona funcionalidad específica para un cuadrado.
 *
 * @author Grupo 1 - Laboratorio 7
 */
public final class Cuadrado extends FiguraBidimensional {

    private double lado;

    /**
     * Constructor de la clase Cuadrado.
     *
     * @param lado   La longitud del lado del cuadrado.
     * @param nombre El nombre o etiqueta del cuadrado.
     */
    public Cuadrado(double lado, String nombre) {
        super(nombre);
        setLado(lado);
    }

    /**
     * Obtiene la longitud del lado del cuadrado.
     *
     * @return La longitud del lado del cuadrado.
     */
    public double getLado() {
        return lado;
    }

    /**
     * Establece la longitud del lado del cuadrado.
     *
     * @param lado La longitud del lado del cuadrado.
     */
    public void setLado(double lado) {
        if (lado > 0)
            this.lado = lado;
        else
            this.lado = 5; // Valor predeterminado si el lado es no válido.
    }

    /**
     * Calcula y devuelve el área del cuadrado.
     *
     * @return El área del cuadrado.
     */
    @Override
    public double obtenerArea() {
        return lado * lado;
    }
}

