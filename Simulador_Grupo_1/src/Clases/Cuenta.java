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
    private Tarjeta tarjeta;
    private int pinTransaccion;
    ArrayList<Transferencia> transferencias; 
    ArrayList<Pago> pagos;

    public Cuenta(int ID, Cliente cliente, Tarjeta tarjeta, int pinTransaccion) {
        this.ID = ID;
        this.cliente = cliente;
        this.tarjeta = tarjeta;
        this.pinTransaccion = pinTransaccion;
        transferencias = new ArrayList<>();
        pagos = new ArrayList<>();
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

    public int getPinTransaccion() {
        return pinTransaccion;
    }

    public void setPinTransaccion(int pinTransaccion) {
        this.pinTransaccion = pinTransaccion;
    }
    
   
    
    //El sistema se encargará de obtener los datos del destinatario y validar datos
    public boolean realizarTransferencia(Cuenta destinatario, int monto)
    {
        if(tarjeta.getSaldo() >= monto)
        {
            destinatario.tarjeta.aumentarSaldo(monto);
            tarjeta.decrementarSaldo(monto);
            //Generar los ids automaticamente
            Transferencia transferencia = new Transferencia(this, destinatario, monto);
            transferencias.add(transferencia);
            return true; //Realizado con exito
        }
        
        return false; //Realizado sin exito
    }
    
    public boolean realizarPago(int monto)
    {
        if(tarjeta.getSaldo() >= monto)
        {
            Pago pago = new Pago();
        }
    }
    
    public String toShortString()
    {
        return "Nro cuenta: " + ID + "\n" + "Propietario: " + cliente.toShortString();
    }
    
    
            

}
