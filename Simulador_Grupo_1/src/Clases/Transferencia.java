
package Clases;

/**
 *
 * @author Grupo 1
 */
public class Transferencia 
{
    private int idTransferencia;
    private Cuenta Fuente;
    private Cuenta Destino;
    private int monto;

    public Transferencia(Cuenta Fuente, Cuenta Destino, int monto) {
        this.Fuente = Fuente;
        this.Destino = Destino;
        this.monto = monto;
    }
    
    public String emitirComprobante()
    {
        return "**************COMPROBANTE TRANSFERENCIA**************\n" + "Fuente: " + Fuente.toShortString() + "\nDestino: " +  Destino.toShortString() + "\n";
    }
    
    

 
    
    
    
}
