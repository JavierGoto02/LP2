/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Grupo 1 - Laboratorio 7 - Ejercicio 2
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(1, 15, 2008);
        fecha1.print();
        Fecha fecha2 = new Fecha("marzo", 29, 2007);
        fecha2.print();
        Fecha fecha3 = new Fecha(365, 1998);
    }
    
}
