
package Clases;

/**
 *
 * @author Grupo 1
 */
public class Empresa extends Cliente {
    private String razonSocial;
    private String ruc;

    public Empresa(String razonSocial, String ruc, int ID, int PIN, String direccion, String telefono) {
        super(direccion, telefono);
        this.razonSocial = razonSocial;
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    @Override
    public String toString() {
        return super.toString() + "Razon Social: " + razonSocial + "\n" + "Ruc: " + ruc + "\n";
    }

    public String toShortString() {
        return super.toShortString() + ", Ruc=" + ruc + "}\n";
    }

}
