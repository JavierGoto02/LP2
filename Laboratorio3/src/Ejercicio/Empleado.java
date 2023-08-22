package Ejercicio;


 //@author Javier Goto
 
public  abstract class Empleado 
{
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private int edad;
    private double salario;


    //Gets
    public String getNombre()
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public String getCedula()
    {
        return cedula;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public int getEdad()
    {
        return edad;
    }

    public double getSalario()
    {
        return getSueldoMensual();
    }

    //Sets
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public void setCedula(String cedula)
    {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }

    public void setEdad(int edad)
    {
        if(edad > 0) this.edad = edad;
    }

    //Metodos abstractos
    public abstract double getSueldoMensual();


}
