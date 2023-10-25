package Ejercicio4;
import java.util.Scanner;

/**
 * Esta clase demuestra el manejo de errores para una cadena de caracteres.
 * @author Grupo 1 - Laboratorio 9 - Ejercicio 4
 */
public class ManejoErroresCadenas {

    /**
     * Punto de entrada principal para la aplicación.
     * 
     * @param args Los argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese una cadena de caracteres:");
            String input = scanner.nextLine();

            if (input.length() > 30) {
                throw new LongitudCadenaException("Error: La cadena supera los 30 caracteres.");
            }

            if (!esAlfabetica(input)) {
                throw new CaracterNoAlfabeticoException("Error: La cadena contiene caracteres no alfabéticos.");
            }

            System.out.println("Cadena ingresada: " + input);
        } catch (LongitudCadenaException e) {
            System.out.println(e.getMessage());
        } catch (CaracterNoAlfabeticoException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    /**
     * Verifica si una cadena es completamente alfabética.
     * 
     * @param str La cadena a verificar.
     * @return true si la cadena es alfabética, false de lo contrario.
     */
    private static boolean esAlfabetica(String str) {
        return str.matches("[a-zA-Z]+");
    }
}
