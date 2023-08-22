/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Grupo 1 - LP2 - FPUNA
 */
public class PruebaEmpleadoBaseMasComision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Información del Empleado:");
        System.out.println("========================");
        EmpleadoBaseMasComision empleadobasecomision1 = new EmpleadoBaseMasComision("Juan", "Perez", "1234567", 5000000.00, 0.05, 25000);
        System.out.println(empleadobasecomision1.toString());
        System.out.println("");

        
        EmpleadoBaseMasComision empleadobasecomision2 = new EmpleadoBaseMasComision("Pedro", "Gomez", "9876543", 5325.00, 0.06, 2432);
        System.out.println("Las ventas brutas son: " + empleadobasecomision2.obtenerVentasBrutas());
        System.out.println("La comision es: " + empleadobasecomision2.obtenerTarifaComision());
        System.out.println("El salario base es: "+ empleadobasecomision2.obtenerSalarioBase());
        empleadobasecomision2.establecerTarifaComision(0.3);
        empleadobasecomision2.establecerVentasBrutas(54000);
        empleadobasecomision2.establecerSalarioBase(46000);
        System.out.println("Las ventas brutas son: " + empleadobasecomision2.obtenerVentasBrutas());
        System.out.println("La comision es: " + empleadobasecomision2.obtenerTarifaComision());
        System.out.println("El salario base es: "+ empleadobasecomision2.obtenerSalarioBase());
    }
    
}
