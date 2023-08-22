package Ejercicio3;

/**
 * Esta clase que extiende de la clase EmpleadoPorComision define objetos que contiene datos 
 personales de un EmpleadoPorComision agregandole el atributo de salario base.
 * @author: Grupo 1 - LP2 - FPUNA
 * @versión: 15/08/2023
*/

public class EmpleadoBaseMasComision extends EmpleadoPorComision
{ 
    private double salarioBase;// salario base por mes

    /**
     * Constructor para el empleado base mas comision.
     * @param primerNombre El parámetro define el primer nombre del empleado.
     * @param apellidoPaterno El parámetro define el apellido paterno del empleado.
     * @param numeroCedula El parámetro define el numero de cedula del empleado.
     * @param ventasBrutas El parámetro define las ventas totales por semana del empleado.
     * @param tarifaComision El parámetro define el porcentaje por comisión del empleado.
     * @param salarioBase El parámetro define el salario base por mes del empleado.
     */
    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno,
    String numeroCedula, double ventasBrutas, double tarifaComision, 
    double salarioBase) 
    {
        //Llamamos al constructor de la clase padre "EmpleadoPorComision".
        super(primerNombre, apellidoPaterno, numeroCedula, ventasBrutas, tarifaComision);

        // Si salarioBase no es válido, lanza excepción
        if(salarioBase < 0.0)
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");

        this.salarioBase = salarioBase;
    }


    /**
     * Metodo que establece el salario base del objeto EmpleadoBaseMasComision.
     * @param salarioBase El parámetro define el nuevo salario base del empleado.
     */
    public void establecerSalarioBase(double salarioBase)
    {
        // Si salarioBase no es válido, lanza excepción
        if(salarioBase < 0.0)
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        
        this.salarioBase = salarioBase;
   }


    //Metodo que retorna el salario base del objeto EmpleadoBaseMasComision.
    public double obtenerSalarioBase() 
    {
        return salarioBase;
    }
    

    /**
     * Metodo que calcula los ingresos del objeto EmpleadoBaseMasComision que se define como:
    (tarifa por comisión * ventas brutas) + salario base.
     */
    @Override 
    public double ingresos() 
    {
        return super.ingresos() + obtenerSalarioBase();
    } 


    /*
    Metodo que nos ofrece una representacion en cadena de los atributos del objeto
    EmpleadoBaseMasComision.
    */
    @Override 
    public String toString()
    {
        return String.format("%s %s%n%s: %.2f%n%s: %.2f", "Con sueldo base nuevo para el",
            super.toString(), "El salario base es", obtenerSalarioBase() ,
            "Su ingreso total nuevo", ingresos());
    } 
} // Fin de la clase EmpleadoBaseMasComision.