package Ejercicio2;
import java.util.Scanner;

/**
 * @author Grupo 1 - Laboratorio 5
 */

public class CalcularVentas
{
    private static final Scanner lector = new Scanner(System.in);

    private static final int ingresarProducto()
    {
        System.out.print("Ingrese numero del producto (1 al 5) o -1 para finalizar: ");
        int numeroProducto = lector.nextInt();
        while(numeroProducto != -1 &&(numeroProducto < 1 || numeroProducto > 5))
        {
            System.out.print("Numero fuera de rango, ingrese numero del producto (1 al 5) o -1 para finalizar: ");
            numeroProducto = lector.nextInt();
        }
        return numeroProducto;
    }

    private static final int ingresarCantidad()
    {
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadProducto = lector.nextInt();
        while(cantidadProducto < 1)
        {
            System.out.print("Numero fuera de rango, ingrese la cantidad vendida: ");
            cantidadProducto = lector.nextInt();
        }
        return cantidadProducto;
    }

    public static void main(String[] args) 
    {
        int producto1 = 0, producto2 = 0, producto3 = 0, producto4 = 0, producto5 = 0, total, centinela;
        while(true)
        {
            int numeroProducto = ingresarProducto();
            if(numeroProducto == -1)
                break;
            int cantidadVendida = ingresarCantidad();
            switch (numeroProducto) 
            {
                case 1:
                    producto1 += 10000 * cantidadVendida;
                    break;
                
                case 2:
                    producto2 += 15000 * cantidadVendida;
                    break;
                
                case 3:
                    producto3 += 20000 * cantidadVendida;
                    break;
                
                case 4:
                    producto4 += 25000 * cantidadVendida;
                    break;

                case 5:
                    producto5 += 30000 * cantidadVendida;
                    break;
            }
            System.out.println();
        }

        total = producto1 + producto2 + producto3 + producto4 + producto5;
        System.out.println("Total producto 1: " + producto1 + "Gs");
        System.out.println("Total producto 2: " + producto2 + "Gs");
        System.out.println("Total producto 3: " + producto3 + "Gs");
        System.out.println("Total producto 4: " + producto4 + "Gs");
        System.out.println("Total producto 5: " + producto5 + "Gs");
        System.out.println("Total: " + total + "Gs");
        
    }
}
