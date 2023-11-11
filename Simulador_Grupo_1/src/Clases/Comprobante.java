package Clases;

/**
 *
 * @author Grupo 1
 */
public abstract class Comprobante 
{
    private int idComprobante;
    private int monto;
    private Cuenta fuente;
    private Cuenta destino;

    public Comprobante(int idComprobante, int monto, Cuenta fuente, Cuenta destino) {
        this.idComprobante = idComprobante;
        this.monto = monto;
        this.fuente = fuente;
        this.destino = destino;
    }

    

    public int getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(int idComprobante) {
        this.idComprobante = idComprobante;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public String toString() 
    {
        return "Nro comprobante: " + idComprobante + "\nFuente: " + fuente.toShortString()+ "\nDestino:" + destino.toShortString()+ "\nMonto: " + monto + "\n";
    }
    
    
    
    
}
