package Ejercicio4;

/**
 * Es clase hija de Empleado, posee los atributos horas y sueldo además de los heredados.
 * 
 * @author Grupo 1 - LP2 - FPUNA
 */

public class EmpleadosPorHoras extends Empleado {
    private double horas;
    private double sueldo;

    /**
     * Constructor de la clase EmpleadosPorHoras
     * 
     * @param primerNombre    Define el primer nombre del empleado
     * @param apellidoPaterno Define el apellido paterno del empleado
     * @param numeroCedula    Define el numero de cedula del empleado
     * @param horas           Define la cantidad de horas trabajadas por el empleado
     * @param sueldo          Define el sueldo del empleado por cada hora trabajada
     */
    public EmpleadosPorHoras(String primerNombre, String apellidoPaterno, String numeroCedula, double horas, double sueldo) {
        super(primerNombre, apellidoPaterno, numeroCedula);
        this.horas = horas;
        this.sueldo = sueldo;
    }

    /**
     * @return la cantidad de horas trabajadas
     */
    public double obtenerHoras() {
        return horas;
    }

    /**
     * @param horas la nueva cantidad de horas trabajadas
     */
    public void establecerHoras(double horas) {
        if (horas < 0 || horas > 168) {
            throw new IllegalArgumentException();
        } else {
            this.horas = horas;
        }
    }

    /**
     * @return el sueldo del empleado por cada hora trabajada
     */
    public double obtenerSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo el nuevo sueldo del empleado por cada hora trabajada
     */
    public void establecerSueldo(double sueldo) {
        if (sueldo < 0) {
            throw new IllegalArgumentException();
        } else {
            this.sueldo = sueldo;
        }
    }

    /**
     * @return la representación formateada de los datos del empleado
     */
    @Override
    public String toString() {
        return String.format("%s%s: %f\n%s: %f", super.toString(), "Horas trabajadas", horas, "Sueldo obtenido", Math.max(horas - 40, 0.0d) * sueldo * 1.5d + Math.min(horas, 40.0d) * sueldo);
    }

}
