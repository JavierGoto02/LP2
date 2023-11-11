
package Clases;

/**
 *
 * @author Grupo 1
 */
public class Pago 
{
    
    private int idTransaccion;
    private String descripcionServicio;
    private int monto;
    private String metodoPago;

    public Pago(int idTransaccion, String descripcionServicio, int monto, String metodoPago) {
        this.idTransaccion = idTransaccion;
        this.descripcionServicio = descripcionServicio;
        this.monto = monto;
        this.metodoPago = metodoPago;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    
    
}
