package Ejercicio4;

/**
 * Clase para probar el funcionamiento de la clase EmpleadosPorHoras
 * 
 * @author fabri
 */
public class PruebaEmpleadosPorHoras {
    public static void main(String[] args) {
        // Instanciamos un objeto de EmpleadosPorHoras
        EmpleadosPorHoras emp = new EmpleadosPorHoras("Fabrizio", "Kawabata", "7669776", 55, 100000);
        System.out.println(emp.toString());

        System.out.println("\n--------Prueba de obtención de horas y sueldo--------");
        System.out.println("Su cantidad de horas trabajadas es: " + emp.obtenerHoras());
        System.out.println("Su sueldo es: " + emp.obtenerSueldo());

        System.out.println("\n--------Prueba de excepción--------");
        try {
            System.out.print("Intentando establecer el sueldo a -1: ");
            emp.establecerSueldo(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Entrada invalida!");
        }
        try {
            System.out.print("Intentando establecer la cantidad de horas a 169: ");
            emp.establecerHoras(169);
        } catch (IllegalArgumentException e) {
            System.out.println("Entrada invalida!");
        }

        System.out.println("\n--------Prueba de establecer horas y sueldo--------");
        emp.establecerSueldo(841000);
        System.out.println("Se ha establecido a 841000 su sueldo.");
        emp.establecerHoras(87);
        System.out.println("Se ha establecido a 87 horas trabajadas.");

        System.out.print(emp.toString());
    }
}
