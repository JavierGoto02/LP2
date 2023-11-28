package SistemaBancario.Entidades;

/**
 * Representa una transacción realizada por un usuario en la aplicación bancaria.
 * 
 * <p>Una transacción tiene un identificador único, el identificador del pagador, la descripción del servicio,
 * el monto de la transacción y el método de pago utilizado.</p>
 * 
 * <p>Implementa la interfaz {@link Comprobante} para la emisión de comprobantes de transacción.</p>
 * 
 * @author Grupo 1
 */
public class Transaccion implements Comprobante {

    private int idTransaccion;
    private int idPagador;
    private String descripcionServicio;
    private int monto;
    private String metodoPago;

    /**
     * Crea una nueva instancia de la clase Transaccion.
     * 
     * @param pagador El identificador del pagador.
     * @param descripcionServicio La descripción del servicio realizado.
     * @param monto El monto de la transacción.
     * @param metodoPago El método de pago utilizado.
     */
    public Transaccion(int pagador, String descripcionServicio, int monto, String metodoPago) {
        this.idPagador = pagador;
        this.descripcionServicio = descripcionServicio;
        this.monto = monto;
        this.metodoPago = metodoPago;
    }

    /**
     * Obtiene el identificador único de la transacción.
     * 
     * @return El identificador de la transacción.
     */
    @Override
    public int getIdentificador() {
        return idTransaccion;
    }

    /**
     * Obtiene el identificador de la cuenta del pagador.
     * 
     * @return El identificador de la cuenta del pagador.
     */
    @Override
    public int getIDCuenta() {
        return idPagador;
    }

    /**
     * Verifica si el comprobante es una transferencia.
     * 
     * @return Falso, ya que esta clase representa una transacción, no una transferencia.
     */
    @Override
    public boolean esTranferencia() {
        return false;
    }

    /**
     * Emite un comprobante de transacción con la información detallada.
     * 
     * @return Una cadena que representa el comprobante de transacción.
     */
    @Override
    public String emitirComprobante() {
        Cuenta pagador = Sistema.obtenerObjetoCuenta(idPagador);
        return "**************COMPROBANTE TRANSACCION**************\n" + "Transaccion Nro: " + idTransaccion
                + "\nPagador: " + pagador.toShortString() + "\nDescripcion Servicio: " + descripcionServicio
                + "\nMonto a pagar: " + monto + "Metodo de pago: " + metodoPago + "\n";
    }
}
