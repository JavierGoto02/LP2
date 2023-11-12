package Clases;

/**
 *
 * @author Grupo 1
 */
public class Persona extends Cliente {
    private int CI;
    private String nombre;
    private String apellido;

    

    public Persona(int Identificador, String direccion, String telefono, int cI, String nombre, String apellido) {
        super(Identificador, direccion, telefono);
        CI = cI;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
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

    @Override
    public String toString() {
        return super.toString() + "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "CI: " + CI + "\n";
    }

    public String toShortString() {
        return super.toShortString() + ", Nombre=" + nombre + ", Apellido=" + apellido + "}\n";
    }

}
