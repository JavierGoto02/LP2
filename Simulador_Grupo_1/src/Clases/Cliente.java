package Clases;

/**
 *
 * @author Grupo 1
 */

public class Cliente 
{
    private int ID;
    private int PIN;
    private String direccion;
    private String telefono;

    public Cliente(int ID, int PIN, String direccion, String telefono) {
        this.ID = ID;
        this.PIN = PIN;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    






    
    
}
