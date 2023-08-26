package Ejercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Grupo 1 - Laboratorio 3
 */

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String fechaIngreso;
    private String profesion;
    private int edad;
    private int trabajoRealizado;
    private double salario;

    // Constructor por defecto
    Empleado() {
        // Inicializamos los atributos por default
        nombre = "Javier";
        apellido = "Goto";
        cedula = "5406655";
        telefono = "0972399578";
        edad = 20;
        salario = 20000;
        trabajoRealizado = 0;
        fechaIngreso = getFechaActual();

    }

    // Constructor personalizado de la clase empleado
    Empleado(String nombre, String apellido, String cedula, String telefono,
            int edad, double salario) throws IllegalArgumentException {
        this.fechaIngreso = getFechaActual();
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.trabajoRealizado = 0;
        if (edad > 0)
            this.edad = edad;
        else {
            System.out.println(edad + " no es una edad válida, inicializando en 20.");
            this.edad = 20; // Se inicializa por defecto

        }
        if (salario >= 0)
            this.salario = salario;
        else {
            System.out.println(salario + " no es un salario válido, inicializando en 20000");
            this.salario = 20000; // Se inicializa por defecto
        }
    }

    // Metodos comunes para todas las clases.
    // Gets
    public String getNombre() {
        return nombre;
    }

    public int getTrabajo() {
        return trabajoRealizado;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getProfesion() {
        return profesion;
    }

    // Sets
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        if (edad > 0)
            this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String informeSimple() {
        return String.format("%s: %s %s\t%s: %s\t%s: %d", "Nombre", getNombre(), getApellido(), "Profesion",
                getProfesion(), "Edad", getEdad());
    }

    public String informeExtendido() {
        return String.format("%s: %s\n%s: %s\n%s: %s\n%s: %s\n%s: %s\n%s: %s\n%s: %d\n&s: %.3f\n%s: %d",
                "Nombre", getNombre(), "Apellido", getApellido(), "Profesion", getProfesion(), "Cedula",
                getCedula(), "Telefono", getTelefono(), "Fecha de ingreso", getFechaIngreso(), "Edad", getEdad(),
                "Salario mensual", getSalario(), "Salario anual", salarioAnual());
    }

    public void aumentarTrabajoRealizado() {
        trabajoRealizado += 1;
    }

    private String getFechaActual() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fechaActual.format(formato);
    }

    public void despedirse() {
        System.out.println("El " + getProfesion() + " " + getNombre() + " dice: Buenas noches colegas!!");
    }

    public void saludar() {
        System.out.println("El " + getProfesion() + " " + getNombre() + " dice: Buenos dias colegas!!");
    }

    // Metodos abstractos, se debe implementar en cada subclase.
    public abstract double salarioAnual();

    public abstract void trabajar();

    public abstract void informeDeTrabajo();

}
