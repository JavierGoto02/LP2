
package Clases;

/**
 *
 * @author Grupo 1
 */
public class Transferencia implements Comprobante{
    private int idTransferencia;
    private Cuenta Fuente;
    private Cuenta Destino;
    private int monto;

    public Transferencia(Cuenta Fuente, Cuenta Destino, int monto) {
        idTransferencia = Sistema.generarIDTransferencia();
        this.Fuente = Fuente;
        this.Destino = Destino;
        this.monto = monto;
        Sistema.agregarTransferencia(this);
    }

    @Override
    public String emitirComprobante() {
        return "**************COMPROBANTE TRANSFERENCIA**************\n" + "Fuente: " + Fuente.toShortString()
                + "\nDestino: " + Destino.toShortString() + "\n";
    }

    public int getIdTransferencia() {
        return idTransferencia;
    }

    public Cuenta getFuente() {
        return Fuente;
    }

    public void setFuente(Cuenta fuente) {
        Fuente = fuente;
    }

    public Cuenta getDestino() {
        return Destino;
    }

    public void setDestino(Cuenta destino) {
        Destino = destino;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

}
