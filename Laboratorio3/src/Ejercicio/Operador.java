package Ejercicio;

import java.util.ArrayList;


/**
 * @author Grupo 1 - Laboratorio 3
 */
public class Operador extends Informatico {
    public ArrayList<String> estadoSistemas;
    private String herramientaMonitoreo;
    private boolean atencionClientes;

    Operador() {
        super();
        estadoSistemas = new ArrayList<>();
        herramientaMonitoreo = "HWiNFO";
        atencionClientes = false;
        setProfesion("Operador");
    }

    Operador(String nombre, String apellido, String cedula, String telefono,
            int edad, double salario, String area, String lenguaje, int aniosExperiencia,
            boolean tieneTitulo, String herramientaMonitoreo, boolean atencionClientes) {
        super(nombre, apellido, cedula, telefono, edad, salario, area, lenguaje, aniosExperiencia, tieneTitulo);
        estadoSistemas = new ArrayList<>();
        this.herramientaMonitoreo = herramientaMonitoreo;
        this.atencionClientes = atencionClientes;
        setProfesion("Operador");
    }

    public ArrayList<String> getEstadoSistemas() {
        return estadoSistemas;
    }

    public String getHerramientaMonitoreo() {
        return herramientaMonitoreo;
    }

    public boolean getAtencionClientes() {
        return atencionClientes;
    }

    public void setEstadoSistemas(ArrayList<String> estadoSistemas) {
        this.estadoSistemas = estadoSistemas;
    }

    public void setHerramientaMonitoreo(String herramientaMonitoreo) {
        this.herramientaMonitoreo = herramientaMonitoreo;
    }

    public void setAtencionClientes(boolean atencionClientes) {
        this.atencionClientes = atencionClientes;
    }

    public void agregarEstadosDeSistemas(String sistema) {
        estadoSistemas.add(sistema);
    }

    public void mostrarEstadosDeSistemas() {
        if (estadoSistemas.size() > 0) {
            System.out.println("Estos son los estados de los sistemas:");
            for (String sistema : estadoSistemas) {
                System.out.println("- " + sistema);
            }
        } else {
            System.out.println("No se tiene registrado ningún sistema hasta ahora.");
        }
    }

    @Override
    public void trabajar() {
        System.out.println("El Operador " + getNombre() + " está operando un mantenimiento!");
        aumentarTrabajoRealizado();
    }

    @Override
    public void informeDeTrabajo() {
        System.out.println(
                "El Operador " + getNombre() + " ha realizado " + getTrabajo() +
                        " operaciones para " + getEstadoSistemas().size() +
                        " sistemas. Utiliza como herramienta principal de monitoreo " + getHerramientaMonitoreo());
    }
}
