package Clases;

import java.util.ArrayList;

/**
 * Esta clase representa la cuenta de un usuario
 * @author Grupo 1
 */

public class Cuenta 
{

    private int ID;
    private int idPropietario;
    private Tarjeta tarjeta;
    private int pinTransaccion;

    public Cuenta(int idpropietario, Tarjeta tarjeta, int pinTransaccion, int ID) 
    {
        this.ID = ID;
        this.idPropietario = idpropietario;
        this.tarjeta = tarjeta;
        this.pinTransaccion = pinTransaccion;
    }

    public int getID() {
        return ID;
    }

    public int getIDPropietario() {
        return idPropietario;
    }

    public Tarjeta getTarjeta()
    {
        return tarjeta;
    }

    public ArrayList<Comprobante> getComprobantes()
    {
        return Sistema.obtenerListaComprobantes(ID);
    }

    public int getPinTransaccion() {
        return pinTransaccion;
    }

    public void setPinTransaccion(int pinTransaccion) {
        this.pinTransaccion = pinTransaccion;
    }

    public void aumentarSaldo(int monto)
    {
        tarjeta.abonarSaldo(monto);
    }

    public boolean tieneFondoSuficiente(int monto)
    {
        if(tarjeta.consultarSaldo() >= monto)
            return true;
        return false;
    }

    public void disminuirSaldo(int monto)
    {
        tarjeta.realizarPago(monto);
    }


    public boolean tieneDeuda()
    {
        if(tarjeta instanceof TarjetaCredito)
        {
            if(((TarjetaCredito)tarjeta).getSaldoPendiente() > 0)
                return true;
        }
        return false;
    }


    public String toShortString() 
    {
        Cliente propietarioCuenta = Sistema.obtenerObjetoCliente(idPropietario);
        return "Nro cuenta: " + ID + "\n" + "Propietario: " + propietarioCuenta.toShortString();
    }

}
