
package Clases;

import java.util.Date;

/**
 *
 * @author Grupo 1
 */
public class Tarjeta 
{
    private int nroTarjeta;
    private int saldo;
    private Date fechaVencimiento;
    private int CVC;
    private int idCuenta;

    public Tarjeta(int nroTarjeta, int saldo, Date fechaVencimiento, int CVC, int idCuenta) {
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.fechaVencimiento = fechaVencimiento;
        this.CVC = CVC;
        this.idCuenta = idCuenta;
    }

    public int getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(int nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCVC() {
        return CVC;
    }

    public void setCVC(int CVC) {
        this.CVC = CVC;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }
    
    public void aumentarSaldo(int monto)
    {
        saldo += monto;
    }
    
    public void decrementarSaldo(int monto)
    {
        saldo -= monto;
    }
    
    
}
