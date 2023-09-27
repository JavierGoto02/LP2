
package Ejercicio1;

/**
 *
 * @author Grupo 1 - Laboratiorio 4
 */
public class Empleado extends Persona{
    private int idEmpleado;
    private float salario;
    
    /**
     * El Constructor de Empleado necesita Numero de Cedula, Nombre, Apellido, Edad, Id Empleado y Salario
     * @param nroCed Numero de Cedula
     * @param nombre Nombre
     * @param apellido Apellido
     * @param edad Edad
     * @param idEmpleado Id Empleado
     * @param salario Salario
     */
    public Empleado(int nroCed, String nombre, String apellido, int edad, int idEmpleado, float salario){
        super(nroCed, nombre, apellido, edad);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }
    
    /**
     * Retorna el Id Empleado
     * @return 
     */
    int getIdEmpleado(){
        return(idEmpleado);
    }
    
    /**
     * Asigna un nuevo Id Empleado
     * @param idEmpleado Id Empleado
     */
    void setIdEmpleado(int idEmpleado){
        this.idEmpleado = idEmpleado;
    }
    
    /**
     * Retorna el Salario
     * @return 
     */
    float getSalario(){
        return(salario);
    }
    
    /**
     * Asigna un nuevo Salario
     * @param salario Salario
     */
    void setSalario(float salario){
        this.salario = salario;
    }
    
    /**
     * Imprime los datos del empleado
     */
    @Override
    void visualizar(){
        super.visualizar();
        System.out.println("Id Empleado: " + idEmpleado);
        System.out.println("Salario: " + salario);
    }
}

