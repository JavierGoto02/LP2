package SistemaBancario.Entidades;

import java.time.LocalDate;
import java.util.Date;

/**
 * La clase TarjetaDebito representa una tarjeta de débito asociada a una cuenta bancaria.
 * Extiende de la clase Tarjeta y proporciona funcionalidades específicas de una tarjeta de débito,
 * como el saldo y las operaciones de consulta, abono y pago.
 * También implementa los métodos abstractos de la clase padre.
 *
 * @author Grupo 1
 */
public class TarjetaDebito extends Tarjeta {

    private int saldo; // Saldo actual en la tarjeta de débito

    /**
     * Constructor que inicializa una instancia de la clase TarjetaDebito.
     *
     * @param nroTarjeta Número de la tarjeta.
     * @param fechaVencimiento Fecha de vencimiento de la tarjeta.
     * @param CVC Código de Verificación de la tarjeta.
     * @param idCuenta Identificador de la cuenta asociada a la tarjeta.
     * @param saldo Saldo inicial de la tarjeta de débito.
     */
    public TarjetaDebito(int nroTarjeta, LocalDate fechaVencimiento, int CVC, int idCuenta, int saldo) {
        super(nroTarjeta, fechaVencimiento, CVC, idCuenta);
        this.saldo = saldo;
    }

    /**
     * Consulta el saldo actual de la tarjeta de débito.
     *
     * @return El saldo actual.
     */
    @Override
    public int consultarSaldo() {
        // Implementación del método en la clase concreta
        return saldo;
    }

    /**
     * Abona el saldo de la tarjeta de débito.
     *
     * @param monto El monto a abonar.
     */
    @Override
    public void abonarSaldo(int monto) {
        // Implementación del método en la clase concreta
        saldo += monto;
    }

    /**
     * Realiza un pago utilizando la tarjeta de débito.
     *
     * @param monto El monto a pagar.
     */
    @Override
    public void realizarPago(int monto) {
        // Implementación del método en la clase concreta
        saldo -= monto;
    }
}