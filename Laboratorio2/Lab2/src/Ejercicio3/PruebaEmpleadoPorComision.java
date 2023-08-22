package Ejercicio3;

/**
 * Clase para pruebas a los metodos y atributos definidos en la clase EmpleadoPorComision
 para verificar su correcto funcionamiento.
 * @author: Grupo 1 - LP2 - FPUNA
 * @versión: 15/08/2023
*/

public class PruebaEmpleadoPorComision
{
    public static void main(String[] args) 
    {
        //Instanciamos un objeto de EmpleadoPorComision
        EmpleadoPorComision empleado = new EmpleadoPorComision("Javier", 
        "Goto", "5406655", 400000, 0.2);
        System.out.println(empleado.toString());
        System.out.println();

        //Pruebas de funcionamiento
        System.out.println("--------PRUEBA DE ESTABLECER VENTAS BRUTAS--------");
        System.out.println("La ventas brutas se estableció a 23000.00:");
        System.out.println("----------------------------------------------");
        empleado.establecerVentasBrutas(23000);
        System.out.println(empleado.toString());
        System.out.println();
        System.out.println("--------PRUEBA DE ESTABLECER TARIFA DE COMISIÓN--------");
        System.out.println("La tarifa de comisión se estableció a 0.50:");
        System.out.println("----------------------------------------------");
        empleado.establecerTarifaComision(0.5);
        System.out.println(empleado.toString());
        System.out.println("--------PRUEBA DE EXCEPCIÓN--------");
        try
        {
            System.out.println("Intentando establecer las ventas brutas en -2:");
            empleado.establecerVentasBrutas(-2);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        try
        {
            System.out.println("Intentando establecer la tarifa de comisión en 2");
            empleado.establecerTarifaComision(2);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}// Fin de la clase PruebaEmpleadoPorComision
