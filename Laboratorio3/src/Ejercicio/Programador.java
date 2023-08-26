package Ejercicio;

/**
 *
 * @author Goti
 */
public class Programador extends Informatico {
    private String idePrincipal;
    private boolean trabajaRemoto;
    private String ambienteDesarrollo;

    Programador() {
        super();
        idePrincipal = "NetBeans 12.0";
        trabajaRemoto = false;
        ambienteDesarrollo = "GitHub";
    }

    Programador(String nombre, String apellido, String cedula, String telefono,
            int edad, double salario, String area, String lenguaje, int aniosExperiencia,
            boolean tieneTitulo, String idePrincipal, boolean trabajaRemoto, String ambienteDesarrollo) {
        super(nombre, apellido, cedula, telefono, edad, salario, area, lenguaje, aniosExperiencia, tieneTitulo);
        this.idePrincipal = idePrincipal;
        this.trabajaRemoto = trabajaRemoto;
        this.ambienteDesarrollo = ambienteDesarrollo;
    }

    public String getIdePrincipal() {
        return idePrincipal;
    }

    public boolean getTrabajaRemoto() {
        return trabajaRemoto;
    }

    public String getAmbienteDesarrollo() {
        return ambienteDesarrollo;
    }

    public void setIdePrincipal(String idePrincipal) {
        this.idePrincipal = idePrincipal;
    }

    public void setTrabajaRemoto(boolean trabajaRemoto) {
        this.trabajaRemoto = trabajaRemoto;
    }

    public void setAmbienteDesarrollo(String ambienteDesarrollo) {
        this.ambienteDesarrollo = ambienteDesarrollo;
    }

    @Override
    public void trabajar() {
        System.out.println("El Programador " + getNombre() + " está programando el código!");
        aumentarTrabajoRealizado();
    }

    @Override
    public void informeDeTrabajo() {
        System.out.printf(
                " El Programador %s utiliza el ide %s en entorno de %s, trabaja de forma %s y ha realizado %d trabajos en total",
                getNombre(), getIdePrincipal(), (getTrabajaRemoto == false ? "Presencial" : "Remota"), getTrabajo());
    }
}
