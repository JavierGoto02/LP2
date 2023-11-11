
package Clases;

/**
 *
 * @author Grupo 1
 */
public class Pago 
{
    
    private int idTransaccion;
    private Cuenta pagador;
    private String descripcionServicio;
    private int monto;
    private String metodoPago;

    public Pago(Cuenta pagador, String descripcionServicio, int monto, String metodoPago) {
        this.pagador = pagador;
        this.descripcionServicio = descripcionServicio;
        this.monto = monto;
        this.metodoPago = metodoPago;
    }
    
    public String emitirComprobante()
    {
        return "**************COMPROBANTE PAGO**************\n" + "Transaccion Nro: " + idTransaccion + "\nPagador: " + pagador.toShortString() + 
                "\nDescripcion Servicio: " + descripcionServicio + "\nMonto a pagar: " + monto + "Metodo de pago: " + metodoPago + "\n";
    }
  
    
    
    
}
