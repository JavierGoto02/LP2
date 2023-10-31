package Ejercicio2;

import java.util.Scanner;

/**
 * Para cumplir estrictamente con la recomendación, debes deshabilitar las aserciones en el código de producción. 
 * Puedes hacerlo agregando la opción -ea al ejecutar el programa de la siguiente manera: java -ea EjercicioAssert
 * @author Grupo 1 
 */
public class EjercicioAssert 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un valor entre 0 y 10: ");
        int valor = scanner.nextInt();
        
        assert (valor >= 0 && valor <= 10) : "El valor está fuera del rango 0-10";
        
        System.out.println("El valor ingresado está dentro del rango 0-10.");
       
    }
    
}
