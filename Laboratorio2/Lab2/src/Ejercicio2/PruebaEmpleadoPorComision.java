/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Grupo 1 - LP2 - FPUNA
 */
public class PruebaEmpleadoPorComision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Información del Empleado:");
        System.out.println("========================");
        EmpleadoPorComision empleadocomision1 = new EmpleadoPorComision("Juan", "Perez", "1234567", 5000000.00, 0.05);
        System.out.println(empleadocomision1.toString());
        System.out.println("Su ingreso total es: " + empleadocomision1.ingresos());
        System.out.println("");

        
        EmpleadoPorComision empleadocomision2 = new EmpleadoPorComision("Pedro", "Gomez", "9876543", 42222.00, 0.07);
        System.out.println("Las ventas brutas son: " + empleadocomision2.obtenerVentasBrutas());
        System.out.println("La comision es: " + empleadocomision2.obtenerTarifaComision());
        empleadocomision2.establecerTarifaComision(0.3);
        empleadocomision2.establecerVentasBrutas(54000.00);
        System.out.println("Las ventas brutas son: " + empleadocomision2.obtenerVentasBrutas());
        System.out.println("La comision es: " + empleadocomision2.obtenerTarifaComision());
        
        
    }
    
}
