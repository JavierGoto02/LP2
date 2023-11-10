package Clases;

/**
 *
 * @author Grupo 1
 */

public class Cuenta 
{
    private int ID;
    private String cliente;
    private int saldo;
    private int pinTransaccion;

    public Cuenta(int ID, String cliente, int saldo, int pinTransaccion) {
        this.ID = ID;
        this.cliente = cliente;
        this.saldo = saldo;
        this.pinTransaccion = pinTransaccion;
    }
    
    
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getPinTransaccion() {
        return pinTransaccion;
    }

    public void setPinTransaccion(int pinTransaccion) {
        this.pinTransaccion = pinTransaccion;
    }
    
    
    
    
}
