package Ejercicio3;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Aplicación que utiliza el manejo de excepciones para calcular un cociente
 * dada una entrada de valores de parte del usuario.
 * @author Grupo 1
 */
public class Ej3InputMismatchException {

    /**
     * Retorna la división entera entre los enteros a y b, donde b debe ser
     * distinto de 0.
     * @param a numerador - dividendo
     * @param b divisor
     * @return resultado entero de la division (a / b)
     * @throws ArithmeticException sí ocurre división por 0 (b = 0)
     */
    public static int cociente(int a, int b) throws ArithmeticException {
        // Intentar evaluar el cociente y atrapar la posible excepción de division
        // por cero según lo solicitado por el ejercicio, luego propagarla con un
        // mensaje más claro en español.
        try {
            return a / b;
        } catch (ArithmeticException ex) {
            throw new ArithmeticException("Error: ocurrio division por 0! (El parametro b no debe ser 0)");
        }
    }

    /**
     * Aplicación que utiliza el manejo de excepciones.
     * @param args argumentos de consola (no utilizados)
     */
    public static void main(String[] args) {
        boolean pidiendoEntrada = true;
        Scanner scanner = new Scanner(System.in);
        while(pidiendoEntrada) {
            System.out.println("Ingrese los valores a y b:");
            // Bloque try-catch para atrapar y manejar excepciones
            try {
                // Pedir entrada de dos enteros a y b (puede tirar InputMismatchException)
                System.out.print("a (entero): ");
                int a = scanner.nextInt();
                System.out.print("b (entero distinto a 0): ");
                int b = scanner.nextInt();
                // a calcular el cociente (puede tirar ArithmeticException)
                int cociente = cociente(a, b);
                System.out.println("\nEl resultado de cociente de de a y b es:\na / b = " + cociente);
                // Se obtuvo el resultado del cociente, ya no es necesario pedir entrada.
                pidiendoEntrada = false;
            } catch (InputMismatchException ex) {
                // Consumir carácter invalido para no terminar en ciclo infinito de entrada retroalimentada
                scanner.nextLine();
                System.out.println("Error: entrada invalida, se deben ingresar valores numericos enteros!\n");
            } catch (ArithmeticException ex) {
                System.out.println(ex.getMessage() + "\n");
            }
        }
    }
}
