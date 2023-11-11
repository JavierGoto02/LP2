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

    public Comprobante(int idComprobante, int monto) {
        this.idComprobante = idComprobante;
        this.monto = monto;
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

//    @Override
//    public String toString() 
//    {
//        
//        
//    }
    
    
    
    
}
