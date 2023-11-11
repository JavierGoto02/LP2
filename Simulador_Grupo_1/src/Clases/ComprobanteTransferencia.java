
package Clases;

/**
 *
 * @author Grupo 1
 */
public class ComprobanteTransferencia extends Comprobante
{
    
    private int idTransferencia;

    public ComprobanteTransferencia(int idTransferencia, int idComprobante, int monto, Cuenta fuente, Cuenta destino) {
        super(idComprobante, monto, fuente, destino);
        this.idTransferencia = idTransferencia;
    }

   
    public int getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(int idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    
    
    
}
