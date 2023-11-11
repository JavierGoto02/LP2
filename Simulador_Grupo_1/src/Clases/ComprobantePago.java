package Clases;

/**
 *
 * @author Grupo 1
 */
public class ComprobantePago extends Comprobante
{
    private int idtransaccion;

    public ComprobantePago(int idtransaccion, int idComprobante, int monto, Cuenta fuente, Cuenta destino) {
        super(idComprobante, monto, fuente, destino);
        this.idtransaccion = idtransaccion;
    }

 

    

    public int getIdtransaccion() {
        return idtransaccion;
    }

    public void setIdtransaccion(int idtransaccion) {
        this.idtransaccion = idtransaccion;
    }
    
    
    

  
    
    
}
