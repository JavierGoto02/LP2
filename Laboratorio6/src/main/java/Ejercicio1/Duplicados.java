package Ejercicio1;
import java.util.Scanner;

/** LP2 - Lab 6 - Ejercicio 1:
 * Use un arreglo unidimensional para resolver el siguiente problema:
 * escriba una aplicación que reciba como entrada cinco números, cada uno de los cuales
 * debe estar entre 10 y 100, inclusive. A medida que se lea cada número, muéstrelo solamente si no es
 * un duplicado de un número que ya se haya leído. Prepárese para el “peor caso”, en el que los cinco
 * números son diferentes. Use el arreglo más pequeño que sea posible para resolver este problema.
 * Muestre el conjunto completo de valores únicos introducidos, después de que el usuario introduzca
 * cada nuevo valor.
 * @author Grupo 1 - Laboratorio 6
 */

public class Duplicados {
    public static void main(String[] args) {
        // Crear un Scanner para recibir las entradas
        Scanner scanner = new Scanner(System.in);
        // Crear un arreglo unidimensional con capacidad para el peor caso de 5 números diferentes ingresados.
        int[] numeros = new int[5];
        // Crear una variable que mantenga un contador de cuantos elementos no son duplicados en el arreglo de números
        int cantidadNoDuplicados = 0;
        for (int i = 0; i < numeros.length; i++) {
            // Pedir entrada
            System.out.print("(#" + (i + 1) + ") Ingrese un numero en el intervalo [10, 100]: ");
            int valor = scanner.nextInt();
            // Verificar validez de la entrada
            if (valor < 10 || valor > 100) {
                System.out.println("Introduzca un numero entero entre 10 y 100!");
                i--; // Volver a pedir la entrada sin comprometer el numero de entradas
            }
            // Si la entrada es válida continuar
            else {
                // Verificar si la entrada es un valor duplicado y mientras agregar a una cadena para impresión
                boolean esDuplicado = false;
                String cadenaArreglo = "";
                for (int j = 0; j < cantidadNoDuplicados; j++) {
                    cadenaArreglo += numeros[j] + ", ";
                    if (valor == numeros[j])
                        esDuplicado = true;
                }
                // Si no es duplicado, agregar a el arreglo con los números no duplicados
                if (!esDuplicado) {
                    numeros[cantidadNoDuplicados] = valor;
                    cantidadNoDuplicados++;
                    cadenaArreglo += valor; // Agregar el valor a la cadena
                    System.out.println("Se ingreso el valor no duplicado: " + valor);
                }
                // No se agrego un valor, arreglar formateo de cadena de impresión
                else {
                    // Eliminar la última coma y espacio (", ") agregados a la cadena
                    cadenaArreglo = cadenaArreglo.substring(0, cadenaArreglo.length() - 2);
                }
                // Mostrar el conjunto completo de valores únicos introducidos
                System.out.println("Valores únicos introducidos: [" + cadenaArreglo + "]\n");
            }
        }
    }
}

