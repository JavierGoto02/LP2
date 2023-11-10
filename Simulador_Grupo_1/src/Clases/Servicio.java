
package Clases;

/**
 *
 * @author Grupo 1
 */
public class Servicio 
{
    
    private int ID;
    private String nombre;

    public Servicio(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
