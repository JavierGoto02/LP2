
package Clases;

import java.util.Date;

/**
 *
 * @author Grupo 1
 */
public abstract class Tarjeta 
{

    private int nroTarjeta;
    private Date fechaVencimiento;
    private int CVC;
    private int idCuenta;

    
    public Tarjeta(int nroTarjeta, Date fechaVencimiento, int cVC, int idCuenta) {
        this.nroTarjeta = nroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        CVC = cVC;
        this.idCuenta = idCuenta;
    }

    
    public int getNroTarjeta() {
        return nroTarjeta;
    }


    public void setNroTarjeta(int nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
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


    public void setCVC(int cVC) {
        CVC = cVC;
    }


    public int getIdCuenta() {
        return idCuenta;
    }


    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }


    public abstract int consultarSaldo();
    public abstract void realizarPago(int monto);
    public abstract void abonarSaldo(int monto);
}
