package Clases;

/**
 * La interfaz Comprobante define la estructura básica para emitir comprobantes en la aplicación bancaria.
 * Los comprobantes pueden ser utilizados para transferencias u otras transacciones financieras.
 * Implementar esta interfaz permite a las clases definir cómo se emiten los comprobantes y proporcionar
 * información relevante como el identificador y el ID de la cuenta asociada.
 *
 * @author Grupo 1
 */
public interface Comprobante {

    /**
     * Emite el comprobante asociado a una transacción.
     *
     * @return Una cadena que representa el comprobante emitido.
     */
    String emitirComprobante();

    /**
     * Verifica si el comprobante representa una transferencia.
     *
     * @return true si el comprobante es una transferencia, false en caso contrario.
     */
    boolean esTranferencia();

    /**
     * Obtiene el identificador único del comprobante.
     *
     * @return El identificador único del comprobante.
     */
    int getIdentificador();

    /**
     * Obtiene el ID de la cuenta asociada al comprobante.
     *
     * @return El ID de la cuenta asociada al comprobante.
     */
    int getIDCuenta();
}