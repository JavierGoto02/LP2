package Clases;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Grupo 1
 */
public abstract class TarjetaCredito extends Tarjeta {

    private int saldoPendiente;

    private int pagoMinimo;
    private int lineaCredito;
    private float interes;
    private float interesPenalizacion;
    private Date fechaLimitePago;

    public TarjetaCredito(int nroTarjeta, Date fechaVencimiento, int cVC, int idCuenta, int pagoMinimo,
            int lineaCredito, float interes, float interesPenalizacion, Date fechaLimitePago) {
        super(nroTarjeta, fechaVencimiento, cVC, idCuenta);
        this.saldoPendiente = 0;
        this.pagoMinimo = pagoMinimo;
        this.lineaCredito = lineaCredito;
        this.interes = interes;
        this.interesPenalizacion = interesPenalizacion;
        this.fechaLimitePago = fechaLimitePago;
    }

    public int getPagoMinimo() {
        return pagoMinimo;
    }

    public void setPagoMinimo(int pagoMinimo) {
        this.pagoMinimo = pagoMinimo;
    }

    public int getSaldoPendiente() {
        return saldoPendiente;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public float getInteresPenalizacion() {
        return interesPenalizacion;
    }

    public void setInteresPenalizacion(float interesPenalizacion) {
        this.interesPenalizacion = interesPenalizacion;
    }

    public Date getFechaLimitePago() {
        return fechaLimitePago;
    }

    public void setFechaLimitePago(Date fechaLimitePago) {
        this.fechaLimitePago = fechaLimitePago;
    }

    @Override
    public int consultarSaldo() {
        return lineaCredito - saldoPendiente;
    }

    @Override
    public void realizarPago(int monto) {
        saldoPendiente += monto;
    }

    @Override
    public void abonarSaldo(int monto) {

        if (monto >= pagoMinimo) {
            // Se define la fecha actual como la fecha de pago 
            Date fechaPago = new Date();
            // Si se pagó a los días posteriores al fecha límite, se aplicará un interés diario de penalización
            if (fechaLimitePago.compareTo(fechaPago) < 0) {
                long diferenciaTiempo = fechaPago.getTime() - fechaLimitePago.getTime();
                long diferenciaDia = TimeUnit.DAYS.convert(diferenciaTiempo, TimeUnit.MILLISECONDS);
                for (int i = 0; i < diferenciaDia; i++) {
                    saldoPendiente += saldoPendiente + saldoPendiente * interesPenalizacion;
                }
            }
            saldoPendiente -= monto;
            // El resto del importe a pagar genera interés
            saldoPendiente += saldoPendiente + saldoPendiente * interes;
            fechaLimitePago.setMonth(fechaLimitePago.getMonth() + 1);
        }
    }
}
