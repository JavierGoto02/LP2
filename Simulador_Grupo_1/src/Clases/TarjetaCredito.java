package Clases;

import java.util.Date;

/**
 *
 * @author Grupo 1
 */
public class TarjetaCredito extends Tarjeta
{
    private int pagoMinimo;
    private float interes;

    public TarjetaCredito(int pagoMinimo, float interes, int nroTarjeta, int saldo, Date fechaVencimiento, int CVC, int idCuenta) {
        super(nroTarjeta, saldo, fechaVencimiento, CVC, idCuenta);
        this.pagoMinimo = pagoMinimo;
        this.interes = interes;
    }

    public int getPagoMinimo() {
        return pagoMinimo;
    }

    public void setPagoMinimo(int pagoMinimo) {
        this.pagoMinimo = pagoMinimo;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }
    
    
}
