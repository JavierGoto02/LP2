package laboratorio1;

import java.util.Scanner;

public class PruebaEmpleado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Prueba de clase Empleado.\n");
        
        // Instanciamos nuestra clase Empleado con el constructor por defecto.
        Empleado nuevoEmpleado = new Empleado("Rodrigo", "Velazquez", 10_000_000.0d);
        System.out.println("\nSe creo el empleado 1 con los siguientes datos: ");
        System.out.println("-nombre: " + nuevoEmpleado.getNombre());
        System.out.println("-apellido: " + nuevoEmpleado.getApellido());
        System.out.printf("-salarioMensual: %.3f\n", nuevoEmpleado.getSalarioMensual());
        System.out.printf("Salario anual del empleado 1: %.3f\n\n", nuevoEmpleado.getSalarioMensual() * 12);   
       
        // Un empleado siempre tendra datos constantes.
        System.out.print("Ingrese el primer nombre del empleado 2: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese el apellido paterno del empleado 2: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese el salario mensual del empleado 2 como valor decimal: ");
        double salario = entrada.nextDouble();

        Empleado empleadoIngresado = new Empleado(nombre, apellido, salario);
        // El otro empleado tendra datos cargados por el usuario.
        
        
        System.out.println("\nSe cargaron los datos al empleado 2: ");
        System.out.println("-nombre: " + empleadoIngresado.getNombre());
        System.out.println("-apellido: " + empleadoIngresado.getApellido());
        System.out.printf("-salarioMensual: %.3f\n", empleadoIngresado.getSalarioMensual());
        System.out.printf("Salario anual del empleado 2: %.3f\n", empleadoIngresado.getSalarioMensual() * 12);   
        
        System.out.println("\nAumentando el salario de ambos empleados por 10%: \n"); 
        nuevoEmpleado.setSalarioMensual(nuevoEmpleado.getSalarioMensual() * 1.1d);
        empleadoIngresado.setSalarioMensual(empleadoIngresado.getSalarioMensual() * 1.1d);
        
        System.out.printf("Empleado 1 (%s %s):\n", nuevoEmpleado.getNombre(), nuevoEmpleado.getApellido());
        System.out.printf("-salarioMensual: %.3f\n", nuevoEmpleado.getSalarioMensual());
        System.out.printf("-Salario Anual: %.3f\n", nuevoEmpleado.getSalarioMensual() * 12);           

        System.out.printf("Empleado 2 (%s %s):\n", empleadoIngresado.getNombre(), empleadoIngresado.getApellido());
        System.out.printf("-salarioMensual: %.3f\n", empleadoIngresado.getSalarioMensual());
        System.out.printf("-Salario Anual: %.3f\n", empleadoIngresado.getSalarioMensual() * 12);    
    }
   
}
