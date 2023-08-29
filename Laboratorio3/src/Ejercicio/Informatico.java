package Ejercicio;

import java.util.ArrayList;

/**
 * @author Grupo 1 - Laboratorio 3
 */
public class Informatico extends Empleado {
    private String area;
    private String lenguaje;
    private int aniosExperiencia;
    private boolean tieneTitulo;
    private ArrayList<String> proyectos;

    Informatico() {
        super();
        area = "Desarrollo web";
        lenguaje = "HTML";
        tieneTitulo = false;
        aniosExperiencia = 3;
        proyectos = new ArrayList<>();
        setProfesion("Informatico");
    }

    Informatico(String nombre, String apellido, String cedula, String telefono,
            int edad, double salario, String area, String lenguaje, int aniosExperiencia,
            boolean tieneTitulo) {
        super(nombre, apellido, cedula, telefono, edad, salario);
        this.area = area;
        this.lenguaje = lenguaje;
        this.tieneTitulo = tieneTitulo;
        this.aniosExperiencia = aniosExperiencia;
        setProfesion("Informatico");
        if (aniosExperiencia < 0) {
            System.out.println(aniosExperiencia + " no son años válidos, inicializando en 3.");
            this.aniosExperiencia = 3;
        }
        this.proyectos = new ArrayList<String>();
    }

    public String getArea() {
        return area;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public boolean gettieneTitulo() {
        return tieneTitulo;
    }

    public ArrayList<String> getProyectos() {
        return proyectos;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
        if (aniosExperiencia < 0) {
            System.out.println(aniosExperiencia + " no son años válidos, inicializando en 3.");
            this.aniosExperiencia = 3;
        }
    }

    public void setTieneTitulo(boolean tieneTitulo) {
        this.tieneTitulo = tieneTitulo;
    }

    public void setProyectos(ArrayList<String> proyectos) {
        this.proyectos = proyectos;
    }

    public void agregarProyectos(String proyecto) {
        proyectos.add(proyecto);
    }

    public void mostrarProyectos() {
        if (proyectos.size() > 0) {
            System.out.println("Estos son los proyectos en las que está trabajando:");
            for (String proyecto : proyectos) {
                System.out.println("- " + proyecto);
            }
        } else {
            System.out.println("No tiene ningún proyecto hasta ahora.");
        }
    }

    @Override
    public double salarioAnual() {
        return getSalario() * 12 + 40000;
    }

    @Override
    public void trabajar() {
        System.out.println("El informático " + getNombre() + " está progresando con el proyecto!");
        aumentarTrabajoRealizado();
    }

    @Override
    public void informeDeTrabajo() {
        System.out.println(
                "El informático " + getNombre() + " en área de " + getArea() + " especializado en " +
                        getLenguaje() + " ha realizado " + getTrabajo() + " proyectos");
    }
}
