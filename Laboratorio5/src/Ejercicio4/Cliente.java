package Ejercicio4;

/**
 *
 * @author Grupo 1 - Laboratiorio 5
 */
public class Cliente {
    /** 
     * Número de cuenta del cliente
     */
    private int numeroDeCuenta;
    /** 
     * El total de todas las transacciones realizadas por el cliente en el mes.
     */
    private int transaccionesRealizadasMensual;
    /**
     * El límite de las transacciones gratuitas permitidas
     */
    private int limiteDeTransaccionesGratuitas;

    /**
     * Constructor para Cliente
     * @param numeroDeCuenta el número de cuenta del cliente.
     */
    public Cliente(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    /**
     * @return el número de cuenta del cliente
     */
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    /**
     * @param numeroDeCuenta el número de cuenta del cliente a establecer
     */
    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    /**
     * @return El total de todas las transacciones realizadas por el cliente en el mes.
     */
    public int getTransaccionesRealizadasMensual() {
        return transaccionesRealizadasMensual;
    }

    /**
     * @param transaccionesRealizadasMensual las transacciones realizadas en el mes para establecer
     */
    public void setTransaccionesRealizadasMensual(int transaccionesRealizadasMensual) {
        this.transaccionesRealizadasMensual = transaccionesRealizadasMensual;
    }

    /**
     * @return El límite de las transacciones gratuitas permitidas
     */
    public int getLimiteDeTransaccionesGratuitas() {
        return limiteDeTransaccionesGratuitas;
    }

    /**
     * @param limiteDeTransaccionesGratuitas el límite de las transacciones gratuitas permitidas a establecer
     */
    public void setLimiteDeTransaccionesGratuitas(int limiteDeTransaccionesGratuitas) {
        this.limiteDeTransaccionesGratuitas = limiteDeTransaccionesGratuitas;
    }

    public int costoPorcentualTransaccion() {
        // Calcular la cantidad de transacciones que sobrepasan el límite gratuito
        int transaccionesNoGratuitas = transaccionesRealizadasMensual - limiteDeTransaccionesGratuitas;
        if (transaccionesNoGratuitas >= 5)
            return 5; // El costo al superar el límite por 5 o más transacciones es 5%
        else if (transaccionesNoGratuitas > 0)
            return 2; // El costo al superar el límite por menos de 5 transacciones es 2%
        else
            return 0; // No se superó el límite, por lo tanto, no hay costo adicional
    }
}

