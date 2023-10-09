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


    //Retorna la posicion de un asiento disponible en el intervalo del argumento, si no hay retorna -1
    private int asientoDisponible(int inicio, int fin)
    {
        for(int i = inicio; i <= fin; i++)
        {
            if(!asientos[i])
                return i;
        }
        return -1;
    }
    
   
    public void despegar()
    {
        System.out.println("Iniciando el despegue!");
        lector.close();
    }
    
    public void asignarAsiento(int nroPersona, int seccion)
    {
        int asientoAsignado = (seccion == 1 ? asientoDisponible(0, 4) : asientoDisponible(5, 9));
        String strSeccion = (seccion == 1? "primera clase" : "economica");
        if(asientoAsignado != -1) //Hay asiento disponible.
        {
            asientos[asientoAsignado] = true;
            mostrarInformacion(nroPersona, asientoAsignado + 1, strSeccion);  
        }

        else //No hay asiento disponible para la seccion elegida
        {
            System.out.println("La seccion " + strSeccion + " esta llena.");
            strSeccion = (seccion == 1? "economica" : "primera clase");

            //Ofrecemos al usuario ser asignado a la otra seccion
            int eleccion = ingresarSeccionAlternativa(strSeccion);
            if(eleccion == 1) //Acepto ser asignado a la otra seccion
            {
                asientoAsignado = (seccion == 1 ? asientoDisponible(5, 9) : asientoDisponible(0, 4));
                if(asientoAsignado != -1) //Si en la otra seccion hay lugar.
                {
                    asientos[asientoAsignado] = true;
                    mostrarInformacion(nroPersona, asientoAsignado + 1, strSeccion);
                }

                else //Si no hay lugar quiere decir que ya no quedan secciones libres.
                    System.out.printf("Ya no quedan secciones libres!!\n\n");
            }
            else //Si no acepta, le avisamos que el proximo vuelo sale en 3 horas.
                System.out.printf("El proximo vuelo sale en 3 horas\n\n");
        }  
    }

    
}
