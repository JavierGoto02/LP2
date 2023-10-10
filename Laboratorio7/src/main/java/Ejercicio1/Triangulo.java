package Ejercicio1;

/**
 * Esta clase representa un triángulo en un espacio bidimensional.
 * Extiende la clase FiguraBidimensional y proporciona funcionalidad específica para un triángulo.
 *
 * @author Grupo 1 - Laboratorio 7 - Ejercicio 1
 */
public final class Triangulo extends FiguraBidimensional {

    private double base;
    private double altura;

    /**
     * Constructor de la clase Triángulo.
     *
     * @param nombre  El nombre o etiqueta del triángulo.
     * @param base    La longitud de la base del triángulo.
     * @param altura  La altura del triángulo.
     */
    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        setBase(base);
        setAltura(altura);
    }

    /**
     * Obtiene la longitud de la base del triángulo.
     *
     * @return La longitud de la base del triángulo.
     */
    public double getBase() {
        return base;
    }

    /**
     * Establece la longitud de la base del triángulo.
     *
     * @param base La longitud de la base del triángulo.
     */
    public void setBase(double base) {
        if (base > 0)
            this.base = base;
        else
            this.base = 5; // Valor predeterminado si la base es no válida.
    }

    /**
     * Obtiene la altura del triángulo.
     *
     * @return La altura del triángulo.
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Establece la altura del triángulo.
     *
     * @param altura La altura del triángulo.
     */
    public void setAltura(double altura) {
        if (altura > 0)
            this.altura = altura;
        else
            this.altura = 5; // Valor predeterminado si la altura es no válida.
    }

    /**
     * Calcula y devuelve el área del triángulo.
     *
     * @return El área del triángulo.
     */
    @Override
    public double obtenerArea() {
        return base * altura / 2;
    }
}
