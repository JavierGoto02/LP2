package Ejercicio4;
import java.util.ArrayList;
import java.util.Scanner;


 //@author Grupo 1 - Laboratiorio 5
 
public class Main {

    public static void main(String[] args) {
        // Pedir datos para el problema
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        while(true) {
            System.out.print("Ingrese el numero de cuenta del cliente (o -1 para salir): ");
            int numeroDeCuenta = scanner.nextInt();
            if (numeroDeCuenta == -1)
                break; // Salir del bucle cuando se ingresa valor para salida
            // Si no creamos el cliente y pedimos valor para los otros datos
            Cliente cliente = new Cliente(numeroDeCuenta);
            System.out.print("Ingrese la cantidad de transacciones realizadas por el cliente en el mes: ");
            cliente.setTransaccionesRealizadasMensual(scanner.nextInt());
            System.out.print("Ingrese el limite de transacciones gratuitas: ");
            cliente.setLimiteDeTransaccionesGratuitas(scanner.nextInt());
            clientes.add(cliente);
        }

        for (Cliente cliente : clientes) {
            System.out.print("Resultado Transacción de Cliente nro " + cliente.getNumeroDeCuenta() + ": ");
            // Calcular el costo de la transacción para el cliente.
            int costoTransaccion = cliente.costoPorcentualTransaccion();
            if (costoTransaccion != 0) {
                System.out.printf("Se excedió el límite de operaciones gratuitas y el sistema generará" +
                        " un costo de %d%% sobre el monto de la transacción.\n", costoTransaccion);
            }
            else {
                System.out.println("La transacción esta bajo el limite de operaciones, por tanto sera gratuita.");
            }
        }

    }
    
}
