package Clases;

import java.util.ArrayList;

/**
 * Esta clase representa la cuenta de un usuario
 * @author Grupo 1
 */

public class Cuenta 
{
    private int ID;
    private Cliente cliente;
    private int saldo;
    private int pinTransaccion;
    ArrayList<Comprobante> comprobantes;

    public Cuenta(int ID, Cliente cliente, int saldo, int pinTransaccion) {
        this.ID = ID;
        this.cliente = cliente;
        this.saldo = saldo;
        this.pinTransaccion = pinTransaccion;
        comprobantes = new ArrayList<>();
    }
    
    
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void aunentarSaldo(int monto)
    {
        saldo += monto;
    }

    public int getPinTransaccion() {
        return pinTransaccion;
    }

    public void setPinTransaccion(int pinTransaccion) {
        this.pinTransaccion = pinTransaccion;
    }
    
   
    
    //El sistema se encargará de obtener los datos del destinatario y validar datos
    public boolean realizarTransferencia(Cuenta destinatario, int monto)
    {
        if(saldo >= monto)
        {
            destinatario.aunentarSaldo(monto);
            saldo -= monto;
            return true; //Realizado con exito
        }
        
        return false; //Realizado sin exito
    }
    
//    public void getInformacion()
//    {
//        System.out.printf("Nombre: %s");
//    }
}
