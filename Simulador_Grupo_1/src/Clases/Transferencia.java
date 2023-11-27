package Clases;

/**
 * Representa una transferencia entre cuentas bancarias.
 * 
 * <p>Una transferencia tiene un identificador único, la cuenta fuente (de donde se realiza la transferencia),
 * la cuenta destino (a donde se realiza la transferencia) y el monto transferido.</p>
 * 
 * <p>Implementa la interfaz {@link Comprobante} para la emisión de comprobantes de transferencia.</p>
 * 
 * @author Grupo 1
 */
public class Transferencia implements Comprobante {

    private int idTransferencia;
    private int idFuente;
    private int idDestino;
    private int monto;

    /**
     * Crea una nueva instancia de la clase Transferencia.
     * 
     * @param fuente El identificador de la cuenta fuente.
     * @param destino El identificador de la cuenta destino.
     * @param monto El monto de la transferencia.
     */
    public Transferencia(int fuente, int destino, int monto) {
        this.idFuente = fuente;
        this.idDestino = destino;
        this.monto = monto;
    }

    /**
     * Emite un comprobante de transferencia con la información detallada.
     * 
     * @return Una cadena que representa el comprobante de transferencia.
     */
    @Override
    public String emitirComprobante() 
    {
        Cuenta Fuente = Sistema.obtenerObjetoCuenta(idFuente);
        Cuenta Destino = Sistema.obtenerObjetoCuenta(idDestino);
        return "**************COMPROBANTE TRANSFERENCIA**************\n" + "Transferencia Nro: " + idTransferencia
                + "\nFuente: " + Fuente.toShortString() + "\nDestino: " + Destino.toShortString() + "\nMonto: " + monto;
    }

    /**
     * Verifica si el comprobante es una transferencia.
     * 
     * @return Verdadero, ya que esta clase representa una transferencia.
     */
    @Override
    public boolean esTranferencia() {
        return true;
    }
    
    /**
     * Obtiene el identificador único de la transferencia.
     * 
     * @return El identificador de la transferencia.
     */
    @Override
    public int getIdentificador() {
        return idTransferencia;
    }
    
    /**
     * Obtiene el identificador de la cuenta fuente de la transferencia.
     * 
     * @return El identificador de la cuenta fuente.
     */
    @Override
    public int getIDCuenta() {
        return idFuente;
    }
}
