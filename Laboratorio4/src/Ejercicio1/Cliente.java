package Ejercicio1;

/**
 *
 * @author Grupo 1 - Laboratiorio 4
 */
public class Cliente extends Persona{
    private int idCliente;
    private float montoCredito;
    
    /**
     * El Constructor de Cliente necesita el Numero de Cedula, Nombre, Apellido, Edad, Id Cliente y el Monto Credito
     * @param nroCed Numero de Cedula
     * @param nombre Nombre
     * @param apellido Apellido
     * @param edad Edad
     * @param idCliente Id Cliente
     * @param montoCredito Monto Credito
     */
    public Cliente(int nroCed, String nombre, String apellido, int edad, int idCliente, float montoCredito){
        super(nroCed, nombre, apellido, edad);
        this.idCliente = idCliente;
        this.montoCredito = montoCredito;
    }
    
    /**
     * Retorna el Id Cliente
     * @return 
     */
    int getIdCliente(){
        return(idCliente);
    }
    
    /**
     * Asigna un nuevo Id Cliente
     * @param idCliente Id Cliente
     */
    void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
    /**
     * Retorna el Monto Credito
     * @return 
     */
    float getMontoCredito(){
        return(montoCredito);
    }
    
    /**
     * Asigna un nuevo Monto Credito
     * @param montoCredito Monto Credito
     */
    void setMontoCredito(float montoCredito){
        this.montoCredito = montoCredito;
    }
}
