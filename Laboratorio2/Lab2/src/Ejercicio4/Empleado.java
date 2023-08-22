package Ejercicio4;

/**
 * La clase base que contiene los datos principales de un empleado
 * 
 * @author fabri
 */
public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroCedula;

    /**
     * Constructor del Empleado
     * 
     * @param primerNombre    Define el primer nombre del empleado
     * @param apellidoPaterno Define el apellido paterno del empleado
     * @param numeroCedula    Define el numero de cedula del empleado
     */
    public Empleado(String primerNombre, String apellidoPaterno, String numeroCedula) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroCedula = numeroCedula;
    }

    /**
     * @return el primer nombre del empleado
     */
    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    /**
     * @return el apellido paterno del empleado
     */
    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * @return el número de cédula del empleado
     */
    public String obtenerNumeroCedula() {
        return numeroCedula;
    }

    /**
     * @return la representación formateada de los datos del empleado
     */
    @Override
    public String toString() {
        return String.format("Informacion del Empleado:\n========================\nNombre = %s\nApellido = %s\nCedula = %s\n", primerNombre, apellidoPaterno, numeroCedula);
    }
}
