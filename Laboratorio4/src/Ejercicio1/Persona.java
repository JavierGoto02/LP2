package Ejercicio1;

/**
 *
 * @author Grupo 1 - Laboratiorio 4
 */
public class Persona {
    private int nroCed;
    private String nombre;
    private String apellido;
    private int edad;

    /**
     * El constructor de Persona necesita el Numero de cedula, nombre, apellido y la edad
     * @param nroCed Numero de Cedula
     * @param nombre Nombre
     * @param apellido Apellido
     * @param edad Edad
     */
    public Persona(int nroCed, String nombre, String apellido, int edad) {
        this.nroCed = nroCed;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    
    /**
     * Retorna el Numero de Cedula
     * @param nroCed Numero de Cedula
     */
    int getNroCed(){
        return(nroCed);
    }
    
    /**
     * Asigna un nuevo valor al Numero de Cedula
     * @return 
     */
    void setNroCed(int nroCed){
        this.nroCed = nroCed;
    }
    
    /**
     * Retorna el Nombre
     * @param nombre Nombre
     */
    String getNombre(){
        return(nombre);
    }
    
    /**
     * Asigna un nuevo Nombre
     * @return 
     */
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    /**
     * Retorna el Apellido
     * @param apellido Apellido
     */
    String getApellido(){
        return(apellido);
    }
    
    /**
     * Asigna un nuevo Apellido
     * @return 
     */
    void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    /**
     * Retorna la Edad
     * @param edad Edad
     */
    int getEdad(){
        return(edad);
    }
    
    /**
     * Asigna una nueva Edad
     * @return 
     */
    void setEdad(int edad){
        this.edad = edad;
    }

    /**
     * Imprime los datos de la Persona
     */
    void visualizar(){
        System.out.println("Nombre y apellido: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de Cedula: " + nroCed);
    }

}

