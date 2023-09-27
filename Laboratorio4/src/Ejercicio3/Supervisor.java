package Ejercicio3;

import java.util.Arrays;

/**
 *
 * @author Grupo 1 - Laboratiorio 4
 */
public class Supervisor extends Empleado {
    private int cantidadEmpleadosSupervisados;
    private String[] listaProyectos;
    private int asistenciaReuniones;

    public Supervisor(String nombre, String cedula, double salarioBase, String categoria, double productividad,
            int cantidadEmpleadosSupervisados, String[] listaProyectos, int asistenciaReuniones) {
        super(nombre, cedula, salarioBase, categoria, productividad);
        this.cantidadEmpleadosSupervisados = cantidadEmpleadosSupervisados;
        this.listaProyectos = listaProyectos;
        this.asistenciaReuniones = asistenciaReuniones;
    }

    public int getCantidadEmpleadosSupervisados() {
        return cantidadEmpleadosSupervisados;
    }

    public void setCantidadEmpleadosSupervisados(int cantidadEmpleadosSupervisados) {
        this.cantidadEmpleadosSupervisados = cantidadEmpleadosSupervisados;
    }

    public String[] getListaProyectos() {
        return listaProyectos;
    }

    public void setListaProyectos(String[] listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    public int getAsistenciaReuniones() {
        return asistenciaReuniones;
    }

    public void setAsistenciaReuniones(int asistenciaReuniones) {
        this.asistenciaReuniones = asistenciaReuniones;
    }

    public void supervisarEmpleado() {
        cantidadEmpleadosSupervisados++;
    }

    public void comunicar(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + String.format(
                "Cantidad de empleados supervisados: %d\nLista de proyectos en progreso: %s\nTotal de asistencia en las reuniones: %d\n",
                getCantidadEmpleadosSupervisados(), Arrays.toString(getListaProyectos()), getAsistenciaReuniones());
    }
}
