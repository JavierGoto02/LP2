package Clases;

import java.util.Date;

/**
 *
 * @author Grupo 1
 */
public abstract class TarjetaCredito extends Tarjeta
{
    
    private int saldoPendiente;
    
    
    
    private int pagoMinimo;
    private int limiteCredito;
    private float interes;




    public TarjetaCredito(int nroTarjeta, Date fechaVencimiento, int cVC, int idCuenta, int saldoPendiente,
            int pagoMinimo, int limiteCredito, float interes) {
        super(nroTarjeta, fechaVencimiento, cVC, idCuenta);
        this.saldoPendiente = saldoPendiente;
        this.pagoMinimo = pagoMinimo;
        this.limiteCredito = limiteCredito;
        this.interes = interes;
    }

    public int getPagoMinimo() {
        return pagoMinimo;
    }

    public void setPagoMinimo(int pagoMinimo) {
        this.pagoMinimo = pagoMinimo;
    }

    public int getSaldoPendiente()
    {
        return saldoPendiente;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    @Override
    public int consultarSaldo() {
        return limiteCredito - saldoPendiente;
    }

    @Override
    public void realizarPago(int monto) 
    {
        saldoPendiente += monto;  
    }

    @Override
    public void abonarSaldo(int monto) 
    {
        saldoPendiente -= monto;
        
    }

    

    


    
    
}
