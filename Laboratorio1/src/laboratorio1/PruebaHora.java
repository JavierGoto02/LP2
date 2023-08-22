package laboratorio1;

import java.util.Scanner;
public class PruebaHora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Prueba de clase Hora.\n");
        
        System.out.print("Ingrese la hora: ");
        int hora = entrada.nextInt();
        
        System.out.print("Ingrese el minuto: ");
        int minuto = entrada.nextInt();
        
        System.out.print("Ingrese el segundo: ");
        int segundo = entrada.nextInt();
        
        // Instanciamos nuestra clase Hora
        Hora objectHora = new Hora(hora, minuto, segundo);
        
        System.out.println("\nSe creo la hora: ");
        objectHora.imprimir();
        System.out.println("\nModificaciones posibles a la hora: ");
        int opcion;

        do{
            System.out.println("\n1-Cambiar hora.");
            System.out.println("2-Cambiar minuto.");
            System.out.println("3-Cambiar segundo.");
            System.out.println("4-Adelantar hora.");
            System.out.println("5-Reinicializar hora.");
            System.out.println("6-Salir.");
            System.out.print("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) 
            {
                case 1:
                    System.out.print("\nIngrese la nueva hora: ");
                    objectHora.setHora(entrada.nextInt());
                    break;
                case 2:
                    System.out.print("\nIngrese el nuevo minuto: ");
                    objectHora.setMinuto(entrada.nextInt());
                    break;
                
                case 3:
                    System.out.print("\nIngrese el nuevo segundo: ");
                    objectHora.setSegundo(entrada.nextInt());
                    break;
                
                case 4:
                    System.out.print("\nIngrese la cantidad de horas a adelantar: ");
                    hora = entrada.nextInt();
                    System.out.print("Ingrese la cantidad de minutos a adelantar: ");
                    minuto = entrada.nextInt();
                    System.out.print("Ingrese la cantidad de segundos a adelantar: ");
                    segundo = entrada.nextInt();
                    objectHora.adelantar(hora, minuto, segundo);
                    break;
                
                case 5:
                    System.out.print("\nIngrese la nueva hora: ");
                    hora = entrada.nextInt();
                    System.out.print("Ingrese el nuevo minuto: ");
                    minuto = entrada.nextInt();
                    System.out.print("Ingrese el nuevo segundo: ");
                    segundo = entrada.nextInt();
                    objectHora.reiniciar(hora, minuto, segundo);
                    break;
                
                default:
                    opcion = 6;
                    break;
            }
            System.out.println("\nLa hora modificada es: ");
            objectHora.imprimir();
            
        } while(opcion != 6);

        
    }
    
}
