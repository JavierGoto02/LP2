package Clases;

import java.util.ArrayList;

/**
 * La clase abstracta Cliente representa a un cliente en la aplicación bancaria.
 * Proporciona información básica como el identificador, dirección y teléfono del cliente.
 * Además, permite acceder y manipular la información de las cuentas asociadas al cliente.
 *
 * @author Grupo 1
 */
public abstract class Cliente {

    private int ID;
    private String direccion;
    private String telefono;

    /**
     * Constructor que inicializa un objeto Cliente con un identificador, dirección y teléfono.
     *
     * @param identificador El identificador único del cliente.
     * @param direccion La dirección del cliente.
     * @param telefono El número de teléfono del cliente.
     */
    public Cliente(int identificador, String direccion, String telefono) {
        ID = identificador;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * Obtiene el identificador único del cliente.
     *
     * @return El identificador único del cliente.
     */
    public int getID() {
        return ID;
    }

    /**
     * Obtiene la dirección del cliente.
     *
     * @return La dirección del cliente.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del cliente.
     *
     * @param direccion La nueva dirección del cliente.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el número de teléfono del cliente.
     *
     * @return El número de teléfono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del cliente.
     *
     * @param telefono El nuevo número de teléfono del cliente.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la lista de cuentas asociadas al cliente.
     *
     * @return Una lista de cuentas asociadas al cliente.
     */
    public ArrayList<Cuenta> getCuentas() {
        return Sistema.obtenerListaCuentas(ID);
    }

    /**
     * Devuelve una representación de cadena del cliente, incluyendo su identificador, dirección y teléfono.
     *
     * @return Una cadena que representa al cliente.
     */
    @Override
    public String toString() {
        return "Identificador: " + ID + "\n" + "Direccion: " + direccion + "\n" + "Telefono: " + telefono + "\n";
    }
    
    public abstract String getEtiqueta();
    public abstract String getDocumento();
            
    /**
     * Devuelve una representación de cadena breve del cliente, incluyendo solo su identificador y teléfono.
     *
     * @return Una cadena breve que representa al cliente.
     */
    public String toShortString() {
        return "{ID=" + ID + ", Telefono=" + telefono;
    }
}