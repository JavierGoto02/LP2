package Ejercicio2;
import java.util.Scanner;

/**
 *
 * @author Grupo 1 - Laboratorio 6
 */
public class Aerolinea 
{

    private final boolean[] asientos;
    private final Scanner lector;
    Aerolinea()
    {
        asientos = new boolean[10];
        lector = new Scanner(System.in);
    }

    public int ingresarSeccion()
    {
        System.out.print("Por favor escriba 1 para Primera Clase o 2 para Económico 0 -1 para salir: ");
        int seccion = lector.nextInt();
        while(seccion != 1 && seccion != 2 && seccion != -1)
        {
            System.out.print("Ingrese una opcion valida: ");
            seccion = lector.nextInt();
        }
        return seccion;
    } 

    private int ingresarSeccionAlternativa(String seccion)
    {
        System.out.print("Ingrese 1 si acepta ser asignado en la seccion " + seccion + " o -1 para esperar siguiente vuelo: ");
        int eleccion = lector.nextInt();
        while(eleccion != 1 && eleccion != -1)
        {
            System.out.print("Ingrese una opcion valida: ");
            eleccion = lector.nextInt();
        }
        return eleccion;
    }

    private void mostrarInformacion(int nroPersona, int asientoAsignado, String seccion)
    {
        System.out.println("Persona " + nroPersona + " asignado a la posicion "
            + asientoAsignado + " de la seccion " + seccion + ".");
        System.out.println();
    }


    private int asientoDisponible(int inicio, int fin)
    {
        for(int i = inicio; i <= fin; i++)
        {
            if(!asientos[i])
                return i;
        }
        return -1;
    }
    
   
    public void cerrarLector()
    {
        lector.close();
    }
    
    public void asignarAsiento(int nroPersona, int seccion)
    {
        int asientoAsignado = (seccion == 1 ? asientoDisponible(0, 4) : asientoDisponible(5, 9));
        String strSeccion = (seccion == 1? "primera clase" : "economica");
        if(asientoAsignado != -1)
        {
            asientos[asientoAsignado] = true;
            mostrarInformacion(nroPersona, asientoAsignado + 1, strSeccion);  
        }
        else
        {
            System.out.println("La seccion " + strSeccion + " esta llena.");
            strSeccion = (seccion == 1? "economica" : "primera clase");
            int eleccion = ingresarSeccionAlternativa(strSeccion);
            if(eleccion == 1)
            {
                asientoAsignado = (seccion == 1 ? asientoDisponible(5, 9) : asientoDisponible(0, 4));
                asientos[asientoAsignado] = true;
                mostrarInformacion(nroPersona, asientoAsignado + 1, strSeccion);
            }
            else
                System.out.println("El proximo vuelo sale en 3 horas");
        }  
    }

    
}
