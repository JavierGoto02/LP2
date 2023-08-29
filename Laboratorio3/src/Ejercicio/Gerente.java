package Ejercicio;

import java.util.ArrayList;

/**
 *
 * @author Grupo 1 - Laboratiorio 3
 */
public class Gerente extends Empleado {
    private String departamento;
    private ArrayList<Empleado> subordinados;
    private int maximoEmpleados;

    // Constructor por defecto
    Gerente() {
        super();
        setProfesion("Gerente");
        this.departamento = "Nanawa";
        this.maximoEmpleados = 5;
        this.subordinados = new ArrayList<>();
    }

    // Constructor personalizado de la clase Gerente
    Gerente(String nombre, String apellido, String cedula, String telefono, int edad,
            double salario, int maximoEmpleados, String departamento) {
        super(nombre, apellido, cedula, telefono, edad, salario);
        setProfesion("Gerente");
        this.departamento = departamento;
        if (maximoEmpleados > 0)
            this.maximoEmpleados = maximoEmpleados;
        else {
            System.out.println(maximoEmpleados + " no es una cantidad maxima de empleado válido, inicializando en 5.");
            this.maximoEmpleados = 5;
        }
        this.subordinados = new ArrayList<>();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setMaximoEmpleados(int nuevoTamaño) {
        if (nuevoTamaño > 0)
            maximoEmpleados = nuevoTamaño;
        else
            System.out.println("No se pudo modificar la cantidad maxima de empleados, ingrese un numero positivo");
    }

    public void contratar(Empleado empleado) {
        if (subordinados.size() < maximoEmpleados) {
            subordinados.add(empleado);
            System.out.println("Se contrató a:");
            System.out.println(empleado.informeExtendido());
            aumentarTrabajoRealizado();
        } else
            System.out.println("Se alcanzo el limite de empleo.");
    }

    public void despedirEmpleado(Empleado empleado) {
        if (subordinados.contains(empleado))
            subordinados.remove(empleado);
        else
            System.out.println(
                    "El empleado " + empleado.getNombre() + " NO es parte del departamento " + getDepartamento());
    }

    @Override
    public void trabajar() {
        System.out.println("El gerente " + getNombre() + " está dirigiendo a los empleados del departamento: "
                + getDepartamento());
        aumentarTrabajoRealizado();
    }

    public void motivar() {
        System.out.println("Vamos equipo!! Ya llega fin de mes!");
    }

    @Override
    public void informeDeTrabajo() {
        if (subordinados.size() > 0) {
            System.out.println("El gerente " + getNombre() + " presenta el informe de los empleados:");
            for (Empleado empleado : subordinados) {
                System.out.println(empleado.informeSimple());
            }
        } else
            System.out.println("No hay empleados en el departamento: " + getDepartamento());
    }

    @Override
    public double salarioAnual() {
        return getSalario() * 12 + 20000;
    }

}
