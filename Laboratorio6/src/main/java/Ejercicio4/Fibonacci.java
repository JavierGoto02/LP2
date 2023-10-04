package Ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Grupo 1 - Laboratorio 6
 */

public class Fibonacci {
    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        if (n <= 2) {
            return (n == 0 ? 0 : 1);
        } else {
            for (int i = 2; i < n; i++) {
                a = b;
                b = c;
                c = a + b;
            }
        }
        return c;
    }

    public static double fibonacciDouble(int n) {
        double a = 0;
        double b = 1;
        double c = 1;
        if (n <= 2) {
            return (n == 0 ? 0 : 1);
        } else {
            for (int i = 2; i < n; i++) {
                a = b;
                b = c;
                c = a + b;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero = 0;
        // Apartado a)
        while (numero != -1) {
            System.out.print("Ingrese el enésimo término de la serie de fibonacci, -1 para terminar: ");
            numero = lector.nextInt();
            if (numero < -1) {
                System.out.println("Entrada inválida!");
            } else if (numero != -1) {
                System.out.printf("El %dmo término de la serie es: %d\n", numero, fibonacci(numero));
            }
        }

        // Apartado b)
        int anterior = 0;
        for (int i = 0; i < 200; i++) {
            anterior = numero;
            numero = fibonacci(i);
            if (numero < 0) {
                System.out.printf("El mayor número de la serie que soporta el int es: %d, %dmo término\n", anterior, i - 1);
                break;
            }
        }

        // Apartado c)
        double numeroDouble = 0;
        double anteriorDouble = 0;
        for (int i = 0; i < 2000; i++) {
            anteriorDouble = numeroDouble;
            numeroDouble = fibonacciDouble(i);
            if (Double.MAX_VALUE - numeroDouble < 0) {
                System.out.printf("El mayor número de la serie que soporta el double es: %.0f, %dmo término\n", anteriorDouble, i - 1);
                break;
            }
        }
        lector.close();
    }
}

