package Clases;

import java.util.HashMap;

/**
 *
 * @author Grupo 1
 */
public class Sistema 
{
    String dominio;
    String nombre;
    
    //Contiene todas las cuentas creadas en el sistema
    HashMap<Integer, Cuenta> cuentaPorCodigo = new HashMap<>();
    

    public Sistema(String dominio, String nombre) {
        this.dominio = dominio;
        this.nombre = nombre;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
