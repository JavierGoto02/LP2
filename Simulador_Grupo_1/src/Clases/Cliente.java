package Clases;

/**
 *
 * @author Grupo 1
 */

public abstract class Cliente {
    private int ID;
    private String direccion;
    private String telefono;

    public Cliente(String direccion, String telefono) {
        ID = Sistema.generarIDCliente();
        this.direccion = direccion;
        this.telefono = telefono;
        Sistema.agregarCliente(this);
    }

    public int getID() {
        return ID;
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

    @Override
    public String toString() {
        return "Identificador: " + ID + "\n" + "Direccion: " + direccion + "\n" + "Telefono: " + telefono + "\n";
    }

    public String toShortString() {
        return "{ID=" + ID + ", Telefono=" + telefono;
    }

}
