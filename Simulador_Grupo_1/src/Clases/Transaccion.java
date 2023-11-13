
package Clases;

/**
 *
 * @author Grupo 1
 */
public class Transaccion implements Comprobante{

    private int idTransaccion;
    private int idPagador;
    private String descripcionServicio;
    private int monto;
    private String metodoPago;


    public Transaccion(int pagador, String descripcionServicio, int monto, String metodoPago) {
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

    @Override
    public String emitirComprobante() 
    {
        Cuenta pagador = Sistema.obtenerObjetoCuenta(idPagador);
        return "**************COMPROBANTE TRANSACCION**************\n" + "Transaccion Nro: " + idTransaccion + "\nPagador: "
                + pagador.toShortString() +
                "\nDescripcion Servicio: " + descripcionServicio + "\nMonto a pagar: " + monto + "Metodo de pago: "
                + metodoPago + "\n";
    }

}
