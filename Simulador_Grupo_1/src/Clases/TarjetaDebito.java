package Clases;

import java.util.Date;

public class TarjetaDebito extends Tarjeta
{
    
    private int saldo;
   

    public TarjetaDebito(int nroTarjeta, Date fechaVencimiento, int cVC, int idCuenta, int saldo) {
        super(nroTarjeta, fechaVencimiento, cVC, idCuenta);
        this.saldo = saldo;
    }




    @Override
    public int consultarSaldo() {
        return saldo;
    }


    

    @Override
    public void abonarSaldo(int monto) {
        saldo += monto;  
    }


    @Override
    public void realizarPago(int monto) {
        saldo -= monto;
    }

    

    
    
}
