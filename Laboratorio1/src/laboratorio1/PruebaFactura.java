package laboratorio1;

import java.util.Scanner;
public class PruebaFactura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Prueba de clase Factura.\n");
        
        System.out.print("Ingrese el numero de pieza: ");
        String numeroDePieza = entrada.nextLine();
        
        System.out.print("Ingrese la descripcion de la pieza: ");
        String descripcionPieza = entrada.nextLine();
        
        System.out.print("Ingrese la cantidad de articulos como entero: ");
        int cantidadDeArticulos = entrada.nextInt();
        
        System.out.print("Ingrese el precio por articulo como valor decimal: ");
        double precioPorArticulo = entrada.nextDouble();
        
        // Instanciamos nuestra clase Factura
        Factura facturaIngresada = new Factura(numeroDePieza,descripcionPieza, cantidadDeArticulos, precioPorArticulo);
        
        System.out.println("\nSe creo la factura con los siguientes datos: ");
        System.out.println("-numeroDePieza: " + facturaIngresada.getNumeroDePieza());
        System.out.println("-descripcionDeLaPieza: " + facturaIngresada.getDescripcionDePieza());
        System.out.println("-cantidadDeArticulos: " + facturaIngresada.getCantidadDeArticulos());
        System.out.printf("-precioPorArticulo: %.3f\n", facturaIngresada.getPrecioPorArticulo());
        System.out.printf("Monto de la factura: %.3f\n", facturaIngresada.obtenerMontoFactura());   
        
        System.out.println("\nPrueba de modificar la factura.\n"); 
        entrada.nextLine();
        System.out.print("Ingrese el numero de pieza: ");
        facturaIngresada.setNumeroDePieza(entrada.nextLine());
        
        System.out.print("Ingrese la descripcion de la pieza: ");
        facturaIngresada.setDescripcionDePieza(entrada.nextLine());

        System.out.print("Ingrese la cantidad de articulos como entero: ");
        facturaIngresada.setCantidadDeArticulos(entrada.nextInt());
        
        System.out.print("Ingrese el precio por articulo como valor decimal: ");
        facturaIngresada.setPrecioPorArticulo(entrada.nextDouble());
        
        System.out.println("\nLuego de modificar la factura tiene los siguientes datos: ");
        System.out.println("-numeroDePieza: " + facturaIngresada.getNumeroDePieza());
        System.out.println("-descripcionDeLaPieza: " + facturaIngresada.getDescripcionDePieza());
        System.out.println("-cantidadDeArticulos: " + facturaIngresada.getCantidadDeArticulos());
        System.out.printf("-precioPorArticulo: %.3f\n", facturaIngresada.getPrecioPorArticulo());
        System.out.printf("Monto de la factura: %.3f\n", facturaIngresada.obtenerMontoFactura());            
    }
}
