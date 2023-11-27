package Clases;

/**
 * La clase Persona representa a un individuo en la aplicación bancaria.
 * Extiende la clase Cliente e incluye información específica para personas, como el nombre, apellido y cédula de identidad.
 *
 * @author Grupo 1
 */
public class Persona extends Cliente {

    private int CI; // Cédula de Identidad
    private String nombre;
    private String apellido;

    /**
     * Constructor que inicializa una instancia de la clase Persona.
     *
     * @param identificador El identificador único de la persona.
     * @param direccion La dirección de la persona.
     * @param telefono El número de teléfono de la persona.
     * @param ci La cédula de identidad de la persona.
     * @param nombre El nombre de la persona.
     * @param apellido El apellido de la persona.
     */
    public Persona(int identificador, String direccion, String telefono, int ci, String nombre, String apellido) {
        super(identificador, direccion, telefono);
        CI = ci;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Obtiene la cédula de identidad de la persona.
     *
     * @return La cédula de identidad de la persona.
     */
    public int getCI() {
        return CI;
    }

    /**
     * Establece la cédula de identidad de la persona.
     *
     * @param CI La nueva cédula de identidad de la persona.
     */
    public void setCI(int CI) {
        this.CI = CI;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre El nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido de la persona.
     *
     * @return El apellido de la persona.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido de la persona.
     *
     * @param apellido El nuevo apellido de la persona.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Devuelve una representación de cadena de la persona, incluyendo la información de la clase padre
     * (Cliente) y los detalles específicos de la persona.
     *
     * @return Una cadena que representa a la persona.
     */
    @Override
    public String toString() {
        return super.toString() + "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n" + "CI: " + CI + "\n";
    }

    /**
     * Devuelve una representación de cadena breve de la persona, incluyendo la información de la clase padre
     * (Cliente) y el nombre y apellido de la persona.
     *
     * @return Una cadena breve que representa a la persona.
     */
    public String toShortString() {
        return super.toShortString() + ", Nombre=" + nombre + ", Apellido=" + apellido + "}\n";
    }
    
    @Override
    public String getEtiqueta()
    {
        return  nombre + " " + apellido;
    }
    
    @Override
    public String getDocumento()
    {
        return String.valueOf(CI);
    }
}