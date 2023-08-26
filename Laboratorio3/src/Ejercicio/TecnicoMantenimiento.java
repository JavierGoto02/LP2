package Ejercicio;

import java.util.ArrayList;

/**
 *
 * @author Grupo 1 - Laboratiorio 3
 */
public class TecnicoMantenimiento extends Empleado {
    private String areaEspecializacion;
    private ArrayList<String> herramientas;

    // Constructor de clase por defecto
    TecnicoMantenimiento() {
        super();
        setProfesion("Tecnico en mantenimiento");
        areaEspecializacion = "Mecanico";
        herramientas = new ArrayList<>();
    }

    // Constructor personalizado de la clase tecnico mantenimiento
    TecnicoMantenimiento(String nombre, String apellido, String cedula, String telefono,
            int edad, double salario, String areaEspecializacion) {
        super(nombre, apellido, cedula, telefono, edad, salario);
        setProfesion("Tecnico en mantenimiento");
        this.areaEspecializacion = areaEspecializacion;
        herramientas = new ArrayList<>();
    }

    public String getAreaEspecializacion() {
        return areaEspecializacion;
    }

    public void setAreaEspecializacion(String areaEspecializacion) {
        this.areaEspecializacion = areaEspecializacion;
    }

    public void agregarHerramientas(String herramienta) {
        herramientas.add(herramienta);
    }

    @Override
    public void informeDeTrabajo() {
        System.out.println("El tecnico de mantenimiento en " + getAreaEspecializacion() +
                " realizó " + getTrabajo() + " trabajo/s/.");
    }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " esta realizando un mantenimiento al equipo.");
        aumentarTrabajoRealizado();
    }

    @Override
    public double salarioAnual() {
        return getSalario() * 12 + 10000;
    }

}
