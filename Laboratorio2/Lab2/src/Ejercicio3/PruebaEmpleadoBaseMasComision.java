package Ejercicio3;

/**
 * Clase para pruebas a los metodos y atributos definidos en la clase EmpleadoBaseMasComision
 para verificar su correcto funcionamiento.
 * @author: Javier Goto
 * @versión: 15/08/2023
*/

public class PruebaEmpleadoBaseMasComision 
{
    public static void main(String[] args) 
    {
        //Instanciamos un objeto de EmpleadoBaseMasComision
        EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision("Javier", 
        "Goto", "5406655", 25000, 0.6, 
        15000);
        System.out.println(empleado.toString());
        System.out.println();

        //Pruebas de funcionamiento
        System.out.println("--------PRUEBA DE ESTABLECER SALARIO BASE--------");
        System.out.println("El salario base se estableció a 23000:");
        System.out.println("------------------------------------------------");
        empleado.establecerSalarioBase(23000);
        System.out.println(empleado.toString());
        System.out.println();
        System.out.println("--------PRUEBA DE EXCEPCIÓN--------");
        try
        {
            System.out.println("Intentando establecer el salario base en -2000:");
            empleado.establecerSalarioBase(-2000);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
    } 
}// Fin de la clase PruebaEmpleadoBaseMasComision
