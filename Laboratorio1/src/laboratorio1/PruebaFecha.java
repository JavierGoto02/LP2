package laboratorio1;

import java.util.Scanner;
public class PruebaFecha {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Prueba de clase Fecha.\n");
        
        System.out.print("Ingrese el dia: ");
        int dia = entrada.nextInt();
        
        System.out.print("Ingrese el mes: ");
        int mes = entrada.nextInt();
        
        System.out.print("Ingrese el año: ");
        int año = entrada.nextInt();
        
        // Instanciamos nuestra clase Fecha
        Fecha fecha = new Fecha(mes, dia, año);
        
        System.out.println("\nSe creo la Fecha: ");
        fecha.mostrarFecha();

        System.out.println("\nPrueba de modificar la fecha.\n"); 
        entrada.nextLine();
        System.out.print("Ingrese el dia: ");
        fecha.setDia(entrada.nextInt());
        
        System.out.print("Ingrese el mes: ");
        fecha.setMes(entrada.nextInt());

        System.out.print("Ingrese el año: ");
        fecha.setAño(entrada.nextInt());
        
        System.out.println("\nLuego de modificar la fecha es: ");
        fecha.mostrarFecha();
    

    }
}
