
package Clases;

/**
 *
 * @author Grupo 1
 */
public class Transferencia 
{
    private int idTransferencia;
    private int idFuente;
    private int idDestino;
    private int monto;

    public Transferencia(int idTransferencia, int idFuente, int idDestino, int monto) {
        this.idTransferencia = idTransferencia;
        this.idFuente = idFuente;
        this.idDestino = idDestino;
        this.monto = monto;
    }

    public int getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(int idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public int getIdFuente() {
        return idFuente;
    }

    public void setIdFuente(int idFuente) {
        this.idFuente = idFuente;
    }

    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
    
    
}
