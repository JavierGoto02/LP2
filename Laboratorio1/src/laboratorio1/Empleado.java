package laboratorio1;
public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;

    //Constructor de la clase
    public Empleado(String nombre, String apellido, double salarioMensual)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        if(salarioMensual >= 0)
        {
            this.salarioMensual = salarioMensual;
        }
    }
}
