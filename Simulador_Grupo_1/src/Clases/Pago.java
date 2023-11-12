
package Clases;

/**
 *
 * @author Grupo 1
 */
public class Pago implements Comprobante{

    private int idTransaccion;
    private int idPagador;
    private String descripcionServicio;
    private int monto;
    private Tarjeta metodoPago;


    public Pago(int pagador, String descripcionServicio, int monto, Tarjeta metodoPago) {
        this.idPagador = pagador;
        this.descripcionServicio = descripcionServicio;
        this.monto = monto;
        this.metodoPago = metodoPago;
    }

    

    @Override
    public int getIDCuenta() {
        return idPagador;
    }



    @Override
    public boolean esTranferencia() {
        return false;
    }

    @Override
    public int getIdentificador() {
        return idTransaccion;
    }

    public int getIdTransaccion() {
        return idTransaccion;
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

    public Tarjeta getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(Tarjeta metodoPago) {
        this.metodoPago = metodoPago;
    }

    @Override
    public String emitirComprobante() 
    {
        Cuenta pagador = Sistema.obtenerObjetoCuenta(idPagador);
        return "**************COMPROBANTE PAGO**************\n" + "Transaccion Nro: " + idTransaccion + "\nPagador: "
                + pagador.toShortString() +
                "\nDescripcion Servicio: " + descripcionServicio + "\nMonto a pagar: " + monto + "Metodo de pago: "
                + metodoPago + "\n";
    }

}
