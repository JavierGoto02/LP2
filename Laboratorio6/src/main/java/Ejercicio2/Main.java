package Ejercicio2;

/**
 *
 * @author Grupo 1 - Laboratorio 6
 */
public class Main 
{

    public static void main(String[] args) 
    {
        Aerolinea aerolinea = new Aerolinea();
        int nroPersona = 0;
        while(true)
        {

            int seccion = aerolinea.ingresarSeccion();
            if(seccion == -1)
            {
                aerolinea.cerrarLector();
                break;  
            }
                
            nroPersona++;
            aerolinea.asignarAsiento(nroPersona, seccion);
        }
    }
    
}
