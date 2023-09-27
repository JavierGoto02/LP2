package Ejercicio3;

import java.util.Arrays;

/**
 *
 * @author Grupo 1 - Laboratiorio 4
 */
public class DirectorEjecutivo extends Gerente {

    private String[] conexiones;
    private int accionesDeEmpresa;

    public DirectorEjecutivo(String nombre, String cedula, double salarioBase, String categoria, double productividad,
            int cantidadEmpleadosSupervisados, String[] listaProyectos, int asistenciaReuniones, int presupuesto,
            int tiempoGestion, String[] historialRecursos, String[] conexiones, int accionesDeEmpresa) {
        super(nombre, cedula, salarioBase, categoria, productividad, cantidadEmpleadosSupervisados, listaProyectos,
                asistenciaReuniones, presupuesto, tiempoGestion, historialRecursos);
        this.conexiones = conexiones;
        this.accionesDeEmpresa = accionesDeEmpresa;
    }

    public String[] getConexiones() {
        return conexiones;
    }

    public void setConexiones(String[] conexiones) {
        this.conexiones = conexiones;
    }

    public int getAccionesDeEmpresa() {
        return accionesDeEmpresa;
    }

    public void setAccionesDeEmpresa(int accionesDeEmpresa) {
        this.accionesDeEmpresa = accionesDeEmpresa;
    }
    
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + String.format(
                "Conexiones externas: %s\nAcciones de la empresa: %d",
                Arrays.toString(getConexiones()), accionesDeEmpresa);
    }

}
