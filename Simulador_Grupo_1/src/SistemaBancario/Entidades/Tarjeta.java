package SistemaBancario.Entidades;

import java.time.LocalDate;
import java.util.Date;

/**
 * La clase Tarjeta es una clase abstracta que representa una tarjeta asociada a una cuenta bancaria.
 * Contiene información común a todas las tarjetas, como el número de tarjeta, la fecha de vencimiento,
 * el código de verificación (CVC) y el identificador de la cuenta a la que está asociada.
 * También define métodos abstractos que deben ser implementados por las clases hijas.
 *
 * @author Grupo 1
 */
public abstract class Tarjeta {

    private int nroTarjeta; // Número de la tarjeta
    private LocalDate fechaVencimiento; // Fecha de vencimiento de la tarjeta
    private int CVC; // Código de Verificación de la tarjeta
    private int idCuenta; // Identificador de la cuenta asociada a la tarjeta

    /**
     * Constructor que inicializa una instancia de la clase Tarjeta.
     *
     * @param nroTarjeta Número de la tarjeta.
     * @param fechaVencimiento Fecha de vencimiento de la tarjeta.
     * @param CVC Código de Verificación de la tarjeta.
     * @param idCuenta Identificador de la cuenta asociada a la tarjeta.
     */
    public Tarjeta(int nroTarjeta, LocalDate fechaVencimiento, int CVC, int idCuenta) {
        this.nroTarjeta = nroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.CVC = CVC;
        this.idCuenta = idCuenta;
    }

    /**
     * Obtiene el número de la tarjeta.
     *
     * @return El número de la tarjeta.
     */
    public int getNroTarjeta() {
        return nroTarjeta;
    }

    /**
     * Establece el número de la tarjeta.
     *
     * @param nroTarjeta El nuevo número de la tarjeta.
     */
    public void setNroTarjeta(int nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    /**
     * Obtiene la fecha de vencimiento de la tarjeta.
     *
     * @return La fecha de vencimiento de la tarjeta.
     */
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Establece la fecha de vencimiento de la tarjeta.
     *
     * @param fechaVencimiento La nueva fecha de vencimiento de la tarjeta.
     */
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * Obtiene el Código de Verificación (CVC) de la tarjeta.
     *
     * @return El Código de Verificación de la tarjeta.
     */
    public int getCVC() {
        return CVC;
    }

    /**
     * Establece el Código de Verificación (CVC) de la tarjeta.
     *
     * @param CVC El nuevo Código de Verificación de la tarjeta.
     */
    public void setCVC(int CVC) {
        this.CVC = CVC;
    }

    /**
     * Obtiene el identificador de la cuenta asociada a la tarjeta.
     *
     * @return El identificador de la cuenta asociada a la tarjeta.
     */
    public int getIdCuenta() {
        return idCuenta;
    }

    /**
     * Establece el identificador de la cuenta asociada a la tarjeta.
     *
     * @param idCuenta El nuevo identificador de la cuenta asociada a la tarjeta.
     */
    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    /**
     * Método abstracto que debe ser implementado por las clases hijas para consultar el saldo.
     *
     * @return El saldo disponible en la cuenta asociada a la tarjeta.
     */
    public abstract int consultarSaldo();

    /**
     * Método abstracto que debe ser implementado por las clases hijas para realizar un pago.
     *
     * @param monto El monto a pagar.
     */
    public abstract void realizarPago(int monto);

    /**
     * Método abstracto que debe ser implementado por las clases hijas para abonar saldo.
     *
     * @param monto El monto a abonar.
     */
    public abstract void abonarSaldo(int monto);
}