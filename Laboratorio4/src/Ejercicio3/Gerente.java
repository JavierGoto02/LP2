package Ejercicio3;

import java.util.Arrays;

/**
 *
 * @author Grupo 1 - Laboratiorio 4
 */
public class Gerente extends Supervisor {
    private int presupuesto;
    private int tiempoGestion;
    private String[] historialRecursos;

    public Gerente(String nombre, String cedula, double salarioBase, String categoria, double productividad,
            int cantidadEmpleadosSupervisados, String[] listaProyectos, int asistenciaReuniones, int presupuesto,
            int tiempoGestion, String[] historialRecursos) {
        super(nombre, cedula, salarioBase, categoria, productividad, cantidadEmpleadosSupervisados, listaProyectos,
                asistenciaReuniones);
        this.presupuesto = presupuesto;
        this.tiempoGestion = tiempoGestion;
        this.historialRecursos = historialRecursos;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getTiempoGestion() {
        return tiempoGestion;
    }

    public void setTiempoGestion(int tiempoGestion) {
        this.tiempoGestion = tiempoGestion;
    }

    public String[] getHistorialRecursos() {
        return historialRecursos;
    }

    public void setHistorialRecursos(String[] historialRecursos) {
        this.historialRecursos = historialRecursos;
    }

    public void vaciarHistorial() {
        setHistorialRecursos(null);
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + String.format(
                "Presupuesto actual: %d\nTiempo de gestion dedicado: %s\nHistoria del movimiento de los recursos: %s\n",
                getPresupuesto(), getTiempoGestion(), Arrays.toString(getHistorialRecursos()));
    }
}