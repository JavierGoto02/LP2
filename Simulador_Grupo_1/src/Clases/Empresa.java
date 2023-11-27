package Clases;

/**
 * La clase Empresa representa una entidad comercial en la aplicación bancaria.
 * Extiende la clase Cliente e incluye información específica para empresas, como la razón social y el RUC.
 *
 * @author Grupo 1
 */
public class Empresa extends Cliente {

    private String razonSocial;
    private String ruc; // Registro Único del Contribuyente 

    /**
     * Constructor que inicializa una instancia de la clase Empresa.
     *
     * @param identificador El identificador único de la empresa.
     * @param direccion La dirección de la empresa.
     * @param telefono El número de teléfono de la empresa.
     * @param razonSocial La razón social de la empresa.
     * @param ruc El RUC (Registro Único del Contribuyente) de la empresa.
     */
    public Empresa(int identificador, String direccion, String telefono, String razonSocial, String ruc) {
        super(identificador, direccion, telefono);
        this.razonSocial = razonSocial;
        this.ruc = ruc;
    }

    /**
     * Obtiene la razón social de la empresa.
     *
     * @return La razón social de la empresa.
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Establece la razón social de la empresa.
     *
     * @param razonSocial La nueva razón social de la empresa.
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * Obtiene el RUC (Registro Único del Contribuyente) de la empresa.
     *
     * @return El RUC de la empresa.
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * Establece el RUC (Registro Único del Contribuyente) de la empresa.
     *
     * @param ruc El nuevo RUC de la empresa.
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    /**
     * Devuelve una representación de cadena de la empresa, incluyendo la información de la clase padre
     * (Cliente) y los detalles específicos de la empresa.
     *
     * @return Una cadena que representa la empresa.
     */
    @Override
    public String toString() {
        return super.toString() + "Razon Social: " + razonSocial + "\n" + "Ruc: " + ruc + "\n";
    }

    /**
     * Devuelve una representación de cadena breve de la empresa, incluyendo la información de la clase padre
     * (Cliente) y el RUC de la empresa.
     *
     * @return Una cadena breve que representa la empresa.
     */
    public String toShortString() {
        return super.toShortString() + ", Ruc=" + ruc + "}\n";
    }
}