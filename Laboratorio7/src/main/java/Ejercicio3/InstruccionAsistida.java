package Ejercicio3;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

/**
 * Lab 7 - Ejercicio 3:
 * Programa de instrucción asistida por computadora (CAI) que ayuda a un
 * estudiante de escuela primaria a que aprenda a multiplicar.
 * @author Grupo 1 - Laboratorio 7 - Ejercicio 3
 */
public class InstruccionAsistida {
    /**
     * Utilizar la clase SecureRandom de Java para generar números
     * aleatorios criptográficamente seguros con una distribución no predecible.
     */
    private static final SecureRandom randomSeguro = new SecureRandom();

    /**
     * Genera una pregunta de multiplicación de dos números enteros positivos de un dígito y lo imprime a la consola.
     * @return la respuesta correcta de la pregunta de multiplicación.
     */
    public static int generarPreguntaDeMultiplicacion() {
        // Generar dos números enteros positivos de un dígito [1, 9]
        // Como nextInt genera números de 0 al máximo exclusivo, generar hasta 8 y sumar 1 para tener el rango deseado
        int a = randomSeguro.nextInt(9) + 1;
        int b = randomSeguro.nextInt(9) + 1;
        // Imprimir el mensaje de la pregunta
        System.out.printf("\n¿Cuánto es %d por %d?\n", a, b);
        // Retornar la respuesta correcta
        return a * b;
    }

    /**
     * Verifica si el entero ingresado por el usuario coincide con la respuesta correcta del problema.
     * @param respuestaCorrecta respuesta correcta para la pregunta.
     * @param respuestaUsuario respuesta dada por el usuario que debemos verificar.
     * @return si la respuesta del usuario es la respuesta correcta del problema.
     */
    public static boolean verificarRespuestaDeMultiplicacion(int respuestaCorrecta, int respuestaUsuario) {
        if (respuestaUsuario == respuestaCorrecta) {
            System.out.println("¡Muy bien!");
            return true;
        }  else {
            System.out.println("No. Por favor intenta de nuevo.");
            return false;
        }
    }

    /**
     * Ejecución principal del programa
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al taller interactivo de multiplicación!" +
                        "\nSe preguntaran preguntas y usted puede dar respuestas que el programa las verificara." +
                        "\nPara salir puede ingresar \"salir\" o \"s\".");
        // Generar e imprimir la primera pregunta
        int respuestaCorrecta = generarPreguntaDeMultiplicacion(), respuestaUsuario;
        while (true) {
            // Recibir entrada de usuario de la consola
            String entradaUsuario = scanner.next();

            // Verificar condición de salida
            if (entradaUsuario.equals("salir") || entradaUsuario.equals("s"))
            {
                System.out.println("Usted finalizo el programa interactivo de multiplicación.");
                return;
            }

            // Si no verificar que entrada de usuario sea entero antes de considerarla como respuesta
            try {
                respuestaUsuario = Integer.parseInt(entradaUsuario);
            } catch (NumberFormatException ex) {
                System.err.println("¡Debes ingresar un numero entero!");
                continue; // Pedir entrada nuevamente
            }

            // Si el usuario responde correctamente la pregunta, generar una nueva pregunta
            if (verificarRespuestaDeMultiplicacion(respuestaCorrecta, respuestaUsuario)) {
                respuestaCorrecta = generarPreguntaDeMultiplicacion();
            }
        }
    }
}
