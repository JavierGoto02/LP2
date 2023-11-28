package SistemaBancario.Entidades;

import java.util.ArrayList;

/**
 * La clase Cuenta representa la cuenta de un usuario en la aplicación bancaria.
 * Contiene información como el identificador de la cuenta, el propietario,
 * la tarjeta asociada, el PIN de transacción, y métodos para realizar operaciones en la cuenta.
 *
 * @author Grupo 1
 */
public class Cuenta {

    private int ID;
    private int idPropietario;
    private Tarjeta tarjeta;
    private int pinTransaccion;

    /**
     * Constructor que inicializa una instancia de la clase Cuenta.
     *
     * @param idPropietario El identificador del propietario de la cuenta.
     * @param tarjeta La tarjeta asociada a la cuenta.
     * @param pinTransaccion El PIN de transacción asociado a la cuenta.
     * @param ID El identificador único de la cuenta.
     */
    public Cuenta(int idPropietario, Tarjeta tarjeta, int pinTransaccion, int ID) {
        this.ID = ID;
        this.idPropietario = idPropietario;
        this.tarjeta = tarjeta;
        this.pinTransaccion = pinTransaccion;
    }

    /**
     * Obtiene el identificador único de la cuenta.
     *
     * @return El identificador único de la cuenta.
     */
    public int getID() {
        return ID;
    }

    /**
     * Obtiene el identificador del propietario de la cuenta.
     *
     * @return El identificador del propietario de la cuenta.
     */
    public int getIDPropietario() {
        return idPropietario;
    }

    /**
     * Obtiene la tarjeta asociada a la cuenta.
     *
     * @return La tarjeta asociada a la cuenta.
     */
    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    /**
     * Obtiene la lista de comprobantes asociados a la cuenta.
     *
     * @return Una lista de comprobantes asociados a la cuenta.
     */
    public ArrayList<Comprobante> getComprobantes() {
        return Sistema.obtenerListaComprobantes(ID);
    }

    /**
     * Obtiene el PIN de transacción asociado a la cuenta.
     *
     * @return El PIN de transacción asociado a la cuenta.
     */
    public int getPinTransaccion() {
        return pinTransaccion;
    }

    /**
     * Establece un nuevo PIN de transacción para la cuenta.
     *
     * @param pinTransaccion El nuevo PIN de transacción.
     */
    public void setPinTransaccion(int pinTransaccion) {
        this.pinTransaccion = pinTransaccion;
    }

    /**
     * Aumenta el saldo de la cuenta.
     *
     * @param monto El monto a abonar a la cuenta.
     */
    public void aumentarSaldo(int monto) {
        tarjeta.abonarSaldo(monto);
    }

    /**
     * Verifica si la cuenta tiene fondos suficientes para una operación.
     *
     * @param monto El monto a verificar.
     * @return true si la cuenta tiene fondos suficientes, false en caso contrario.
     */
    public boolean tieneFondoSuficiente(int monto) {
        return tarjeta.consultarSaldo() >= monto;
    }

    /**
     * Disminuye el saldo de la cuenta realizando un pago.
     *
     * @param monto El monto a pagar desde la cuenta.
     */
    public void disminuirSaldo(int monto) {
        tarjeta.realizarPago(monto);
    }

    /**
     * Verifica si la cuenta tiene deuda (solo aplicable a tarjetas de crédito).
     *
     * @return true si la cuenta tiene deuda, false en caso contrario.
     */
    public boolean tieneDeuda() {
        if (tarjeta instanceof TarjetaCredito) {
            return ((TarjetaCredito) tarjeta).getSaldoPendiente() > 0;
        }
        return false;
    }

    /**
     * Devuelve una representación de cadena breve de la cuenta, incluyendo el número de cuenta
     * y una representación breve del propietario.
     *
     * @return Una cadena breve que representa la cuenta.
     */
    public String toShortString() {
        Cliente propietarioCuenta = Sistema.obtenerObjetoCliente(idPropietario);
        return "Nro cuenta: " + ID + "\n" + "Propietario: " + propietarioCuenta.toShortString();
    }
}