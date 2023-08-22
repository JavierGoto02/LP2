package Ejercicio3;

/**
 * Esta clase que extiende de la clase Empleado define objetos que contiene datos personales 
 de un Empleado agregandole los atributos ventas brutas y tafica por comison.
 * @author: Javier Goto
 * @versión: 15/08/2023
*/

public class EmpleadoPorComision extends Empleado 
{
    private double ventasBrutas;
    private double tarifaComision;
    /**
     * Constructor para el empleado por comisión.
     * @param primerNombre El parámetro define el primer nombre del empleado.
     * @param apellidoPaterno El parámetro define el apellido paterno del empleado.
     * @param numeroCedula El parámetro define el numero de cedula del empleado.
     * @param ventasBrutas El parámetro define las ventas totales por semana del empleado.
     * @param tarifaComision El parámetro define el porcentaje por comisión del empleado.
     */
    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroCedula, double ventasBrutas, double tarifaComision)
    {
        //Llamamos al constructor de la clase padre "Empleado".
        super(primerNombre, apellidoPaterno, numeroCedula);
        

        // Si ventasBrutas no son válidas, lanza excepción.
        if(ventasBrutas <0.0)
            throw new IllegalArgumentException("Ventas brutas debe ser >= 0.0");

        // Si tarifaComision no es válida, lanza excepción
        if(tarifaComision <=0.0|| tarifaComision >=1.0)
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
    
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;   
    }// Cierre del constructor


    /**
     * Metodo que establece las ventas brutas del objeto EmpleadoPorComision.
     * @param ventasBrutas El parámetro define la nueva ventas brutas del empleado
     */
    public void establecerVentasBrutas(double ventasBrutas) 
    {
        // Si ventasBrutas no son válidas, lanza excepción.
        if(ventasBrutas < 0.0)
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        this.ventasBrutas = ventasBrutas;
    }

    
    //Metodo que retorna las ventas brutas del objeto EmpleadoPorComision.
    public double obtenerVentasBrutas()
    {
        return ventasBrutas;
    }


    /**
     * Metodo que establece la tarifa de comisión del objeto EmpleadoPorComision
     * @param tarifaComision El parámetro define la nueva tarifa por comisión del empleado.
     */
    public void establecerTarifaComision(double tarifaComision)
    {
        // Si tarifaComision no es válida, lanza excepción
        if(tarifaComision <=0.0|| tarifaComision >= 1.0)
            throw new IllegalArgumentException("La tarifa de comisión debe ser > 0.0 y < 1.0");

        this.tarifaComision = tarifaComision;
    }


    // Metodo que retorna la tarifa de comisión del objeto EmpleadoPorComision.
    public double obtenerTarifaComision()
    {
        return tarifaComision;
    }


    /*
    Metodo que calcula los ingresos del objeto EmpleadoPorComision que se define como: 
    tarifa por comisión * ventas brutas.
    */
    public double ingresos()  
    {
        return obtenerTarifaComision() * obtenerVentasBrutas(); 
    }

    
    /*
    Metodo que nos ofrece una representacion en cadena de los atributos del objeto
    EmpleadoPorComision.
    */
    @Override 
    public String toString()
    {
        //Llama al metodo toString() de la clase padre "Empleado".
        return super.toString() + String.format("%s: %.2f%n%s: %.2f",
        "Las ventas brutas son", obtenerVentasBrutas(),
        "La comisión es", obtenerTarifaComision()); 
    }   
}// Fin de la clase EmpleadoPorComision.
