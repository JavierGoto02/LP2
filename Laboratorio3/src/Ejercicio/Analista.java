package Ejercicio;

/**
* @author Grupo 1 - Laboratorio 3
*/
public class Analista extends Informatico {
    private String tipoDeAnalisis;
    private String metodoDeAnalisis;
    private String herramientasDeAnalisis;

    Analista() {
        super();
        tipoDeAnalisis = "Análisis de requisitos";
        metodoDeAnalisis = "Casos de uso";
        herramientasDeAnalisis = "Excel";
        setProfesion("Analista");
    }

    Analista(String nombre, String apellido, String cedula, String telefono,
            int edad, double salario, String area, String lenguaje, int aniosExperiencia,
            boolean tieneTitulo, String tipoDeAnalisis, String metodoDeAnalisis, String herramientasDeAnalisis) {
        super(nombre, apellido, cedula, telefono, edad, salario, area, lenguaje, aniosExperiencia, tieneTitulo);
        this.tipoDeAnalisis = tipoDeAnalisis;
        this.metodoDeAnalisis = metodoDeAnalisis;
        this.herramientasDeAnalisis = herramientasDeAnalisis;
        setProfesion("Analista");
    }

    public String getTipoDeAnalisis() {
        return tipoDeAnalisis;
    }

    public String getMetodoDeAnalisis() {
        return metodoDeAnalisis;
    }

    public String getHerramientasDeAnalisis() {
        return herramientasDeAnalisis;
    }

    public void setTipoDeAnalisis(String tipoDeAnalisis) {
        this.tipoDeAnalisis = tipoDeAnalisis;
    }

    public void setMetodoDeAnalisis(String metodoDeAnalisis) {
        this.metodoDeAnalisis = metodoDeAnalisis;
    }

    public void setHerramientasDeAnalisis(String herramientasDeAnalisis) {
        this.herramientasDeAnalisis = herramientasDeAnalisis;
    }

    @Override
    public void trabajar() {
        System.out.println("El Analista " + getNombre() + " está analizando un trabajo!");
        aumentarTrabajoRealizado();
    }

    @Override
    public void informeDeTrabajo() {
        System.out.println(
                "El Analista " + getNombre() + " utiliza el método de " + getMetodoDeAnalisis() +
                        " para el análisis de " + getTipoDeAnalisis() + " utilizando la herramienta " +
                        getHerramientasDeAnalisis() + ". Ha realizado " + getTrabajo() + " análisis en total");
    }
}
