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
    ArrayList<Comprobante> comprobantes;

    public Cuenta(int idpropietario, Tarjeta tarjeta, int pinTransaccion, int ID) 
    {
        this.ID = ID;
        this.idPropietario = idpropietario;
        this.tarjeta = tarjeta;
        this.pinTransaccion = pinTransaccion;
        comprobantes = new ArrayList<>();
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
        return comprobantes;
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
        if (tarjeta.consultarSaldo() >= monto) 
        {
            destinatario.tarjeta.abonarSaldo(monto);
            tarjeta.realizarPago(monto);
            //Generar los ids automaticamente
            Transferencia transferencia = new Transferencia(this.ID, destinatario.ID, monto);
            comprobantes.add(transferencia);
            return true; //Realizado con exito
        }

        return false; //Realizado sin exito
    }

    public boolean realizarPagoServicio(int monto, String descripcionServicio) 
    {
        if (tarjeta.consultarSaldo() >= monto) 
        {
            tarjeta.realizarPago(monto);
            Pago pago = new Pago(this, descripcionServicio, monto, tarjeta);
            comprobantes.add(pago);
            return true;
        }
        return false;
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

    public void eliminar()
    {
        comprobantes = null;
        tarjeta = null;
    }


    public String toShortString() 
    {
        Cliente propietarioCuenta = Sistema.obtenerObjetoCliente(idPropietario);
        return "Nro cuenta: " + ID + "\n" + "Propietario: " + propietarioCuenta.toShortString();
    }

}
