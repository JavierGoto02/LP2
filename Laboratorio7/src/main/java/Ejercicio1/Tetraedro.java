package Ejercicio1;

/**
 * Esta clase representa un tetraedro en un espacio tridimensional.
 * Extiende la clase FiguraTridimensional y proporciona funcionalidad específica para un tetraedro.
 *
 * @author Grupo 1 - Laboratorio 7
 */
public final class Tetraedro extends FiguraTridimensional {

    private double lado;
    private double altura;

    /**
     * Constructor de la clase Tetraedro.
     *
     * @param nombre  El nombre o etiqueta del tetraedro.
     * @param lado    La longitud del lado del tetraedro.
     * @param altura  La altura del tetraedro.
     */
    public Tetraedro(String nombre, double lado, double altura) {
        super(nombre);
        setLado(lado);
        setAltura(altura);
    }

    /**
     * Obtiene la longitud del lado del tetraedro.
     *
     * @return La longitud del lado del tetraedro.
     */
    public double getLado() {
        return lado;
    }

    /**
     * Establece la longitud del lado del tetraedro.
     *
     * @param lado La longitud del lado del tetraedro.
     */
    public void setLado(double lado) {
        if (lado > 0)
            this.lado = lado;
        else
            this.lado = 5; // Valor predeterminado si el lado es no válido.
    }

    /**
     * Obtiene la altura del tetraedro.
     *
     * @return La altura del tetraedro.
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Establece la altura del tetraedro.
     *
     * @param altura La altura del tetraedro.
     */
    public void setAltura(double altura) {
        if (altura > 0)
            this.altura = altura;
        else
            this.altura = 5; // Valor predeterminado si la altura es no válida.
    }

    /**
     * Calcula y devuelve el volumen del tetraedro.
     *
     * @return El volumen del tetraedro.
     */
    @Override
    public double obtenerVolumen() {
        return (lado * lado * lado * Math.sqrt(2)) / 12;
    }

    /**
     * Calcula y devuelve el área superficial del tetraedro.
     *
     * @return El área superficial del tetraedro.
     */
    @Override
    public double obtenerArea() {
        return lado * lado * Math.sqrt(3);
    }
}