
package Clases;

/**
 *
 * @author Grupo 1
 */
public class Transferencia implements Comprobante{
    private int idTransferencia;
    private int idFuente;
    private int idDestino;
    private int monto;

    public Transferencia(int Fuente, int Destino, int monto) {
        this.idFuente = Fuente;
        this.idDestino = Destino;
        this.monto = monto;
    }

    @Override
    public String emitirComprobante() 
    {
        Cuenta Fuente = Sistema.obtenerObjetoCuenta(idFuente);
        Cuenta Destino = Sistema.obtenerObjetoCuenta(idDestino);
        return "**************COMPROBANTE TRANSFERENCIA**************\n" + "Transferencia Nro: " + idTransferencia + "\nFuente: " + Fuente.toShortString()
                + "\nDestino: " + Destino.toShortString() + "\nMonto: " + monto;
    }

    @Override
    public boolean esTranferencia() {
        return true;
    }
    

    @Override
    public int getIdentificador() {
        return idTransferencia;
    }
    


    @Override
    public int getIDCuenta() {
        return idFuente;
    }
}
