package Clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * La clase TarjetaCredito representa una tarjeta de crédito asociada a una cuenta bancaria.
 * Extiende de la clase Tarjeta y proporciona funcionalidades específicas de una tarjeta de crédito,
 * como el saldo pendiente, el pago mínimo, la línea de crédito, las tasas de interés y la fecha límite de pago.
 * También implementa los métodos abstractos de la clase padre.
 *
 * @author Grupo 1
 */
public class TarjetaCredito extends Tarjeta {

    private int saldoPendiente; // Saldo pendiente en la tarjeta de crédito

    private int pagoMinimo; // Pago mínimo que debe realizarse
    private int lineaCredito; // Línea de crédito disponible
    private float interes; // Tasa de interés por uso de la tarjeta de crédito
    private float interesPenalizacion; // Tasa de interés por pagos atrasados
    private LocalDate fechaLimitePago; // Fecha límite para realizar el pago mínimo

    /**
     * Constructor que inicializa una instancia de la clase TarjetaCredito.
     *
     * @param nroTarjeta Número de la tarjeta.
     * @param fechaVencimiento Fecha de vencimiento de la tarjeta.
     * @param CVC Código de Verificación de la tarjeta.
     * @param idCuenta Identificador de la cuenta asociada a la tarjeta.
     * @param pagoMinimo Pago mínimo que debe realizarse.
     * @param lineaCredito Línea de crédito disponible.
     * @param interes Tasa de interés por uso de la tarjeta de crédito.
     * @param interesPenalizacion Tasa de interés por pagos atrasados.
     * @param fechaLimitePago Fecha límite para realizar el pago mínimo.
     */
    public TarjetaCredito(int nroTarjeta, LocalDate fechaVencimiento, int CVC, int idCuenta, int pagoMinimo,
            int lineaCredito, float interes, float interesPenalizacion, LocalDate fechaLimitePago) {
        super(nroTarjeta, fechaVencimiento, CVC, idCuenta);
        this.saldoPendiente = 0;
        this.pagoMinimo = pagoMinimo;
        this.lineaCredito = lineaCredito;
        this.interes = interes;
        this.interesPenalizacion = interesPenalizacion;
        this.fechaLimitePago = fechaLimitePago;
    }

    /**
     * Obtiene el pago mínimo que debe realizarse.
     *
     * @return El pago mínimo.
     */
    public int getPagoMinimo() {
        return pagoMinimo;
    }

    /**
     * Establece el pago mínimo que debe realizarse.
     *
     * @param pagoMinimo El nuevo pago mínimo.
     */
    public void setPagoMinimo(int pagoMinimo) {
        this.pagoMinimo = pagoMinimo;
    }

    /**
     * Obtiene el saldo pendiente en la tarjeta de crédito.
     *
     * @return El saldo pendiente.
     */
    public int getSaldoPendiente() {
        return saldoPendiente;
    }

    /**
     * Obtiene la tasa de interés por uso de la tarjeta de crédito.
     *
     * @return La tasa de interés por uso de la tarjeta de crédito.
     */
    public float getInteres() {
        return interes;
    }

    /**
     * Establece la tasa de interés por uso de la tarjeta de crédito.
     *
     * @param interes La nueva tasa de interés por uso de la tarjeta de crédito.
     */
    public void setInteres(float interes) {
        this.interes = interes;
    }

    /**
     * Obtiene la tasa de interés por pagos atrasados.
     *
     * @return La tasa de interés por pagos atrasados.
     */
    public float getInteresPenalizacion() {
        return interesPenalizacion;
    }

    /**
     * Establece la tasa de interés por pagos atrasados.
     *
     * @param interesPenalizacion La nueva tasa de interés por pagos atrasados.
     */
    public void setInteresPenalizacion(float interesPenalizacion) {
        this.interesPenalizacion = interesPenalizacion;
    }

    /**
     * Obtiene la fecha límite para realizar el pago mínimo.
     *
     * @return La fecha límite para realizar el pago mínimo.
     */
    public LocalDate getFechaLimitePago() {
        return fechaLimitePago;
    }

    /**
     * Establece la fecha límite para realizar el pago mínimo.
     *
     * @param fechaLimitePago La nueva fecha límite para realizar el pago mínimo.
     */
    public void setFechaLimitePago(LocalDate fechaLimitePago) {
        this.fechaLimitePago = fechaLimitePago;
    }

    /**
     * Consulta el saldo disponible en la tarjeta de crédito, teniendo en cuenta el saldo pendiente y la línea de crédito.
     *
     * @return El saldo disponible.
     */
    @Override
    public int consultarSaldo() {
        return lineaCredito - saldoPendiente;
    }

    /**
     * Realiza un pago utilizando la tarjeta de crédito.
     *
     * @param monto El monto a pagar.
     */
    @Override
    public void realizarPago(int monto) {
        saldoPendiente += monto;
    }

    /**
     * Abona el saldo pendiente de la tarjeta de crédito y realiza el cálculo de intereses y penalizaciones.
     *
     * @param monto El monto a abonar.
     */
    @Override
    public void abonarSaldo(int monto) {
        if (monto >= pagoMinimo) {
            // Se define la fecha actual como la fecha de pago
            LocalDate fechaPago = LocalDate.now();
            // Si se pagó a los días posteriores a la fecha límite, se aplicará un interés diario de penalización
            if (fechaLimitePago.isBefore(fechaPago)) {
                long diferenciaDia = ChronoUnit.DAYS.between(fechaLimitePago, fechaPago);
                for (int i = 0; i < diferenciaDia; i++) {
                    saldoPendiente +=  saldoPendiente * interesPenalizacion;
                }
            }
            saldoPendiente -= monto;
            // El resto del importe a pagar genera interés
            saldoPendiente += saldoPendiente * interes;
            fechaLimitePago = fechaLimitePago.plusMonths(1);
        }
    }
}
