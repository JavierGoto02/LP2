package Clases;

/**
 *
 * @author Grupo 1
 */
public class Individuo extends Cliente
{
    private int CI;
    private String nombre;
    private String apellido;

    public Individuo(int CI, String nombre, String apellido, int ID, int PIN, String direccion, String telefono) {
        super(ID, PIN, direccion, telefono);
        this.CI = CI;
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
    
    
    
}
