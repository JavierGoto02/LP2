package Ejercicio3;

/**
 *
 * @author Grupo 1 - Laboratiorio 4
 */
import java.util.HashMap;

public class Empleado {
    public static final HashMap<String, Double> listaCategoria;
    
    static 
        {
        listaCategoria = new HashMap<>();
        listaCategoria.put("Informatica", 1.3);
        listaCategoria.put("Administracion", 1.2);
        listaCategoria.put("Supervision", 1.3);
        listaCategoria.put("Produccion", 1.1);
        listaCategoria.put("Comunicaciones", 1.2);
        listaCategoria.put("Logistica", 1.1);
        listaCategoria.put("Finanzas", 1.1);
        listaCategoria.put("Ventas", 1.1);
        listaCategoria.put("Produccion", 1.1);
        listaCategoria.put("Recursos Humanos", 1.1);
        }
    private String nombre;
    private String cedula;
    private double salarioBase;
    private String categoria;
    private double productividad;

    public Empleado(String nombre, String cedula, double salarioBase, String categoria, double productividad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salarioBase = salarioBase;
        this.categoria = categoria;
        this.productividad = productividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getProductividad() {
        return productividad;
    }

    public void setProductividad(double productividad) {
        this.productividad = productividad;
    }

    public void aumentarSalario(double sueldoExtra) {
        double demanda = listaCategoria.get(categoria) != null ? listaCategoria.get(categoria) : 1;
        if (productividad > 70) {
            salarioBase += sueldoExtra * (1 + productividad / 100) * demanda;
        }
    }

    public double calcularPrima() {
        double demanda = listaCategoria.get(categoria) != null ? listaCategoria.get(categoria) : 1;
        return (salarioBase * (1 + productividad / 100) * demanda * 180) / 360;
    }

    public String mostrarInformacion() {
        return String.format(
                "Nombre y apellido: %s\nN° cédula: %s\nSalario base: %.2f\nPrima: %.2f\nCategoría: %s\nProductividad: %.2f\n",
                getNombre(), getCedula(), getSalarioBase(), calcularPrima(), getCategoria(), getProductividad());
    }
}
