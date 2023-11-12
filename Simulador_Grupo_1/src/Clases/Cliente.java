package Clases;

import java.util.ArrayList;

/**
 *
 * @author Grupo 1
 */

public abstract class Cliente {
    private int ID;
    private String direccion;
    private String telefono;
    private ArrayList<Cuenta> cuentas;

    public Cliente(int Identificador, String direccion, String telefono) {
        ID = Identificador;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public void agregarCuenta(Cuenta cuenta)
    {
        cuentas.add(cuenta);
    }

    public ArrayList<Cuenta> getCuentas()
    {
        return cuentas;
    }

    public void eliminarCuenta(Cuenta cuentaEliminar)
    {
        cuentas.remove(cuentaEliminar);
    }

    @Override
    public String toString() {
        return "Identificador: " + ID + "\n" + "Direccion: " + direccion + "\n" + "Telefono: " + telefono + "\n";
    }

    public String toShortString() {
        return "{ID=" + ID + ", Telefono=" + telefono;
    }

}
