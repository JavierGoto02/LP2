package Ejercicio3;

/**
 * Esta clase define objetos que contiene datos personales de un Empleado.
 * @author: Grupo 1 - LP2 - FPUNA
 * @versión: 15/08/2023
*/

public class Empleado 
{
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroCedula;


    /**
     * Constructor del Empleado
     * @param primerNombre El parámetro define el primer nombre del empleado.
     * @param apellidoPaterno El parámetro define el apellido paterno del empleado.
     * @param numeroCedula El parámetro define el numero de cedula del empleado.
     */
    public Empleado(String primerNombre, String apellidoPaterno, String numeroCedula)
    {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroCedula = numeroCedula;
    } // Cierre del constructor

    
    //Metodo que nos retorna el primer nombre del empleado. 
    public String obtenerPrimerNombre() 
    {
        return primerNombre;
    }

    
    //Metodo que nos retorna el apellido paterno del empleado.
    public String obtenerApellidoPaterno()
    {
        return apellidoPaterno;
    }

    
    //Metodo que nos retorna el numero de cedula del empleado. 
    public String obtenerNumeroCedula()
    {
        return numeroCedula;
    }

    
    /*
    Metodo que nos ofrece una representacion en cadena de los atributos del objeto
    Empleado.
    */
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n",
        "empleado por comisión", obtenerPrimerNombre(), obtenerApellidoPaterno(),  
        "N° de cédula", obtenerNumeroCedula()); 
    }
}

