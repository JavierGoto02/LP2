package Clases;

import java.util.ArrayList;

/**
 * Esta clase representa la cuenta de un usuario
 * @author Grupo 1
 */

public class Cuenta {

    private int ID;
    private Cliente cliente;
    private int saldo;
    private int pinTransaccion;
    ArrayList<Comprobante> comprobantes; //Tiene el comprobante de todas las transacciones hechas por la cuenta

    public Cuenta(Cliente cliente, int saldo, int pinTransaccion) {
        ID = Sistema.generarIDCuenta();
        this.cliente = cliente;
        this.saldo = saldo;
        this.pinTransaccion = pinTransaccion;
        comprobantes = new ArrayList<>();
        Sistema.agregarCuenta(this);
    }

    public int getID() {
        return ID;
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

    public void aumentarSaldo(int monto) {
        saldo += monto;
    }

    public int getPinTransaccion() {
        return pinTransaccion;
    }

    public void setPinTransaccion(int pinTransaccion) {
        this.pinTransaccion = pinTransaccion;
    }

    //El sistema se encargará de obtener los datos del destinatario y validar datos
    public boolean realizarTransferencia(Cuenta destinatario, int monto) {
        if (saldo >= monto) {
            destinatario.aumentarSaldo(monto);
            saldo -= monto;
            //Generar los ids automaticamente
            ComprobanteTransferencia comprobante = new ComprobanteTransferencia(345, 222, monto, this, destinatario);
            comprobantes.add(comprobante);
            return true; //Realizado con exito
        }

        return false; //Realizado sin exito
    }

    public String toShortString() {
        return "Nro cuenta: " + ID + "\n" + "Propietario: " + cliente.toShortString();
    }

}
